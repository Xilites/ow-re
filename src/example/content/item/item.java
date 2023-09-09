package example.content.item;

import arc.Core;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.type.Item;

public class item {
    public static Item Singularity, BlackHole, UpdateUnloader;
    public static void load(){
        Singularity = new Item("singularity"){{
                hardness = -1;
                alwaysUnlocked = true;
        }};
        BlackHole = new Item("black-hole"){{
            hardness = -1;
            alwaysUnlocked = true;
        }};
        UpdateUnloader = new Item("update"){
            {
                Blocks.ductUnloader.underBullets = false;
            }
        };
    }
}
