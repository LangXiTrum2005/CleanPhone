package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzgut extends zzgrc {
    final transient zzgqs zza;

    public zzgut(Map map, zzgqs zzgqsVar) {
        super(map);
        this.zza = zzgqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrc, com.google.android.gms.internal.ads.zzgrt
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgrt, com.google.android.gms.internal.ads.zzgrw
    public final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgrt, com.google.android.gms.internal.ads.zzgrw
    public final Map zzl() {
        return zzm();
    }
}
