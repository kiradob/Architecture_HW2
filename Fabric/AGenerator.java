package Fabric;

import Interface.iGameItem;
import Product.AReward;

public class AGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new AReward();
    }
}
