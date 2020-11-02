package com.christelle.hostelbookingapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import com.christelle.hostelbookingapp.adapter.RecentAdapter;
import com.christelle.hostelbookingapp.adapter.TopRoomsAdapter;
import com.christelle.hostelbookingapp.model.RecentsData;
import com.christelle.hostelbookingapp.model.TopRoomsData;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainScreen extends AppCompatActivity {

    RecyclerView recentRecycler, toproomsrecycler;
    RecentAdapter recentAdapter;
    TopRoomsAdapter topRoomsAdapter;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        //Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // adding dummy data in our model class
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgris Hills", "India", "From $300", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgris Hills", "India", "From $300", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgris Hills", "India", "From $300", R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopRoomsData> topRoomsDataList = new ArrayList<>();
        topRoomsDataList.add(new TopRoomsData("Kasimir Hill", "India", "From $200 - $500", R.drawable.topplaces));
        topRoomsDataList.add(new TopRoomsData("Kasimir Hill", "India", "From $200 - $500", R.drawable.topplaces));
        topRoomsDataList.add(new TopRoomsData("Kasimir Hill", "India", "From $200 - $500", R.drawable.topplaces));
        topRoomsDataList.add(new TopRoomsData("Kasimir Hill", "India", "From $200 - $500", R.drawable.topplaces));
        topRoomsDataList.add(new TopRoomsData("Kasimir Hill", "India", "From $200 - $500", R.drawable.topplaces));

        setToproomsrecycler(topRoomsDataList);


    }

    private void setRecentRecycler(List<RecentsData> recentsDataList) {

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentAdapter = new RecentAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentAdapter);
    }

    private void setToproomsrecycler(List<TopRoomsData> topRoomsDataList) {

        toproomsrecycler = findViewById(R.id.top_rooms_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        toproomsrecycler.setLayoutManager(layoutManager);
        topRoomsAdapter = new TopRoomsAdapter(this, topRoomsDataList);
        toproomsrecycler.setAdapter(recentAdapter);
    }
}