import Fabric.ItemGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.SilverGenerator;
import Fabric.AGenerator;
import Fabric.BGenerator;
import Fabric.CGenerator;
import Fabric.DGenerator;
import Fabric.EGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ItemGenerator f1=new GemGenerator();
        f1.openReward();
        ItemGenerator f2=new GoldGenerator();
        f2.openReward();
        ItemGenerator f3=new SilverGenerator();
        f3.openReward();
        ItemGenerator f4=new AGenerator();
        f4.openReward();
        ItemGenerator f5=new BGenerator();
        f5.openReward();
        ItemGenerator f6=new CGenerator();
        f6.openReward();
        ItemGenerator f7=new DGenerator();
        f7.openReward();
        ItemGenerator f8=new EGenerator();
        f8.openReward();

        List<ItemGenerator> itemGeneratorList=new ArrayList<>();

        itemGeneratorList.add(f1);
        itemGeneratorList.add(f2);
        itemGeneratorList.add(f3);
        itemGeneratorList.add(f4);
        itemGeneratorList.add(f5);
        itemGeneratorList.add(f6);
        itemGeneratorList.add(f7);
        itemGeneratorList.add(f8);

        Random random=ThreadLocalRandom.current();

       
        for (int i=0; i<10; i++) {
            itemGeneratorList.get(random.nextInt(8)).openReward();
        }

// +5 наград

    }
    
}
