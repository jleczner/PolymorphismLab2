import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonathanleczner on 9/27/16.
 */
public class ColorfulThing implements Thing{
    private Color color;

    public enum Color {BLUE, RED, GREEN, YELLOW, PURPLE}

    public ColorfulThing(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public List getProperties() {
        List props = new ArrayList<Color>();
        props.add(color);
        return props;
    }
}
