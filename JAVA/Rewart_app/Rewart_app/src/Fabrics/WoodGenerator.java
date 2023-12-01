package Fabrics;

import Interfaces.IGameItem;
import Products.Wood;

public class WoodGenerator extends ItemFabric{
        @Override
        public IGameItem createItem() {
            return new Wood();
        }
    
}
