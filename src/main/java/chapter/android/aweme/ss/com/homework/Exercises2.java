package chapter.android.aweme.ss.com.homework;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static chapter.android.aweme.ss.com.homework.R.layout.activity_chatroom;
import static chapter.android.aweme.ss.com.homework.R.layout.activity_main;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来   有7个
 */
public class Exercises2 extends AppCompatActivity {

    private  ViewGroup page2;
    private TextView textview;
    private void init() {
        //page2 = findViewById(activity_main);
        textview = findViewById(R.id.exercise2_answer);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
       View view= LayoutInflater.from(this).inflate(activity_chatroom ,null);
               int viewcount;
               viewcount = getViewCount(view);
               System.out.println(viewcount);
               String VC= viewcount +"";
               init();
               textview.setText("viewcount = "+ VC);
    }



    public static int getViewCount(View view) {
        //todo 补全你的代码
        int count = 0;

            if(view instanceof  ViewGroup) {
                ViewGroup vp = (ViewGroup) view;
                for(int i =0;i<vp.getChildCount();i++)
                {
                    count++;
                    count += getViewCount(vp.getChildAt(i));
                }
            }
        return count;

    }

}
