package learn.cigide;

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
        Button bt = findViewById(R.id.butt);

        bt.setOnClickListener(view -> {
            String val = et.getText().toString();

            tv.setText(val);
        });

        int result = multipliedNumber(455);
        System.out.println(result);
    }

    private int multipliedNumber(int val) {
        return val * 2;
    }
}