package mcm.edu.ph.gamutan_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayText);

        String firstName = "Adrian";
        char middleInitial = 'C';
        String lastName = "Gamutan";
        int myAge = 18;
        float myDreamTVLGrade = 75.0f;
        double myMoney =5.25;




        display.setText("My name is "+firstName+ " "
                +String.valueOf(middleInitial)+ " "
                +lastName+ ",\nI am "
                +myAge+ " years old, with "
                +Double.toString(myMoney)+ " pesos in my pocket.\nI want my grade in TVL3 to be more than "
                +String.valueOf(myDreamTVLGrade)+ ".");

        boolean amImarried = false;

        
    }
}