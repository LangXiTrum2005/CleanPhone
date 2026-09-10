package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class sLN extends com.bytedance.sdk.openadsdk.core.JXs.lk {
    public float Lxb;

    public sLN(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.JXs.lk, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = getLayoutParams().width;
        int i4 = getLayoutParams().height;
        float f = this.Lxb;
        if (f > 0.0f) {
            if (i3 == -2) {
                size = (int) (size2 * f);
                mode = 1073741824;
            } else if (i4 == -2) {
                size2 = (int) (size / f);
                mode2 = 1073741824;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f) {
        this.Lxb = f;
    }

    public sLN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sLN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Lxb = 0.0f;
    }
}
