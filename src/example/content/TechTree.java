package example.content;

import example.content.block.block;
import example.content.item.item;
import mindustry.content.Blocks;
import mindustry.content.Planets;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;

public class TechTree {
    public static void load(){
         mindustry.content.TechTree.TechNode TechTree = nodeRoot("Old World(旧世界)", item.Singularity,() -> {

            node(planet.OldWorldCenter, () -> {
                node(planet.OldWorld, () -> {
                    node(block.CollapseMachine, () -> {
                        node(item.BlackHole);
                        node(block.SubstanceConveyor,() -> {
                        });
                    });
                });
                node(planet.NewWorld);
            });
        });
        planet.OldWorldCenter.techTree = TechTree;
//        Planets.erekir.techTree = TechTree;
    }
}
