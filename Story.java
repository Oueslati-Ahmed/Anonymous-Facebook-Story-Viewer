package story;

import java.awt.datatransfer.Clipboard;
import java.net.URI;
import java.awt.Desktop;
import java.util.Objects;
import java.awt.datatransfer.DataFlavor;
import java.awt.Toolkit;

public class Story
{
    public static void main(final String[] args) throws Exception {
        final Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        String str = Objects.toString(c.getData(DataFlavor.stringFlavor));
        final int begin = str.indexOf("https");
        str = str.substring(begin);
        final int end = str.indexOf("\"");
        str = str.substring(0, end);
        str = str.replace("\\/", "/");
        System.out.println(str);
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(str));
        }
    }
}