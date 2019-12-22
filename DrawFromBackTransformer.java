package com.example.viewpagertransformer;

import android.view.View;
import androidx.viewpager.widget.ViewPager.PageTransformer;

public class DrawFromBackTransformer implements PageTransformer {
    private static final float MIN_SCALE = 0.75F;

    public DrawFromBackTransformer() {
    }

    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();
        if (position >= -1.0F && position <= 1.0F) {
            float v;
            if (position <= 0.0F) {
                view.setAlpha(1.0F + position);
                view.setTranslationX((float)pageWidth * -position);
                v = 0.75F + 0.25F * (1.0F - Math.abs(position));
                view.setScaleX(v);
                view.setScaleY(v);
            } else if ((double)position > 0.5D && position <= 1.0F) {
                view.setAlpha(0.0F);
                view.setTranslationX((float)pageWidth * -position);
            } else if ((double)position > 0.3D && (double)position <= 0.5D) {
                view.setAlpha(1.0F);
                view.setTranslationX((float)pageWidth * position);
                v = 0.75F;
                view.setScaleX(v);
                view.setScaleY(v);
            } else {
                if ((double)position <= 0.3D) {
                    view.setAlpha(1.0F);
                    view.setTranslationX((float)pageWidth * position);
                    v = (float)(0.3D - (double)position);
                    v = v >= 0.25F ? 0.25F : v;
                    float scaleFactor = 0.75F + v;
                    view.setScaleX(scaleFactor);
                    view.setScaleY(scaleFactor);
                }

            }
        } else {
            view.setAlpha(0.0F);
        }
    }
}
