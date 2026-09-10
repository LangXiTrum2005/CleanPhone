package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzxh implements zzxw {
    final /* synthetic */ zzxk zza;
    private final int zzb;

    public zzxh(zzxk zzxkVar, int i2) {
        Objects.requireNonNull(zzxkVar);
        this.zza = zzxkVar;
        this.zzb = i2;
    }

    public final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzd(zzle zzleVar, zzih zzihVar, int i2) {
        return this.zza.zzs(this.zzb, zzleVar, zzihVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zze(long j) {
        return this.zza.zzt(this.zzb, j);
    }
}
