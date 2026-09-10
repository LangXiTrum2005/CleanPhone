package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvc extends zzgtd {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzgvc(Object[] objArr, int i2, int i3) {
        this.zza = objArr;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzgqa.zzm(i2, this.zzc, "index");
        Object obj = this.zza[i2 + i2 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return true;
    }
}
