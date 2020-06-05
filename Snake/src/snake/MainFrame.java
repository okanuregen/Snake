/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author okan.uregen
 */
public class MainFrame extends JFrame {

    private int mWidth = 800;
    private int mHeight = 800;
    private static boolean check = true; //for the just one frame

    private MainFrame() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDimension();
        setResizable(false);
        
        SubFrame s = new SubFrame();
        add(s);

    }

    public int getmWidth() {
        return mWidth;
    }

    public int getmHeight() {
        return mHeight;
    }

    public static MainFrame getMain() { // for the just one frame 

        if (check) {
            check = false;
            return new MainFrame();
        } else {
            return null;
        }

    }

    public void setDimension() { //EKRANIN TAM ORTASINA
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize(); //EKRANIN BOUYTUUNU TUTAR
        int x = 0;
        int y = 0;

        if (mWidth + 100 > dm.width) {
            mWidth = dm.width - 100;
        }
        if (mHeight + 100 > dm.height) {
            mHeight = dm.height - 100;
        }

        x = (dm.width - mWidth) / 2;
        y = (dm.height - mHeight) / 2;

        this.setBounds(x, y, mWidth, mHeight);

    }

}
