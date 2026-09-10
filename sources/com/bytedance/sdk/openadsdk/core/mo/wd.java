package com.bytedance.sdk.openadsdk.core.mo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends RelativeLayout {
    public wd(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.RelativeLayout
    public void setGravity(int i2) {
        super.setGravity(tvp.qdl(i2));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(tvp.qdl(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
    }

    public wd(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
