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
    public int computeHours(){
        return getDistance()/getHours();
    }

    public int computeMinutes(){
        return 60/getHours();
    }
    public void displayTime(){
        System.out.printf("It will take %d hour/s and %d minute/s.", computeHours(), computeMinutes());
    }

}
