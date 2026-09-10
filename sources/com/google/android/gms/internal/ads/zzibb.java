package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzibb extends AbstractList {
    private final zziaz zza;
    private final zziba zzb;

    public zzibb(zziaz zziazVar, zziba zzibaVar) {
        this.zza = zziazVar;
        this.zzb = zzibaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.zzb.zzb(this.zza.zzf(i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
