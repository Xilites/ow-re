package example.content.block;

import example.content.item.BlackHole;
import mindustry.entities.Effect;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;

import static mindustry.content.Fx.launch;
import static mindustry.content.Fx.none;
import static mindustry.type.ItemStack.with;

public class SubstanceConveyor {
    public static Block SubstanceConveyor;
    public static void load(){
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
