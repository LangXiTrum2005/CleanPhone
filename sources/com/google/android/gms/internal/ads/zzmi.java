package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface zzmi extends zzmd {
    String zzS();

    default long zzT(long j, long j2) {
        if (zze() == 1) {
            return (zzY() || zzZ()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default boolean zzU(long j) {
        return false;
    }

    default void zzV(float f, float f2) throws zzit {
    }

    default void zzW() {
    }

    void zzX(long j, long j2) throws zzit;

    boolean zzY();

    boolean zzZ();

    int zza();

    zzmk zzb();

    void zzc(int i2, zzpn zzpnVar, zzdn zzdnVar);

    void zzcT() throws zzit;

    void zzcU(zzv[] zzvVarArr, zzxw zzxwVar, long j, long j2, zzwg zzwgVar) throws zzit;

    zzxw zzcV();

    boolean zzcW();

    zzlj zzd();

    int zze();

    void zzf(zzml zzmlVar, zzv[] zzvVarArr, zzxw zzxwVar, long j, boolean z2, boolean z3, long j2, long j3, zzwg zzwgVar) throws zzit;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j, boolean z2) throws zzit;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}
