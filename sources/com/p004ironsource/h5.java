package com.p004ironsource;

import com.p004ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class h5 extends e.a {
    public h5(r4 r4Var, URL url, JSONObject jSONObject, boolean z2, o5 o5Var) {
        super(r4Var, url, jSONObject, z2, o5Var);
    }

    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z2, r4 r4Var, long j) {
        try {
            if (z2) {
                ((a5) r4Var).a(this.f25882b, this.f + 1, j, this.j, this.f25886i);
            } else {
                r4Var.a(this.f25883c, this.d, this.f + 1, this.g, j);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            r4Var.a(1009, e2.getMessage(), this.f + 1, this.g, j);
        }
    }
}
