package dw.loanu.app;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
    Button btnStart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);

    }

    private void btnStartClick() {

        startActivity(new Intent("dw.loanu.app.LoanActivity"));
    }
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnStart:
                btnStartClick();
                break;

        }
    }





}