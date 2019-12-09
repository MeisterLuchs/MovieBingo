package de.meisterluchs.moviebingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button i1;
    private Button n1;
    private Button g1;
    private Button o1;
    private Button b2;
    private Button i2;
    private Button n2;
    private Button g2;
    private Button o2;
    private Button b3;
    private Button i3;
    private Button n3;
    private Button g3;
    private Button o3;
    private Button b4;
    private Button i4;
    private Button n4;
    private Button g4;
    private Button o4;
    private Button b5;
    private Button i5;
    private Button n5;
    private Button g5;
    private Button o5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int buttonSize = (metrics.widthPixels - 24) / 5;

        b1 = findViewById(R.id.b1);
        i1 = findViewById(R.id.i1);
        n1 = findViewById(R.id.n1);
        g1 = findViewById(R.id.g1);
        o1 = findViewById(R.id.o1);
        b2 = findViewById(R.id.b2);
        i2 = findViewById(R.id.i2);
        n2 = findViewById(R.id.n2);
        g2 = findViewById(R.id.g2);
        o2 = findViewById(R.id.o2);
        b3 = findViewById(R.id.b3);
        i3 = findViewById(R.id.i3);
        n3 = findViewById(R.id.n3);
        g3 = findViewById(R.id.g3);
        o3 = findViewById(R.id.o3);
        b4 = findViewById(R.id.b4);
        i4 = findViewById(R.id.i4);
        n4 = findViewById(R.id.n4);
        g4 = findViewById(R.id.g4);
        o4 = findViewById(R.id.o4);
        b5 = findViewById(R.id.b5);
        i5 = findViewById(R.id.i5);
        n5 = findViewById(R.id.n5);
        g5 = findViewById(R.id.g5);
        o5 = findViewById(R.id.o5);

        b1.setMinimumWidth(0);
        i1.setMinimumWidth(0);
        n1.setMinimumWidth(0);
        g1.setMinimumWidth(0);
        o1.setMinimumWidth(0);
        b2.setMinimumWidth(0);
        i2.setMinimumWidth(0);
        n2.setMinimumWidth(0);
        g2.setMinimumWidth(0);
        o2.setMinimumWidth(0);
        b3.setMinimumWidth(0);
        i3.setMinimumWidth(0);
        n3.setMinimumWidth(0);
        g3.setMinimumWidth(0);
        o3.setMinimumWidth(0);
        b4.setMinimumWidth(0);
        i4.setMinimumWidth(0);
        n4.setMinimumWidth(0);
        g4.setMinimumWidth(0);
        o4.setMinimumWidth(0);
        b5.setMinimumWidth(0);
        i5.setMinimumWidth(0);
        n5.setMinimumWidth(0);
        g5.setMinimumWidth(0);
        o5.setMinimumWidth(0);

        b1.setMinimumHeight(0);
        i1.setMinimumHeight(0);
        n1.setMinimumHeight(0);
        g1.setMinimumHeight(0);
        o1.setMinimumHeight(0);
        b2.setMinimumHeight(0);
        i2.setMinimumHeight(0);
        n2.setMinimumHeight(0);
        g2.setMinimumHeight(0);
        o2.setMinimumHeight(0);
        b3.setMinimumHeight(0);
        i3.setMinimumHeight(0);
        n3.setMinimumHeight(0);
        g3.setMinimumHeight(0);
        o3.setMinimumHeight(0);
        b4.setMinimumHeight(0);
        i4.setMinimumHeight(0);
        n4.setMinimumHeight(0);
        g4.setMinimumHeight(0);
        o4.setMinimumHeight(0);
        b5.setMinimumHeight(0);
        i5.setMinimumHeight(0);
        n5.setMinimumHeight(0);
        g5.setMinimumHeight(0);
        o5.setMinimumHeight(0);

        b1.setWidth(buttonSize);
        i1.setWidth(buttonSize);
        n1.setWidth(buttonSize);
        g1.setWidth(buttonSize);
        o1.setWidth(buttonSize);
        b2.setWidth(buttonSize);
        i2.setWidth(buttonSize);
        n2.setWidth(buttonSize);
        g2.setWidth(buttonSize);
        o2.setWidth(buttonSize);
        b3.setWidth(buttonSize);
        i3.setWidth(buttonSize);
        n3.setWidth(buttonSize);
        g3.setWidth(buttonSize);
        o3.setWidth(buttonSize);
        b4.setWidth(buttonSize);
        i4.setWidth(buttonSize);
        n4.setWidth(buttonSize);
        g4.setWidth(buttonSize);
        o4.setWidth(buttonSize);
        b5.setWidth(buttonSize);
        i5.setWidth(buttonSize);
        n5.setWidth(buttonSize);
        g5.setWidth(buttonSize);
        o5.setWidth(buttonSize);

        b1.setHeight(buttonSize);
        i1.setHeight(buttonSize);
        n1.setHeight(buttonSize);
        g1.setHeight(buttonSize);
        o1.setHeight(buttonSize);
        b2.setHeight(buttonSize);
        i2.setHeight(buttonSize);
        n2.setHeight(buttonSize);
        g2.setHeight(buttonSize);
        o2.setHeight(buttonSize);
        b3.setHeight(buttonSize);
        i3.setHeight(buttonSize);
        n3.setHeight(buttonSize);
        g3.setHeight(buttonSize);
        o3.setHeight(buttonSize);
        b4.setHeight(buttonSize);
        i4.setHeight(buttonSize);
        n4.setHeight(buttonSize);
        g4.setHeight(buttonSize);
        o4.setHeight(buttonSize);
        b5.setHeight(buttonSize);
        i5.setHeight(buttonSize);
        n5.setHeight(buttonSize);
        g5.setHeight(buttonSize);
        o5.setHeight(buttonSize);

        String jsonString = null;
        JSONObject json = null;
        boolean load = false;
        try {
            jsonString = readBoard();
            load = true;
        } catch (NullPointerException e) {
            Toast.makeText(this, "Welcome to Movie Bingo!", Toast.LENGTH_SHORT).show();
        }

        if (load) {
            try {
                json = new JSONObject(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                b1.setText(json.getString("b1"));
                i1.setText(json.getString("i1"));
                n1.setText(json.getString("n1"));
                g1.setText(json.getString("g1"));
                o1.setText(json.getString("o1"));
                b2.setText(json.getString("b2"));
                i2.setText(json.getString("i2"));
                n2.setText(json.getString("n2"));
                g2.setText(json.getString("g2"));
                o2.setText(json.getString("o2"));
                b3.setText(json.getString("b3"));
                i3.setText(json.getString("i3"));
                g3.setText(json.getString("g3"));
                o3.setText(json.getString("o3"));
                b4.setText(json.getString("b4"));
                i4.setText(json.getString("i4"));
                n4.setText(json.getString("n4"));
                g4.setText(json.getString("g4"));
                o4.setText(json.getString("o4"));
                b5.setText(json.getString("b5"));
                i5.setText(json.getString("i5"));
                n5.setText(json.getString("n5"));
                g5.setText(json.getString("g5"));
                o5.setText(json.getString("o5"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (json != null) {
            jsonString = json.toString();
        }
    }

    private String readBoard() {
        FileInputStream fIn = null;
        char[] inputBuffer = new char[255];
        String data = null;
        try {
            fIn = openFileInput("current.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStreamReader isr = new InputStreamReader(fIn);
        try {
            isr.read(inputBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        data = new String(inputBuffer);
        try {
            isr.close();
            fIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    // called when button is pressed
    public void tapButton(View activity_main) {
        ColorDrawable buttonColor;
        int colorId;
        switch (activity_main.getId()) {
            case (R.id.b1):
                buttonColor = (ColorDrawable) b1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    b1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    b1.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.i1):
                buttonColor = (ColorDrawable) i1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    i1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    i1.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.n1):
                buttonColor = (ColorDrawable) n1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    n1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    n1.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.g1):
                buttonColor = (ColorDrawable) g1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    g1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    g1.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.o1):
                buttonColor = (ColorDrawable) o1.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    o1.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    o1.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.b2):
                buttonColor = (ColorDrawable) b2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    b2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    b2.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.i2):
                buttonColor = (ColorDrawable) i2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    i2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    i2.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.n2):
                buttonColor = (ColorDrawable) n2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    n2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    n2.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.g2):
                buttonColor = (ColorDrawable) g2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    g2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    g2.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.o2):
                buttonColor = (ColorDrawable) o2.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    o2.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    o2.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.b3):
                buttonColor = (ColorDrawable) b3.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    b3.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    b3.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.i3):
                buttonColor = (ColorDrawable) i3.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    i3.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    i3.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.g3):
                buttonColor = (ColorDrawable) g3.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    g3.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    g3.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.o3):
                buttonColor = (ColorDrawable) o3.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    o3.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    o3.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.b4):
                buttonColor = (ColorDrawable) b4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    b4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    b4.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.i4):
                buttonColor = (ColorDrawable) i4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    i4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    i4.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.n4):
                buttonColor = (ColorDrawable) n4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    n4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    n4.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.g4):
                buttonColor = (ColorDrawable) g4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    g4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    g4.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.o4):
                buttonColor = (ColorDrawable) o4.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    o4.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    o4.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.b5):
                buttonColor = (ColorDrawable) b5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    b5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    b5.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.i5):
                buttonColor = (ColorDrawable) i5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    i5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    i5.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.n5):
                buttonColor = (ColorDrawable) n5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    n5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    n5.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.g5):
                buttonColor = (ColorDrawable) g5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    g5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    g5.setBackgroundColor(-5592406);
                }
                break;
            case (R.id.o5):
                buttonColor = (ColorDrawable) o5.getBackground();
                colorId = buttonColor.getColor();
                if (colorId == -5592406) {
                    o5.setBackgroundColor(Color.parseColor("#04B404"));
                }
                else if (colorId == Color.parseColor("#04B404")) {
                    o5.setBackgroundColor(-5592406);
                }
                break;
        }
    }
    
    // called when edit button is pressed
    public void switchToEdit(View activity_edit) {
        Intent editActivity = new Intent(this, EditActivity.class);
        startActivity(editActivity);
    }
}
