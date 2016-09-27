/**
 * Created by jonathanleczner on 9/11/16.
 */
public class App {
    public static void main(String[] args) {
        ThingContainer tc1 = new ThingContainer(0);
        ThingContainer tc2 = new ThingContainer(1);
        ThingContainer tc3 = new ThingContainer(5);
        ColorfulThing blue1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing green1 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing red1 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing green2 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing purp1 = new ColorfulThing(ColorfulThing.Color.PURPLE);
        ColorfulThing yellow1 = new ColorfulThing(ColorfulThing.Color.YELLOW);
        ThingContainer things = new ThingContainer(new ColorfulThing[]{blue1, green1, red1, purp1, yellow1});

        System.out.println("tc1");
        tc1.add(blue1);
        tc1.printThings();
        System.out.println("tc2");
        tc2.add(blue1);
        tc2.add(green1);
        tc2.printThings();
        tc3.add(blue1);
        tc3.add(green1);
        tc3.add(blue1);
        tc3.pop();
        tc3.add(green2);
        tc3.remove(green1);
        tc3.add(red1);
        tc3.add(yellow1);
        tc3.add(yellow1);
        tc3.remove(ColorfulThing.Color.YELLOW);
        tc3.add(purp1);
        tc3.printThings();
        things.printThings();
    }
}
