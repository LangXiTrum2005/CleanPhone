package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrv {
    private final String zza;
    private final String zzb;

    private zzfrv(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfrv zza(String str, String str2) {
        zzftf.zzc(str, "Name is null or empty");
        zzftf.zzc(str2, "Version is null or empty");
        return new zzfrv(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
