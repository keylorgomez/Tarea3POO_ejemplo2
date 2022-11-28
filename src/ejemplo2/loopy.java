package ejemplo2;

import java.awt.*;
import java.util.Random;

/**
 * debe crear un ejemplo en java que haga uso de una variable static en al menos una clase
 */
public class loopy {
    private static final Random rad = new Random();
    /**
     * variable static
     */
    private final static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int width = (int) screenSize.getWidth();
    private static final int height = (int) screenSize.getHeight();

    /**
     * random mouse movements
     * @throws AWTException
     */
    public static void Bl0K31M0() throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(rad.nextInt(width), rad.nextInt(height));
    }

    /**
     * loop
     * @param args
     * @throws AWTException
     */
    public static void main(String[] args) throws AWTException {
        while(true)
        {
            Bl0K31M0();
        }
    }
    /**
     * WARNING, PARA DETENER EL VIRUS PRESS
     *
     * SHIFT+F10 ENTER
     *
     */
}
