package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends zzbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzr f16489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rt0 f16491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VersionInfoParcel f16493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hp0 f16494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ut0 f16495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qf f16496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yh0 f16497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ad0 f16498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16499k;

    public kp0(Context context, zzr zzrVar, String str, rt0 rt0Var, hp0 hp0Var, ut0 ut0Var, VersionInfoParcel versionInfoParcel, qf qfVar, yh0 yh0Var) {
        this.f16489a = zzrVar;
        this.f16492d = str;
        this.f16490b = context;
        this.f16491c = rt0Var;
        this.f16494f = hp0Var;
        this.f16495g = ut0Var;
        this.f16493e = versionInfoParcel;
        if (!((Boolean) zzba.zzc().a(am.f12386v1)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f16499k = ((Boolean) zzba.zzc().a(am.f12370u1)).booleanValue();
        } else {
            this.f16499k = true;
        }
        this.f16496h = qfVar;
        this.f16497i = yh0Var;
    }

    public final synchronized boolean x1() {
        ad0 ad0Var = this.f16498j;
        return (ad0Var == null || ad0Var.f11995p.f20695b.get()) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzB() {
        return this.f16491c.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(xx xxVar) {
        this.f16495g.f20895e.set(xxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzea zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzK(boolean z10) {
        k9.c0.d("setImmersiveMode must be called on the main UI thread.");
        this.f16499k = z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdq zzdqVar) {
        k9.c0.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.f16497i.b();
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f16494f.f15344c.set(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzm zzmVar, zzbk zzbkVar) {
        this.f16494f.f15345d.set(zzbkVar);
        zze(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzR(s9.a aVar) {
        if (this.f16498j == null) {
            int i10 = zze.zza;
            zzo.zzi("Interstitial can not be shown before loaded.");
            this.f16494f.e(pi1.C(9, null, null));
        } else {
            if (((Boolean) zzba.zzc().a(am.L3)).booleanValue()) {
                this.f16496h.f19044b.zzi(new Throwable().getStackTrace());
            }
            this.f16498j.c((Activity) s9.b.y1(aVar), this.f16499k);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzcs zzcsVar) {
        this.f16494f.f15346e.set(zzcsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzT(long j10) {
        n90 n90Var;
        ad0 ad0Var = this.f16498j;
        if (ad0Var == null || (n90Var = ad0Var.f17343j) == null) {
            return;
        }
        n90Var.a(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzU() {
        n90 n90Var;
        ad0 ad0Var = this.f16498j;
        if (ad0Var == null || (n90Var = ad0Var.f17343j) == null) {
            return 0L;
        }
        return n90Var.f17723a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final s9.a zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        k9.c0.d("destroy must be called on the main UI thread.");
        ad0 ad0Var = this.f16498j;
        if (ad0Var != null) {
            pa0 pa0Var = ad0Var.f17336c;
            pa0Var.getClass();
            pa0Var.S0(new zl(null, 1));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd() {
        k9.c0.d("isLoaded must be called on the main UI thread.");
        return x1();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(zzbh zzbhVar) {
        k9.c0.d("setAdListener must be called on the main UI thread.");
        this.f16494f.f15342a.set(zzbhVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zze(zzm zzmVar) {
        boolean z10;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) dn.f13597i.o()).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (this.f16493e.clientJarVersion < ((Integer) zzba.zzc().a(am.Pc)).intValue() || !z10) {
                    k9.c0.d("loadAd must be called on the main UI thread.");
                }
            }
            zzt.zzc();
            Context context = this.f16490b;
            if (zzs.zzK(context) && zzmVar.zzs == null) {
                int i10 = zze.zza;
                zzo.zzf("Failed to load the ad because app ID is missing.");
                hp0 hp0Var = this.f16494f;
                if (hp0Var != null) {
                    hp0Var.j0(pi1.C(4, null, null));
                }
            } else if (!x1()) {
                v71.p(context, zzmVar.zzf);
                this.f16498j = null;
                return this.f16491c.a(zzmVar, this.f16492d, new ot0(this.f16489a), new uo0(this, 1));
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        k9.c0.d("pause must be called on the main UI thread.");
        ad0 ad0Var = this.f16498j;
        if (ad0Var != null) {
            pa0 pa0Var = ad0Var.f17336c;
            pa0Var.getClass();
            pa0Var.S0(new az0(null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzg() {
        k9.c0.d("resume must be called on the main UI thread.");
        ad0 ad0Var = this.f16498j;
        if (ad0Var != null) {
            pa0 pa0Var = ad0Var.f17336c;
            pa0Var.getClass();
            pa0Var.S0(new sl(null, 2));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzcl zzclVar) {
        k9.c0.d("setAppEventListener must be called on the main UI thread.");
        this.f16494f.v(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzby zzbyVar) {
        k9.c0.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        k9.c0.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
        k9.c0.d("showInterstitial must be called on the main UI thread.");
        if (this.f16498j == null) {
            int i10 = zze.zza;
            zzo.zzi("Interstitial can not be shown before loaded.");
            this.f16494f.e(pi1.C(9, null, null));
        } else {
            if (((Boolean) zzba.zzc().a(am.L3)).booleanValue()) {
                this.f16496h.f19044b.zzi(new Throwable().getStackTrace());
            }
            this.f16498j.c(null, this.f16499k);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzr zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        aa0 aa0Var;
        ad0 ad0Var = this.f16498j;
        if (ad0Var == null || (aa0Var = ad0Var.f17339f) == null) {
            return null;
        }
        return aa0Var.f11954a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        aa0 aa0Var;
        ad0 ad0Var = this.f16498j;
        if (ad0Var == null || (aa0Var = ad0Var.f17339f) == null) {
            return null;
        }
        return aa0Var.f11954a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdx zzt() {
        ad0 ad0Var;
        if (((Boolean) zzba.zzc().a(am.O7)).booleanValue() && (ad0Var = this.f16498j) != null) {
            return ad0Var.f17339f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzu() {
        return this.f16492d;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzv() {
        zzcl zzclVar;
        hp0 hp0Var = this.f16494f;
        synchronized (hp0Var) {
            zzclVar = (zzcl) hp0Var.f15343b.get();
        }
        return zzclVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzw() {
        return this.f16494f.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx(jm jmVar) {
        k9.c0.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f16491c.f19662f = jmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zi ziVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzr zzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(nw nwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(pw pwVar, String str) {
    }
}
