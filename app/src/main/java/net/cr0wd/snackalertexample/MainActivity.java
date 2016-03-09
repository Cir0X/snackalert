package net.cr0wd.snackalertexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.cr0wd.snackalert.SnackAlert;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
//        SnackAlert.success(view, "Test");
        SnackAlert.longInfo(view, "some text");
    }
}
