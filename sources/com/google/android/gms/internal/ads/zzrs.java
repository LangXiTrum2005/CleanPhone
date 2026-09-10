package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzrs implements zzsf {
    final /* synthetic */ zzrz zza;

    public /* synthetic */ zzrs(zzrz zzrzVar, byte[] bArr) {
        Objects.requireNonNull(zzrzVar);
        this.zza = zzrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    public final void zza(long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        zzee.zzc("AudioTrackAudioOutput", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    public final void zzb(final long j) {
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzrr
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzpx) obj).zza(j);
            }
        };
        zzed zzedVarZzs = this.zza.zzs();
        zzedVarZzs.zzd(-1, zzdyVar);
        zzedVarZzs.zze();
    }
}
