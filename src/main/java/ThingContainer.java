/**
 * Created by jonathanleczner on 9/27/16.
 */
public class ThingContainer {
    private ColorfulThing[] things;
    private int lastElementIndex;

    public ThingContainer(int size) {
        things = new ColorfulThing[size];
        lastElementIndex = -1; // add will make 0
    }

    public ThingContainer(ColorfulThing[] things) {
        this.things = things;
    }

    public ColorfulThing[] getThings() {
        return things;
    }
    public int getLastElementIndex() { return lastElementIndex; }

    public void add(ColorfulThing ct) {
        for (int i = 0; i < things.length; i++) {
            if (things[i] == null) {
                things[i] = ct;
                lastElementIndex++;
                return;
            }
        }
        System.out.println("ThingContainer is full");
    }

    public ColorfulThing pop() {
        ColorfulThing last = null;
        int lastElementIndex = getLastElementIndex();
        if (things.length > 0) {
            last = things[lastElementIndex];
            remove(last);
        }
        System.out.println("You done popped em ALL!");
        return last;
    }

    public ColorfulThing remove(ColorfulThing.Color color) {
        ColorfulThing returnValue = null;
        for (int i = 0; i <= lastElementIndex; i++) {
            ColorfulThing.Color thingColor = things[i].getColor();
            if (thingColor == color) {
                returnValue = things[i];
                things = removeHelper(i);
                return returnValue;
            }
        }
        return returnValue;
    }

    public ColorfulThing remove(ColorfulThing ct) {
        ColorfulThing returnValue = null;
        for (int i = 0; i < things.length; i++) {
            if (things[i] == ct) {
                returnValue = things[i];
                things = removeHelper(i);
            }
        }
        return returnValue;
    }

    public ColorfulThing[] removeHelper(int removeIndex) {
        ColorfulThing[] newThings  = new ColorfulThing[things.length];
        ThingContainer temp = new ThingContainer(newThings);
        for (int i = 0; i <= this.lastElementIndex; i++)
            if (i != removeIndex)
                temp.add(things[i]);
        this.lastElementIndex--;
        return newThings;
    }

    public void printThings() {
        if (things.length > 0)
            for (int i = 0; i < lastElementIndex; i++)
                System.out.println("[" + i + "] " + things[i].getColor());
        else
            System.out.println("No space in this container, bruh");
        System.out.println(); // for prettiness
    }

}