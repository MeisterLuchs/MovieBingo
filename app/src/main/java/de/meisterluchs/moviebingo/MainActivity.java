package de.meisterluchs.moviebingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    public Button b1;
    public Button i1;
    public Button n1;
    public Button g1;
    public Button o1;
    public Button b2;
    public Button i2;
    public Button n2;
    public Button g2;
    public Button o2;
    public Button b3;
    public Button i3;
    public Button g3;
    public Button o3;
    public Button b4;
    public Button i4;
    public Button n4;
    public Button g4;
    public Button o4;
    public Button b5;
    public Button i5;
    public Button n5;
    public Button g5;
    public Button o5;
    public JSONObject json;
    public TextView textView;
    public String jsonString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        textView = findViewById(R.id.textView);
/*
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("current.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(inputStreamReader.read());
            fileInputStream.close();
            inputStreamReader.close();
            jsonString = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
*/
        if (savedInstanceState != null) {
            try {
                json = new JSONObject("jsonString");
                textView.setText("1");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        else if (getIntent().getStringExtra("json") != null) {
            try {
                json = new JSONObject(getIntent().getStringExtra("json"));
                textView.setText("2");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        else {
            textView.setText("3");
            return;
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
        if (json != null) {
            jsonString = json.toString();
            FileOutputStream outputStream = null;
            try {
                outputStream = getApplicationContext().openFileOutput("current.json", 0);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                outputStream.write(jsonString.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        textView.setText(jsonString);
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
        finish();
    }
}
