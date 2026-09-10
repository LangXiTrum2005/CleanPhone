package com.bytedance.sdk.openadsdk.core.mo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.aaj;

/* JADX INFO: loaded from: classes3.dex */
public class jpc extends TextView {
    public jpc(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        setTextDirection(5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        try {
            super.onMeasure(i2, i3);
        } catch (Throwable th) {
            aaj.lnr("PAGTextView", th.toString());
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        super.setGravity(tvp.qdl(i2));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(tvp.qdl(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public jpc(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        qdl();
    }
}
