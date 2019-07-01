package de.meisterluchs.moviebingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    // called when edit button is pressed
    public void switchToEdit(View activity_main) {
//        function to save text fields as JSON
        onBackPressed();
    }
}
