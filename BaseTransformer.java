package com.example.viewpagertransformer;

import android.view.View;
import androidx.viewpager.widget.ViewPager.PageTransformer;

public abstract class BaseTransformer implements PageTransformer {
    public BaseTransformer() {
    }

    protected abstract void onTransform(View var1, float var2);

    public void transformPage(View view, float position) {
        this.onPreTransform(view, position);
        this.onTransform(view, position);
        this.onPostTransform(view, position);
    }

    protected boolean hideOffscreenPages() {
        return true;
    }

    protected boolean isPagingEnabled() {
        return false;
    }

    protected void onPreTransform(View view, float position) {
        float width = (float)view.getWidth();
        view.setRotationX(0.0F);
        view.setRotationY(0.0F);
        view.setRotation(0.0F);
        view.setScaleX(1.0F);
        view.setScaleY(1.0F);
        view.setPivotX(0.0F);
        view.setPivotY(0.0F);
        view.setTranslationY(0.0F);
        view.setTranslationX(this.isPagingEnabled() ? 0.0F : -width * position);
        if (this.hideOffscreenPages()) {
            view.setAlpha(position > -1.0F && position < 1.0F ? 1.0F : 0.0F);
        } else {
            view.setAlpha(1.0F);
        }

    }

    protected void onPostTransform(View view, float position) {
    }
}
