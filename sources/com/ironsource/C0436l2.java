package com.ironsource;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0436l2 extends com.ironsource.mediationsdk.e.a {
    public C0436l2(U1 u6, URL url, JSONObject jSONObject, boolean z10, C0561s2 c0561s2) {
        super(u6, url, jSONObject, z10, c0561s2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z10, U1 u6, long j10) {
        try {
            if (z10) {
                ((InterfaceC0311e2) u6).a(this.f29516b, this.f29520f + 1, j10, this.f29524j, this.f29523i);
            } else {
                u6.a(this.f29517c, this.f29518d, this.f29520f + 1, this.f29521g, j10);
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            u6.a(1009, e10.getMessage(), this.f29520f + 1, this.f29521g, j10);
        }
    }
}
