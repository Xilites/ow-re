package example.content.item;

import arc.Core;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.world.blocks.storage.Unloader;

import static mindustry.type.ItemStack.with;

public class item {
    public static Item Singularity, BlackHole, UpdateUnloader;
    public static void load(){
        Singularity = new Item("singularity"){{
                hardness = -1;
                alwaysUnlocked = true;
            Core.atlas.find(this.name);
        }};
        BlackHole = new Item("black-hole"){{
            hardness = -1;
            alwaysUnlocked = true;
            Core.atlas.find(this.name);;
        }};
        UpdateUnloader = new Item("update"){
            {
                Core.atlas.find(this.name);
                Blocks.ductUnloader = new Unloader("duct-unloader"){
                    {
                        requirements(Category.distribution, with(Items.graphite, 20, Items.silicon, 20, Items.tungsten, 10));
                        health = 120;
                        speed = 4f;
                        solid = false;
                        underBullets = true;
                        regionRotated1 = 1;
                    }
                };
            }
        };
    }
}
