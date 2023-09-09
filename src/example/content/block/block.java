package example.content.block;

import example.content.item.BlackHole;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.storage.Unloader;
import mindustry.world.meta.BlockGroup;

import static mindustry.content.Fx.none;
import static mindustry.type.ItemStack.with;

public class block {
    public static Block CollapseMachine, SubstanceConveyor, CoreUnloader;
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
        CoreUnloader = new Unloader("CoreUnloader"){
            {
                requirements(Category.effect, with(Items.titanium, 25, Items.silicon, 30));
                speed = 60f / 11f;
                group = BlockGroup.transportation;
            }
        };
    }
}
