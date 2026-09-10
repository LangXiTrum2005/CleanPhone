package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.p004ironsource.d9;
import com.p004ironsource.sv;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdyd implements AppEventListener, zzddq, com.google.android.gms.ads.internal.client.zza, zzdak, zzdbe, zzdbf, zzdby, zzdan, zzfmv {
    private final List zza;
    private final zzdxr zzb;
    private long zzc;

    public zzdyd(zzdxr zzdxrVar, zzclg zzclgVar) {
        this.zzb = zzdxrVar;
        this.zza = Collections.singletonList(zzclgVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzi(com.google.android.gms.ads.internal.client.zza.class, sv.f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzi(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zza(Context context) {
        zzi(zzdbf.class, d9.h.t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzb(Context context) {
        zzi(zzdbf.class, d9.h.u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzc(Context context) {
        zzi(zzdbf.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    @ParametersAreNonnullByDefault
    public final void zzd(zzbzm zzbzmVar, String str, String str2) {
        zzi(zzdak.class, "onRewarded", zzbzmVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzi(zzdan.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdJ() {
        zzi(zzdak.class, sv.k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdK(zzfmo zzfmoVar, String str) {
        zzi(zzfmn.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdL(zzfmo zzfmoVar, String str) {
        zzi(zzfmn.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdM(zzfmo zzfmoVar, String str, Throwable th) {
        zzi(zzfmn.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdN(zzfmo zzfmoVar, String str) {
        zzi(zzfmn.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        zzi(zzddq.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        zzi(zzdbe.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzds() {
        zzi(zzdak.class, sv.g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdt() {
        zzi(zzdak.class, sv.f27215c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zze() {
        zzi(zzdak.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzf() {
        zzi(zzdak.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        zzi(zzdby.class, sv.j, new Object[0]);
    }
}
