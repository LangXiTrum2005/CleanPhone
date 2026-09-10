package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1414dC extends JK {
    public final /* synthetic */ A7 A00;
    public final /* synthetic */ C0647Cv A01;
    public final /* synthetic */ C0758Hc A02;
    public final /* synthetic */ C1411d9 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C1414dC(C1411d9 c1411d9, String str, C0758Hc c0758Hc, A7 a7, Map map, C0647Cv c0647Cv) {
        this.A03 = c1411d9;
        this.A04 = str;
        this.A02 = c0758Hc;
        this.A00 = a7;
        this.A05 = map;
        this.A01 = c0647Cv;
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A05.get(this.A02.A02())) {
            this.A00.AB0(this.A04, new FB(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            C03962h.A07(this.A03.A00, this.A03.A06);
            this.A03.A05.put(this.A02.A02(), true);
        }
    }
}
