package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb;

    public zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.zza;
        if (this.zzb >= zzaeVar.zzh()) {
            int i2 = this.zzb;
            throw new NoSuchElementException(a.g(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
        }
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        return zzaeVar.zzl(i3);
    }
}
