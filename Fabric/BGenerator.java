package Fabric;

import Interface.iGameItem;
import Product.BReward;

public class BGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new BReward();
    }
}