package com.smartdigimkt.expressad.video.dynview.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class AnyThinkTextView extends TextView {
    private ObjectAnimator e0;

    public AnyThinkTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.e0;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.e0;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.e0 = objectAnimator;
    }

    public AnyThinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
