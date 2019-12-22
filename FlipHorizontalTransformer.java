package com.example.viewpagertransformer;

import android.view.View;

public class FlipHorizontalTransformer extends BaseTransformer {
    public FlipHorizontalTransformer() {
    }

    protected void onTransform(View view, float position) {
        float rotation = 180.0F * position;
        view.setAlpha(rotation <= 90.0F && rotation >= -90.0F ? 1.0F : 0.0F);
        view.setPivotX((float)view.getWidth() * 0.5F);
        view.setPivotY((float)view.getHeight() * 0.5F);
        view.setRotationY(rotation);
    }
}
