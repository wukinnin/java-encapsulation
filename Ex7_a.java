public class Ex7_a
{
    private int walk; 
    private int prep; 
    private int workTime;

    public Ex7_a(int walk, int prep, int workTime){
        this.walk=walk; 
        this.prep=prep;
        this.workTime=workTime; 
    }

    public int getWalk(){
        return walk; 
    }

    public int getPrep(){
        return prep; 
    }
    public int getWorkTime(){
        return workTime; 
    }

    public int computeHours(){
        return getWorkTime()-1; 
    }
    public int computeMinutes(){
        return getPrep()-getWalk(); 
    }
    public void displayTime(){
        System.out.printf("Juan should leave home at %d:%d", computeHours(), computeMinutes()); 
    }
}