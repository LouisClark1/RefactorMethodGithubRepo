import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args){
            int imageWidth = 1080;
            int imageHeight = 1080;


        URL url = null;

        BufferedImage originalImage = null;

        try
        {
            //url = new URL("https://images.fasosites.com/13458_2992719m.jpg?cv=201801231221error");
            url = new URL("https://images.fasosites.com/13458_2992719m.jpg?cv=201801231221error");
        }
        catch (MalformedURLException e1)
        {
            e1.printStackTrace();
        }

        try
        {
            originalImage = ImageIO.read(url);

            Image newResizedImage = originalImage
                    .getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);



            ImageIO.write(convertToBufferedImage(newResizedImage), "jpg", new File("C:/Users/louis/Desktop/test/output.jpg"));

            ImageIO.write(convertToBufferedImage(newResizedImage), "png", new File("C:/Users/louis/Desktop/test/output.jpg"));

            ImageIO.write(convertToBufferedImage(newResizedImage), "gif", new File("C:/Users/louis/Desktop/test/output.jpg"));

            ImageIO.write(convertToBufferedImage(newResizedImage), "bmp", new File("C:/Users/louis/Desktop/test/output.jpg"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("done");

    }

    public static BufferedImage convertToBufferedImage(Image img) {

        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bi = new BufferedImage(
                img.getWidth(null), img.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);

        Graphics2D graphics2D = bi.createGraphics();
        graphics2D.drawImage(img, 0, 0, null);
        graphics2D.dispose();

        return bi;
    }
}