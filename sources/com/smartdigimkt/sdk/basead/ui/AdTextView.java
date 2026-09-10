package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class AdTextView extends TextView {
    public AdTextView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        setBackgroundResource(h.a(context, "myoffer_bg_banner_ad_choice", k.d));
        setTextColor(-1);
        setText(context.getResources().getString(h.a(context, "basead_ad_text", k.f38992h)));
        setTextSize(8.0f);
        setGravity(17);
        setPadding(h.a(context, 3.0f), 0, h.a(context, 3.0f), 0);
    }

    public AdTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public AdTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}
