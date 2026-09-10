package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbr {
    public static final zzhbr zza = new zzhbr("SHA1");
    public static final zzhbr zzb = new zzhbr("SHA224");
    public static final zzhbr zzc = new zzhbr("SHA256");
    public static final zzhbr zzd = new zzhbr("SHA384");
    public static final zzhbr zze = new zzhbr("SHA512");
    private final String zzf;

    private zzhbr(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
