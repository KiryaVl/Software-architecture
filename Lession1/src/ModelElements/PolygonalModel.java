package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    public List<Polygon> Polygons;
    public List<ModelElements.Textures> Textures;

    public PolygonalModel(List<ModelElements.Textures> textures) {
        Textures = textures;
        Polygons = new ArrayList<>();
    }
}
