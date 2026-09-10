package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.e3;
import com.applovin.impl.q7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f8468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0009a f8471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e3 f8472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8473f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface InterfaceC0009a {
        void b(e3 e3Var);
    }

    public a(com.applovin.impl.sdk.l lVar) {
        this.f8469b = lVar.Q();
        this.f8468a = lVar.e();
        this.f8470c = q7.a(com.applovin.impl.sdk.l.p(), "AdActivityObserver", lVar);
    }

    public void a(e3 e3Var, InterfaceC0009a interfaceC0009a) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8469b.a("AdActivityObserver", "Starting for ad " + e3Var.getAdUnitId() + "...");
        }
        a();
        this.f8471d = interfaceC0009a;
        this.f8472e = e3Var;
        this.f8468a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f8470c) && this.f8472e.C0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8469b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f8471d != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8469b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f8471d.b(this.f8472e);
            }
            a();
            return;
        }
        if (this.f8473f == null) {
            this.f8473f = activity.getClass().getName();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.C(new StringBuilder("Started tracking ad Activity: "), this.f8473f, this.f8469b, "AdActivityObserver");
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f8473f)) {
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.C(new StringBuilder("Ad Activity destroyed: "), this.f8473f, this.f8469b, "AdActivityObserver");
            }
            if (this.f8471d != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8469b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f8471d.b(this.f8472e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8469b.a("AdActivityObserver", "Cancelling...");
        }
        this.f8468a.b(this);
        this.f8471d = null;
        this.f8472e = null;
        this.f8473f = null;
    }
}
