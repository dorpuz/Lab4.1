public class MarsApplications {
    public static void main(String[] args) {
        MarsRobot Spirit = new MarsRobot();
        MarsRobot Opportunity = new MarsRobot("exploration", 2, -60);
        MarsRobot Opportunity2 = new MarsRobot("waiting", 4, -40);

       Spirit.status = "exploration";
        Spirit.speed = 2;
        Spirit.temperature = -60;

        /*Opportunity.status = "off";
        Opportunity.speed = 2;
        Opportunity.temperature = -60;*/
        Opportunity.showAttributes();

        Spirit.showAttributes();
        System.out.println("Increase speed");

        Spirit.speed = 3;
        Spirit.showAttributes();

        System.out.println("Decrease temp to -90");
        Spirit.temperature = -90;
        Spirit.showAttributes();

        System.out.println("Check temp\n");
        Spirit.checkTemperature();
        Spirit.showAttributes();

        Spirit.checkStatus();
        Opportunity.checkStatus();

    }
}