package de.meisterluchs.moviebingo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button B1;
    public Button I1;
    public Button N1;
    public Button G1;
    public Button O1;
    public Button B2;
    public Button I2;
    public Button N2;
    public Button G2;
    public Button O2;
    public Button B3;
    public Button I3;
    public Button G3;
    public Button O3;
    public Button B4;
    public Button I4;
    public Button N4;
    public Button G4;
    public Button O4;
    public Button B5;
    public Button I5;
    public Button N5;
    public Button G5;
    public Button O5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.B1);
        I1 = findViewById(R.id.I1);
        N1 = findViewById(R.id.N1);
        G1 = findViewById(R.id.G1);
        O1 = findViewById(R.id.O1);
        B2 = findViewById(R.id.B2);
        I2 = findViewById(R.id.I2);
        N2 = findViewById(R.id.N2);
        G2 = findViewById(R.id.G2);
        O2 = findViewById(R.id.O2);
        B3 = findViewById(R.id.B3);
        I3 = findViewById(R.id.I3);
        G3 = findViewById(R.id.G3);
        O3 = findViewById(R.id.O3);
        B4 = findViewById(R.id.B4);
        I4 = findViewById(R.id.I4);
        N4 = findViewById(R.id.N4);
        G4 = findViewById(R.id.G4);
        O4 = findViewById(R.id.O4);
        B5 = findViewById(R.id.B5);
        I5 = findViewById(R.id.I5);
        N5 = findViewById(R.id.N5);
        G5 = findViewById(R.id.G5);
        O5 = findViewById(R.id.O5);
    }

    // called when button is pressed
    public void tapButton(View activity_main) {
        ColorDrawable buttonColor;
        int colorId;
        switch (activity_main.getId()) {
            case (R.id.B1):
                buttonColor = (ColorDrawable) B1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    B1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    B1.setBackgroundColor(-5592406);
                }
            case (R.id.I1):
                buttonColor = (ColorDrawable) I1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    I1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    I1.setBackgroundColor(-5592406);
                }
            case (R.id.N1):
                buttonColor = (ColorDrawable) N1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    N1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    N1.setBackgroundColor(-5592406);
                }
            case (R.id.G1):
                buttonColor = (ColorDrawable) G1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    G1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    G1.setBackgroundColor(-5592406);
                }
            case (R.id.O1):
                buttonColor = (ColorDrawable) O1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    O1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    O1.setBackgroundColor(-5592406);
                }
            case (R.id.B2):
                buttonColor = (ColorDrawable) B2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    B2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    B2.setBackgroundColor(-5592406);
                }
            case (R.id.I2):
                buttonColor = (ColorDrawable) I2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    I2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    I2.setBackgroundColor(-5592406);
                }
            case (R.id.N2):
                buttonColor = (ColorDrawable) N2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    N2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    N2.setBackgroundColor(-5592406);
                }
            case (R.id.G2):
                buttonColor = (ColorDrawable) G2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    G2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    G2.setBackgroundColor(-5592406);
                }
            case (R.id.O2):
                buttonColor = (ColorDrawable) O2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    O2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    O2.setBackgroundColor(-5592406);
                }
            case (R.id.B3):
                buttonColor = (ColorDrawable) B3.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    B3.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    B3.setBackgroundColor(-5592406);
                }
            case (R.id.I3):
                buttonColor = (ColorDrawable) I3.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    I3.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    I3.setBackgroundColor(-5592406);
                }
            case (R.id.G3):
                buttonColor = (ColorDrawable) G3.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    G3.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    G3.setBackgroundColor(-5592406);
                }
            case (R.id.O3):
                buttonColor = (ColorDrawable) O3.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    O3.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    O3.setBackgroundColor(-5592406);
                }
            case (R.id.B4):
                buttonColor = (ColorDrawable) B4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    B4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    B4.setBackgroundColor(-5592406);
                }
            case (R.id.I4):
                buttonColor = (ColorDrawable) I4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    I4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    I4.setBackgroundColor(-5592406);
                }
            case (R.id.N4):
                buttonColor = (ColorDrawable) N4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    N4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    N4.setBackgroundColor(-5592406);
                }
            case (R.id.G4):
                buttonColor = (ColorDrawable) G4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    G4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    G4.setBackgroundColor(-5592406);
                }
            case (R.id.O4):
                buttonColor = (ColorDrawable) O4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    O4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    O4.setBackgroundColor(-5592406);
                }
            case (R.id.B5):
                buttonColor = (ColorDrawable) B5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    B5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    B5.setBackgroundColor(-5592406);
                }
            case (R.id.I5):
                buttonColor = (ColorDrawable) I5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    I5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    I5.setBackgroundColor(-5592406);
                }
            case (R.id.N5):
                buttonColor = (ColorDrawable) N5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    N5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    N5.setBackgroundColor(-5592406);
                }
            case (R.id.G5):
                buttonColor = (ColorDrawable) G5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    G5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    G5.setBackgroundColor(-5592406);
                }
            case (R.id.O5):
                buttonColor = (ColorDrawable) O5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    O5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    O5.setBackgroundColor(-5592406);
                }
        }
    }
}
