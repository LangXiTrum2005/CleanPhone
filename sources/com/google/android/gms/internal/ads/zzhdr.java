package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdr {
    public static final zzhdr zza = new zzhdr("ASSUME_AES_GCM");
    public static final zzhdr zzb = new zzhdr("ASSUME_XCHACHA20POLY1305");
    public static final zzhdr zzc = new zzhdr("ASSUME_CHACHA20POLY1305");
    public static final zzhdr zzd = new zzhdr("ASSUME_AES_CTR_HMAC");
    public static final zzhdr zze = new zzhdr("ASSUME_AES_EAX");
    public static final zzhdr zzf = new zzhdr("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzhdr(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
