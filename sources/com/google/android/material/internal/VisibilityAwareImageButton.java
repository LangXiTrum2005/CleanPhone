package com.google.android.material.internal;

import android.widget.ImageButton;

/* JADX INFO: loaded from: classes4.dex */
public class VisibilityAwareImageButton extends ImageButton {
    public int e0;

    public final int getUserSetVisibility() {
        return this.e0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.e0 = i2;
    }
}
