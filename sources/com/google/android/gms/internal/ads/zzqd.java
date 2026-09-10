package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqd {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqd zza(boolean z2) {
        this.zza = z2;
        return this;
    }

    public final zzqd zzb(boolean z2) {
        this.zzb = z2;
        return this;
    }

    public final zzqd zzc(boolean z2) {
        this.zzc = z2;
        return this;
    }

    public final zzqd zzd(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzqe zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqe(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    public final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
