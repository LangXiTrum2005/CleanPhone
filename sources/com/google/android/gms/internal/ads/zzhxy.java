package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhxy implements Iterator {
    zzhxz zza;
    zzhxz zzb;
    int zzc;
    final /* synthetic */ zzhya zzd;

    public zzhxy(zzhya zzhyaVar) {
        Objects.requireNonNull(zzhyaVar);
        this.zzd = zzhyaVar;
        this.zza = zzhyaVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzhyaVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzhxz zzhxzVar = this.zzb;
        if (zzhxzVar == null) {
            throw new IllegalStateException();
        }
        zzhya zzhyaVar = this.zzd;
        zzhyaVar.zzd(zzhxzVar, true);
        this.zzb = null;
        this.zzc = zzhyaVar.zzc;
    }

    public final zzhxz zza() {
        zzhya zzhyaVar = this.zzd;
        zzhxz zzhxzVar = this.zza;
        if (zzhxzVar == zzhyaVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzhyaVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzhxzVar.zzd;
        this.zzb = zzhxzVar;
        return zzhxzVar;
    }
}
