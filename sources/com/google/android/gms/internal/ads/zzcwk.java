package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes4.dex */
final class zzcwk implements zzgyj {
    final /* synthetic */ zzcwo zza;

    public zzcwk(zzcwo zzcwoVar) {
        Objects.requireNonNull(zzcwoVar);
        this.zza = zzcwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        this.zza.zzk().zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zzn(true);
    }
}
