package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class SimplePlayerBannerMediaView extends SimplePlayerMediaView {
    public SimplePlayerBannerMediaView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.SimplePlayerMediaView
    public void b() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_simple_player_banner_media_ad_view", "layout"), this);
    }

    public SimplePlayerBannerMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimplePlayerBannerMediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
