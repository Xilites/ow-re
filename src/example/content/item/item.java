package example.content.item;

import mindustry.type.Item;
import example.content.item.*;

public class item {
    public static Item Singularity, BlackHole;
    public static void load(){
        Singularity = new Item("Singularity"){{
                hardness = -1;
                alwaysUnlocked = true;
        }};
        BlackHole = new Item("BlackHole"){{
            hardness = -1;
            alwaysUnlocked = true;
        }};
    }
}
