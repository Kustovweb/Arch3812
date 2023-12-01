package Fabrics;

import Interfaces.IGameItem;
import Products.Silver;

public class SilverGenerator extends ItemFabric{
        @Override
        public IGameItem createItem() {
            return new Silver();
        }
    
}
