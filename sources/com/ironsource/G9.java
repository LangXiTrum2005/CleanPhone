package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class G9 extends AbstractC0437l3 {
    private static G9 R;
    private String P;
    private final M8 Q = Kb.Y().s();

    private G9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized G9 i() {
        try {
            if (R == null) {
                G9 g10 = new G9();
                R = g10;
                g10.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return R;
    }

    @Override // com.ironsource.AbstractC0437l3
    public int c(C0654x5 c0654x5) {
        int iF = f(c0654x5.c());
        if (iF == AbstractC0437l3.e.BANNER.b()) {
            return this.Q.a(IronSource.a.BANNER);
        }
        return iF == AbstractC0437l3.e.NATIVE_AD.b() ? this.Q.a(IronSource.a.NATIVE_AD) : this.Q.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean d(C0654x5 c0654x5) {
        int iC = c0654x5.c();
        return iC == EnumC0672y5.IS_CALLBACK_LOAD_SUCCESS.b() || iC == EnumC0672y5.IS_INSTANCE_OPENED.b() || iC == EnumC0672y5.IS_INSTANCE_CLOSED.b() || iC == EnumC0672y5.IS_AUCTION_SUCCESS.b() || iC == EnumC0672y5.IS_AUCTION_FAILED.b() || iC == EnumC0672y5.BN_INSTANCE_SHOW.b() || iC == EnumC0672y5.BN_AUCTION_SUCCESS.b() || iC == EnumC0672y5.BN_AUCTION_FAILED.b() || iC == EnumC0672y5.NT_INSTANCE_LOAD_SUCCESS.b() || iC == EnumC0672y5.NT_INSTANCE_SHOW.b() || iC == EnumC0672y5.NT_AUCTION_SUCCESS.b() || iC == EnumC0672y5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC0437l3
    public String e(int i10) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC0437l3
    public void f(C0654x5 c0654x5) {
        this.P = c0654x5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC0437l3
    public boolean j(C0654x5 c0654x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC0437l3
    public void d() {
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.IS_LOAD_CALLED, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.IS_INSTANCE_LOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.IS_INSTANCE_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.IS_CALLBACK_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.IS_INSTANCE_LOAD_FAILED, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.IS_INSTANCE_LOAD_NO_FILL, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.IS_INSTANCE_READY_TRUE, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.IS_INSTANCE_READY_FALSE, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_LOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_CALLBACK_LOAD_ERROR, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_RELOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_CALLBACK_RELOAD_ERROR, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_CALLBACK_RELOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_LOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_RELOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_LOAD_ERROR, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_RELOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_RELOAD_ERROR, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.BN_INSTANCE_SHOW, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.NT_LOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.NT_CALLBACK_LOAD_ERROR, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.NT_INSTANCE_LOAD, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.NT_INSTANCE_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.NT_INSTANCE_LOAD_ERROR, this.J);
        com.google.android.gms.internal.measurement.f2.p(EnumC0672y5.NT_INSTANCE_SHOW, this.J);
    }
}
