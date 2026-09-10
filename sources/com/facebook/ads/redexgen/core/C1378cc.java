package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1378cc extends AbstractC04805q<C1376ca> {
    public final int A00;
    public final C1828k1 A01;
    public final ViewOnClickListenerC1617gW A02;
    public final List<String> A03;

    public C1378cc(C1828k1 c1828k1, List<String> screenshotUrls, int i, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c1828k1;
        this.A02 = viewOnClickListenerC1617gW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C1376ca A0D(ViewGroup viewGroup, int i) {
        C1377cb c1377cb = new C1377cb(this.A01);
        if (C05789m.A1B(this.A01)) {
            c1377cb.setOnClickListener(new I6(this));
        }
        return new C1376ca(c1377cb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1376ca c1376ca, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i >= A0C() + (-1) ? this.A00 * 4 : this.A00, 0);
        c1376ca.A0j().setLayoutParams(marginLayoutParams);
        c1376ca.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    public final int A0C() {
        return this.A03.size();
    }
}
