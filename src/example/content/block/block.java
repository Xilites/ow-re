package example.content.block;

import arc.Core;
import example.content.item.item;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.production.GenericCrafter;

import static mindustry.content.Fx.none;
import static mindustry.type.ItemStack.with;

public class block {
    public static Block CollapseMachine, SubstanceConveyor, Update;
    public static void load(){
        CollapseMachine = new GenericCrafter("collapse-machine"){{
            requirements(Category.crafting, with(Items.carbide,2));

            craftEffect = none;
            outputItem = new ItemStack(item.BlackHole,2);
            hasItems = true;
            hasPower = true;
            craftTime = 60f * 2;
            itemCapacity = 50;
            size = 2;

            consumeItem(Items.carbide,2);
            consumePower(10f);

            Core.atlas.find(this.name);
        }};
        SubstanceConveyor = new LaunchPad("substance-conveyor"){{
            requirements(Category.effect,with(item.BlackHole,5));
            breakEffect = none;
            destroyEffect = none;
            hasPower = true;
            hasItems = true;
            launchTime = 0;
            itemCapacity = 50;
            size = 2;

            consumePower(5f);

            Core.atlas.find(this.name);
        }};
    }
}
