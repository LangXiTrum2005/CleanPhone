package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
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
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends zzbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbh f13221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou0 f13222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p70 f13223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f13224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yh0 f13225f;

    public cp0(Context context, zzbh zzbhVar, ou0 ou0Var, p70 p70Var, yh0 yh0Var) {
        this.f13220a = context;
        this.f13221b = zzbhVar;
        this.f13222c = ou0Var;
        this.f13223d = p70Var;
        this.f13225f = yh0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View view = p70Var.f18543m;
        zzt.zzc();
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzn().zzc);
        frameLayout.setMinimumWidth(zzn().zzf);
        this.f13224e = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() {
        p70 p70Var = this.f13223d;
        return p70Var != null && p70Var.f17335b.f13706q0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzB() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzea zzF() {
        p70 p70Var = this.f13223d;
        p70Var.getClass();
        try {
            return p70Var.f18546p.zza();
        } catch (qu0 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzfw zzfwVar) {
        int i10 = zze.zza;
        zzo.zzh("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdq zzdqVar) {
        if (!((Boolean) zzba.zzc().a(am.f12231kd)).booleanValue()) {
            int i10 = zze.zza;
            zzo.zzh("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        hp0 hp0Var = this.f13222c.f18362c;
        if (hp0Var != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.f13225f.b();
                }
            } catch (RemoteException e10) {
                int i11 = zze.zza;
                zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
            }
            hp0Var.f15344c.set(zzdqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(long j10) {
        n90 n90Var = this.f13223d.f17343j;
        if (n90Var != null) {
            n90Var.a(j10);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() {
        n90 n90Var;
        p70 p70Var = this.f13223d;
        if (p70Var == null || (n90Var = p70Var.f17343j) == null) {
            return 0L;
        }
        return n90Var.f17723a.get();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(zzcp zzcpVar) {
        int i10 = zze.zza;
        zzo.zzh("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final s9.a zzb() {
        return new s9.b(this.f13224e);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() {
        k9.c0.d("destroy must be called on the main UI thread.");
        pa0 pa0Var = this.f13223d.f17336c;
        pa0Var.getClass();
        pa0Var.S0(new zl(null, 1));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(zzbh zzbhVar) {
        int i10 = zze.zza;
        zzo.zzh("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zze(zzm zzmVar) {
        int i10 = zze.zza;
        zzo.zzh("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() {
        k9.c0.d("destroy must be called on the main UI thread.");
        pa0 pa0Var = this.f13223d.f17336c;
        pa0Var.getClass();
        pa0Var.S0(new az0(null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg() {
        k9.c0.d("destroy must be called on the main UI thread.");
        pa0 pa0Var = this.f13223d.f17336c;
        pa0Var.getClass();
        pa0Var.S0(new sl(null, 2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzcl zzclVar) {
        hp0 hp0Var = this.f13222c.f18362c;
        if (hp0Var != null) {
            hp0Var.v(zzclVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzby zzbyVar) {
        int i10 = zze.zza;
        zzo.zzh("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        int i10 = zze.zza;
        zzo.zzh("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() {
        rc0 rc0Var = this.f13223d.f18548r;
        synchronized (rc0Var) {
            rc0Var.S0(xa0.D);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzr zzn() {
        k9.c0.d("getAdSize must be called on the main UI thread.");
        return x10.c(this.f13220a, Collections.singletonList(this.f13223d.c()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzr zzrVar) {
        FrameLayout frameLayout;
        b30 b30Var;
        k9.c0.d("setAdSize must be called on the main UI thread.");
        p70 p70Var = this.f13223d;
        if (p70Var == null || (frameLayout = this.f13224e) == null || (b30Var = p70Var.f18544n) == null) {
            return;
        }
        b30Var.F(t0.a(zzrVar));
        frameLayout.setMinimumHeight(zzrVar.zzc);
        frameLayout.setMinimumWidth(zzrVar.zzf);
        p70Var.f18551u = zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        aa0 aa0Var = this.f13223d.f17339f;
        if (aa0Var != null) {
            return aa0Var.f11954a;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        aa0 aa0Var = this.f13223d.f17339f;
        if (aa0Var != null) {
            return aa0Var.f11954a;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdx zzt() {
        return this.f13223d.f17339f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzu() {
        return this.f13222c.f18366g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzv() {
        return this.f13222c.f18373o;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzw() {
        return this.f13221b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(jm jmVar) {
        int i10 = zze.zza;
        zzo.zzh("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzbe zzbeVar) {
        int i10 = zze.zza;
        zzo.zzh("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z10) {
        int i10 = zze.zza;
        zzo.zzh("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
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
