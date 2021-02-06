import javax.management.InvalidAttributeValueException;

public class Simulator {
    TiltTray trays = new TiltTray();
    boolean detailedLogs = false;

    Simulator(int slots, int slotsPerHour, int inductionZones, boolean detailedLogs)
            throws InvalidAttributeValueException {
        trays.setInductionZoneCount(inductionZones);
        trays.setTotalSlots(slots);
        trays.setSlotsPerHour(slotsPerHour);
        trays.createSlots(slots, inductionZones);
        trays.setDetailedLogs(detailedLogs);
        trays.plotInductionZones();

        this.detailedLogs = detailedLogs;
    }

    public void runSimulation(){       
        executeSimulation();
        printResults();
    }

    public void executeSimulation(){
        for(int rotation = 0; rotation < trays.slotsPerHour; rotation++){
            if(detailedLogs)
                System.out.print("Rotation: " + rotation + " ");
            trays.induce();
            trays.rotateAndSlide();
        }
        if(detailedLogs)
            System.out.println("");
    }

    public void printResults(){
        System.out.println("");
        System.out.print("Slots: " + trays.totalSlots);
        System.out.print(" Rounds: " + trays.slotsPerHour);
        System.out.print(" Induction Zones: " + trays.inductionZoneCount);

        if(detailedLogs)
            trays.printAll();

        double totalGenerated = 0.0;
        if(detailedLogs)
            System.out.println("\nInduction Zones:");
        
        for(InductionZone iz : trays.inductionZones){
            if(detailedLogs)
                System.out.println("Zone: "+ iz.zoneId + " GeneratedCount: " + iz.generatedCount + " Skip Count: "+ iz.skipCount);
            totalGenerated += iz.generatedCount;
        }
        System.out.println("");
        System.out.println("Total trays filled: "+ totalGenerated + " Efficiency improvement: "+ (totalGenerated/trays.slotsPerHour));
    }
    public static void main(String args[]) throws InvalidAttributeValueException {
        int slots = 100;
        int slotsPerHour = 1000000;
        int[] inductionZones = {1, 2, 4,5,10,20,50,100};
        boolean detailedLogs = false;
        
        for(int iz:inductionZones){
            Simulator sm = new Simulator(slots, slotsPerHour, iz, detailedLogs);
            sm.runSimulation();
        }
    }
}
