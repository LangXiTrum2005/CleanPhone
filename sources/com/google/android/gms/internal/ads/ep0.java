package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 extends zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu0 f14041a;

    public ep0(Context context, a50 a50Var, nu0 nu0Var, ne0 ne0Var, zzbh zzbhVar) {
        vu0 vu0Var = new vu0(ne0Var, (yh0) a50Var.f11874m.zzb());
        ((hp0) vu0Var.f21275c).f15342a.set(zzbhVar);
        v90 v90Var = new v90();
        v90Var.f21137c = a50Var;
        v90Var.f21135a = context;
        v90Var.f21138d = vu0Var;
        v90Var.f21136b = nu0Var;
        v90Var.f21139e = a50Var.c();
        nu0Var.f17973r = (hp0) vu0Var.f21275c;
        this.f14041a = new vu0(26, v90Var, nu0Var.f17959c);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(zzm zzmVar) {
        this.f14041a.l(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        String str;
        vu0 vu0Var = this.f14041a;
        synchronized (vu0Var) {
            str = null;
            try {
                aa0 aa0Var = (aa0) vu0Var.f21276d;
                str = aa0Var != null ? aa0Var.f11954a : null;
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzg() {
        boolean z10;
        vu0 vu0Var = this.f14041a;
        synchronized (vu0Var) {
            try {
                s80 s80Var = (s80) ((v90) vu0Var.f21274b).f21140f;
                z10 = s80Var != null && s80Var.f19894c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzh() {
        String str;
        vu0 vu0Var = this.f14041a;
        synchronized (vu0Var) {
            str = null;
            try {
                aa0 aa0Var = (aa0) vu0Var.f21276d;
                str = aa0Var != null ? aa0Var.f11954a : null;
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzi(zzm zzmVar, int i10) {
        this.f14041a.l(zzmVar, i10);
    }
}
