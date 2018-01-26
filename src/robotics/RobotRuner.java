package robotics;

/**
 * Created by java on 26.01.2018.
 */
public class RobotRuner {
    public static void main(String[] args) {

     //   Robot robot=new Robot();
      //  robot.thinking();
       // robot.setCpu(4);
       // robot.thinking();

      //  ChapyRobot chp=new ChapyRobot();

      //  chp.thinking();

        Transformer transformer=new Transformer();
        transformer.setName("Ivar");
        System.out.println(transformer.toString());
        transformer.thinking();
    //   transformer.setSerialNumber(123456);
      //  transformer.setName("fighter");
       // transformer.getName();
      //  transformer.setSword(true);
      //  transformer.fight();
      //  SimplyRobot simplyRobot=new SimplyRobot();

    }
}
