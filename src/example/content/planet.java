package example.content;

import arc.Core;
import arc.graphics.Color;
import arc.graphics.g2d.SpriteBatch;
import arc.graphics.g2d.TextureRegion;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.game.Team;
import mindustry.graphics.g3d.*;
import mindustry.maps.planet.ErekirPlanetGenerator;
import mindustry.type.Planet;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.Env;

public class planet {
    public static Planet
    OldWorldCenter,
    OldWorld,
    NewWorld;
    public static void load(){
        OldWorldCenter = new Planet("old-world-center", null, 8f){{
            bloom = true;
            accessible = false;
            meshLoader = () -> new SunMesh(
                    this,8,
                    8,0.8,2.0,1.8,5,
                    1.8f,
                    Color.valueOf("FF6464"),
                    Color.valueOf("FF9696"),
                    Color.valueOf("6464FF"),
                    Color.valueOf("9696FF"),
                    Color.valueOf("6496FF"),
                    Color.valueOf("FF9664")
            );
        }};
        OldWorld = new Planet("old-world",OldWorldCenter,2f){{
        }};
        NewWorld = new Planet("new-world",OldWorldCenter,2f){{
        }};
    }
}
