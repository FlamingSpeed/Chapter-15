package org.kevin.hillcrest;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String, Color> favoriteColors = new HashMap<>();
        favoriteColors.put("Alex", Color.blue);
        favoriteColors.put("Matus", Color.PINK);
        favoriteColors.put("Srikar", Color.BLACK);
        favoriteColors.put("Hailie", Color.GREEN);
        favoriteColors.put("Alex", Color.CYAN);
        ColorManager colorManager = new ColorManager();
        System.out.println(colorManager.toString(favoriteColors.get("Alex")));

        var keys = favoriteColors.keySet();
        for(var key: keys){
            if(key.equals("Alex")){
                favoriteColors.put("Alex", Color.CYAN);
            }
            var color = colorManager.toString(favoriteColors.get(key));
            System.out.printf("%s : %s\n", key, color);
        }
    }
}
