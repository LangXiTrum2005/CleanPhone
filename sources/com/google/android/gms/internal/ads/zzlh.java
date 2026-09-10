package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlh {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlh() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzlh zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzlh zzb(float f) {
        boolean z2 = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z2 = false;
        }
        zzgqa.zza(z2);
        this.zzb = f;
        return this;
    }

    public final zzlh zzc(long j) {
        boolean z2 = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z2 = false;
            }
        }
        zzgqa.zza(z2);
        this.zzc = j;
        return this;
    }

    public final zzli zzd() {
        return new zzli(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzlh(zzli zzliVar, byte[] bArr) {
        this.zza = zzliVar.zza;
        this.zzb = zzliVar.zzb;
        this.zzc = zzliVar.zzc;
    }
}
