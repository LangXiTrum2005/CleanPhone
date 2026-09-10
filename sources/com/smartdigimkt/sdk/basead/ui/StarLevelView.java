package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class StarLevelView extends ImageView {
    Context e0;

    public StarLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.e0 = context;
    }

    public void setState(boolean z2) {
        if (z2) {
            setImageResource(h.a(getContext(), "myoffer_splash_star", k.d));
        } else {
            setImageResource(h.a(getContext(), "myoffer_splash_star_gray", k.d));
        }
    }

    public StarLevelView(Context context) {
        this(context, null);
        this.e0 = context;
    }

    public StarLevelView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = context;
    }
}
