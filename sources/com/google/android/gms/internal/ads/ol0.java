package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ol0 implements ta0, ha0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f18295c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f18296d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f18297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rl0 f18298b;

    public ol0(rl0 rl0Var, zzj zzjVar) {
        this.f18298b = rl0Var;
        this.f18297a = zzjVar;
    }

    public final void a(boolean z10) {
        int i10;
        int iIntValue;
        if (((Boolean) zzba.zzc().a(am.f12269n7)).booleanValue() && !this.f18297a.zzx()) {
            Object obj = f18295c;
            synchronized (obj) {
                i10 = f18296d;
                iIntValue = ((Integer) zzba.zzc().a(am.o7)).intValue();
            }
            if (i10 < iIntValue) {
                rl0 rl0Var = this.f18298b;
                uv0 uv0VarA = rl0Var.f19612d.a(new Bundle());
                uv0VarA.addListener(new zd1(0, uv0VarA, new bc.i(2, rl0Var, z10)), l00.f16615h);
                synchronized (obj) {
                    f18296d++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void j0(zze zzeVar) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        a(true);
    }
}
