package com.renny.recyclerbanner;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import com.example.library.banner.RecyclerViewBannerBase;

import java.util.ArrayList;
import java.util.List;

public class NormalActivity extends AppCompatActivity {
    RecyclerViewBannerNormal banner, banner2;

//        list.add("https://picsum.photos/id/1001/1200/600.jpg");
//        list.add("https://picsum.photos/id/1001/1200/600?blur=5.jpg");
//        list.add("https://picsum.photos/id/1001/1200/600?grayscale.jpg");
//        list.add("https://picsum.photos/id/1001/1200/600?grayscale&blur=5.jpg");
//        list.add("https://picsum.photos/id/1011/1200/600.jpg");
//        list.add("https://picsum.photos/id/1101/1200/600.jpg");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        banner = (RecyclerViewBannerNormal) findViewById(R.id.banner);
        banner2 = (RecyclerViewBannerNormal) findViewById(R.id.banner2);
        List<String> list = new ArrayList<>();

        list.add("https://picsum.photos/id/1011/1200/600.jpg");

        banner.initBannerImageView(list, new RecyclerViewBannerBase.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(NormalActivity.this, "clicked:" + position, Toast.LENGTH_SHORT).show();
            }
        });
        banner2.initBannerImageView(list, new RecyclerViewBannerBase.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(NormalActivity.this, "clicked:" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
