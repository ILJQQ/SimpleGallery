package com.jikexueyuan.simplegallery;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImgView = (Button) findViewById(R.id.btnViewImg);
        btnImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);    //打开图片得启动ACTION_VIEW意图
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),  R.drawable.img);   //将图片转换为bitmap格式
                Uri uri = Uri.parse(MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, null, null));    //将bitmap转换为uri
                intent.setDataAndType(uri, "image/*");    //设置intent数据和图片格式
                startActivity(intent);
            }
        });
    }
}
