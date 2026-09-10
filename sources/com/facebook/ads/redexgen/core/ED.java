package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC2188eu {
    public C1337Ek A00;

    public ED(C2300gi c2300gi) {
        super(c2300gi);
    }

    public ED(C2300gi c2300gi, AttributeSet attributeSet, int i2) {
        super(c2300gi, attributeSet, i2);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2188eu
    public final void AAv(C1337Ek c1337Ek) {
        this.A00 = c1337Ek;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2188eu
    public final void AKV(C1337Ek c1337Ek) {
        A08();
        this.A00 = null;
    }

    public C1337Ek getVideoView() {
        return this.A00;
    }
}
