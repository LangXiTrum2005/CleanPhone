package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class n6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v7 f8848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f8849h;

    public n6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderVastAd", lVar);
        this.f8849h = appLovinAdLoadListener;
        this.f8848g = v7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Rendering VAST ad...");
        }
        int size = this.f8848g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        a8 a8VarA = null;
        e8 e8VarA = null;
        u7 u7VarA = null;
        t7 t7VarA = null;
        String strA2 = "";
        for (q8 q8Var : this.f8848g.a()) {
            q8 q8VarB = q8Var.b(d8.b(q8Var) ? "Wrapper" : "InLine");
            if (q8VarB != null) {
                q8 q8VarB2 = q8VarB.b("AdSystem");
                if (q8VarB2 != null) {
                    a8VarA = a8.a(q8VarB2, a8VarA, this.f8297a);
                }
                strA = d8.a(q8VarB, "AdTitle", strA);
                strA2 = d8.a(q8VarB, "Description", strA2);
                d8.a(q8VarB.a("Impression"), hashSet, this.f8848g, this.f8297a);
                q8 q8VarC = q8VarB.c("ViewableImpression");
                if (q8VarC != null) {
                    d8.a(q8VarC.a("Viewable"), hashSet, this.f8848g, this.f8297a);
                }
                q8 q8VarB3 = q8VarB.b("AdVerifications");
                if (q8VarB3 != null) {
                    t7VarA = t7.a(q8VarB3, t7VarA, this.f8848g, this.f8297a);
                }
                d8.a(q8VarB.a("Error"), hashSet2, this.f8848g, this.f8297a);
                q8 q8VarC2 = q8VarB.c("Creatives");
                if (q8VarC2 != null) {
                    for (q8 q8Var2 : q8VarC2.b()) {
                        q8 q8VarC3 = q8Var2.c("Linear");
                        if (q8VarC3 != null) {
                            e8VarA = e8.a(q8VarC3, e8VarA, this.f8848g, this.f8297a);
                        } else {
                            q8 q8VarB4 = q8Var2.b("CompanionAds");
                            if (q8VarB4 != null) {
                                q8 q8VarB5 = q8VarB4.b("Companion");
                                if (q8VarB5 != null) {
                                    u7VarA = u7.a(q8VarB5, u7VarA, this.f8848g, this.f8297a);
                                }
                            } else if (com.applovin.impl.sdk.p.a()) {
                                this.f8299c.b(this.f8298b, "Received and will skip rendering for an unidentified creative: " + q8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Did not find wrapper or inline response for node: " + q8Var);
            }
        }
        r7 r7VarA = new r7.b().a(this.f8297a).a(this.f8848g.b()).b(this.f8848g.e()).a(this.f8848g.c()).b(strA).a(strA2).a(a8VarA).a(e8VarA).a(u7VarA).a(t7VarA).b(hashSet).a(t7VarA).a(hashSet2).a();
        w7 w7VarC = d8.c(r7VarA);
        if (w7VarC != null) {
            d8.a(this.f8848g, this.f8849h, w7VarC, -6, this.f8297a);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Finished rendering VAST ad: " + r7VarA);
        }
        r7VarA.getAdEventTracker().e();
        this.f8297a.s0().a((k5) new p5(r7VarA, this.f8297a, this.f8849h), f6.b.CACHING);
    }
}
