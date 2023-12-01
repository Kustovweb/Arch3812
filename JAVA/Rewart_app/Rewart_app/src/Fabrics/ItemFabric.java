package Fabrics;

import Interfaces.IGameItem;

public abstract class ItemFabric {
    
    public abstract IGameItem createItem();

    public void openReward() {
        createItem().open();
    }
}
