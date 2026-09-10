package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1377cb extends C0710Fg {
    public final ImageView A00;
    public final C1828k1 A01;

    public C1377cb(C1828k1 c1828k1) {
        super(c1828k1);
        this.A01 = c1828k1;
        this.A00 = new ImageView(c1828k1);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC1623gc downloadImageTask = new AsyncTaskC1623gc(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
