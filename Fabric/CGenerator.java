package Fabric;

import Interface.iGameItem;
import Product.CReward;

public class CGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new CReward();
    }
}
