package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Text;

import ModelElements.PoligonModel;
import ModelElements.Camera;
import ModelElements.Scene;
import ModelElements.Texture;
import ModelElements.Flash;

public class ModelStore implements IModelChanger{
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;
    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();


        List<Texture> textures = new ArrayList<Texture>();
        this.models.add(new PoligonModel(textures));

        this.flashes.add(new Flash(null, null, null, 0));
        this.cameras.add(new Camera(null, null));
        this.scenes.add(new Scene(0, models, flashes, cameras));

    }

    public Scene getScene(int id) {
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        
    }
    


}
