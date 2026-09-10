package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e3 extends a3 implements u1 {
    private final Bundle A;
    private final AtomicReference B;
    private final AtomicBoolean C;
    private final AtomicBoolean D;
    private final AtomicBoolean E;
    private boolean F;
    private String G;
    private boolean H;

    public e3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(c3Var, jSONObject, jSONObject2, null, lVar);
        this.A = new Bundle();
        this.D = new AtomicBoolean();
        this.E = new AtomicBoolean();
        this.B = new AtomicReference();
        this.C = new AtomicBoolean();
    }

    private long n0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f8395a.a(t3.W7)).longValue()) : jA;
    }

    public boolean A0() {
        return this.C.get();
    }

    public boolean B0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f8395a.a(t3.f9766c8)).booleanValue();
    }

    public boolean C0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f8395a.a(t3.f9767d8)).booleanValue();
    }

    public boolean D0() {
        return a("suaaode", (Boolean) this.f8395a.a(t3.K8)).booleanValue();
    }

    public boolean E0() {
        return a("susaode", (Boolean) this.f8395a.a(t3.P7)).booleanValue();
    }

    public void a(boolean z10) {
        this.H = z10;
    }

    @Override // com.applovin.impl.u1
    public long getTimeToLiveMillis() {
        return n0() - (SystemClock.elapsedRealtime() - L());
    }

    public void j(String str) {
        this.G = str;
    }

    public void m0() {
        this.C.set(true);
    }

    public long o0() {
        return a("ahdm", ((Long) this.f8395a.a(t3.Q7)).longValue());
    }

    public long p0() {
        long jA = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f8395a.a(t3.f9768e8)).longValue());
    }

    public long q0() {
        long jA = a("ad_hidden_timeout_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_timeout_ms", ((Long) this.f8395a.a(t3.f9765b8)).longValue());
    }

    public q4 r0() {
        return (q4) this.B.getAndSet(null);
    }

    public long s0() {
        if (L() > 0) {
            return SystemClock.elapsedRealtime() - L();
        }
        return -1L;
    }

    @Override // com.applovin.impl.u1
    public void setExpired() {
        this.F = true;
    }

    public Bundle t0() {
        return this.A;
    }

    public long u0() {
        long jA = a("fullscreen_display_delay_ms", -1L);
        return jA >= 0 ? jA : ((Long) this.f8395a.a(t3.O7)).longValue();
    }

    public String v0() {
        return b("mcode", "");
    }

    public AtomicBoolean w0() {
        return this.D;
    }

    public String x0() {
        return this.G;
    }

    public AtomicBoolean y0() {
        return this.E;
    }

    public boolean z0() {
        return this.H;
    }

    @Override // com.applovin.impl.a3
    public a3 a(com.applovin.impl.mediation.h hVar) {
        return new e3(this, hVar);
    }

    @Override // com.applovin.impl.a3
    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.A.putBundle("applovin_ad_view_info", bundle2);
    }

    public void a(q4 q4Var) {
        this.B.set(q4Var);
    }

    private e3(e3 e3Var, com.applovin.impl.mediation.h hVar) {
        super(e3Var.Q(), e3Var.a(), e3Var.g(), hVar, e3Var.f8395a);
        this.A = new Bundle();
        this.D = new AtomicBoolean();
        this.E = new AtomicBoolean();
        this.B = e3Var.B;
        this.C = e3Var.C;
        this.H = e3Var.H;
    }
}
