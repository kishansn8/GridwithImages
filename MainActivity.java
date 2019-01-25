package com.example.gridwithimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String arr[]={"Google Plus","Windows","Woogly", "Twitter", "Facebook",
                  "Instagram", "Whatsapp", "Linkedin","Messanger","imo",
                  "Paytm", "Zomato","Swiggy","Jio","Uber","Ola"};

    int arr1[]={R.drawable.gplus,R.drawable.windows,R.drawable.woogly,R.drawable.twitter,R.drawable.fb,
                R.drawable.insta,R.drawable.wha,R.drawable.link,R.drawable.messanger,R.drawable.imo,
                R.drawable.paytm,R.drawable.zomato, R.drawable.swiggy,R.drawable.jio,R.drawable.uber,
                R.drawable.ola};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=(GridView)findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arr.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater infla=getLayoutInflater();

            View v= infla.inflate(R.layout.grid_,null);

            TextView tv1=(TextView)v.findViewById(R.id.textView2);
            ImageView imageview=(ImageView)v.findViewById(R.id.imageView2);

            tv1.setText(arr[position]);
            imageview.setImageResource(arr1[position]);

            return v;
        }
    }
}
