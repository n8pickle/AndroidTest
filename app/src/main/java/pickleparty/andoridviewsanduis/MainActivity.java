package pickleparty.andoridviewsanduis;

import android.content.Context;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Camera camera = new Camera();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button_id);
        final Switch switch1 = (Switch) findViewById(R.id.switch1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(switch1.isChecked()){
                    Toast.makeText(getApplicationContext(), getApplicationContext().getResources().getString(R.string.toast_string_2), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), getApplicationContext().getResources().getString(R.string.toast_string), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
