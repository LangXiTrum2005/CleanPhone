package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapu {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzapu(int i2, int i3, int i4) {
        this.zza = i2 != Integer.MIN_VALUE ? android.support.v4.media.a.i(i2, "/", new StringBuilder(String.valueOf(i2).length() + 1)) : "";
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i2 = this.zzd;
        int i3 = i2 == Integer.MIN_VALUE ? this.zzb : i2 + this.zzc;
        this.zzd = i3;
        String str = this.zza;
        this.zze = androidx.datastore.preferences.protobuf.a.g(i3, str, new StringBuilder(str.length() + String.valueOf(i3).length()));
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}
