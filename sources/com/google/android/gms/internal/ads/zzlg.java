package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public interface zzlg {
    default void zza(zzpn zzpnVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void zzb(zzlf zzlfVar, zzyh zzyhVar, zzzw[] zzzwVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void zzc(zzpn zzpnVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void zzd(zzpn zzpnVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    zzaah zze(zzpn zzpnVar);

    default long zzf(zzpn zzpnVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean zzg(zzpn zzpnVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzh(zzlf zzlfVar) {
        long j = zzlfVar.zzd;
        throw null;
    }

    default boolean zzi(zzlf zzlfVar) {
        zzbf zzbfVar = zzlfVar.zzb;
        throw null;
    }

    default boolean zzj(zzpn zzpnVar, zzbf zzbfVar, zzwg zzwgVar, long j) {
        zzee.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
