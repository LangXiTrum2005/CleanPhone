package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1355Fc extends AbstractC2244fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C2138e5 A02;
    public final /* synthetic */ FY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C1355Fc(FY fy, String str, C2138e5 c2138e5, VA va, Map map, Y2 y2) {
        this.A03 = fy;
        this.A04 = str;
        this.A02 = c2138e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2244fo
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A08.get(this.A02.A02())) {
            this.A00.ABJ(this.A04, new C1957b9(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            C1564Ng.A07(this.A03.A00, this.A03.A09);
            this.A03.A08.put(this.A02.A02(), true);
        }
    }
}
