package com.example.miwok;

import android.view.View;
import android.widget.Toast;

    public class NumbersClickListner implements View.OnClickListener {
        @Override
        public void onClick(View view){
            Toast.makeText(view.getContext(),"open the list of numbers ",Toast.LENGTH_SHORT).show();
        }

    }

