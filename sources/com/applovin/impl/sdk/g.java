package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.j7;
import com.applovin.impl.t3;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j7 f9426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9427b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9428c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f9430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference f9431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9432g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void onAdRefresh();
    }

    public g(l lVar, a aVar) {
        this.f9431f = new WeakReference(aVar);
        this.f9430e = lVar;
    }

    private void e() {
        if (((Boolean) this.f9430e.a(t3.I7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f9430e.a(t3.I7)).booleanValue()) {
            synchronized (this.f9427b) {
                try {
                    if (this.f9429d) {
                        this.f9430e.Q();
                        if (p.a()) {
                            this.f9430e.Q().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f9430e.o0().isApplicationPaused()) {
                        this.f9430e.Q();
                        if (p.a()) {
                            this.f9430e.Q().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        j7 j7Var = this.f9426a;
                        if (j7Var != null) {
                            j7Var.e();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f9431f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f9427b) {
            try {
                j7 j7Var = this.f9426a;
                if (j7Var != null) {
                    j7Var.d();
                } else {
                    this.f9430e.Q();
                    if (p.a()) {
                        this.f9430e.Q().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f9428c.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        synchronized (this.f9427b) {
            try {
                this.f9426a = null;
                if (!((Boolean) this.f9430e.a(t3.J7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n() {
        synchronized (this.f9427b) {
            try {
                j7 j7Var = this.f9426a;
                if (j7Var != null) {
                    j7Var.e();
                } else {
                    this.f9428c.set(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f9427b) {
            try {
                j7 j7Var = this.f9426a;
                jC = j7Var != null ? j7Var.c() : -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f9430e.a(t3.H7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f9430e.a(t3.H7)).booleanValue()) {
            synchronized (this.f9427b) {
                try {
                    if (this.f9429d) {
                        this.f9430e.Q();
                        if (p.a()) {
                            this.f9430e.Q().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f9430e.J().d()) {
                        this.f9430e.Q();
                        if (p.a()) {
                            this.f9430e.Q().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f9426a != null) {
                        long jB = this.f9432g - b();
                        long jLongValue = ((Long) this.f9430e.a(t3.G7)).longValue();
                        if (jLongValue < 0 || jB <= jLongValue) {
                            this.f9426a.e();
                            z10 = false;
                        } else {
                            a();
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10 || (aVar = (a) this.f9431f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean g() {
        return this.f9429d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f9427b) {
            z10 = this.f9426a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f9427b) {
            k();
            this.f9429d = true;
        }
    }

    public void m() {
        synchronized (this.f9427b) {
            n();
            this.f9429d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a(long j10) {
        synchronized (this.f9427b) {
            try {
                a();
                this.f9432g = j10;
                this.f9426a = j7.a(j10, this.f9430e, new androidx.fragment.app.n(this, 10));
                if (!((Boolean) this.f9430e.a(t3.J7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f9430e.a(t3.I7)).booleanValue() && (this.f9430e.J().d() || this.f9430e.o0().isApplicationPaused())) {
                    this.f9426a.d();
                }
                if (this.f9428c.compareAndSet(true, false) && ((Boolean) this.f9430e.a(t3.K7)).booleanValue()) {
                    this.f9430e.Q();
                    if (p.a()) {
                        this.f9430e.Q().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f9426a.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f9427b) {
            try {
                j7 j7Var = this.f9426a;
                if (j7Var != null) {
                    j7Var.a();
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
