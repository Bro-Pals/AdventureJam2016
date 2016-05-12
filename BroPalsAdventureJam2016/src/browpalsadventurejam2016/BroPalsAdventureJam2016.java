/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browpalsadventurejam2016;

import browpalsadventurejam2016.state.PlayState;
import bropals.lib.simplegame.AWTGameWindow;
import bropals.lib.simplegame.GameStateRunner;
import bropals.lib.simplegame.io.AssetManager;
import java.io.File;

/**
 *
 * @author Pants
 */
public class BroPalsAdventureJam2016 {

    public static int RES_WIDTH = 1024;
    public static int RES_HEIGHT = 768;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AssetManager assetManager = new AssetManager(new File("assets"), true);
        assetManager.loadImagesInDirectories("img", true);
        AWTGameWindow window = new AWTGameWindow("Adventure Jam 2016", RES_WIDTH, RES_HEIGHT);
        GameStateRunner runner = new GameStateRunner(window, assetManager);
        runner.setState(new PlayState());
        runner.loop();
    }
    
}
