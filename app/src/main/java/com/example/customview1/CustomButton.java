package com.example.customview1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class CustomButton extends androidx.appcompat.widget.AppCompatButton {
    private Paint color1;
    private Paint color2;
    private int bgColor1 = android.R.color.holo_red_light;
    private int bgColor2 = android.R.color.holo_green_light;
    private int textColors = R.color.black;
    private Paint textColor;
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
//        textColor = new Paint(Paint.ANTI_ALIAS_FLAG);
//        textColor.setColor(getResources().getColor(R.color.black));
//        textColor.setStyle(Paint.Style.FILL_AND_STROKE);
//        textColor.setTextAlign(Paint.Align.CENTER);
//        textColor.setTextSize(40f);

//        color1 = new Paint(Paint.ANTI_ALIAS_FLAG);
//        color1.setColor(Color.RED);
//        color2 = new Paint(Paint.ANTI_ALIAS_FLAG);
//        color2.setColor(Color.GREEN);
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
