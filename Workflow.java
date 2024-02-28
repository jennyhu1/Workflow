class Workflow{

    private int wfid;
    private String step;
    private int objid;

    public boolean AddWFItem(String step, int objid){
        return true;
    }

    public int GetNextWFItem(String step){
        return objid;
    }

    public int CountWFItems(String step){
        return 1;
    }

}
