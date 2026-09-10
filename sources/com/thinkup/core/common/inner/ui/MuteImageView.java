package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public class MuteImageView extends ImageView {
    private boolean o;

    public MuteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = false;
    }

    public void setMute(boolean z2) {
        if (z2) {
            setSelected(true);
        } else {
            setSelected(false);
        }
    }
}
