public class Ex8_a {
    private int distance, speed;
    public Ex8_a(int distance, int speed){
        this.distance = distance;
        this.speed = speed;
    }
    public int getDistance(){
        return distance;
    }
    public int getHours(){
        return speed;
    }
    public void displayTime() {
        // multiply kilometers to manageable minutes and then divide by speed
        int minutes = (distance * 60) / speed;
        
        // then get the minutes relative to an hour by modulo 60
        int minutesFinal = minutes % 60;

        // divide the minute conversion to 60 to get the amount of hours
        int hours = minutes / 60;

        System.out.print("Mimi will take ");
        System.out.print(hours + " hour/s");
        System.out.print(" and ");
        System.out.print(minutesFinal + " minute/s");
    }

}
