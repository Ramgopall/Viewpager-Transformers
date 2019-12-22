package com.example.viewpagertransformer;

import android.view.View;

public class CubeInTransformer extends BaseTransformer {
    public CubeInTransformer() {
    }

    protected void onTransform(View view, float position) {
        view.setPivotX(position > 0.0F ? 0.0F : (float)view.getWidth());
        view.setPivotY(0.0F);
        view.setRotationY(-90.0F * position);
    }

    public boolean isPagingEnabled() {
        return true;
    }
}
