package com.smartdigimkt.k8;

import com.smartdigimkt.sdk.api.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d implements com.smartdigimkt.w7.c, c.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f36273h = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f36274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.u7.a f36275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f36276c;
    private com.smartdigimkt.h7.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f36277e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private com.smartdigimkt.h7.b g;

    public class a implements com.smartdigimkt.h7.b {
        final /* synthetic */ com.smartdigimkt.l8.e X;

        public a(com.smartdigimkt.l8.e eVar) {
            this.X = eVar;
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f36277e.set(true);
            d.this.b(this.X);
        }
    }

    public d(c cVar, com.smartdigimkt.u7.a aVar) {
        this.f36274a = cVar;
        this.f36275b = aVar;
        this.f36276c = aVar != null ? aVar.b() : null;
    }

    private void c() {
        com.smartdigimkt.h7.b bVar;
        com.smartdigimkt.h7.a aVar = this.d;
        if (aVar == null || (bVar = this.g) == null) {
            return;
        }
        aVar.a(bVar);
    }

    @Override // com.smartdigimkt.w7.c
    public void b(int i2) {
        a();
    }

    @Override // com.smartdigimkt.w7.c
    public void a(int i2, Object obj) {
        c();
        b();
        a(this.f36275b, obj, this.f36277e.get());
    }

    @Override // com.smartdigimkt.k8.c.a
    public void b() {
        c.a aVar = this.f36276c;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.smartdigimkt.k8.c.a
    public void b(com.smartdigimkt.l8.e eVar) {
        c.a aVar;
        if (this.f.getAndSet(true) || (aVar = this.f36276c) == null) {
            return;
        }
        aVar.b(eVar);
    }

    @Override // com.smartdigimkt.w7.c
    public void a(int i2, String str, AdError adError) {
        c();
        a(this.f36275b, adError);
    }

    @Override // com.smartdigimkt.w7.c
    public void a(int i2) {
        c();
    }

    @Override // com.smartdigimkt.k8.c.a
    public void a() {
        c.a aVar = this.f36276c;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.smartdigimkt.k8.c.a
    public void a(AdError adError) {
        c.a aVar;
        if (this.f.getAndSet(true) || (aVar = this.f36276c) == null) {
            return;
        }
        aVar.a(adError);
    }

    @Override // com.smartdigimkt.k8.c.a
    public void a(com.smartdigimkt.l8.e eVar) {
        c.a aVar = this.f36276c;
        if (aVar != null) {
            aVar.a(eVar);
        }
    }

    public void a(long j, com.smartdigimkt.l8.e eVar) {
        com.smartdigimkt.h7.a aVarC = com.smartdigimkt.h7.e.c();
        this.d = aVarC;
        if (aVarC == null) {
            return;
        }
        a aVar = new a(eVar);
        this.g = aVar;
        this.d.a(aVar, j);
    }

    private void a(com.smartdigimkt.u7.a aVar, Object obj, boolean z2) {
        if (aVar == null || obj == null) {
            return;
        }
        String strC = aVar.c();
        com.smartdigimkt.l8.e eVarA = aVar.a();
        try {
            JSONObject jSONObject = (JSONObject) obj;
            jSONObject.put("updateTime", System.currentTimeMillis());
            int iOptInt = jSONObject.optInt("pl_wf_st_type", 0);
            com.smartdigimkt.l8.e eVarA2 = this.f36274a.a(aVar.c(), iOptInt);
            if (eVarA2 != null) {
                eVarA2.a(jSONObject, strC);
            }
            com.smartdigimkt.l8.e eVarB = com.smartdigimkt.l8.e.b(strC, jSONObject);
            this.f36274a.a(strC, eVarB, jSONObject, iOptInt);
            eVarB.Z();
            if (z2) {
                a(eVarB);
            } else {
                b(eVarB);
            }
        } catch (Throwable th) {
            if (eVarA != null && !eVarA.W()) {
                b(eVarA);
                return;
            }
            a(com.smartdigimkt.v7.b.a("30001", th + ""));
        }
    }

    private void a(com.smartdigimkt.u7.a aVar, AdError adError) {
        String strC;
        com.smartdigimkt.l8.e eVarA;
        if (aVar != null) {
            try {
                strC = aVar.c();
                eVarA = aVar.a();
            } catch (Throwable th) {
                a(com.smartdigimkt.v7.b.a("30001", th + ""));
                return;
            }
        } else {
            eVarA = null;
            strC = "";
        }
        if (adError != null && String.valueOf(699).equals(adError.getCode())) {
            this.f36274a.a(strC, eVarA);
            a(adError);
            return;
        }
        if (eVarA != null && !eVarA.W()) {
            b(eVarA);
            return;
        }
        a(adError);
    }
}
