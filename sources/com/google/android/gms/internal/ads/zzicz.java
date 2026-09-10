package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzicz implements Iterator {
    final /* synthetic */ zzidb zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzicz(zzidb zzidbVar, byte[] bArr) {
        Objects.requireNonNull(zzidbVar);
        this.zza = zzidbVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zzb + 1;
        zzidb zzidbVar = this.zza;
        if (i2 >= zzidbVar.zzj()) {
            return !zzidbVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        zzidb zzidbVar = this.zza;
        return i2 < zzidbVar.zzj() ? (zzicy) zzidbVar.zzi()[i2] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzidb zzidbVar = this.zza;
        zzidbVar.zzh();
        int i2 = this.zzb;
        if (i2 >= zzidbVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i2 - 1;
            zzidbVar.zzg(i2);
        }
    }
}
