package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
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
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fp0 extends zzbt implements gb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zs0 f14493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hp0 f14495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzr f14496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nu0 f14497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f14498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yh0 f14499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p70 f14500i;

    public fp0(Context context, zzr zzrVar, String str, zs0 zs0Var, hp0 hp0Var, VersionInfoParcel versionInfoParcel, yh0 yh0Var) {
        this.f14492a = context;
        this.f14493b = zs0Var;
        this.f14496e = zzrVar;
        this.f14494c = str;
        this.f14495d = hp0Var;
        this.f14497f = zs0Var.f22713k;
        this.f14498g = versionInfoParcel;
        this.f14499h = yh0Var;
        zs0Var.f22710h.P0(this, zs0Var.f22704b);
    }

    public final synchronized boolean x1(zzm zzmVar) {
        try {
            if (y1()) {
                k9.c0.d("loadAd must be called on the main UI thread.");
            }
            zzt.zzc();
            Context context = this.f14492a;
            if (!zzs.zzK(context) || zzmVar.zzs != null) {
                v71.p(context, zzmVar.zzf);
                return this.f14493b.a(zzmVar, this.f14494c, null, new vf(this, 27));
            }
            int i10 = zze.zza;
            zzo.zzf("Failed to load the ad because app ID is missing.");
            hp0 hp0Var = this.f14495d;
            if (hp0Var != null) {
                hp0Var.j0(pi1.C(4, null, null));
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final boolean y1() {
        boolean z10;
        if (((Boolean) dn.f13594f.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return this.f14498g.clientJarVersion < ((Integer) zzba.zzc().a(am.Pc)).intValue() || !z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        p70 p70Var = this.f14500i;
        return p70Var != null && p70Var.f17335b.f13706q0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzB() {
        return this.f14493b.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzea zzF() {
        k9.c0.d("getVideoController must be called from the main thread.");
        p70 p70Var = this.f14500i;
        zzea zzeaVarZza = null;
        if (p70Var == null) {
            return null;
        }
        try {
            zzeaVarZza = p70Var.f18546p.zza();
        } catch (qu0 unused) {
        }
        return zzeaVarZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzG(zzfw zzfwVar) {
        try {
            if (y1()) {
                k9.c0.d("setVideoOptions must be called on the main UI thread.");
            }
            this.f14497f.f17960d = zzfwVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdq zzdqVar) {
        if (y1()) {
            k9.c0.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdqVar.zzf()) {
                this.f14499h.b();
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f14495d.f15344c.set(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzT(long j10) {
        n90 n90Var;
        this.f14497f.f17976u.set(j10);
        p70 p70Var = this.f14500i;
        if (p70Var == null || (n90Var = p70Var.f17343j) == null) {
            return;
        }
        n90Var.a(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzU() {
        n90 n90Var;
        p70 p70Var = this.f14500i;
        return (p70Var == null || (n90Var = p70Var.f17343j) == null) ? this.f14497f.f17976u.get() : n90Var.f17723a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzY(zzcp zzcpVar) {
        k9.c0.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f14497f.f17979x = zzcpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final s9.a zzb() {
        if (y1()) {
            k9.c0.d("getAdFrame must be called on the main UI thread.");
        }
        return new s9.b(this.f14493b.f22708f);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        try {
            if (((Boolean) dn.f13593e.o()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(am.Lc)).booleanValue()) {
                    if (this.f14498g.clientJarVersion < ((Integer) zzba.zzc().a(am.Qc)).intValue()) {
                        k9.c0.d("destroy must be called on the main UI thread.");
                    }
                } else {
                    k9.c0.d("destroy must be called on the main UI thread.");
                }
            } else {
                k9.c0.d("destroy must be called on the main UI thread.");
            }
            p70 p70Var = this.f14500i;
            if (p70Var != null) {
                pa0 pa0Var = p70Var.f17336c;
                pa0Var.getClass();
                pa0Var.S0(new zl(null, 1));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(zzbh zzbhVar) {
        if (y1()) {
            k9.c0.d("setAdListener must be called on the main UI thread.");
        }
        this.f14495d.f15342a.set(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zze(zzm zzmVar) {
        zzr zzrVar = this.f14496e;
        synchronized (this) {
            nu0 nu0Var = this.f14497f;
            nu0Var.f17958b = zzrVar;
            nu0Var.f17972q = this.f14496e.zzn;
        }
        return x1(zzmVar);
        return x1(zzmVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        try {
            if (((Boolean) dn.f13595g.o()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(am.Mc)).booleanValue()) {
                    if (this.f14498g.clientJarVersion < ((Integer) zzba.zzc().a(am.Qc)).intValue()) {
                        k9.c0.d("pause must be called on the main UI thread.");
                    }
                } else {
                    k9.c0.d("pause must be called on the main UI thread.");
                }
            } else {
                k9.c0.d("pause must be called on the main UI thread.");
            }
            p70 p70Var = this.f14500i;
            if (p70Var != null) {
                pa0 pa0Var = p70Var.f17336c;
                pa0Var.getClass();
                pa0Var.S0(new az0(null));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzg() {
        try {
            if (((Boolean) dn.f13596h.o()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(am.Kc)).booleanValue()) {
                    if (this.f14498g.clientJarVersion < ((Integer) zzba.zzc().a(am.Qc)).intValue()) {
                        k9.c0.d("resume must be called on the main UI thread.");
                    }
                } else {
                    k9.c0.d("resume must be called on the main UI thread.");
                }
            } else {
                k9.c0.d("resume must be called on the main UI thread.");
            }
            p70 p70Var = this.f14500i;
            if (p70Var != null) {
                pa0 pa0Var = p70Var.f17336c;
                pa0Var.getClass();
                pa0Var.S0(new sl(null, 2));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzcl zzclVar) {
        if (y1()) {
            k9.c0.d("setAppEventListener must be called on the main UI thread.");
        }
        this.f14495d.v(zzclVar);
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
    public final synchronized void zzm() {
        k9.c0.d("recordManualImpression must be called on the main UI thread.");
        p70 p70Var = this.f14500i;
        if (p70Var != null) {
            rc0 rc0Var = p70Var.f18548r;
            synchronized (rc0Var) {
                rc0Var.S0(xa0.D);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzr zzn() {
        k9.c0.d("getAdSize must be called on the main UI thread.");
        p70 p70Var = this.f14500i;
        if (p70Var != null) {
            return x10.c(this.f14492a, Collections.singletonList(p70Var.c()));
        }
        return this.f14497f.f17958b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzo(zzr zzrVar) {
        b30 b30Var;
        k9.c0.d("setAdSize must be called on the main UI thread.");
        this.f14497f.f17958b = zzrVar;
        this.f14496e = zzrVar;
        p70 p70Var = this.f14500i;
        if (p70Var != null) {
            FrameLayout frameLayout = this.f14493b.f22708f;
            if (frameLayout != null && (b30Var = p70Var.f18544n) != null) {
                b30Var.F(t0.a(zzrVar));
                frameLayout.setMinimumHeight(zzrVar.zzc);
                frameLayout.setMinimumWidth(zzrVar.zzf);
                p70Var.f18551u = zzrVar;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        aa0 aa0Var;
        p70 p70Var = this.f14500i;
        if (p70Var == null || (aa0Var = p70Var.f17339f) == null) {
            return null;
        }
        return aa0Var.f11954a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        aa0 aa0Var;
        p70 p70Var = this.f14500i;
        if (p70Var == null || (aa0Var = p70Var.f17339f) == null) {
            return null;
        }
        return aa0Var.f11954a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdx zzt() {
        p70 p70Var;
        if (((Boolean) zzba.zzc().a(am.O7)).booleanValue() && (p70Var = this.f14500i) != null) {
            return p70Var.f17339f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzu() {
        return this.f14494c;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzv() {
        zzcl zzclVar;
        hp0 hp0Var = this.f14495d;
        synchronized (hp0Var) {
            zzclVar = (zzcl) hp0Var.f15343b.get();
        }
        return zzclVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzw() {
        return this.f14495d.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx(jm jmVar) {
        k9.c0.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f14493b.f22709g = jmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzbe zzbeVar) {
        if (y1()) {
            k9.c0.d("setAdListener must be called on the main UI thread.");
        }
        jp0 jp0Var = this.f14493b.f22707e;
        synchronized (jp0Var) {
            jp0Var.f16125a = zzbeVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz(boolean z10) {
        try {
            if (y1()) {
                k9.c0.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f14497f.f17961e = z10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(xx xxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) {
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
    public final void zzK(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(s9.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(nw nwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzm zzmVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(pw pwVar, String str) {
    }
}
