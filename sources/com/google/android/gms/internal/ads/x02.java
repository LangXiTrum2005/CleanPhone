package com.google.android.gms.internal.ads;

import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x02 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iw0 f21667b;

    public /* synthetic */ x02(iw0 iw0Var, int i10, long j10, long j11) {
        this.f21666a = 3;
        this.f21667b = iw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21666a;
        int i11 = 13;
        byte b10 = 0;
        iw0 iw0Var = this.f21667b;
        iw0Var.getClass();
        switch (i10) {
            case 0:
                String str = uu0.f20901a;
                d02 d02Var = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var.f(d02Var.o(), 1008, new b02(i11));
                break;
            case 1:
                String str2 = uu0.f20901a;
                d02 d02Var2 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var2.f(d02Var2.o(), IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new ey1(b10, 14));
                break;
            case 2:
                String str3 = uu0.f20901a;
                d02 d02Var3 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var3.f(d02Var3.o(), 1010, new b02(15));
                break;
            case 3:
                String str4 = uu0.f20901a;
                d02 d02Var4 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var4.f(d02Var4.o(), 1011, new b02(16));
                break;
            case 4:
                String str5 = uu0.f20901a;
                d02 d02Var5 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var5.f(d02Var5.o(), 1012, new b02(17));
                break;
            case 5:
                String str6 = uu0.f20901a;
                d02 d02Var6 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var6.f(d02Var6.o(), Z3.f28073j, new ey1(b10, 11));
                break;
            case 6:
                String str7 = uu0.f20901a;
                d02 d02Var7 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var7.f(d02Var7.o(), IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new ey1(b10, 12));
                break;
            case 7:
                String str8 = uu0.f20901a;
                d02 d02Var8 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var8.f(d02Var8.o(), IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new ey1(b10, i11));
                break;
            default:
                String str9 = uu0.f20901a;
                d02 d02Var9 = ((jy1) iw0Var.f15865c).f16219a.f19727s;
                d02Var9.f(d02Var9.o(), 1007, new b02(6));
                break;
        }
    }

    public /* synthetic */ x02(iw0 iw0Var, long j10) {
        this.f21666a = 2;
        this.f21667b = iw0Var;
    }

    public /* synthetic */ x02(iw0 iw0Var, Object obj, int i10) {
        this.f21666a = i10;
        this.f21667b = iw0Var;
    }

    public /* synthetic */ x02(iw0 iw0Var, String str, long j10, long j11) {
        this.f21666a = 0;
        this.f21667b = iw0Var;
    }
}
