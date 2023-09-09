package example.content;

import example.content.block.block;
import example.content.item.item;
import mindustry.content.Blocks;
import mindustry.content.Planets;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;

public class TechTree {
    public static void load(){
        Planets.erekir.techTree = nodeRoot("Old World(旧世界)", item.Singularity,() -> {
            node(block.CollapseMachine, () -> {
                node(item.BlackHole);
                node(block.SubstanceConveyor,() -> {
                    node(planet.OldWorldCenter);
                });
            });
        });
    }
}
