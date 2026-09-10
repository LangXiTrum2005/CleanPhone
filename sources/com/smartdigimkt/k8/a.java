package com.smartdigimkt.k8;

import android.content.Context;
import com.inmobi.commons.core.configs.CrashConfig;
import com.smartdigimkt.n8.p;
import com.smartdigimkt.r6.h;
import com.smartdigimkt.sdk.api.AdError;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final String d = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f36257e = "AP_SY";
    private static volatile a f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36258a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.l8.a f36259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f36260c;

    /* JADX INFO: renamed from: com.smartdigimkt.k8.a$a, reason: collision with other inner class name */
    public class RunnableC0522a implements Runnable {
        final /* synthetic */ boolean X;

        public RunnableC0522a(boolean z2) {
            this.X = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b(this.X);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ JSONObject X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.l8.a f36263Y;

        public c(JSONObject jSONObject, com.smartdigimkt.l8.a aVar) {
            this.X = jSONObject;
            this.f36263Y = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextC = a.this.c();
            com.smartdigimkt.u6.e.a(com.smartdigimkt.u6.d.a(contextC)).b(com.smartdigimkt.m6.b.p().f(), this.X.toString(), "AP_SY");
            com.smartdigimkt.l8.a aVar = this.f36263Y;
            p.b(contextC, "sdm_sdk", "EU_INFO", aVar != null ? aVar.O() : 0);
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context c() {
        return com.smartdigimkt.m6.b.p().k();
    }

    private com.smartdigimkt.l8.a d() {
        com.smartdigimkt.v6.c cVar;
        try {
            List<com.smartdigimkt.v6.c> listC = com.smartdigimkt.u6.e.a(com.smartdigimkt.u6.d.a(c())).c(com.smartdigimkt.m6.b.p().f(), "AP_SY");
            if (listC != null && !listC.isEmpty() && (cVar = listC.get(0)) != null) {
                com.smartdigimkt.l8.a aVarE = com.smartdigimkt.l8.a.e(new JSONObject(cVar.d()));
                if (aVarE != null) {
                    aVarE.j(Long.parseLong(cVar.c()));
                }
                return aVarE;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static a e() {
        if (f == null) {
            synchronized (a.class) {
                try {
                    if (f == null) {
                        f = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    private com.smartdigimkt.l8.a f() {
        com.smartdigimkt.l8.a aVar = new com.smartdigimkt.l8.a();
        aVar.b(true);
        aVar.h(7200000L);
        aVar.w("0");
        aVar.j(0L);
        aVar.e(5000L);
        aVar.D(1);
        aVar.i(0L);
        aVar.H("");
        aVar.l(1);
        aVar.b(0L);
        aVar.j("");
        aVar.g(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        aVar.c(51200L);
        aVar.y(30000);
        aVar.E(0);
        aVar.i("[\"com.smartdigimkt\"]");
        aVar.k(1);
        aVar.s(2);
        return aVar;
    }

    private boolean h() {
        com.smartdigimkt.l8.a aVarB = b();
        if (aVarB == null || aVarB.M0()) {
            return true;
        }
        return aVarB.H0() + aVarB.t0() <= System.currentTimeMillis();
    }

    public long g() {
        com.smartdigimkt.l8.a aVar = this.f36259b;
        if (aVar == null || aVar.Z() == 0) {
            return 204800L;
        }
        return this.f36259b.Z();
    }

    public void i() {
        a(false);
    }

    public void j() {
        com.smartdigimkt.p6.p.c().e();
        h.e().b();
    }

    public class b implements com.smartdigimkt.w7.c {
        public b() {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            a.this.f36260c = false;
            a.this.a(obj);
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            a.this.f36260c = false;
            String unused = a.d;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            a.this.f36260c = false;
            String unused = a.d;
        }
    }

    public com.smartdigimkt.l8.a b() {
        if (this.f36259b == null) {
            synchronized (this) {
                try {
                    if (this.f36259b == null) {
                        this.f36259b = d();
                    }
                    if (this.f36259b == null) {
                        this.f36259b = f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f36259b;
    }

    public void a(boolean z2) {
        if (this.f36260c) {
            return;
        }
        synchronized (this.f36258a) {
            try {
                if (this.f36260c) {
                    return;
                }
                if (this.f36259b == null && com.smartdigimkt.l7.b.a().f()) {
                    com.smartdigimkt.l7.b.a().g(new RunnableC0522a(z2));
                } else {
                    b(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z2) {
        if (z2 || h()) {
            this.f36260c = true;
            com.smartdigimkt.c8.c cVar = new com.smartdigimkt.c8.c();
            com.smartdigimkt.l8.a aVar = this.f36259b;
            if (aVar != null) {
                cVar.a(aVar.a());
            }
            new com.smartdigimkt.b8.d(cVar).a(0, (com.smartdigimkt.w7.c) new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        if (obj instanceof JSONObject) {
            try {
                com.smartdigimkt.l8.a aVarA = a((JSONObject) obj);
                if (aVarA != null) {
                    this.f36259b = aVarA;
                    j();
                    com.smartdigimkt.r7.a.a().d(com.smartdigimkt.m6.b.p().k());
                }
            } catch (Throwable unused) {
            }
        }
    }

    private com.smartdigimkt.l8.a a(JSONObject jSONObject) {
        com.smartdigimkt.l8.a aVar = this.f36259b;
        if (!aVar.M0()) {
            aVar.a(jSONObject, null);
        }
        com.smartdigimkt.l8.a aVarE = com.smartdigimkt.l8.a.e(jSONObject);
        if (aVarE != null) {
            aVarE.j(System.currentTimeMillis());
        }
        com.smartdigimkt.l7.b.a().g(new c(jSONObject, aVarE));
        return aVarE;
    }
}
