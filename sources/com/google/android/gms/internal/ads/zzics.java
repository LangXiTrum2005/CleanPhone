package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class zzics implements Iterator {
    private final ArrayDeque zza;
    private zzhzi zzb;

    public /* synthetic */ zzics(zzhzl zzhzlVar, byte[] bArr) {
        if (!(zzhzlVar instanceof zzict)) {
            this.zza = null;
            this.zzb = (zzhzi) zzhzlVar;
            return;
        }
        zzict zzictVar = (zzict) zzhzlVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzictVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzictVar);
        this.zzb = zzb(zzictVar.zzD());
    }

    private final zzhzi zzb(zzhzl zzhzlVar) {
        while (zzhzlVar instanceof zzict) {
            zzict zzictVar = (zzict) zzhzlVar;
            this.zza.push(zzictVar);
            zzhzlVar = zzictVar.zzD();
        }
        return (zzhzi) zzhzlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzhzi next() {
        zzhzi zzhziVarZzb;
        zzhzi zzhziVar = this.zzb;
        if (zzhziVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzhziVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzhziVarZzb = zzb(((zzict) arrayDeque.pop()).zzE());
        } while (zzhziVarZzb.zzc() == 0);
        this.zzb = zzhziVarZzb;
        return zzhziVar;
    }
}
