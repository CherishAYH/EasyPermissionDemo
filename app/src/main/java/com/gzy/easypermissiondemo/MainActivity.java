package com.gzy.easypermissiondemo;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.gzy.easypermission.PermissionUtil;
import com.gzy.easypermission.RequestCallBack;

/**
 * EasyPermission Test Activity
 *
 * @author gaozongyang
 * @date 2019/1/28
 */
public class MainActivity extends AppCompatActivity {

    private final String TAG = "gzy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestPermission();
    }

    private void requestPermission() {
        String[] permissions = new String[]{Manifest.permission.RECORD_AUDIO};
        PermissionUtil.requestPermission(this, permissions, new RequestCallBack() {
            @Override
            public void granted() {
                Toast.makeText(MainActivity.this, "已获取到麦克风权限", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void denied() {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG, "onRestart: ");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.e(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "onDestroy: ");
        super.onDestroy();
    }
}
