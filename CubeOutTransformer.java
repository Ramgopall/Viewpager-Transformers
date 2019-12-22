package com.example.viewpagertransformer;

import android.view.View;

public class CubeOutTransformer extends BaseTransformer {
    public CubeOutTransformer() {
    }

    protected void onTransform(View view, float position) {
        view.setPivotX(position < 0.0F ? (float)view.getWidth() : 0.0F);
        view.setPivotY((float)view.getHeight() * 0.5F);
        view.setRotationY(90.0F * position);
    }

    public boolean isPagingEnabled() {
        return true;
    }
}
