package example.content;

import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.graphics.g3d.SunMesh;
import mindustry.type.Planet;

public class planet {
    public static Planet
            OldWorldCenter;
    public static void load(){
        OldWorldCenter = new Planet("OldWorldCenter", null, 4f){{
            bloom = true;
            accessible = false;

            meshLoader = () -> new SunMesh(
                    this, 4,
                    5, 0.3, 1.7, 1.2, 1,
                    1.1f,
                    Color.valueOf("FF6464"),
                    Color.valueOf("FF9696"),
                    Color.valueOf("6464FF"),
                    Color.valueOf("9696FF"),
                    Color.valueOf("6496FF"),
                    Color.valueOf("FF9664")
            );
        }};
    }
}
