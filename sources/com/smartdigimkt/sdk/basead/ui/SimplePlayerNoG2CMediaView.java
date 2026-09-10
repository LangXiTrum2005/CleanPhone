package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class SimplePlayerNoG2CMediaView extends SimplePlayerMediaView {
    public SimplePlayerNoG2CMediaView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.SimplePlayerMediaView
    public void b() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_simple_player_no_g2c_media_ad_view", "layout"), this);
    }

    public SimplePlayerNoG2CMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimplePlayerNoG2CMediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
