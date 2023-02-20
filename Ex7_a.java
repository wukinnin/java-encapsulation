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

    public void displayTime() {
        // calculate total travel time by adding walk and prep time
        int totalTravelTime = walk + prep;

        // compute the amount of minutes based on work time by multiplying it by 60.
        int totalWorkMinutes = workTime * 60;

        // get the total amount of minutes by deducting the travel time (minutes) and total work minutes.
        int totalMinutes = totalWorkMinutes - totalTravelTime;

        // get the leave hour by dividing the total minutes by 60.
        int leaveHour = totalMinutes / 60;

        // get the leave minutes by solving it by modulo 60.
        int leaveMinute = totalMinutes % 60;

        System.out.printf("Juan should leave home at %d:%02d", leaveHour, leaveMinute);
    }

}