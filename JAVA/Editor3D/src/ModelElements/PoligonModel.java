package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonModel {
    public List<Poligon> poligons;
    public List<Texture> textures;
    public PoligonModel(List<Texture> textures) {
        this.poligons = new ArrayList<>();
        this.textures = textures;
        this.poligons.add(new Poligon());
    }

    
} 
