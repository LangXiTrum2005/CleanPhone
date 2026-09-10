package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.ironsource.C0375hc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class s6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v7 f9245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f9246h;

    public s6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskResolveVastWrapper", lVar);
        this.f9246h = appLovinAdLoadListener;
        this.f9245g = v7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = d8.a(this.f9245g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Resolving VAST ad with depth " + this.f9245g.d() + " at " + strA);
        }
        try {
            this.f8297a.s0().a(new a(com.applovin.impl.sdk.network.a.a(this.f8297a).b(strA).c(C0375hc.f28788a).a(q8.f9109f).a(((Integer) this.f8297a.a(z4.Z4)).intValue()).c(((Integer) this.f8297a.a(z4.f10103a5)).intValue()).a(false).a(), this.f8297a));
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Unable to resolve VAST wrapper", th2);
            }
            a(-1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, q8 q8Var, int i10) {
            this.f8297a.s0().a(k6.a(q8Var, s6.this.f9245g, s6.this.f9246h, s6.this.f8297a));
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, q8 q8Var) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            s6.this.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f9246h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        d8.a(this.f9245g, this.f9246h, i10 == -1001 ? w7.TIMED_OUT : w7.GENERAL_WRAPPER_ERROR, i10, this.f8297a);
    }
}
