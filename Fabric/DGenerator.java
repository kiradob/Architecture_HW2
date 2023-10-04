package Fabric;

import Interface.iGameItem;
import Product.DReward;

public class DGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new DReward();
    }
}
