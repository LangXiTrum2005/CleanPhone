package com.adcolony.sdk;

import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class t implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f9368a = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9369b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9370c = 16;
    private double d = 1.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ThreadPoolExecutor f9371e = new ThreadPoolExecutor(this.f9369b, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, this.f9368a);

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    public class b implements j0 {
        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    public class c implements j0 {
        public c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    private void b() {
        int corePoolSize = this.f9371e.getCorePoolSize();
        int size = this.f9368a.size();
        int i2 = this.f9369b;
        if (((double) size) * this.d > (corePoolSize - i2) + 1 && corePoolSize < this.f9370c) {
            this.f9371e.setCorePoolSize(corePoolSize + 1);
        } else {
            if (size != 0 || corePoolSize <= i2) {
                return;
            }
            this.f9371e.setCorePoolSize(i2);
        }
    }

    public void a() {
        this.f9371e.allowCoreThreadTimeOut(true);
        com.adcolony.sdk.a.a("WebServices.download", new a());
        com.adcolony.sdk.a.a("WebServices.get", new b());
        com.adcolony.sdk.a.a("WebServices.post", new c());
    }

    public void c(int i2) {
        this.f9371e.setKeepAliveTime(i2, TimeUnit.SECONDS);
    }

    public void a(s sVar) {
        b();
        try {
            this.f9371e.execute(sVar);
        } catch (RejectedExecutionException unused) {
            new e0.a().a("RejectedExecutionException: ThreadPoolExecutor unable to ").a("execute download for url " + sVar.f9358l).a(e0.f9132i);
            a(sVar, sVar.b(), null);
        }
    }

    public void b(int i2) {
        this.f9370c = i2;
        int corePoolSize = this.f9371e.getCorePoolSize();
        int i3 = this.f9370c;
        if (corePoolSize > i3) {
            this.f9371e.setCorePoolSize(i3);
        }
    }

    public void a(int i2) {
        this.f9369b = i2;
        int corePoolSize = this.f9371e.getCorePoolSize();
        int i3 = this.f9369b;
        if (corePoolSize < i3) {
            this.f9371e.setCorePoolSize(i3);
        }
    }

    public void a(double d) {
        this.d = d;
    }

    @Override // com.adcolony.sdk.s.a
    public void a(s sVar, h0 h0Var, Map<String, List<String>> map) {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "url", sVar.f9358l);
        c0.b(f1VarB, "success", sVar.f9359n);
        c0.b(f1VarB, "status", sVar.f9360p);
        c0.a(f1VarB, "body", sVar.m);
        c0.b(f1VarB, "size", sVar.o);
        if (map != null) {
            f1 f1VarB2 = c0.b();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String strF = android.support.v4.media.a.f(1, 1, entry.getValue().toString());
                if (entry.getKey() != null) {
                    c0.a(f1VarB2, entry.getKey(), strF);
                }
            }
            c0.a(f1VarB, "headers", f1VarB2);
        }
        h0Var.a(f1VarB).c();
    }
}
