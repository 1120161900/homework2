package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import  android.util.Log;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * onPause onStop onDestroy onCreate onStart onResume
 */
public class Exercises1 extends AppCompatActivity {

    private static final String TAG = "Exercises1";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
    }
    protected  void onStart(){
        super.onStart();
        Log.d(TAG,"onStart");
    }
    protected  void onResume(){
        super.onResume();
        Log.d(TAG,"onResume");
    }
    protected  void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");
    }
    protected  void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");
    }
    protected  void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }


}
