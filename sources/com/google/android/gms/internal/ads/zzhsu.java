package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhsu {
    public static final zzhsu zza = new zzhsu("SHA256");
    public static final zzhsu zzb = new zzhsu("SHA384");
    public static final zzhsu zzc = new zzhsu("SHA512");
    private final String zzd;

    private zzhsu(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
