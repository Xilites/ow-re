package example.content;

import arc.Core;
import arc.graphics.Color;
import arc.graphics.g2d.SpriteBatch;
import arc.graphics.g2d.TextureRegion;
import mindustry.content.Planets;
import mindustry.graphics.g3d.*;
import mindustry.maps.planet.ErekirPlanetGenerator;
import mindustry.type.Planet;

public class planet {
    public static Planet
    OldWorldCenter,
    OldWorld,
    NewWorld;
    public static void load(){
        OldWorldCenter = new Planet("old-world-center", null, 4f){{
            bloom = true;
            accessible = true;
            meshLoader = () -> new SunMesh(
                    this, 5,
                    6, 0.5, 2, 2, 1,
                    1.1f,
                    Color.valueOf("FF6464"),
                    Color.valueOf("FF9696"),
                    Color.valueOf("6464FF"),
                    Color.valueOf("9696FF"),
                    Color.valueOf("6496FF"),
                    Color.valueOf("FF9664")
            );
            alwaysUnlocked = true;
        }};
        OldWorld = new Planet("old-world",OldWorldCenter,2f){{
            generator = new ErekirPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 5);
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 2, 0.15f, 0.14f, 5, Color.valueOf("eba768").a(0.75f), 2, 0.42f, 1f, 0.43f),
                    new HexSkyMesh(this, 3, 0.6f, 0.15f, 5, Color.valueOf("eea293").a(0.75f), 2, 0.42f, 1.2f, 0.45f)
            );
            landCloudColor = Color.valueOf("9696FF");
            atmosphereColor = Color.valueOf("6496FF");
        }};
        NewWorld = new Planet("new-world",OldWorldCenter,2f){{
        }};
    }
}
