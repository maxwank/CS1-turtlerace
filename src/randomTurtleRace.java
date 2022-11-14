public class randomTurtleRace
{
    public static void main(String[] args) {
        Turtle redTurtle = new Turtle();
        redTurtle.fillColor("red");
        Turtle greenTurtle = new Turtle();
        greenTurtle.fillColor("green");
        Turtle blueTurtle = new Turtle();
        blueTurtle.fillColor("blue");
        Turtle orangeTurtle = new Turtle();
        orangeTurtle.fillColor("orange");
        Turtle purpleTurtle = new Turtle();
        purpleTurtle.fillColor("purple");
        Turtle yellowTurtle = new Turtle();
        yellowTurtle.fillColor("yellow");

        redTurtle.up();
        greenTurtle.up();
        blueTurtle.up();
        orangeTurtle.up();
        purpleTurtle.up();
        yellowTurtle.up();

        redTurtle.setPosition(-100,0);
        greenTurtle.setPosition(-100,50);
        blueTurtle.setPosition(-100,100);
        orangeTurtle.setPosition(-100,150);
        purpleTurtle.setPosition(-100,200);
        yellowTurtle.setPosition(-100,250);

        redTurtle.down();
        greenTurtle.down();
        blueTurtle.down();
        orangeTurtle.down();
        purpleTurtle.down();
        yellowTurtle.down();

        redTurtle.speed(1);
        greenTurtle.speed(1);
        blueTurtle.speed(1);
        orangeTurtle.speed(1);
        purpleTurtle.speed(1);
        yellowTurtle.speed(1);

        int redSteps = 0;
        int greenSteps = 0;
        int blueSteps = 0;
        int orangeSteps = 0;
        int purpleSteps = 0;
        int yellowSteps = 0;

        clear();

        boolean racing=true;
        while(racing) {
            int random = random(1,6);
            if (random == 1) {
                redSteps = redSteps + 1;
                redTurtle.forward(1);
                redTurtle.right(1);
                if (redSteps==360) {
                    racing=false;
                }
            }
            else if (random == 2) {
                greenSteps = greenSteps + 1;
                greenTurtle.forward(1);
                greenTurtle.right(1);
                if (greenSteps==360) {
                    racing=false;
                }
            }
            else if (random==3) {
                blueSteps = blueSteps + 1;
                blueTurtle.forward(1);
                blueTurtle.right(1);
                if (blueSteps==360) {
                    racing=false;
                }
            }
            else if (random==4) {
                orangeSteps = orangeSteps + 1;
                orangeTurtle.forward(1);
                orangeTurtle.right(1);
                if (orangeSteps==360) {
                    racing=false;
                }
            }
            else if (random==5) {
                purpleSteps = purpleSteps + 1;
                purpleTurtle.forward(1);
                purpleTurtle.right(1);
                if (purpleSteps==360) {
                    racing=false;
                }
            }
            else if (random==6) {
                yellowSteps = yellowSteps + 1;
                yellowTurtle.forward(1);
                yellowTurtle.right(1);
                if (yellowSteps==360) {
                    racing=false;
                }
            }
        }

        System.out.println("The final position of the red turtle is " + redSteps);
        System.out.println("The final position of the green turtle is " + greenSteps);
        System.out.println("The final position of the blue turtle is " + blueSteps);
        System.out.println("The final position of the orange turtle is " + orangeSteps);
        System.out.println("The final position of the purple turtle is " + purpleSteps);
        System.out.println("The final position of the yellow turtle is " + yellowSteps);
    }

    public static void clear()
    {
        System.out.print("\033[H\033[2J");
    }

    public static int random(int min, int max) {
        return (int) Math.floor(max*Math.random())+min;
    }
}
