package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgsg implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgsk zze;

    public /* synthetic */ zzgsg(zzgsk zzgskVar, byte[] bArr) {
        Objects.requireNonNull(zzgskVar);
        this.zze = zzgskVar;
        this.zzb = zzgskVar.zzs();
        this.zzc = zzgskVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.zzc;
        this.zzd = i2;
        Object objZza = zza(i2);
        this.zzc = this.zze.zzg(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzgqa.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i2 = this.zzd;
        zzgsk zzgskVar = this.zze;
        zzgskVar.remove(zzgskVar.zzo(i2));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i2);
}
