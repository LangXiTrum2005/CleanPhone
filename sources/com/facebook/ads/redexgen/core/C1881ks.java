package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1881ks extends C4L {
    public static String[] A01 = {"TEi6qE8rkCQGgGy4v7NzSxsVq0pzva7O", "YDOvw0rnr4UKw3Mnxoslotwc24p8", "a0zjiBNZeYiCSuvwyHtYeell8KyTQ5xY", "ogjV6WpDB35FLp8RKY", "WANqVRIVKxhPnPWopei7e1k0CZWy62T", "aZZWj5Yt51SqLR33GVZjsdPHZCc7cpWa", "7MlacYU9Pwo9bfliYZC3slRrct3tH7Ko", "0XE4m45s2Z74YdVCvJuFI2R02XTQtmXa"};
    public final C1880kr A00;

    public C1881ks(C1880kr c1880kr) {
        this.A00 = c1880kr;
    }

    @Override // com.facebook.ads.redexgen.core.C4L
    public final void A08(View view, AnonymousClass56 anonymousClass56) {
        super.A08(view, anonymousClass56);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            AnonymousClass62 layoutManager = this.A00.A01.getLayoutManager();
            if (A01[1].length() != 28) {
                throw new RuntimeException();
            }
            A01[4] = "lLG2rM4BR6TSMRI6WEis0bH1e3aTZeM";
            layoutManager.A1C(view, anonymousClass56);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C4L
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1X(view, i, bundle);
        }
        return false;
    }
}
