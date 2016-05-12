
package browpalsadventurejam2016.state;

import bropals.lib.simplegame.state.GameState;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Kevin
 */
public class PlayState extends GameState {

    @Override
    public void update(int i) {
    }

    @Override
    public void render(Object o) {
        Graphics2D g2 = (Graphics2D)o;
        // initial draw test
        g2.setColor(Color.BLUE);
        g2.fillRect(10, 10, 50, 50);
        g2.drawImage(getAssetManager().getImage("dog"), 100, 100, null);
    }

    @Override
    public void onEnter() {
    }

    @Override
    public void onExit() {
    }

}
