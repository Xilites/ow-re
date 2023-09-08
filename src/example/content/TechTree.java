package example.content;

import example.content.item.Singularity;
import example.content.item.item;
import mindustry.content.Planets;
import mindustry.content.TechTree.*;

import static mindustry.content.TechTree.nodeRoot;

public class TechTree {
    public static void load(){
        Planets.erekir.techTree = nodeRoot("Old World(旧世界)", item.Singularity,() -> {

        });
    }
}
