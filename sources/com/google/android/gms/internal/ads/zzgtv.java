package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtv extends zzgvr {
    private final Object zza;
    private boolean zzb;

    public zzgtv(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
