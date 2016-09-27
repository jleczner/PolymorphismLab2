import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonathanleczner on 9/27/16.
 */
public class CoatedThing extends ColorfulThing {
    private Color color;
    private Texture texture;

    public enum Texture {GLOSSY, MATTE, SPECKLED, METALLIC}

    public CoatedThing(Color color, Texture texture) {
        super(color);
        this.texture = texture;
    }

    @Override
    public List getProperties() {
        List props = new ArrayList<Color>();
        props.add(color);
        props.add(texture);
        return props;
    }
}
