package mk.finki.ukim.mk.lab.bootstrap;

import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Balloon> balloons = new ArrayList<>();

    @PostConstruct
    public void init() {
        this.balloons.add(new Balloon("yellow","yellow desc"));
        this.balloons.add(new Balloon("black","black desc"));
        this.balloons.add(new Balloon("pink","pink desc"));
        this.balloons.add(new Balloon("red","red desc"));
        this.balloons.add(new Balloon("brown","brown desc"));
        this.balloons.add(new Balloon("white","white desc"));
        this.balloons.add(new Balloon("orange","orange desc"));
        this.balloons.add(new Balloon("green","green desc"));
        this.balloons.add(new Balloon("blue","blue desc"));
        this.balloons.add(new Balloon("purple","purple desc"));
    }
}
