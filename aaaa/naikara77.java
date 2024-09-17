package naikara77;

import naikara77.abc.*;
import arc.*;
import mindustry.game.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

public class naikara77 extends Mod{

    public naikara77(){
        Events.on(EventType.ClientLoadEvent.class, e -> Renderer.init());
        Events.run(Trigger.draw, Renderer::draw);
    }
}
