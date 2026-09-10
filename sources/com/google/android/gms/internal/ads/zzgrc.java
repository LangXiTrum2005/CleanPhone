package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class zzgrc extends zzgrt implements zzgty {
    public zzgrc(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
