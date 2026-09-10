package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class au0 extends hy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt0 f12511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ut0 f12512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ku0 f12514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f12516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qf f12517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yh0 f12518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ug0 f12519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12520j;

    public au0(String str, yt0 yt0Var, Context context, ut0 ut0Var, ku0 ku0Var, VersionInfoParcel versionInfoParcel, qf qfVar, yh0 yh0Var) {
        this.f12513c = str;
        this.f12511a = yt0Var;
        this.f12512b = ut0Var;
        this.f12514d = ku0Var;
        this.f12515e = context;
        this.f12516f = versionInfoParcel;
        if (!((Boolean) zzba.zzc().a(am.f12386v1)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f12520j = ((Boolean) zzba.zzc().a(am.f12370u1)).booleanValue();
        } else {
            this.f12520j = true;
        }
        this.f12517g = qfVar;
        this.f12518h = yh0Var;
    }

    public final synchronized void x1(zzm zzmVar, py pyVar, int i10) {
        try {
            if (!zzmVar.zzb()) {
                boolean z10 = false;
                if (((Boolean) dn.f13599k.o()).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                        z10 = true;
                    }
                }
                if (this.f12516f.clientJarVersion < ((Integer) zzba.zzc().a(am.Pc)).intValue() || !z10) {
                    k9.c0.d("#008 Must be called on the main UI thread.");
                }
            }
            ut0 ut0Var = this.f12512b;
            ut0Var.f20893c.set(pyVar);
            zzt.zzc();
            if (zzs.zzK(this.f12515e) && zzmVar.zzs == null) {
                int i11 = zze.zza;
                zzo.zzf("Failed to load the ad because app ID is missing.");
                ut0Var.j0(pi1.C(4, null, null));
            } else {
                if (this.f12519i != null) {
                    return;
                }
                vt0 vt0Var = new vt0(22);
                yt0 yt0Var = this.f12511a;
                yt0Var.f22370h.f17970o.f38703b = i10;
                yt0Var.a(zzmVar, this.f12513c, vt0Var, new x11(this, 24));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized void zzb(s9.a aVar) {
        zzk(aVar, this.f12520j);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized void zzc(zzm zzmVar, py pyVar) {
        x1(zzmVar, pyVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized void zzd(zzm zzmVar, py pyVar) {
        x1(zzmVar, pyVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zze(ly lyVar) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        this.f12512b.f20894d.set(lyVar);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzf(zzdn zzdnVar) {
        ut0 ut0Var = this.f12512b;
        if (zzdnVar == null) {
            ut0Var.f20892b.set(null);
        } else {
            ut0Var.f20892b.set(new zt0(this, zzdnVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final Bundle zzg() {
        Bundle bundle;
        k9.c0.d("#008 Must be called on the main UI thread.");
        ug0 ug0Var = this.f12519i;
        if (ug0Var == null) {
            return new Bundle();
        }
        wa0 wa0Var = ug0Var.f20780q;
        synchronized (wa0Var) {
            bundle = new Bundle(wa0Var.f21477c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized void zzh(vy vyVar) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        ku0 ku0Var = this.f12514d;
        ku0Var.f16524a = vyVar.f21315a;
        ku0Var.f16525b = vyVar.f21316b;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final boolean zzi() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        ug0 ug0Var = this.f12519i;
        return (ug0Var == null || ug0Var.f20786w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized String zzj() {
        aa0 aa0Var;
        ug0 ug0Var = this.f12519i;
        if (ug0Var == null || (aa0Var = ug0Var.f17339f) == null) {
            return null;
        }
        return aa0Var.f11954a;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized void zzk(s9.a aVar, boolean z10) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        if (this.f12519i == null) {
            int i10 = zze.zza;
            zzo.zzi("Rewarded can not be shown before loaded");
            this.f12512b.e(pi1.C(9, null, null));
        } else {
            if (((Boolean) zzba.zzc().a(am.L3)).booleanValue()) {
                this.f12517g.f19044b.zzi(new Throwable().getStackTrace());
            }
            this.f12519i.c((Activity) s9.b.y1(aVar), z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final fy zzl() {
        k9.c0.d("#008 Must be called on the main UI thread.");
        ug0 ug0Var = this.f12519i;
        if (ug0Var != null) {
            return ug0Var.f20782s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final zzdx zzm() {
        ug0 ug0Var;
        if (((Boolean) zzba.zzc().a(am.O7)).booleanValue() && (ug0Var = this.f12519i) != null) {
            return ug0Var.f17339f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final String zzn() {
        return this.f12513c;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzo(zzdq zzdqVar) {
        k9.c0.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.f12518h.b();
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f12512b.f20898h.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized void zzp(boolean z10) {
        k9.c0.d("setImmersiveMode must be called on the main UI thread.");
        this.f12520j = z10;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized long zzq() {
        n90 n90Var;
        ug0 ug0Var = this.f12519i;
        if (ug0Var == null || (n90Var = ug0Var.f17343j) == null) {
            return 0L;
        }
        return n90Var.f17723a.get();
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final synchronized void zzr(long j10) {
        n90 n90Var;
        ug0 ug0Var = this.f12519i;
        if (ug0Var == null || (n90Var = ug0Var.f17343j) == null) {
            return;
        }
        n90Var.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzs(qy qyVar) {
        k9.c0.d("#008 Must be called on the main UI thread.");
        this.f12512b.f20896f.set(qyVar);
    }
}
