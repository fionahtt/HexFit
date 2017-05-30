package com.example.fionathendean.hexfit;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorSuggestion extends AppCompatActivity {

    public static int[] RGB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_suggestion);
        RGB = getRGB(ImageChooser.colorHex);
        setComplementary(RGB);
    }

    public static int[] getRGB(final String rgb) {
        int r = Integer.parseInt(rgb.substring(0, 2), 16); // 16 for hex
        int g = Integer.parseInt(rgb.substring(3, 5), 16); // 16 for hex
        int b = Integer.parseInt(rgb.substring(6, 8), 16); // 16 for hex
        return new int[] {r, g, b};
    }

    private void setComplementary(int[] colors) {
        if(colors[0]==colors[1] && colors[1]==colors[2]){
            TextView txtView = (TextView) findViewById(R.id.complementary);
            txtView.setText("Your shirt is a neutral color! You can wear any color with this. Go " +
                    "monochrome for a clean cut look, pair with a bright pastel, or wear with another neutral color!");
        }

        else {
            int[] complementary = new int[3];
            for (int a=0; a<3;a++){
                complementary[a] = 255-colors[a];
            }

//            TextView txtView = (TextView) findViewById(R.id.complementary);
//            txtView.setText("Complementary: lime green");
            TextView txtView1 = (TextView) findViewById(R.id.neutral);
            txtView1.setText("Neutral: black, khaki, gray, white");
        }


    }

}
