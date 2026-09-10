package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public class MuteImageView extends ImageView {
    private boolean e0;

    public MuteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = false;
    }

    public void setMute(boolean z2) {
        if (z2) {
            setSelected(true);
        } else {
            setSelected(false);
        }
    }
}
