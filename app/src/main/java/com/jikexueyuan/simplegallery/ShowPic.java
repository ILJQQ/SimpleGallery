package com.jikexueyuan.simplegallery;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ShowPic extends AppCompatActivity {

    private ImageView ivShowPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_pic);

        ivShowPic = (ImageView) findViewById(R.id.ivShowPic);
        Intent getImage = getIntent();
        Uri data = getImage.getData();      //获取Intent传过来的uri数据
        ivShowPic.setImageURI(data);    //ImageView显示出来
    }
}
