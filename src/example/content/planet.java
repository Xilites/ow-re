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
        OldWorldCenter = new Planet("old-world-center", Planets.sun, 4f){{
            meshLoader = () -> new HexMesh(this, 8);
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 2, 0.2f, 0.14f, 8, Color.valueOf("eba768").a(0.75f), 2, 0.42f, 1f, 0.43f),
                    new HexSkyMesh(this, 3, 0.6f, 0.15f, 8, Color.valueOf("eea293").a(0.75f), 2, 0.42f, 1.2f, 0.45f)
            );
            alwaysUnlocked = true;
            unlockedOnLand.add(Blocks.coreBastion);
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
