import java.util.Random;
import javax.management.InvalidAttributeValueException;


class TiltTray {
    private Node head;
    boolean detailedLogs = false;
    int inductionZoneCount;
     InductionZone[] inductionZones;
     int slotsPerHour;
     int totalSlots;
    Random rand = new Random();        
    int itemId = 0;

    public void createSlots(int slots, int izs){
        // Initialize and create the slots
        head = null;
        Node curr = null;
        totalSlots = slots;
        for(int i=0; i < totalSlots; ++i){
            if(curr == null)
                head = curr = new Node();
            else {
                curr.next = new Node();
                curr = curr.next;
            }
            curr.id = i;
            curr.next = head;
        }
    }

    public void plotInductionZones() throws InvalidAttributeValueException {
        if(inductionZoneCount <= 0) throw new InvalidAttributeValueException();
        inductionZones = new InductionZone[inductionZoneCount];
        Node curr = head;
        int divider = totalSlots/inductionZoneCount;
        int index = 0;
        for(int counter = 0; counter < totalSlots; ++counter){
            if(counter % divider == 0){
                inductionZones[index] = new InductionZone(index);
                inductionZones[index++].node = curr;
            }
            curr = curr.next;
        }
    }

    public Slot generateItem(int slots, int iz){
        Slot s = new Slot();
        s.fallingChute = rand.nextInt(slots);
        s.freeFlag = false;
        s.inductionBy = iz;
        s.itemId = ++itemId;
        return s;
    }

    /*
        Induce new elements based on the available slot in front of an induction zone.
    */
    public void induce(){
        for(int counter=0;counter<inductionZoneCount;++counter){
            if(inductionZones[counter].node.data.freeFlag){
                inductionZones[counter].node.data = generateItem(totalSlots, counter);
                inductionZones[counter].generatedCount++;
            }
            else{
                inductionZones[counter].skipCount++;
            }
        }
    }

    public void rotateAndSlide(){
//        head.data.printSlot();
        head = head.next;
        Node curr = head;
        if(detailedLogs)
            System.out.print("Cleared ");
        for(int i=0; i < totalSlots; ++i){
            if(curr.data.fallingChute == i){
                if(detailedLogs)
                    System.out.print(curr.data.itemId + " ");
                curr.data.resetSlot();
            }
            curr = curr.next;
        }
        for(int i=0;i<inductionZoneCount;++i){
            inductionZones[i].node = inductionZones[i].node.next;
        }
        if(detailedLogs)
            System.out.println();
    }
    
    public void printAll(){
        Node curr = head;
        for(int i=0; i < totalSlots; ++i){
            curr.data.printSlot();
            curr = curr.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSlotsPerHour() {
        return slotsPerHour;
    }

    public void setSlotsPerHour(int slotsPerHour) {
        this.slotsPerHour = slotsPerHour;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public boolean isDetailedLogs() {
        return detailedLogs;
    }

    public void setDetailedLogs(boolean detailedLogs) {
        this.detailedLogs = detailedLogs;
    }

    public int getInductionZoneCount() {
        return inductionZoneCount;
    }

    public void setInductionZoneCount(int inductionZoneCount) {
        this.inductionZoneCount = inductionZoneCount;
    }

}