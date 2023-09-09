package example.content.block;

import example.content.item.BlackHole;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.production.GenericCrafter;

import static mindustry.content.Fx.none;
import static mindustry.type.ItemStack.with;

public class block {
    public static Block CollapseMachine, SubstanceConveyor;
    public static void load(){
        CollapseMachine = new GenericCrafter("CollapseMachine"){{
            requirements(Category.crafting, with(Items.carbide,2));

            craftEffect = none;
            outputItem = new ItemStack(BlackHole.BlackHole,2);
            hasItems = true;
            hasPower = true;
            craftTime = 60f * 2;
            itemCapacity = 50;
            size = 3;

            consumeItem(Items.carbide,2);
            consumePower(10f);
        }};
        SubstanceConveyor = new LaunchPad("SubstanceConveyor"){{
            requirements(Category.effect,with(BlackHole.BlackHole,5));
            breakEffect = none;
            destroyEffect = none;
            hasPower = true;
            hasItems = true;
            launchTime = 0;
            itemCapacity = 50;
            size = 3;

            consumePower(5f);
        }};
    }
}
