package com.example.viewpagertransformer;

import android.view.View;

public class RotateUpTransformer extends BaseTransformer {
    private static final float ROT_MOD = -15.0F;

    public RotateUpTransformer() {
    }

    protected void onTransform(View view, float position) {
        float width = (float)view.getWidth();
        float rotation = -15.0F * position;
        view.setPivotX(width * 0.5F);
        view.setPivotY(0.0F);
        view.setTranslationX(0.0F);
        view.setRotation(rotation);
    }

    protected boolean isPagingEnabled() {
        return true;
    }
}
