package ModelElements;

import java.util.List;
import Stuff.Type;

public class Scene {
    public int id;
    public List<PoligonModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
            if (models.size() > 0) {
                this.models = models;
            } else {
                throw new Exception("Должна быть одна модель");
            }
             if (cameras.size() > 0) {
                this.cameras = cameras;
            } else {
                throw new Exception("Должна быть одна модель");
            }
        this.flashes = flashes;
        
    }
    // public Type method1(Type type){
    //     return type;
    // }
    // public Type method2(Type type1, Type type2){
    //     return type2;
    // }


        public <T> T method1(T flash){
        return flash;
    }
    public <T, E> T method2(T Model, E flash){
        return Model;
    }

}
