package com.p004ironsource;

import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes5.dex */
public class ds extends u7 {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static ds f24835R;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f24836P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final ii f24837Q = on.U().k();

    private ds() {
        this.H = "outcome";
        this.G = 3;
        this.f27380I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f24836P = "";
    }

    public static synchronized ds i() {
        try {
            if (f24835R == null) {
                ds dsVar = new ds();
                f24835R = dsVar;
                dsVar.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f24835R;
    }

    @Override // com.p004ironsource.u7
    public int c(zb zbVar) {
        return this.f24837Q.a(IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.p004ironsource.u7
    public void d() {
        a.s(ac.RV_BUSINESS_MEDIATION_LOAD, this.f27381J);
        a.s(ac.RV_BUSINESS_INSTANCE_LOAD, this.f27381J);
        a.s(ac.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, this.f27381J);
        a.s(ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, this.f27381J);
        a.s(ac.RV_INSTANCE_LOAD_FAILED, this.f27381J);
        a.s(ac.RV_INSTANCE_SHOW_CHANCE, this.f27381J);
        a.s(ac.RV_INSTANCE_READY_TRUE, this.f27381J);
        a.s(ac.RV_INSTANCE_READY_FALSE, this.f27381J);
        a.s(ac.RV_INSTANCE_LOAD_FAILED_REASON, this.f27381J);
        a.s(ac.RV_INSTANCE_LOAD_NO_FILL, this.f27381J);
        a.s(ac.RV_MEDIATION_LOAD_ERROR, this.f27381J);
    }

    @Override // com.p004ironsource.u7
    public String e(int i2) {
        return (i2 == 15 || (i2 >= 300 && i2 < 400)) ? this.f24836P : "";
    }

    @Override // com.p004ironsource.u7
    public void f(zb zbVar) {
        if (zbVar.c() == 15 || (zbVar.c() >= 300 && zbVar.c() < 400)) {
            this.f24836P = zbVar.b().optString("placement");
        }
    }

    @Override // com.p004ironsource.u7
    public boolean j(zb zbVar) {
        return false;
    }

    @Override // com.p004ironsource.u7
    public boolean d(zb zbVar) {
        int iC = zbVar.c();
        return iC == ac.FIRST_INSTANCE.getId() || iC == ac.INIT_COMPLETE.getId() || iC == ac.SDK_INIT_FAILED.getId() || iC == ac.SDK_INIT_SUCCESS.getId() || iC == ac.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.getId() || iC == ac.RV_BUSINESS_INSTANCE_OPENED.getId() || iC == ac.RV_INSTANCE_CLOSED.getId() || iC == ac.RV_BUSINESS_INSTANCE_REWARDED.getId() || iC == ac.RV_AUCTION_FAILED.getId() || iC == ac.RV_AUCTION_SUCCESS.getId();
    }
}
