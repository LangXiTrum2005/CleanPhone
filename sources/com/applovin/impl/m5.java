package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class m5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Activity f8407h;

    public m5(List list, Activity activity, com.applovin.impl.sdk.l lVar) {
        super("TaskAutoInitAdapters", lVar, true);
        this.f8406g = list;
        this.f8407h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m3 m3Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Auto-initing adapter: " + m3Var);
        }
        this.f8297a.U().a(m3Var, this.f8407h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8406g.size() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVar = this.f8299c;
                String str = this.f8298b;
                StringBuilder sb2 = new StringBuilder("Auto-initing ");
                sb2.append(this.f8406g.size());
                sb2.append(" adapters");
                sb2.append(this.f8297a.u0().c() ? " in test mode" : "");
                sb2.append("...");
                pVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f8297a.X())) {
                this.f8297a.Q0();
            } else if (!this.f8297a.I0()) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f8297a.X());
            }
            if (this.f8407h == null) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (m3 m3Var : this.f8406g) {
                if (m3Var.s()) {
                    this.f8297a.s0().a(new x8(9, this, m3Var), f6.b.MEDIATION);
                } else {
                    this.f8297a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8297a.Q().a(this.f8298b, "Skipping eager auto-init for adapter " + m3Var);
                    }
                }
            }
        }
    }
}
