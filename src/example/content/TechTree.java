package example.content;

import example.content.block.CollapseMachine;
import example.content.block.SubstanceConveyor;
import example.content.block.block;
import example.content.item.BlackHole;
import example.content.item.Singularity;
import example.content.item.item;
import mindustry.content.Blocks;
import mindustry.content.Planets;
import mindustry.content.TechTree.*;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;

public class TechTree {
    public static void load(){
        Planets.erekir.techTree = nodeRoot("Old World(旧世界)", item.Singularity,() -> {
            node(block.CollapseMachine, () -> {
                node(item.BlackHole);
                node(block.SubstanceConveyor,() -> {
                    node(item.UpdateUnloader);
                });
            });
        });
        if (item.UpdateUnloader.unlocked()){
            Blocks.ductUnloader.underBullets = false;
        }
    }
}
