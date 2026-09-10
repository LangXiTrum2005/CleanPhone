package com.bytedance.sdk.openadsdk.core.mo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends FrameLayout {
    public lnr(Context context) {
        super(context);
        init();
    }

    private void init() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(tvp.qdl(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
    }

    public lnr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public lnr(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }
}
