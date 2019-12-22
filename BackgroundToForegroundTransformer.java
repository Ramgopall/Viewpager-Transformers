package com.example.viewpagertransformer;

import android.view.View;

public class BackgroundToForegroundTransformer extends BaseTransformer {
    public BackgroundToForegroundTransformer() {
    }

    protected void onTransform(View view, float position) {
        float height = (float)view.getHeight();
        float width = (float)view.getWidth();
        float scale = min(position < 0.0F ? 1.0F : Math.abs(1.0F - position), 0.5F);
        view.setScaleX(scale);
        view.setScaleY(scale);
        view.setPivotX(width * 0.5F);
        view.setPivotY(height * 0.5F);
        view.setTranslationX(position < 0.0F ? width * position : -width * position * 0.25F);
    }

    private static final float min(float val, float min) {
        return val < min ? min : val;
    }
}
