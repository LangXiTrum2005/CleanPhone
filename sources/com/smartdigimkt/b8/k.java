package com.smartdigimkt.b8;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class k extends a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f33985u = "k";
    boolean t;

    public k(int i2, String str, com.smartdigimkt.w6.l lVar, Map<String, Object> map) {
        super(new com.smartdigimkt.c8.j(i2, str, lVar, map));
        this.t = false;
    }

    private void k() {
        String string;
        try {
            string = new JSONObject(this.f33979e.g()).toString();
        } catch (Throwable unused) {
            string = new JSONObject().toString();
        }
        String str = string;
        int iL = this.f33979e.l();
        com.smartdigimkt.c8.d dVar = this.f33979e;
        com.smartdigimkt.w6.l lVarN = dVar instanceof com.smartdigimkt.c8.j ? ((com.smartdigimkt.c8.j) dVar).n() : null;
        if (lVarN != null) {
            com.smartdigimkt.q3.c.a().a(iL, this.f33977b, str, lVarN.Q0());
        }
    }

    public void a(boolean z2) {
        this.t = z2;
    }

    @Override // com.smartdigimkt.b8.a
    public void a(int i2) {
        if (this.t) {
            this.f33979e.m();
            if (com.smartdigimkt.q3.c.a().a(i2)) {
                k();
            }
        }
    }
}
