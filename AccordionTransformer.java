package com.example.viewpagertransformer;

import android.view.View;

public class AccordionTransformer extends BaseTransformer {
    public AccordionTransformer() {
    }

    protected void onTransform(View view, float position) {
        view.setPivotX(position < 0.0F ? 0.0F : (float)view.getWidth());
        view.setScaleX(position < 0.0F ? 1.0F + position : 1.0F - position);
    }
}
