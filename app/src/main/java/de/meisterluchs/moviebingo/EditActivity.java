package de.meisterluchs.moviebingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

@SuppressWarnings("ALL")
public class EditActivity extends AppCompatActivity {

    private TextView b1e;
    private TextView i1e;
    private TextView n1e;
    private TextView g1e;
    private TextView o1e;
    private TextView b2e;
    private TextView i2e;
    private TextView n2e;
    private TextView g2e;
    private TextView o2e;
    private TextView b3e;
    private TextView i3e;
    private TextView n3e;
    private TextView g3e;
    private TextView o3e;
    private TextView b4e;
    private TextView i4e;
    private TextView n4e;
    private TextView g4e;
    private TextView o4e;
    private TextView b5e;
    private TextView i5e;
    private TextView n5e;
    private TextView g5e;
    private TextView o5e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int buttonSize = (metrics.widthPixels - 24) / 5;

        b1e = findViewById(R.id.b1e);
        i1e = findViewById(R.id.i1e);
        n1e = findViewById(R.id.n1e);
        g1e = findViewById(R.id.g1e);
        o1e = findViewById(R.id.o1e);
        b2e = findViewById(R.id.b2e);
        i2e = findViewById(R.id.i2e);
        n2e = findViewById(R.id.n2e);
        g2e = findViewById(R.id.g2e);
        o2e = findViewById(R.id.o2e);
        b3e = findViewById(R.id.b3e);
        i3e = findViewById(R.id.i3e);
        n3e = findViewById(R.id.n3e);
        g3e = findViewById(R.id.g3e);
        o3e = findViewById(R.id.o3e);
        b4e = findViewById(R.id.b4e);
        i4e = findViewById(R.id.i4e);
        n4e = findViewById(R.id.n4e);
        g4e = findViewById(R.id.g4e);
        o4e = findViewById(R.id.o4e);
        b5e = findViewById(R.id.b5e);
        i5e = findViewById(R.id.i5e);
        n5e = findViewById(R.id.n5e);
        g5e = findViewById(R.id.g5e);
        o5e = findViewById(R.id.o5e);

        b1e.setMinimumWidth(0);
        i1e.setMinimumWidth(0);
        n1e.setMinimumWidth(0);
        g1e.setMinimumWidth(0);
        o1e.setMinimumWidth(0);
        b2e.setMinimumWidth(0);
        i2e.setMinimumWidth(0);
        n2e.setMinimumWidth(0);
        g2e.setMinimumWidth(0);
        o2e.setMinimumWidth(0);
        b3e.setMinimumWidth(0);
        i3e.setMinimumWidth(0);
        n3e.setMinimumWidth(0);
        g3e.setMinimumWidth(0);
        o3e.setMinimumWidth(0);
        b4e.setMinimumWidth(0);
        i4e.setMinimumWidth(0);
        n4e.setMinimumWidth(0);
        g4e.setMinimumWidth(0);
        o4e.setMinimumWidth(0);
        b5e.setMinimumWidth(0);
        i5e.setMinimumWidth(0);
        n5e.setMinimumWidth(0);
        g5e.setMinimumWidth(0);
        o5e.setMinimumWidth(0);

        b1e.setMinimumHeight(0);
        i1e.setMinimumHeight(0);
        n1e.setMinimumHeight(0);
        g1e.setMinimumHeight(0);
        o1e.setMinimumHeight(0);
        b2e.setMinimumHeight(0);
        i2e.setMinimumHeight(0);
        n2e.setMinimumHeight(0);
        g2e.setMinimumHeight(0);
        o2e.setMinimumHeight(0);
        b3e.setMinimumHeight(0);
        i3e.setMinimumHeight(0);
        n3e.setMinimumHeight(0);
        g3e.setMinimumHeight(0);
        o3e.setMinimumHeight(0);
        b4e.setMinimumHeight(0);
        i4e.setMinimumHeight(0);
        n4e.setMinimumHeight(0);
        g4e.setMinimumHeight(0);
        o4e.setMinimumHeight(0);
        b5e.setMinimumHeight(0);
        i5e.setMinimumHeight(0);
        n5e.setMinimumHeight(0);
        g5e.setMinimumHeight(0);
        o5e.setMinimumHeight(0);

