package com.example.fionathendean.hexfit;

//import android.support.design.widget.FloatingActionButton;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontScreen extends AppCompatActivity {

    private Button startButton;
    private String startButtonText;
//    private FloatingActionButton infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_screen);
        setUpComponents();
    }

    private void setUpComponents() {
        startButton = (Button) findViewById(R.id.getStartedButton);
        startButtonText = (String) startButton.getText();
//        infoButton = (FloatingActionButton) findViewById(R.id.fab);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FrontScreen.this,ImageChooser.class);
                startActivity(i);
            }
        });
    }
}
