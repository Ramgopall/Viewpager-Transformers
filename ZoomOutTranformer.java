package com.example.viewpagertransformer;

import android.view.View;

public class ZoomOutTranformer extends BaseTransformer {
    public ZoomOutTranformer() {
    }

    protected void onTransform(View view, float position) {
        float scale = 1.0F + Math.abs(position);
        view.setScaleX(scale);
        view.setScaleY(scale);
        view.setPivotX((float)view.getWidth() * 0.5F);
        view.setPivotY((float)view.getHeight() * 0.5F);
        view.setAlpha(position >= -1.0F && position <= 1.0F ? 1.0F - (scale - 1.0F) : 0.0F);
        if (position == -1.0F) {
            view.setTranslationX((float)(view.getWidth() * -1));
        }

    }
}
