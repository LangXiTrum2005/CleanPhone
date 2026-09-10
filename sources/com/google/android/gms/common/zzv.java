package com.google.android.gms.common;

/* JADX INFO: loaded from: classes3.dex */
final class zzv {
    private String zza = null;
    private Boolean zzb = null;
    private Boolean zzc = null;

    private zzv() {
    }

    public final zzv zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzv zzb(boolean z2) {
        this.zzb = Boolean.valueOf(z2);
        return this;
    }

    public final zzv zzc(boolean z2) {
        this.zzc = Boolean.valueOf(z2);
        return this;
    }

    public final zzw zzd() {
        Boolean bool = this.zzb;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.zzc != null) {
            return new zzw(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }

    public /* synthetic */ zzv(byte[] bArr) {
    }
}
