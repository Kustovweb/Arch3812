package Fabrics;

import Interfaces.IGameItem;
import Products.Gold;

public class GoldGenerator extends ItemFabric{
        @Override
        public IGameItem createItem() {
            return  new Gold();
        }
    
}
