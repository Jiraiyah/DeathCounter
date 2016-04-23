package jiraiyah.deathcounter;

import net.minecraft.scoreboard.IScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DeathEventHandler
{
    @SubscribeEvent
    public void onWordGenerateSpawnPoint( WorldEvent.CreateSpawnPosition event)
    {
        //   /scoreboard objectives add deaths deathCount Deaths
        //   /scoreboard objectives setdisplay list deaths
        World world = event.getWorld();
        ScoreObjective objective = world.getScoreboard().addScoreObjective("deaths", IScoreCriteria.DEATH_COUNT);
        objective.setDisplayName("Deaths");
        world.getScoreboard().setObjectiveInDisplaySlot(0, objective);
    }
}

