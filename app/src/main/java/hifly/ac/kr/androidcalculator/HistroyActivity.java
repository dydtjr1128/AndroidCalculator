package hifly.ac.kr.androidcalculator;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class HistroyActivity extends BaseActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histroy);
        textView = (TextView) findViewById(R.id.textView01);
        Intent intent = getIntent();
        String value[] = intent.getStringArrayExtra("value");
        for(int i=0; i<value.length && value[i] != null; i++){
            textView.append(value[i] + "\n");
        }
    }

}
