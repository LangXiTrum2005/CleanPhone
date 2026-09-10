package com.thinkup.core.activity.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class LoadingView extends ImageView {
    public LoadingView(Context context) {
        super(context);
        o();
    }

    private void o() {
        setImageDrawable(getResources().getDrawable(o00.o(getContext(), "core_loading", k.d)));
        try {
            setLayerType(2, null);
        } catch (Exception unused) {
        }
        o(this);
    }

    public void startAnimation() {
        o(this);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o();
    }

    private static void o(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(linearInterpolator);
        rotateAnimation.setDuration(1000L);
        view.startAnimation(rotateAnimation);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        o();
    }
}
