package com.bytedance.sdk.openadsdk.core.di;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends LinearLayout {
    public fi(Context context) {
        super(context);
        init();
    }

    private void init() {
        setLayoutDirection(3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        super.setGravity(jbs.ri(i));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(jbs.ri(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public fi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public fi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
