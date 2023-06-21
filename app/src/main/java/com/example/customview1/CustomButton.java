package com.example.customview1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

public class CustomButton extends androidx.appcompat.widget.AppCompatButton {

    private int bgColor1 = android.R.color.holo_red_light;
    private int bgColor2 = android.R.color.holo_green_light;
    private Drawable heart;

    private boolean clicked = false;


    public CustomButton(Context context) {
        super(context);
        init();
    }

    public CustomButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        heart = ResourcesCompat.getDrawable(getResources(), R.drawable.baseline_favorite_24, null);
        setCompoundDrawablesRelativeWithIntrinsicBounds(heart, null, heart,null);
        setBackgroundColor(getResources().getColor(bgColor1));
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked = !clicked;
                int colors;
                if (clicked){colors = bgColor2;}
                else {colors = bgColor1;}
                setBackgroundColor(getResources().getColor(colors));
            }
        });
    }

}
