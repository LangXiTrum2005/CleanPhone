package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfho extends zzbzo {
    private final zzfhe zza;
    private final zzfgv zzb;
    private final zzfid zzc;
    private zzdte zzd;
    private boolean zze = false;

    public zzfho(zzfhe zzfheVar, zzfgv zzfgvVar, zzfid zzfidVar) {
        this.zza = zzfheVar;
        this.zzb = zzfgvVar;
        this.zzc = zzfidVar;
    }

    private final synchronized boolean zzy() {
        zzdte zzdteVar = this.zzd;
        return (zzdteVar == null || zzdteVar.zze()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbgk.zzgs)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzbzp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzbzt r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbgb r1 = com.google.android.gms.internal.ads.zzbgk.zzgq     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbgi r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcda r2 = com.google.android.gms.ads.internal.zzt.zzh()     // Catch: java.lang.Throwable -> L20
            r2.zzg(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbgb r0 = com.google.android.gms.internal.ads.zzbgk.zzgs     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbgi r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfgx r0 = new com.google.android.gms.internal.ads.zzfgx     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfhe r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfhm r3 = new com.google.android.gms.internal.ads.zzfhm     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zza(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfho.zzb(com.google.android.gms.internal.ads.zzbzt):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzd(zzbzs zzbzsVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzbzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final boolean zze() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized String zzl() throws RemoteException {
        zzdte zzdteVar = this.zzd;
        if (zzdteVar == null || zzdteVar.zzn() == null) {
            return null;
        }
        return zzdteVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzn(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzcbVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfhn(this, zzcbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdte zzdteVar = this.zzd;
        return zzdteVar != null ? zzdteVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (objUnwrap instanceof Activity) {
                        activity = (Activity) objUnwrap;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized void zzq(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized void zzr(boolean z2) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final boolean zzs() {
        zzdte zzdteVar = this.zzd;
        return zzdteVar != null && zzdteVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() throws RemoteException {
        zzdte zzdteVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhB)).booleanValue() && (zzdteVar = this.zzd) != null) {
            return zzdteVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzu(zzbzn zzbznVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzp(zzbznVar);
    }

    public final /* synthetic */ zzfid zzv() {
        return this.zzc;
    }

    public final /* synthetic */ zzdte zzw() {
        return this.zzd;
    }

    public final /* synthetic */ void zzx(zzdte zzdteVar) {
        this.zzd = zzdteVar;
    }
}
