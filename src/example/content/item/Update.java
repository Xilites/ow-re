package example.content.item;

import arc.Core;
import example.content.item.item;
import mindustry.content.Blocks;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.world.Block;

import static mindustry.type.ItemStack.with;

public class Update extends Item {
    public Update(String name) {
        super(name);
        loadIcon();
    }
}
