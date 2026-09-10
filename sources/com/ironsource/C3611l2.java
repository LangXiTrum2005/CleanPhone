package com.ironsource;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3611l2 extends com.ironsource.mediationsdk.e.a {
    public C3611l2(U1 u1, URL url, JSONObject jSONObject, boolean z, C3733s2 c3733s2) {
        super(u1, url, jSONObject, z, c3733s2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z, U1 u1, long j) {
        try {
            if (z) {
                ((InterfaceC3486e2) u1).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                u1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (Exception e) {
            C3631m4.d().a(e);
            u1.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }
}
