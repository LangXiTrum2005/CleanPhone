package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1687he extends AbstractC0659Dh {
    public final F8 A00;

    public C1687he(C1828k1 c1828k1, View.OnClickListener onClickListener) {
        super(c1828k1, onClickListener);
        this.A00 = new F8(c1828k1);
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final C1687he A0F(String str) {
        new AsyncTaskC1623gc(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C1688hf(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0659Dh
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
