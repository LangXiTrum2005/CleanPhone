package com.adcolony.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p004ironsource.z8;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScheduledExecutorService f9258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScheduledFuture<?> f9259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9260c;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            m0.this.c();
        }
    }

    public class b implements j0 {
        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            m0.this.f();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        String strE = e();
        if (strE.equals(this.f9260c)) {
            return;
        }
        this.f9260c = strE;
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "network_type", strE);
        new h0("Network.on_status_change", 1, f1VarB).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ScheduledFuture<?> scheduledFuture = this.f9259b;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f9259b.cancel(false);
            }
            this.f9259b = null;
        }
    }

    public String e() {
        return a();
    }

    private String a() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return "none";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) contextA.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "none";
            }
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return z8.f27869b;
            }
            return (type == 0 || type >= 2) ? "cell" : "none";
        } catch (SecurityException e2) {
            new e0.a().a("SecurityException - please ensure you added the ").a("ACCESS_NETWORK_STATE permission: ").a(e2.toString()).a(e0.f9131h);
            return "none";
        } catch (Exception e3) {
            new e0.a().a("Exception occurred when retrieving activeNetworkInfo in ").a("ADCNetwork.getConnectivityStatus(): ").a(e3.toString()).a(e0.f9132i);
            return "none";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f9258a == null) {
            this.f9258a = Executors.newSingleThreadScheduledExecutor();
        }
        if (this.f9259b == null) {
            try {
                this.f9259b = this.f9258a.scheduleAtFixedRate(new c(), 0L, 1000L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                new e0.a().a("Error when scheduling network checks: ").a(e2.toString()).a(e0.f9132i);
            }
            d();
        }
    }

    public void b() {
        this.f9260c = e();
        com.adcolony.sdk.a.a("Network.start_notifications", new a());
        com.adcolony.sdk.a.a("Network.stop_notifications", new b());
    }
}
