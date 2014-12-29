// Take it, use it and share it.
// Human knowledge belongs to the world

import java.io.File;
import javax.swing.filechooser.FileFilter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whosyourdaddy
 */
public class Filter extends FileFilter {

    public Filter() {
    }

    public boolean accept(File f) {

        if (f.isDirectory()) {
            return true;
        }
        // Hanya file berextensi jpg gif png dan bmp yang akan ditampilkan
        String file = f.getName().toUpperCase();
        if (file.endsWith(".JPG") || file.endsWith(".GIF") || file.endsWith("PNG") || file.endsWith("BMP")) {
            return true;
        }
        return false;

    }

    public String getDescription() {
        return "Image File";
    }
}
