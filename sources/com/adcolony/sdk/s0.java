package com.adcolony.sdk;

import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.ne;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d0 f9361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ScheduledExecutorService f9362b;
    HashMap<String, Object> d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<f0> f9363c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b0 f9364e = new b0("adcolony_android", "4.8.0", "Production");

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.a();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f9366a;

        public b(f0 f0Var) {
            this.f9366a = f0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.f9363c.add(this.f9366a);
        }
    }

    public s0(d0 d0Var, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> map) {
        this.f9361a = d0Var;
        this.f9362b = scheduledExecutorService;
        this.d = map;
    }

    public synchronized void a(long j, TimeUnit timeUnit) {
        try {
            if (!this.f9362b.isShutdown() && !this.f9362b.isTerminated()) {
                this.f9362b.scheduleAtFixedRate(new a(), j, j, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
    }

    public synchronized void b() {
        try {
            this.f9362b.shutdown();
            try {
                ScheduledExecutorService scheduledExecutorService = this.f9362b;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (!scheduledExecutorService.awaitTermination(1L, timeUnit)) {
                    this.f9362b.shutdownNow();
                    if (!this.f9362b.awaitTermination(1L, timeUnit)) {
                        System.err.println("s0: ScheduledExecutorService did not terminate");
                    }
                }
            } catch (InterruptedException unused) {
                this.f9362b.shutdownNow();
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c(String str) {
        b(new f0.a().a(2).a(this.f9364e).a(str).a());
    }

    public synchronized void d(String str) {
        b(new f0.a().a(1).a(this.f9364e).a(str).a());
    }

    public synchronized void e(String str) {
        this.d.put("controllerVersion", str);
    }

    public synchronized void f(String str) {
        this.d.put(JsonStorageKeyNames.SESSION_ID_KEY, str);
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f9363c.size() > 0) {
                    this.f9361a.a(a(this.f9364e, this.f9363c));
                    this.f9363c.clear();
                }
            } catch (IOException unused) {
                this.f9363c.clear();
            } catch (JSONException unused2) {
                this.f9363c.clear();
            }
        }
    }

    public synchronized void b(String str) {
        b(new f0.a().a(0).a(this.f9364e).a(str).a());
    }

    public synchronized void a(String str) {
        b(new f0.a().a(3).a(this.f9364e).a(str).a());
    }

    public synchronized void b(f0 f0Var) {
        try {
            if (!this.f9362b.isShutdown() && !this.f9362b.isTerminated()) {
                this.f9362b.submit(new b(f0Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
    }

    public String a(b0 b0Var, List<f0> list) throws JSONException {
        f1 f1Var = new f1();
        f1Var.a("index", b0Var.b());
        f1Var.a("environment", b0Var.a());
        f1Var.a("version", b0Var.c());
        e1 e1Var = new e1();
        Iterator<f0> it = list.iterator();
        while (it.hasNext()) {
            e1Var.a(a(it.next()));
        }
        f1Var.a("logs", e1Var);
        return f1Var.toString();
    }

    private synchronized f1 a(f0 f0Var) throws JSONException {
        f1 f1Var;
        try {
            f1Var = new f1(this.d);
            f1Var.a("environment", f0Var.a().a());
            f1Var.a(AppLovinEventTypes.USER_COMPLETED_LEVEL, f0Var.b());
            f1Var.a(PglCryptUtils.KEY_MESSAGE, f0Var.c());
            f1Var.a("clientTimestamp", f0Var.d());
            f1 f1Var2 = new f1(com.adcolony.sdk.a.b().u().getMediationInfo());
            f1 f1Var3 = new f1(com.adcolony.sdk.a.b().u().getPluginInfo());
            f1Var.a("mediation_network", c0.h(f1Var2, "name"));
            f1Var.a("mediation_network_version", c0.h(f1Var2, "version"));
            f1Var.a(ne.K, c0.h(f1Var3, "name"));
            f1Var.a("plugin_version", c0.h(f1Var3, "version"));
            e1 e1VarB = com.adcolony.sdk.a.b().q().b();
            if (e1VarB == null || e1VarB.a("batteryInfo")) {
                f1Var.b("batteryInfo", com.adcolony.sdk.a.b().n().l());
            }
            if (e1VarB != null) {
                f1Var.a(e1VarB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1Var;
    }
}
