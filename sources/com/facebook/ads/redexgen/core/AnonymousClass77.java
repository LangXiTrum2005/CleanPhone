package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass77 extends C2346hS {
    public AnonymousClass77(C1662Re c1662Re) {
        super(c1662Re);
    }

    @Override // com.facebook.ads.redexgen.core.C2346hS, com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public final /* bridge */ /* synthetic */ void A44(View view, int i2, RelativeLayout.LayoutParams layoutParams) {
        super.A44(view, i2, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C2346hS, com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public final /* bridge */ /* synthetic */ void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A45(view, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C2346hS, com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public final void A4j(String str) {
        super.A4j(str);
        if (this.A00.get() == null) {
            return;
        }
        String strA03 = EnumC2193ez.A08.A03();
        String rewardedVideoError = EnumC2193ez.A09.A03();
        if (str.equals(strA03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C2346hS, com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public final /* bridge */ /* synthetic */ void A4k(String str, UL ul) {
        super.A4k(str, ul);
    }

    @Override // com.facebook.ads.redexgen.core.C2346hS, com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public final /* bridge */ /* synthetic */ void AAo(String str, C1570Nm c1570Nm) {
        super.AAo(str, c1570Nm);
    }

    @Override // com.facebook.ads.redexgen.core.C2346hS, com.facebook.ads.redexgen.core.InterfaceC1841Yh
    public final /* bridge */ /* synthetic */ void ADJ(int i2) {
        super.ADJ(i2);
    }
}
