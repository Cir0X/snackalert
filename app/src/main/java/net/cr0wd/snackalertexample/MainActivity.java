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

    public void onSuccessClick(View view) {
        SnackAlert.success(view, "success");
    }

    public void onErrorClick(View view) {
        SnackAlert.error(view, "error");
    }

    public void onInfoClick(View view) {
        SnackAlert.info(view, "info");
    }

    public void onLongSuccessClick(View view) {
        SnackAlert.longSuccess(view, "long success");
    }

    public void onLongErrorClick(View view) {
        SnackAlert.longError(view, "long error");
    }

    public void onLongInfoClick(View view) {
        SnackAlert.longInfo(view, "long info");
    }
}