        b1e.setWidth(buttonSize);
        i1e.setWidth(buttonSize);
        n1e.setWidth(buttonSize);
        g1e.setWidth(buttonSize);
        o1e.setWidth(buttonSize);
        b2e.setWidth(buttonSize);
        i2e.setWidth(buttonSize);
        n2e.setWidth(buttonSize);
        g2e.setWidth(buttonSize);
        o2e.setWidth(buttonSize);
        b3e.setWidth(buttonSize);
        i3e.setWidth(buttonSize);
        n3e.setWidth(buttonSize);
        g3e.setWidth(buttonSize);
        o3e.setWidth(buttonSize);
        b4e.setWidth(buttonSize);
        i4e.setWidth(buttonSize);
        n4e.setWidth(buttonSize);
        g4e.setWidth(buttonSize);
        o4e.setWidth(buttonSize);
        b5e.setWidth(buttonSize);
        i5e.setWidth(buttonSize);
        n5e.setWidth(buttonSize);
        g5e.setWidth(buttonSize);
        o5e.setWidth(buttonSize);

        b1e.setHeight(buttonSize);
        i1e.setHeight(buttonSize);
        n1e.setHeight(buttonSize);
        g1e.setHeight(buttonSize);
        o1e.setHeight(buttonSize);
        b2e.setHeight(buttonSize);
        i2e.setHeight(buttonSize);
        n2e.setHeight(buttonSize);
        g2e.setHeight(buttonSize);
        o2e.setHeight(buttonSize);
        b3e.setHeight(buttonSize);
        i3e.setHeight(buttonSize);
        n3e.setHeight(buttonSize);
        g3e.setHeight(buttonSize);
        o3e.setHeight(buttonSize);
        b4e.setHeight(buttonSize);
        i4e.setHeight(buttonSize);
        n4e.setHeight(buttonSize);
        g4e.setHeight(buttonSize);
        o4e.setHeight(buttonSize);
        b5e.setHeight(buttonSize);
        i5e.setHeight(buttonSize);
        n5e.setHeight(buttonSize);
        g5e.setHeight(buttonSize);
        o5e.setHeight(buttonSize);
    }

    private JSONObject createJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("b1", b1e.getText());
        json.put("i1", i1e.getText());
        json.put("n1", n1e.getText());
        json.put("g1", g1e.getText());
        json.put("o1", o1e.getText());
        json.put("b2", b2e.getText());
        json.put("i2", i2e.getText());
        json.put("n2", n2e.getText());
        json.put("g2", g2e.getText());
        json.put("o2", o2e.getText());
        json.put("b3", b3e.getText());
        json.put("i3", i3e.getText());
        json.put("g3", g3e.getText());
        json.put("o3", o3e.getText());
        json.put("b4", b4e.getText());
        json.put("i4", i4e.getText());
        json.put("n4", n4e.getText());
        json.put("g4", g4e.getText());
        json.put("o4", o4e.getText());
        json.put("b5", b5e.getText());
        json.put("i5", i5e.getText());
        json.put("n5", n5e.getText());
        json.put("g5", g5e.getText());
        json.put("o5", o5e.getText());
        return json;
    }

    private void writeBoard(String data) {
        FileOutputStream fOut = null;
        OutputStreamWriter osw = null;
        try {
            fOut = openFileOutput("current.json",0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        osw = new OutputStreamWriter(fOut);
        try {
            osw.write(data);
            osw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "gespeichert", Toast.LENGTH_SHORT).show();
        try {
            osw.close();
            fOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // called when edit button is pressed
    public void switchToMain(View activity_main) throws JSONException {
        String jsonString = createJSON().toString();
        writeBoard(jsonString);
        Intent mainActivity = new Intent(this, MainActivity.class);
        mainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainActivity);
        finish();
        }

    public void resetBoard(View activity_edit) {
        b1e.setText(R.string.b1def);
        i1e.setText(R.string.i1def);
        n1e.setText(R.string.n1def);
        g1e.setText(R.string.g1def);
        o1e.setText(R.string.o1def);
        b2e.setText(R.string.b2def);
        i2e.setText(R.string.i2def);
        n2e.setText(R.string.n2def);
        g2e.setText(R.string.g2def);
        o2e.setText(R.string.o2def);
        b3e.setText(R.string.b3def);
        i3e.setText(R.string.i3def);
        g3e.setText(R.string.g3def);
        o3e.setText(R.string.o3def);
        b4e.setText(R.string.b4def);
        i4e.setText(R.string.i4def);
        n4e.setText(R.string.n4def);
        g4e.setText(R.string.g4def);
        o4e.setText(R.string.o4def);
        b5e.setText(R.string.b5def);
        i5e.setText(R.string.i5def);
        n5e.setText(R.string.n5def);
        g5e.setText(R.string.g5def);
        o5e.setText(R.string.o5def);

    }
}
