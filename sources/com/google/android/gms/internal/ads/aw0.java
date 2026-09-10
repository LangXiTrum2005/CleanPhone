package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class aw0 implements hc0, la0, jc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw0 f12531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw0 f12532b;

    public aw0(Context context, jw0 jw0Var) {
        this.f12531a = jw0Var;
        this.f12532b = fw0.f(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final void e(zze zzeVar) {
        if (((Boolean) an.f12467d.o()).booleanValue()) {
            String string = zzeVar.zza().toString();
            fw0 fw0Var = this.f12532b;
            fw0Var.zzk(string);
            fw0Var.zzd(false);
            this.f12531a.a(fw0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void zza() {
        if (((Boolean) an.f12467d.o()).booleanValue()) {
            fw0 fw0Var = this.f12532b;
            fw0Var.zzd(true);
            this.f12531a.a(fw0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void zzh() {
        if (((Boolean) an.f12467d.o()).booleanValue()) {
            this.f12532b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void zzg() {
    }
}
