package com.impatient.ch03;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by sjchen on 8/9/16.
 */
public class ImageDemo {
    public static BufferedImage createImage(int width, int height, PixelFunction f) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = f.apply(x, y);
                image.setRGB(x, y, color.getRGB());
            }
        }
        return image;
    }

    public static void main(String[] arg) throws IOException {
        BufferedImage frechFlag = ImageDemo.createImage(150, 100, (x, y) -> {
            return x < 50 ? Color.BLUE :x< 100 ? Color.WHITE : Color.RED;
        });
        Path path = Paths.get("flag.png");
        ImageIO.write(frechFlag, "PNG",path.toFile());
        System.out.println("Image saved to "+ path.toAbsolutePath());
    }
}
