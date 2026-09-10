package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhtg {
    public static final zzhtg zza = new zzhtg("SHA256");
    public static final zzhtg zzb = new zzhtg("SHA384");
    public static final zzhtg zzc = new zzhtg("SHA512");
    private final String zzd;

    private zzhtg(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
