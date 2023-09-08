package example.content.item;

import mindustry.type.Item;

public class Singularity {
    public static Item Singularity;
    public static void load(){
        Singularity = new Item("奇点"){
            {
                hardness = -1;
            }
        };
    }
}
