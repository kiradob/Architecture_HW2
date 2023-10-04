package Fabric;

import Interface.iGameItem;
import Product.EReward;

public class EGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new EReward();
    }
}
