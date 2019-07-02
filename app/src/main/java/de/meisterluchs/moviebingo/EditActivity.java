package de.meisterluchs.moviebingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class EditActivity extends AppCompatActivity {

    public TextView b1e;
    public TextView i1e;
    public TextView n1e;
    public TextView g1e;
    public TextView o1e;
    public TextView b2e;
    public TextView i2e;
    public TextView n2e;
    public TextView g2e;
    public TextView o2e;
    public TextView b3e;
    public TextView i3e;
    public TextView g3e;
    public TextView o3e;
    public TextView b4e;
    public TextView i4e;
    public TextView n4e;
    public TextView g4e;
    public TextView o4e;
    public TextView b5e;
    public TextView i5e;
    public TextView n5e;
    public TextView g5e;
    public TextView o5e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
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
    }

    public JSONObject createJSON() throws JSONException {
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

    // called when edit button is pressed
    public void switchToMain(View activity_main) throws JSONException {
        Intent mainActivity = new Intent(this, MainActivity.class);
        mainActivity.putExtra("json", createJSON().toString());
        startActivity(mainActivity);
        finish();
        }
}
