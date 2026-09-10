package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rr0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.i0 f19643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.i0 f19644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19647e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19648f;

    public rr0(b2.i0 i0Var, b2.i0 i0Var2, boolean z10, boolean z11, boolean z12) {
        this.f19643a = i0Var;
        this.f19644b = i0Var2;
        this.f19645c = z10;
        this.f19646d = z11;
        this.f19648f = z12;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[DONT_INVERT] */
    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        String str;
        long j10;
        String str2;
        long j11;
        Bundle bundle = (Bundle) obj;
        if (this.f19647e) {
            return;
        }
        Bundle bundleB = rb0.b(bundle, "pii");
        boolean z10 = this.f19648f;
        if (!z10) {
            if (((Boolean) zzba.zzc().a(am.f12113d4)).booleanValue()) {
                b2.i0 i0Var = this.f19643a;
                str2 = i0Var.f5300a;
                j11 = i0Var.f5301b;
                if (str2 != null) {
                    bundleB.putString("paidv1_id_android", str2);
                    bundleB.putLong("paidv1_creation_time_android", j11);
                }
            } else if (z10) {
                if (((Boolean) zzba.zzc().a(am.f12146f4)).booleanValue()) {
                    b2.i0 i0Var2 = this.f19643a;
                    str2 = i0Var2.f5300a;
                    j11 = i0Var2.f5301b;
                    if (str2 != null && j11 > 0) {
                        bundleB.putString("paidv1_id_android", str2);
                        bundleB.putLong("paidv1_creation_time_android", j11);
                    }
                }
            }
        } else if (z10) {
            if (((Boolean) zzba.zzc().a(am.f12146f4)).booleanValue()) {
                b2.i0 i0Var3 = this.f19643a;
                str2 = i0Var3.f5300a;
                j11 = i0Var3.f5301b;
                if (str2 != null) {
                    bundleB.putString("paidv1_id_android", str2);
                    bundleB.putLong("paidv1_creation_time_android", j11);
                }
            }
        }
        if (!z10) {
            if (((Boolean) zzba.zzc().a(am.f12130e4)).booleanValue()) {
                b2.i0 i0Var4 = this.f19644b;
                str = i0Var4.f5300a;
                j10 = i0Var4.f5301b;
                if (str != null) {
                    bundleB.putString("paidv2_id_android", str);
                    bundleB.putLong("paidv2_creation_time_android", j10);
                }
                bundleB.putBoolean("paidv2_pub_option_android", this.f19645c);
                bundleB.putBoolean("paidv2_user_option_android", this.f19646d);
            } else if (z10) {
                if (((Boolean) zzba.zzc().a(am.f12162g4)).booleanValue()) {
                    b2.i0 i0Var5 = this.f19644b;
                    str = i0Var5.f5300a;
                    j10 = i0Var5.f5301b;
                    if (str != null && j10 > 0) {
                        bundleB.putString("paidv2_id_android", str);
                        bundleB.putLong("paidv2_creation_time_android", j10);
                    }
                    bundleB.putBoolean("paidv2_pub_option_android", this.f19645c);
                    bundleB.putBoolean("paidv2_user_option_android", this.f19646d);
                }
            }
        } else if (z10) {
            if (((Boolean) zzba.zzc().a(am.f12162g4)).booleanValue()) {
                b2.i0 i0Var6 = this.f19644b;
                str = i0Var6.f5300a;
                j10 = i0Var6.f5301b;
                if (str != null) {
                    bundleB.putString("paidv2_id_android", str);
                    bundleB.putLong("paidv2_creation_time_android", j10);
                }
                bundleB.putBoolean("paidv2_pub_option_android", this.f19645c);
                bundleB.putBoolean("paidv2_user_option_android", this.f19646d);
            }
        }
        if (bundleB.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleB);
    }

    public rr0(boolean z10) {
        this.f19648f = z10;
    }
}
