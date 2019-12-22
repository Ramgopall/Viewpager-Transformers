package com.example.viewpagertransformer;

import android.view.View;

public class RotateDownTransformer extends BaseTransformer {
    private static final float ROT_MOD = -15.0F;

    public RotateDownTransformer() {
    }

    protected void onTransform(View view, float position) {
        float width = (float)view.getWidth();
        float height = (float)view.getHeight();
        float rotation = -15.0F * position * -1.25F;
        view.setPivotX(width * 0.5F);
        view.setPivotY(height);
        view.setRotation(rotation);
    }

    protected boolean isPagingEnabled() {
        return true;
    }
}
