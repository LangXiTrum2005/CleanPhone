package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zd implements b3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k6 f15731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8 f15732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2 f15733c;
    public final ef d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f15734e;
    public final y6 f;
    public final EndpointRepository g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uf f15735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15736i = 1;
    public int j = 0;
    public long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b3 f15737l = null;
    public AtomicInteger m = null;

    public zd(k6 k6Var, a8 a8Var, z2 z2Var, ef efVar, AtomicReference atomicReference, y6 y6Var, EndpointRepository endpointRepository, uf ufVar) {
        this.f15731a = k6Var;
        this.f15732b = a8Var;
        this.f15733c = z2Var;
        this.d = efVar;
        this.f15734e = atomicReference;
        this.f = y6Var;
        this.g = endpointRepository;
        this.f15735h = ufVar;
    }

    public final synchronized void a() {
        try {
            int i2 = this.f15736i;
            if (i2 == 2) {
                za.a("Change state to COOLDOWN", null);
                this.f15736i = 4;
                this.f15737l = null;
            } else if (i2 == 3) {
                za.a("Change state to COOLDOWN", null);
                this.f15736i = 4;
                AtomicInteger atomicInteger = this.m;
                this.m = null;
                if (atomicInteger != null) {
                    this.f15731a.a(atomicInteger);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            try {
                za.c("Sdk Version = 9.10.2, Commit: 09decf9845eb8f00ac06b030676751feddd00887", null);
                qf qfVar = (qf) this.f15734e.get();
                a(qfVar);
                if (!qfVar.e() && !qfVar.d()) {
                    if (this.f15736i == 3) {
                        if (this.m.get() > 0) {
                            return;
                        }
                        za.a("Change state to COOLDOWN", null);
                        this.f15736i = 4;
                        this.m = null;
                    }
                    if (this.f15736i == 4) {
                        if (this.k - System.nanoTime() > 0) {
                            za.a("Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires", null);
                            return;
                        }
                        za.a("Change state to IDLE", null);
                        this.f15736i = 1;
                        this.j = 0;
                        this.k = 0L;
                    }
                    if (this.f15736i != 1) {
                        return;
                    }
                    if (!qfVar.h()) {
                        za.b("Did not prefetch because neither native nor webview are enabled.", null);
                        return;
                    }
                    URL endPointUrl = this.g.getEndPointUrl(EndpointRepository.EndPoint.PREFETCH);
                    j3 j3Var = new j3(v2.c.POST, com.chartboost.sdk.internal.Networking.b.a(endPointUrl), endPointUrl.getPath(), this.d.a(), ae.NORMAL, null, this, this.f, this.f15735h);
                    j3Var.b("cache_assets", this.f15732b.e());
                    j3Var.s = true;
                    za.a("Change state to AWAIT_PREFETCH_RESPONSE", null);
                    this.f15736i = 2;
                    this.j = 2;
                    this.k = System.nanoTime() + TimeUnit.MINUTES.toNanos(qfVar.f14949w);
                    this.f15737l = j3Var;
                    this.f15733c.a(j3Var);
                    return;
                }
                a();
            } catch (Exception e2) {
                if (this.f15736i == 2) {
                    za.a("Change state to COOLDOWN", null);
                    this.f15736i = 4;
                    this.f15737l = null;
                }
                za.b("prefetch", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(qf qfVar) {
        boolean z2 = qfVar.r;
        if (this.j != 2 || z2) {
            return;
        }
        za.a("Change state to IDLE", null);
        this.f15736i = 1;
        this.j = 0;
        this.k = 0L;
        this.f15737l = null;
        AtomicInteger atomicInteger = this.m;
        this.m = null;
        if (atomicInteger != null) {
            this.f15731a.a(atomicInteger);
        }
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public synchronized void a(b3 b3Var, CBError cBError) {
        String errorDesc = "Prefetch failure";
        if (cBError != null) {
            try {
                errorDesc = cBError.getErrorDesc();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f.mo189track(new u6(fh.f.PREFETCH_REQUEST_ERROR, errorDesc, "", "", null));
        if (this.f15736i != 2) {
            return;
        }
        if (b3Var != this.f15737l) {
            return;
        }
        this.f15737l = null;
        za.a("Change state to COOLDOWN", null);
        this.f15736i = 4;
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public synchronized void a(b3 b3Var, JSONObject jSONObject) {
        try {
            if (this.f15736i != 2) {
                return;
            }
            if (b3Var != this.f15737l) {
                return;
            }
            za.a("Change state to DOWNLOAD_ASSETS", null);
            this.f15736i = 3;
            this.f15737l = null;
            this.m = new AtomicInteger();
            if (jSONObject != null) {
                za.a("Got Asset list for Prefetch from server: " + jSONObject, null);
                this.f15731a.a(ae.LOW, p1.b(jSONObject, ((qf) this.f15734e.get()).o), this.m, null, "");
            }
        } catch (Exception e2) {
            za.b("prefetch onSuccess", e2);
        }
    }
}
