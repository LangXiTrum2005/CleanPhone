package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhlg {
    public static final zzhlg zza = new zzhlg("SHA1");
    public static final zzhlg zzb = new zzhlg("SHA224");
    public static final zzhlg zzc = new zzhlg("SHA256");
    public static final zzhlg zzd = new zzhlg("SHA384");
    public static final zzhlg zze = new zzhlg("SHA512");
    private final String zzf;

    private zzhlg(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
