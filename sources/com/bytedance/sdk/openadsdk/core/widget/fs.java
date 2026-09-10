package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class fs extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    public float qdl;

    public fs(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.lnr, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i4 = getLayoutParams().width;
        int i5 = getLayoutParams().height;
        float f = this.qdl;
        if (f > 0.0f) {
            if (i4 == -2) {
                size = (int) (size2 * f);
                mode = 1073741824;
            } else if (i5 == -2) {
                size2 = (int) (size / f);
                mode2 = 1073741824;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f) {
        this.qdl = f;
    }

    public fs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fs(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.qdl = 0.0f;
    }
}
