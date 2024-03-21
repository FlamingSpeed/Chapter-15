package org.kevin.hillcrest;

import java.awt.*;
import java.awt.color.ColorSpace;

public class ColorManager {
    int r;
    int g;
    int b;
    int a;
    public String toString(Color color) {
        r=color.getRed();
        g=color.getGreen();
        b=color.getBlue();
        a=color.getAlpha();
        Color color1 = new Color(r,g,b,a);
        return String.format("Your values are %d, %d, %d, %d. This is also known as the color: %s",r,g,b,a, color1);
    }
}
