package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public abstract class ModelStore implements IModelChanger {
    public List<PolygonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changedObserver;

    public ModelStore(List<IModelChangedObserver>
                              changedObserver)
            throws Exception {
        this.changedObserver = changedObserver;

        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PolygonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }


    public Scene GetScene(int id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == id) {
                return Scenes.get(i);
            }

        }
        return null;
    }

    public void NotifyChange(IModelChanger sender) {

    }
}
