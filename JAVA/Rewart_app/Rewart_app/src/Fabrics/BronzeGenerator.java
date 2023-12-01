package Fabrics;

import Interfaces.IGameItem;
import Products.Bronze;

public class BronzeGenerator extends ItemFabric{
        @Override
        public IGameItem createItem() {
            return new Bronze();
        }
    
}
