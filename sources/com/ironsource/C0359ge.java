package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0359ge extends AbstractC0437l3 {
    private static C0359ge R;
    private String P;
    private final M8 Q = Kb.Y().s();

    private C0359ge() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized C0359ge i() {
        try {
            if (R == null) {
                C0359ge c0359ge = new C0359ge();
                R = c0359ge;
                c0359ge.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return R;
    }

    @Override // com.ironsource.AbstractC0437l3
    public int c(C0654x5 c0654x5) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean d(C0654x5 c0654x5) {
        int iC = c0654x5.c();
        return iC == EnumC0672y5.FIRST_INSTANCE.b() || iC == EnumC0672y5.INIT_COMPLETE.b() || iC == EnumC0672y5.SDK_INIT_FAILED.b() || iC == EnumC0672y5.SDK_INIT_SUCCESS.b() || iC == EnumC0672y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || iC == EnumC0672y5.RV_BUSINESS_INSTANCE_OPENED.b() || iC == EnumC0672y5.RV_INSTANCE_CLOSED.b() || iC == EnumC0672y5.RV_BUSINESS_INSTANCE_REWARDED.b() || iC == EnumC0672y5.RV_AUCTION_FAILED.b() || iC == EnumC0672y5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC0437l3
    public String e(int i10) {
        return (i10 == 15 || (i10 >= 300 && i10 < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC0437l3
    public void f(C0654x5 c0654x5) {
        if (c0654x5.c() == 15 || (c0654x5.c() >= 300 && c0654x5.c() < 400)) {
            this.P = c0654x5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean j(C0654x5 c0654x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0437l3
    public void d() {
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_BUSINESS_MEDIATION_LOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_BUSINESS_INSTANCE_LOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_INSTANCE_LOAD_FAILED, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_INSTANCE_SHOW_CHANCE, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_INSTANCE_READY_TRUE, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_INSTANCE_READY_FALSE, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_INSTANCE_LOAD_FAILED_REASON, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_INSTANCE_LOAD_NO_FILL, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.RV_MEDIATION_LOAD_ERROR, this.J);
    }
}
