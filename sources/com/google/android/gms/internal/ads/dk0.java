package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 implements mb0, vc0, ta0, na0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh0 f13573b;

    public dk0(Context context, yh0 yh0Var) {
        this.f13572a = context;
        this.f13573b = yh0Var;
    }

    public final void a(Context context) {
        if (((Boolean) zzba.zzc().a(am.I5)).booleanValue()) {
            l00.f16608a.execute(new zd1(29, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        if (((Boolean) zzba.zzc().a(am.N5)).booleanValue()) {
            a(this.f13572a);
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
        if (((Boolean) zzba.zzc().a(am.K5)).booleanValue()) {
            a(this.f13572a);
        }
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zzd(zzbc zzbcVar) {
        if (((Boolean) zzba.zzc().a(am.L5)).booleanValue()) {
            a(this.f13572a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        if (((Boolean) zzba.zzc().a(am.M5)).booleanValue()) {
            a(this.f13572a);
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void zze(String str) {
    }
}
