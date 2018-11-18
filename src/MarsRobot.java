public class MarsRobot implements Robot{

    String status;
    int speed;
    float temperature;

    MarsRobot(String status, int speed, float temperature){
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;
    }
    MarsRobot(String status){
        this.status = status;
    }
    MarsRobot(int speed, float temperature){
        this.speed = speed;
        this.temperature = temperature;
    }
    MarsRobot(String status, float temperature){
        this.status = status;
        this.temperature = temperature;
    }
    MarsRobot(String status, int speed){
        this.status = status;
        this.speed = speed;
    }

    MarsRobot(){}

    public void checkTemperature() {
        if (temperature < -80) {
            status = "go back";
            speed = 5;
        } else {
            System.out.println("It's ok.");
        }
    }
    public void checkStatus(){
        System.out.println("Current status: " + status);
    }

    void showAttributes(){
        System.out.println("Status: "+status);
        System.out.println("Prędkość: "+speed);
        System.out.println("Temperatura: "+temperature);
    }

}