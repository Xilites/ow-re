package example.content.item;

import mindustry.type.Item;

public class BlackHole {
    public static Item BlackHole;
    public static void load(){
        BlackHole = new Item("BlackHole"){{
            hardness = -1;
        }};
    }
}
