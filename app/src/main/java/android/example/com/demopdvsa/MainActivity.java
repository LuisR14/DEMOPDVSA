package android.example.com.demopdvsa;
import java.util.Locale;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import cn.com.aratek.dev.Terminal;



public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.boton1);

        if (Config.HAS_FINGERPRINT_DEVICE) {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),FingerprintDemo.class);
                    startActivity(intent);
                }
            });

        }




    }




}



