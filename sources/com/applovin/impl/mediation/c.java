package com.applovin.impl.mediation;

import com.applovin.impl.e3;
import com.applovin.impl.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f8580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i0 f8581d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(e3 e3Var);
    }

    public c(com.applovin.impl.sdk.l lVar, a aVar) {
        this.f8578a = lVar;
        this.f8579b = lVar.Q();
        this.f8580c = aVar;
    }

    public void a(e3 e3Var, long j10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8579b.a("AdHiddenCallbackTimeoutManager", defpackage.e.j(j10, "Scheduling in ", "ms..."));
        }
        this.f8581d = i0.a(j10, this.f8578a, new s(3, this, e3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8579b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f8580c.a(e3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8579b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        i0 i0Var = this.f8581d;
        if (i0Var != null) {
            i0Var.a();
            this.f8581d = null;
        }
    }
}
