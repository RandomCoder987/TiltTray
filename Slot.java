public class Slot {
        int itemId;
        boolean freeFlag;
        int inductionBy;
        int fallingChute;
    
        public void printSlot(){
            System.out.println("Item ID: " + itemId + " freeFlag: " + freeFlag + " induction By: " + inductionBy + " fallingChute: " + fallingChute);
        }
        
        Slot(){
            resetSlot();
        }
        public void resetSlot(){
            freeFlag = true;
            itemId = -1;
            inductionBy = -1;
            fallingChute = -1;
        }
    }

