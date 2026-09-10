package com.p004ironsource;

import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes5.dex */
public class wj extends u7 {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static wj f27602R;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f27603P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final ii f27604Q = on.U().k();

    private wj() {
        this.H = "ironbeast";
        this.G = 2;
        this.f27380I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f27603P = "";
    }

    public static synchronized wj i() {
        try {
            if (f27602R == null) {
                wj wjVar = new wj();
                f27602R = wjVar;
                wjVar.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27602R;
    }

    @Override // com.p004ironsource.u7
    public int c(zb zbVar) {
        ii iiVar;
        IronSource.AD_UNIT ad_unit;
        int iF = f(zbVar.c());
        if (iF == u7.e.BANNER.a()) {
            iiVar = this.f27604Q;
            ad_unit = IronSource.AD_UNIT.BANNER;
        } else if (iF == u7.e.NATIVE_AD.a()) {
            iiVar = this.f27604Q;
            ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        } else {
            iiVar = this.f27604Q;
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        return iiVar.a(ad_unit);
    }

    @Override // com.p004ironsource.u7
    public void d() {
        a.s(ac.IS_LOAD_CALLED, this.f27381J);
        a.s(ac.IS_INSTANCE_LOAD, this.f27381J);
        a.s(ac.IS_INSTANCE_LOAD_SUCCESS, this.f27381J);
        a.s(ac.IS_CALLBACK_LOAD_SUCCESS, this.f27381J);
        a.s(ac.IS_INSTANCE_LOAD_FAILED, this.f27381J);
        a.s(ac.IS_INSTANCE_LOAD_NO_FILL, this.f27381J);
        a.s(ac.IS_INSTANCE_READY_TRUE, this.f27381J);
        a.s(ac.IS_INSTANCE_READY_FALSE, this.f27381J);
        a.s(ac.BN_LOAD, this.f27381J);
        a.s(ac.BN_CALLBACK_LOAD_ERROR, this.f27381J);
        a.s(ac.BN_RELOAD, this.f27381J);
        a.s(ac.BN_CALLBACK_RELOAD_ERROR, this.f27381J);
        a.s(ac.BN_CALLBACK_RELOAD_SUCCESS, this.f27381J);
        a.s(ac.BN_INSTANCE_LOAD, this.f27381J);
        a.s(ac.BN_INSTANCE_RELOAD, this.f27381J);
        a.s(ac.BN_INSTANCE_LOAD_SUCCESS, this.f27381J);
        a.s(ac.BN_INSTANCE_LOAD_ERROR, this.f27381J);
        a.s(ac.BN_INSTANCE_RELOAD_SUCCESS, this.f27381J);
        a.s(ac.BN_INSTANCE_RELOAD_ERROR, this.f27381J);
        a.s(ac.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, this.f27381J);
        a.s(ac.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, this.f27381J);
        a.s(ac.BN_INSTANCE_SHOW, this.f27381J);
        a.s(ac.NT_LOAD, this.f27381J);
        a.s(ac.NT_CALLBACK_LOAD_ERROR, this.f27381J);
        a.s(ac.NT_INSTANCE_LOAD, this.f27381J);
        a.s(ac.NT_INSTANCE_LOAD_SUCCESS, this.f27381J);
        a.s(ac.NT_INSTANCE_LOAD_ERROR, this.f27381J);
        a.s(ac.NT_INSTANCE_SHOW, this.f27381J);
    }

    @Override // com.p004ironsource.u7
    public String e(int i2) {
        return this.f27603P;
    }

    @Override // com.p004ironsource.u7
    public void f(zb zbVar) {
        this.f27603P = zbVar.b().optString("placement");
    }

    @Override // com.p004ironsource.u7
    public boolean j(zb zbVar) {
        return false;
    }

    @Override // com.p004ironsource.u7
    public boolean d(zb zbVar) {
        int iC = zbVar.c();
        return iC == ac.IS_CALLBACK_LOAD_SUCCESS.getId() || iC == ac.IS_INSTANCE_OPENED.getId() || iC == ac.IS_INSTANCE_CLOSED.getId() || iC == ac.IS_AUCTION_SUCCESS.getId() || iC == ac.IS_AUCTION_FAILED.getId() || iC == ac.BN_INSTANCE_SHOW.getId() || iC == ac.BN_AUCTION_SUCCESS.getId() || iC == ac.BN_AUCTION_FAILED.getId() || iC == ac.NT_INSTANCE_LOAD_SUCCESS.getId() || iC == ac.NT_INSTANCE_SHOW.getId() || iC == ac.NT_AUCTION_SUCCESS.getId() || iC == ac.NT_AUCTION_FAILED.getId();
    }
}
