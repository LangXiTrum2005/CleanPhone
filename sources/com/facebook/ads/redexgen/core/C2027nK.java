package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2027nK implements InterfaceC03871y {
    public final /* synthetic */ C1828k1 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2027nK(JSONObject jSONObject, C1828k1 c1828k1, String str) {
        this.A02 = jSONObject;
        this.A00 = c1828k1;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03871y
    public final String A7E() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03871y
    public final Collection<String> A7f() {
        return AbstractC03881z.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03871y
    public final EnumC03861x A8A() {
        return AbstractC03881z.A00(this.A02);
    }
}
