package example.content.item;

import mindustry.type.Item;

public class Singularity {
    public static Item Singularity;
    public static void load(){
        Singularity = new Item("Singularity"){
            {
                hardness = -1;
                alwaysUnlocked = true;
            }
        };
    }
}
