/**
 * Created by jonathanleczner on 9/27/16.
 */
public class ThingContainer {
    private Thing[] things;
    private int lastElementIndex;

    public ThingContainer(int size) {
        things = new Thing[size];
        lastElementIndex = -1; // add will make 0
    }

    public ThingContainer(Thing[] things) {
        this.things = things;
    }

    public Thing[] getThings() {
        return things;
    }
    public int getLastElementIndex() { return lastElementIndex; }

    public void add(Thing t) {
        for (int i = 0; i < things.length; i++) {
            if (things[i] == null) {
                things[i] = t;
                lastElementIndex++;
                return;
            }
        }
        System.out.println("ThingContainer is full");
    }

    public Thing pop() {
        Thing last = null;
        int lastElementIndex = getLastElementIndex();
        if (things.length > 0) {
            last = things[lastElementIndex];
            remove(last);
        }
        System.out.println("You done popped em ALL!");
        return last;
    }

    public Thing remove(ColorfulThing.Color color) {
        ColorfulThing returnValue = null;
        for (int i = 0; i <= lastElementIndex; i++) {
            if (things[i].getProperties().contains(color)) {
                ColorfulThing ct = (ColorfulThing) things[i];
                ColorfulThing.Color thingColor = ct.getColor();
                if (thingColor == color) {
                    returnValue = ct;
                    things = removeHelper(i);
                    return returnValue;
                }
            }
        }
        return returnValue;
    }

    public Thing remove(Thing t) {
        Thing returnValue = null;
        for (int i = 0; i < things.length; i++) {
            if (things[i] == t) {
                returnValue = things[i];
                things = removeHelper(i);
            }
        }
        return returnValue;
    }

    public Thing[] removeHelper(int removeIndex) {
        Thing[] newThings  = new Thing[things.length];
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
                System.out.println("[" + i + "] " + things[i].getProperties());
        else
            System.out.println("No space in this container, bruh");
        System.out.println(); // for prettiness
    }

}