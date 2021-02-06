public class InductionZone {
    int zoneId;
    int generatedCount;
    int skipCount;
    Node node;

    InductionZone(int index){
        zoneId = index;
        generatedCount = 0;
        skipCount = 0;
    }

    public int getZoneId(){
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public int getGeneratedCount() {
        return generatedCount;
    }

    public void setGeneratedCount(int generatedCount) {
        this.generatedCount = generatedCount;
    }

    public int getSkipCount() {
        return skipCount;
    }

    public void setSkipCount(int skipCount) {
        this.skipCount = skipCount;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
