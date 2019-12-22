package com.example.viewpagertransformer;

import android.view.View;

public class ZoomInTransformer extends BaseTransformer {
    public ZoomInTransformer() {
    }

    protected void onTransform(View view, float position) {
        float scale = position < 0.0F ? position + 1.0F : Math.abs(1.0F - position);
        view.setScaleX(scale);
        view.setScaleY(scale);
        view.setPivotX((float)view.getWidth() * 0.5F);
        view.setPivotY((float)view.getHeight() * 0.5F);
        view.setAlpha(position >= -1.0F && position <= 1.0F ? 1.0F - (scale - 1.0F) : 0.0F);
    }
}
