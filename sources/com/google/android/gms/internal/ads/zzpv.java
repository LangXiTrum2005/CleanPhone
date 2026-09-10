package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpv {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpv zza(boolean z2) {
        this.zza = z2;
        return this;
    }

    public final zzpv zzb(boolean z2) {
        this.zzb = z2;
        return this;
    }

    public final zzpv zzc(boolean z2) {
        this.zzc = z2;
        return this;
    }

    public final zzpw zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpw(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
