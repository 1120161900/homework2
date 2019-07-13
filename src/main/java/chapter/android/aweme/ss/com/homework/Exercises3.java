package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {
   // private String[] data = new String[]{"1", "2", "3", "4", "5", "7"," 8", "9", "10"," 11", "12", "13"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises3);

        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(Exercises3.this,android.R.layout.simple_list_item_1,data);
        ListView listview=(ListView)findViewById(R.id.listview);
        listview.setAdapter(new ListViewAdapter(this));

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(Exercises3.this,"点击了第几个:"+i,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Exercises3.this, exercise_action.class);

                intent.putExtra("position",i);
                System.out.println(i);
               startActivity(intent);
            }
        });

    }

}

