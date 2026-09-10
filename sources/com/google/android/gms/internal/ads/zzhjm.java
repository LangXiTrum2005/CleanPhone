package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhjm implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzhjm(zzhjp zzhjpVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhjpVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhjo(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
