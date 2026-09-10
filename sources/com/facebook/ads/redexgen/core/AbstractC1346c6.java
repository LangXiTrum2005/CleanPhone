package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1346c6 extends RelativeLayout implements IQ {
    public C1361cL A00;

    public AbstractC1346c6(C1828k1 c1828k1) {
        super(c1828k1);
    }

    public AbstractC1346c6(C1828k1 c1828k1, AttributeSet attributeSet, int i) {
        super(c1828k1, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.IQ
    public final void AAk(C1361cL c1361cL) {
        this.A00 = c1361cL;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.IQ
    public final void AJa(C1361cL c1361cL) {
        A08();
        this.A00 = null;
    }

    public C1361cL getVideoView() {
        return this.A00;
    }
}
