package com.example.viewpagertransformer;

import android.view.View;

public class StackTransformer extends BaseTransformer {
    public StackTransformer() {
    }

    protected void onTransform(View view, float position) {
        view.setTranslationX(position < 0.0F ? 0.0F : (float)(-view.getWidth()) * position);
    }
}
