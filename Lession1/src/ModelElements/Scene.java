package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PolygonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PolygonalModel> models,
                 List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("No model found");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0) {
            this.Cameras = cameras;
        } else {
            throw new Exception("No camera found");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T flash, E camera) {
        return flash;
    }
/*
 public Type method1(Type t){
    return t;
 }
   public Type1 method1(Type1 t1, Type2 t2){
    return t1;
  }
*/
}
