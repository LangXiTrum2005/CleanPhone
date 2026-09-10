package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2506kJ implements InterfaceC1555Mw {
    public final /* synthetic */ C2300gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2506kJ(JSONObject jSONObject, C2300gi c2300gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c2300gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final Collection<String> A7p() {
        return AbstractC1556Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final EnumC1554Mv A8K() {
        return AbstractC1556Mx.A00(this.A02);
    }
}
