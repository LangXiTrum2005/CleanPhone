package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrb {
    public static final zzhrb zza = new zzhrb("SHA256");
    public static final zzhrb zzb = new zzhrb("SHA384");
    public static final zzhrb zzc = new zzhrb("SHA512");
    private final String zzd;

    private zzhrb(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
