package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class  exercise_action extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises3_action);
        int data=getIntent().getIntExtra("position",-1);
       TextView tv1=findViewById(R.id.textView);
        tv1.setText(""+data);
    }
}