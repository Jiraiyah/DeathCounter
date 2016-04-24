/**
 * Copyright 2016 DeathCounter (Jiraiyah)
 *
 * project link :
 *
 * Licensed under The MIT License (MIT);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://opensource.org/licenses/MIT
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

    @SubscribeEvent
    public void onWordGenerateSpawnPoint( WorldEvent.Load event)
    {
        World world = event.getWorld();
        ScoreObjective objective = world.getScoreboard().getObjective("deaths");
        if (objective == null)
        {
            objective = world.getScoreboard().addScoreObjective("deaths", IScoreCriteria.DEATH_COUNT);
            objective.setDisplayName("Deaths");
            world.getScoreboard().setObjectiveInDisplaySlot(0, objective);
        }
    }
}

