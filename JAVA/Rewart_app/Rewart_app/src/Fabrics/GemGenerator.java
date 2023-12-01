package Fabrics;

import Interfaces.IGameItem;
import Products.Silver;

public class GemGenerator extends ItemFabric{
        @Override
        public IGameItem createItem() {
            return new Silver();
        }
    
}
