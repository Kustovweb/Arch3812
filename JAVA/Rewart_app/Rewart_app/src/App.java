import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabrics.GemGenerator;
import Fabrics.GoldGenerator;
import Fabrics.ItemFabric;
import Fabrics.SilverGenerator;
import Fabrics.WoodGenerator;
import Fabrics.BronzeGenerator;

public class App {
    public static void main(String[] args) throws Exception {
      
        List<ItemFabric> fabrics = new ArrayList<>();

        fabrics.add(new GoldGenerator());
        fabrics.add(new GemGenerator());
        fabrics.add(new SilverGenerator());
        fabrics.add(new BronzeGenerator());
        fabrics.add(new WoodGenerator());

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(5);
            fabrics.get(index).openReward();
        }

    }
}
