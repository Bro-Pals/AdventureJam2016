
package browpalsadventurejam2016.data;

import bropals.lib.simplegame.state.GameState;
import browpalsadventurejam2016.world.Area;
import java.io.File;

/**
 * A class that builds a level from a file.
 * @author Kevin
 */
public class LevelBuilder {

    private GameState state;
    
    public LevelBuilder(GameState state) {
        this.state = state;
    }
    
    Area constructArea(File file) {
        Area area = new Area(state);
        
        return area;
    }
    
}
