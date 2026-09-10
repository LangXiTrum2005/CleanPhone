package com.adjust.sdk;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.ee0;
import com.google.android.gms.internal.ads.ey1;
import com.google.android.gms.internal.ads.iw0;
import com.google.android.gms.internal.ads.jy1;
import com.google.android.gms.internal.ads.kv;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.ads.ry1;
import com.google.android.gms.internal.ads.uf;
import com.google.android.gms.internal.ads.uu0;
import ea.m1;
import ea.p2;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6842c;

    public /* synthetic */ f0(int i10, Object obj, boolean z10) {
        this.f6840a = i10;
        this.f6842c = obj;
        this.f6841b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6840a) {
            case 0:
                ((ActivityHandler) this.f6842c).setAskingAttributionI(this.f6841b);
                break;
            case 1:
                ((kv) this.f6842c).n(this.f6841b);
                break;
            case 2:
                ee0 ee0Var = (ee0) this.f6842c;
                boolean z10 = this.f6841b;
                ?? r10 = ee0Var.f13947w;
                if (r10 != 0) {
                    ee0Var.f13938n.g(null, r10.w1(), ee0Var.f13947w.zzi(), ee0Var.f13947w.zzj(), z10, ee0Var.k(), 0);
                } else {
                    int i10 = zze.zza;
                    zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                }
                break;
            case 3:
                iw0 iw0Var = (iw0) this.f6842c;
                boolean z11 = this.f6841b;
                iw0Var.getClass();
                String str = uu0.f20901a;
                ry1 ry1Var = ((jy1) iw0Var.f15865c).f16219a;
                if (ry1Var.U != z11) {
                    ry1Var.U = z11;
                    mk0 mk0Var = ry1Var.f19722n;
                    mk0Var.i(23, new ey1(z11));
                    mk0Var.j();
                    break;
                }
                break;
            case 4:
                p2 p2Var = (p2) this.f6842c;
                m1 m1Var = (m1) p2Var.f3623a;
                boolean zA = m1Var.a();
                boolean z12 = false;
                boolean z13 = m1Var.f39605y != null && m1Var.f39605y.booleanValue();
                boolean z14 = this.f6841b;
                m1Var.f39605y = Boolean.valueOf(z14);
                if (z13 == z14) {
                    ea.s0 s0Var = m1Var.f39587f;
                    m1.h(s0Var);
                    s0Var.f39760n.c(Boolean.valueOf(z14), "Default data collection state already set to");
                }
                if (m1Var.a() != zA) {
                    boolean zA2 = m1Var.a();
                    if (m1Var.f39605y != null && m1Var.f39605y.booleanValue()) {
                        z12 = true;
                    }
                    if (zA2 != z12) {
                        ea.s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39758k.d("Default data collection is different than actual status", Boolean.valueOf(z14), Boolean.valueOf(zA));
                    }
                } else {
                    ea.s0 s0Var3 = m1Var.f39587f;
                    m1.h(s0Var3);
                    s0Var3.f39758k.d("Default data collection is different than actual status", Boolean.valueOf(z14), Boolean.valueOf(zA));
                }
                p2Var.Y0();
                break;
            default:
                uf ufVar = (uf) this.f6842c;
                boolean z15 = this.f6841b;
                a7.p.a();
                bc.s sVar = (bc.s) ufVar.f20746b;
                boolean z16 = sVar.f5580a;
                sVar.f5580a = z15;
                if (z16 != z15) {
                    ((t6.k) sVar.f5581b).a(z15);
                }
                break;
        }
    }

    public f0(p2 p2Var, boolean z10) {
        this.f6840a = 4;
        this.f6841b = z10;
        Objects.requireNonNull(p2Var);
        this.f6842c = p2Var;
    }

    public f0(boolean z10, ActivityHandler activityHandler) {
        this.f6840a = 0;
        this.f6842c = activityHandler;
        this.f6841b = z10;
    }
}
