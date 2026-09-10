package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzguz extends zzgtd {
    final /* synthetic */ zzgva zza;

    public zzguz(zzgva zzgvaVar) {
        Objects.requireNonNull(zzgvaVar);
        this.zza = zzgvaVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        zzgva zzgvaVar = this.zza;
        zzgqa.zzm(i2, zzgvaVar.zzw(), "index");
        int i3 = i2 + i2;
        Object obj = zzgvaVar.zzv()[i3];
        Objects.requireNonNull(obj);
        Object obj2 = zzgvaVar.zzv()[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return true;
    }
}
