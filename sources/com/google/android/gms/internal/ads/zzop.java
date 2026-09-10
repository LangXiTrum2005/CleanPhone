package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzop {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzop zza(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzop zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzop zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzor zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzor(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
