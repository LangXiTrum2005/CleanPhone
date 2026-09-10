package com.google.android.gms.internal.ads;

import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md0 f17611b;

    public /* synthetic */ n1(md0 md0Var, long j10, int i10) {
        this.f17610a = 1;
        this.f17611b = md0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17610a;
        md0 md0Var = this.f17611b;
        md0Var.getClass();
        switch (i10) {
            case 0:
                String str = uu0.f20901a;
                d02 d02Var = ((jy1) md0Var.f17400c).f16219a.f19727s;
                d02Var.f(d02Var.o(), Z3.l, new ey1((byte) 0, 17));
                break;
            case 1:
                String str2 = uu0.f20901a;
                d02 d02Var2 = ((jy1) md0Var.f17400c).f16219a.f19727s;
                d02Var2.f(d02Var2.i((r32) d02Var2.f13329d.f21139e), IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new ey1((byte) 0, 20));
                break;
            case 2:
                String str3 = uu0.f20901a;
                d02 d02Var3 = ((jy1) md0Var.f17400c).f16219a.f19727s;
                d02Var3.f(d02Var3.o(), 1019, new ey1((byte) 0, 18));
                break;
            case 3:
                String str4 = uu0.f20901a;
                d02 d02Var4 = ((jy1) md0Var.f17400c).f16219a.f19727s;
                d02Var4.f(d02Var4.o(), IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new ey1((byte) 0, 21));
                break;
            default:
                String str5 = uu0.f20901a;
                d02 d02Var5 = ((jy1) md0Var.f17400c).f16219a.f19727s;
                d02Var5.f(d02Var5.o(), 1015, new ey1((byte) 0, 16));
                break;
        }
    }

    public /* synthetic */ n1(md0 md0Var, Object obj, int i10) {
        this.f17610a = i10;
        this.f17611b = md0Var;
    }

    public /* synthetic */ n1(md0 md0Var, String str, long j10, long j11) {
        this.f17610a = 0;
        this.f17611b = md0Var;
    }
}
