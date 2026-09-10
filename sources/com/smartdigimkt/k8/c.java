package com.smartdigimkt.k8;

import com.smartdigimkt.c8.l;
import com.smartdigimkt.sdk.api.AdError;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36270c = "c";
    private static volatile c d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f36271a = new f(com.smartdigimkt.m6.b.p().k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f36272b = new e();

    public interface a {
        void a();

        void a(com.smartdigimkt.l8.e eVar);

        void a(AdError adError);

        void b();

        void b(com.smartdigimkt.l8.e eVar);
    }

    private c() {
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                try {
                    if (d == null) {
                        d = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void a(String str, com.smartdigimkt.l8.e eVar, JSONObject jSONObject, int i2) {
        this.f36271a.a(com.smartdigimkt.m6.b.p().f(), str, eVar, jSONObject, i2);
    }

    public com.smartdigimkt.l8.e a(String str, int i2) {
        return this.f36271a.a(com.smartdigimkt.m6.b.p().f(), str, i2);
    }

    public com.smartdigimkt.l8.e a(String str) {
        return a(str, 0);
    }

    public void a(com.smartdigimkt.u7.a aVar) {
        if (aVar == null) {
            return;
        }
        String strC = aVar.c();
        try {
            boolean zE = aVar.e();
            com.smartdigimkt.l8.e eVarA = aVar.a();
            l lVar = new l(strC);
            d dVar = new d(this, aVar);
            if (eVarA == null) {
                this.f36272b.a(lVar, dVar);
                return;
            }
            lVar.a(eVarA.a());
            boolean zW = eVarA.W();
            if (!zE && !zW) {
                if (!eVarA.X()) {
                    dVar.b(eVarA);
                    return;
                }
                long jQ = eVarA.Q();
                if (jQ <= 0) {
                    dVar.b(eVarA);
                } else {
                    dVar.a(jQ, eVarA);
                }
                this.f36272b.a(lVar, dVar);
                return;
            }
            this.f36272b.a(lVar, dVar);
        } catch (Throwable unused) {
        }
    }

    public void a(String str, com.smartdigimkt.l8.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f36271a.b(com.smartdigimkt.m6.b.p().f(), str, eVar.O());
    }
}
