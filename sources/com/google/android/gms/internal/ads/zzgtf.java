package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgtf {
    Object[] zza;
    int zzb;
    zzgte zzc;

    public zzgtf() {
        this(4);
    }

    private final void zze(int i2) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.zza = Arrays.copyOf(objArr, zzgsy.zze(length, i3));
        }
    }

    private final zzgtg zzf(boolean z2) {
        zzgte zzgteVar;
        zzgte zzgteVar2;
        if (z2 && (zzgteVar2 = this.zzc) != null) {
            throw zzgteVar2.zza();
        }
        zzgvd zzgvdVarZzk = zzgvd.zzk(this.zzb, this.zza, this);
        if (!z2 || (zzgteVar = this.zzc) == null) {
            return zzgvdVarZzk;
        }
        throw zzgteVar.zza();
    }

    public final zzgtf zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgrz.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + i2;
        objArr[i3] = obj;
        objArr[i3 + 1] = obj2;
        this.zzb = i2 + 1;
        return this;
    }

    public final zzgtf zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgtg zzc() {
        return zzf(true);
    }

    public final zzgtg zzd() {
        return zzf(false);
    }

    public zzgtf(int i2) {
        this.zza = new Object[i2 + i2];
        this.zzb = 0;
    }
}
