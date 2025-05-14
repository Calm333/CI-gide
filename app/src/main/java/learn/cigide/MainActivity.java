package learn.cigide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.editTextText);
        Button bt = findViewById(R.id.button);
        Button bt2 = findViewById(R.id.button2);

        bt.setOnClickListener(view -> {
            String val = et.getText().toString();

            tv.setText(val);
        });

        int res = multipliedNumber(523);
        System.out.println(res);

        bt2.setOnClickListener(view -> {
            String val = et.getText().toString();

            startShowDataActivity(val);
        });
    }

    private int multipliedNumber(int val) {
        return val * 2;
    }

    private void startShowDataActivity(String value) {
        Intent intent = new Intent(this, ShowDataActivity.class);
        intent.putExtra("data", value);
        startActivity(intent);
    }
}