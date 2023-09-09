package example.content.block;

import example.content.item.BlackHole;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;

import static mindustry.content.Fx.none;
import static mindustry.type.ItemStack.with;

public class CollapseMachine {
    public static Block CollapseMachine;
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
    }
}
