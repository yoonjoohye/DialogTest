package a67yjh00.com.example.lg.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String itemArr[]={"최승현","박보검","공유","이동욱"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);//감시자
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("첫번째 다이얼로그");
        dialog.setIcon(R.mipmap.pikachu);
        /*dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                butDialog.setText(itemArr[i]);
            }
        });*/
       dialog.setSingleChoiceItems(itemArr, 0, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int i) {
               butDialog.setText(itemArr[i]);
           }
       });
        dialog.setPositiveButton("OK",null);
        dialog.show();
    }
}
