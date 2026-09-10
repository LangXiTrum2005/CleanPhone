package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements mi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final so0 f20402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au0 f20403c;

    public ti0(long j10, Context context, so0 so0Var, a50 a50Var, String str) {
        this.f20401a = j10;
        this.f20402b = so0Var;
        this.f20403c = (au0) ((fx1) new md0(a50Var.f11854b, context, str).f17400c).zzb();
    }

    @Override // com.google.android.gms.internal.ads.mi0
    public final void a(zzm zzmVar) {
        try {
            this.f20403c.zzc(zzmVar, new ri0(this));
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mi0
    public final void zzb() {
        try {
            au0 au0Var = this.f20403c;
            au0Var.zze(new si0(this));
            au0Var.zzb(new s9.b(null));
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mi0
    public final void zzc() {
    }
}
