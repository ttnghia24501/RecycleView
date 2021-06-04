package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ProductApdapter.IOnClickItem {
    List<Product>listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        ProductApdapter adapter = new ProductApdapter(this.listProduct,this);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);

        RecyclerView rvProduct = (RecyclerView) findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
    }
    private void initData(){
        listProduct.add(new Product("LV P1","Louis Vuitton 1","1100.000",R.drawable.p1));
        listProduct.add(new Product("LV P2","Louis Vuitton 2","1100.000",R.drawable.p2));
        listProduct.add(new Product("LV P3","Louis Vuitton 3","1100.000",R.drawable.p3));
        listProduct.add(new Product("LV P4","Louis Vuitton 4","1100.000",R.drawable.p4));
        listProduct.add(new Product("LV P5","Louis Vuitton 5","1100.000",R.drawable.p5));
        listProduct.add(new Product("LV P6","Louis Vuitton 6","1100.000",R.drawable.p6));
        listProduct.add(new Product("LV P7","Louis Vuitton 7","1100.000",R.drawable.p1));
        listProduct.add(new Product("LV P8","Louis Vuitton 8","1100.000",R.drawable.p2));
        listProduct.add(new Product("LV P9","Louis Vuitton 9","1100.000",R.drawable.p3));
        listProduct.add(new Product("LV P10","Louis Vuitton 10","1100.000",R.drawable.p4));
    }
    @Override
    public void onClickitem(int position){
        Product product = listProduct.get(position);
        Toast.makeText(this,product.getTitle(),Toast.LENGTH_SHORT).show();
    }
}