package th.ac.su.myhomework1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Button checkButton = findViewById(R.id.check);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText idEditText = findViewById(R.id.id_edit_text);
                String strID = idEditText.getText().toString();
                if(strID.length() != 13){
                    Toast t = Toast.makeText(CheckActivity.this,
                            "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก ",
                            Toast.LENGTH_LONG);
                    t.show();
                }
                else if(strID.equals("1111111111111") || strID.equals("2222222222222")){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(CheckActivity.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิ์");
                    dialog.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง");
                    dialog.setPositiveButton("OK" , null);
                    dialog.show();
                }else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(CheckActivity.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิ์");
                    dialog.setMessage("คุณไม่มีสิทธิ์เลือกตั้ง");
                    dialog.setPositiveButton("OK" , null);
                    dialog.show();
                }
            }
        });

    }
}