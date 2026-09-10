package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class FH extends AbstractC1648Qq<FC> {
    public final int A00;
    public final C2300gi A01;
    public final ViewOnClickListenerC1498Kr A02;
    public final List<String> A03;

    public FH(C2300gi c2300gi, List<String> screenshotUrls, int i2, ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        this.A03 = screenshotUrls;
        this.A00 = i2;
        this.A01 = c2300gi;
        this.A02 = viewOnClickListenerC1498Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final FC A0F(ViewGroup viewGroup, int i2) {
        FD fd = new FD(this.A01);
        if (C1750Up.A1D(this.A01)) {
            fd.setOnClickListener(new ViewOnClickListenerC2167eZ(this));
        }
        return new FC(fd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0K(FC fc, int i2) {
        String str = this.A03.get(i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i2 != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i2 >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        fc.A0p().setLayoutParams(marginLayoutParams);
        fc.A0p().A00(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1648Qq
    public final int A0B() {
        return this.A03.size();
    }
}
