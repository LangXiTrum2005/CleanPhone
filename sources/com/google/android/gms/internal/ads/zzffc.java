package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes4.dex */
final class zzffc implements zzgpr {
    final /* synthetic */ zzfff zza;

    public zzffc(zzfff zzfffVar) {
        Objects.requireNonNull(zzfffVar);
        this.zza = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbza zzbzaVar = (zzbza) obj;
        zzffd zzffdVar = new zzffd(zzbzaVar, new zzfkl(zzbzaVar.zzj), null);
        zzfff zzfffVar = this.zza;
        zzfffVar.zzd(zzffdVar);
        return zzfffVar.zzc();
    }
}
