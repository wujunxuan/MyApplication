package com.example.jayden.myapplication;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);

        textView = findViewById(R.id.text_view);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();
                String text = "imageWidth = " + imageView.getWidth()
                        + ", imageHeight = " + imageView.getHeight()
                        + ", bitmapWidth = " + bitmap.getWidth()
                        + ", bitmapHeight = " + bitmap.getHeight()
                        + ", size = " + (bitmap.getAllocationByteCount() / 1024f / 1024f);
                textView.setText(text);
            }
        });

    }
}
