package a67yjh00.com.example.lg.dialogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);//감시자
    }

    @Override
    public void onClick(View v) {

    }
}
