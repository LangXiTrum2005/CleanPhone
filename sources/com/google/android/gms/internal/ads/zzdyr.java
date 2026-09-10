package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.p004ironsource.sv;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdyr {
    private final zzbon zza;

    public zzdyr(zzbon zzbonVar) {
        this.zza = zzbonVar;
    }

    private final void zzs(zzdyq zzdyqVar) throws RemoteException {
        String strZza = zzdyqVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdyq(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("creation", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("nativeObjectCreated");
        zzs(zzdyqVar);
    }

    public final void zzc(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("creation", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("nativeObjectNotCreated");
        zzs(zzdyqVar);
    }

    public final void zzd(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("interstitial", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdyqVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("interstitial", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc(sv.j);
        zzs(zzdyqVar);
    }

    public final void zzf(long j, int i2) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("interstitial", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onAdFailedToLoad");
        zzdyqVar.zzd(Integer.valueOf(i2));
        zzs(zzdyqVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("interstitial", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc(sv.f27215c);
        zzs(zzdyqVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("interstitial", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc(sv.f);
        this.zza.zzb(zzdyqVar.zza());
    }

    public final void zzi(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("interstitial", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc(sv.g);
        zzs(zzdyqVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdyqVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onRewardedAdLoaded");
        zzs(zzdyqVar);
    }

    public final void zzl(long j, int i2) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onRewardedAdFailedToLoad");
        zzdyqVar.zzd(Integer.valueOf(i2));
        zzs(zzdyqVar);
    }

    public final void zzm(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onRewardedAdOpened");
        zzs(zzdyqVar);
    }

    public final void zzn(long j, int i2) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onRewardedAdFailedToShow");
        zzdyqVar.zzd(Integer.valueOf(i2));
        zzs(zzdyqVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onRewardedAdClosed");
        zzs(zzdyqVar);
    }

    public final void zzp(long j, zzcac zzcacVar) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onUserEarnedReward");
        zzdyqVar.zze(zzcacVar.zze());
        zzdyqVar.zzf(Integer.valueOf(zzcacVar.zzf()));
        zzs(zzdyqVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc("onAdImpression");
        zzs(zzdyqVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdyq zzdyqVar = new zzdyq("rewarded", null);
        zzdyqVar.zzb(Long.valueOf(j));
        zzdyqVar.zzc(sv.f);
        zzs(zzdyqVar);
    }
}
