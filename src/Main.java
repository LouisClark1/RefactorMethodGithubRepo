import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args)

    {
        URL url = null;

        BufferedImage image = null;

        try
        {
            url = new URL("https://images.fasosites.com/13458_2992719m.jpg?cv=201801231221error");
        }
        catch (MalformedURLException e1)
        {
            e1.printStackTrace();
        }

        try
        {
            image = ImageIO.read(url);

            ImageIO.write(image, "jpg", new File("C:/Users/louis/Desktop/test/output.jpg"));

            ImageIO.write(image, "png", new File("C:/Users/louis/Desktop/test/output.jpg"));

            ImageIO.write(image, "gif", new File("C:/Users/louis/Desktop/test/output.jpg"));

            ImageIO.write(image, "bmp", new File("C:/Users/louis/Desktop/test/output.jpg"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("done");
    }
}