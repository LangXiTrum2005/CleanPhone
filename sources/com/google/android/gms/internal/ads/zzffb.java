package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes4.dex */
final class zzffb implements zzgpr {
    final /* synthetic */ zzfff zza;

    public zzffb(zzfff zzfffVar) {
        Objects.requireNonNull(zzfffVar);
        this.zza = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (zzeef) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfff zzfffVar = this.zza;
        zzfffVar.zzd(new zzffd(null, zzfffVar.zzb(), null));
        return zzfffVar.zzc();
    }
}
