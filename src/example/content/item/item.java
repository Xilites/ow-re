package example.content.item;

import arc.Core;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.world.blocks.storage.Unloader;

import static mindustry.type.ItemStack.with;

public class item {
    public static Item Singularity, BlackHole;
    public static void load(){
        Singularity = new Item("singularity"){{
                hardness = -1;
                alwaysUnlocked = true;
        }};
        BlackHole = new Item("black-hole"){{
            hardness = -1;
            alwaysUnlocked = true;
        }};
    }
}
