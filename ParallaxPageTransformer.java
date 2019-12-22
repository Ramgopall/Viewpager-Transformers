package com.example.viewpagertransformer;

import android.view.View;

public class ParallaxPageTransformer extends BaseTransformer {
    private final int viewToParallax;

    public ParallaxPageTransformer(int viewToParallax) {
        this.viewToParallax = viewToParallax;
    }

    protected void onTransform(View view, float position) {
        int pageWidth = view.getWidth();
        if (position < -1.0F) {
            view.setAlpha(1.0F);
        } else if (position <= 1.0F) {
            view.findViewById(this.viewToParallax).setTranslationX(-position * (float)(pageWidth / 2));
        } else {
            view.setAlpha(1.0F);
        }

    }
}
