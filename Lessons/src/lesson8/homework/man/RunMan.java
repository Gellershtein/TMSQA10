package lesson8.homework.man;

import lesson8.homework.man.Footwear.AdidasFootwear;
import lesson8.homework.man.Footwear.Footwear;
import lesson8.homework.man.Footwear.NikeFootwear;
import lesson8.homework.man.Footwear.PumaFootwear;
import lesson8.homework.man.Jacket.AdidasJacket;
import lesson8.homework.man.Jacket.Jacket;
import lesson8.homework.man.Jacket.NikeJacket;
import lesson8.homework.man.Jacket.PumaJacket;
import lesson8.homework.man.Trousers.AdidasTrousers;
import lesson8.homework.man.Trousers.NikeTrousers;
import lesson8.homework.man.Trousers.PumaTrousers;

public class RunMan {
    public static void main(String[] args) {

        AdidasFootwear fadidas = new AdidasFootwear();
        AdidasJacket jadidas = new AdidasJacket();
        AdidasTrousers tadidas = new AdidasTrousers();

        NikeFootwear fnike = new NikeFootwear();
        NikeJacket jnike = new NikeJacket();
        NikeTrousers tnike = new NikeTrousers();

        PumaFootwear fpuma = new PumaFootwear();
        PumaJacket jpuma = new PumaJacket();
        PumaTrousers tnpuma = new PumaTrousers();


        Man man = new Man(fadidas, jadidas, tadidas);
        man.dress();
        man.undress();
    }
}
