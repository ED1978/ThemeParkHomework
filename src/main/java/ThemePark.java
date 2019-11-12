import attractions.Dogems;
import attractions.Park;
import attractions.PlayGround;
import attractions.RollerCoaster;
import stalls.CandyFlossStall;
import stalls.FagStall;
import stalls.IceCreamStall;

public class ThemePark {

    private String name;
    private Dogems dogems;
    private Park park;
    private PlayGround playGround;
    private RollerCoaster rollerCoaster;
    private CandyFlossStall candyFlossStall;
    private FagStall fagStall;
    private IceCreamStall iceCreamStall;

    public ThemePark(String name){
        this.name = name;
        this.dogems = new Dogems();
        this.park = new Park();
        this.playGround = new PlayGround();
        this.rollerCoaster = new RollerCoaster();
        this.candyFlossStall = new CandyFlossStall("Francis");
        this.fagStall = new FagStall("Mavis");
        this.iceCreamStall = new IceCreamStall("Sheena");
    }

}
