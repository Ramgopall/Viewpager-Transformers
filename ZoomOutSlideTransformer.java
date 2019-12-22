package com.example.viewpagertransformer;

import android.view.View;

public class ZoomOutSlideTransformer extends BaseTransformer {
    private static final float MIN_SCALE = 0.85F;
    private static final float MIN_ALPHA = 0.5F;

    public ZoomOutSlideTransformer() {
    }

    protected void onTransform(View view, float position) {
        if (position >= -1.0F || position <= 1.0F) {
            float height = (float)view.getHeight();
            float scaleFactor = Math.max(0.85F, 1.0F - Math.abs(position));
            float vertMargin = height * (1.0F - scaleFactor) / 2.0F;
            float horzMargin = (float)view.getWidth() * (1.0F - scaleFactor) / 2.0F;
            view.setPivotY(0.5F * height);
            if (position < 0.0F) {
                view.setTranslationX(horzMargin - vertMargin / 2.0F);
            } else {
                view.setTranslationX(-horzMargin + vertMargin / 2.0F);
            }

            view.setScaleX(scaleFactor);
            view.setScaleY(scaleFactor);
            view.setAlpha(0.5F + (scaleFactor - 0.85F) / 0.14999998F * 0.5F);
        }

    }
}
