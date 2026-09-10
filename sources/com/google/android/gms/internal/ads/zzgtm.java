package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgtm extends zzgsx {
    Object[] zzd;
    private int zze;

    public zzgtm() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgsx, com.google.android.gms.internal.ads.zzgsy
    public final /* bridge */ /* synthetic */ zzgsy zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgtm zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzn = zzgtn.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzn <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgsw.zza(iHashCode);
                while (true) {
                    int i2 = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i2];
                    if (obj2 == null) {
                        objArr2[i2] = obj;
                        this.zze += iHashCode;
                        zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i2 + 1;
                }
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzgtm zzg(Object... objArr) {
        if (this.zzd == null) {
            zzb(objArr, 2);
            return this;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            zzf(objArr[i2]);
        }
        return this;
    }

    public final zzgtm zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgtn zzi() {
        zzgtn zzgtnVarZzv;
        int i2 = this.zzb;
        if (i2 == 0) {
            return zzgve.zza;
        }
        if (i2 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgvo(obj);
        }
        if (this.zzd == null || zzgtn.zzn(i2) != this.zzd.length) {
            zzgtnVarZzv = zzgtn.zzv(this.zzb, this.zza);
            this.zzb = zzgtnVarZzv.size();
        } else {
            int i3 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgtn.zzw(i3, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            }
            int i4 = this.zze;
            Object[] objArr = this.zzd;
            zzgtnVarZzv = new zzgve(objArrCopyOf, i4, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgtnVarZzv;
    }

    public zzgtm(int i2, boolean z2) {
        super(i2);
        this.zzd = new Object[zzgtn.zzn(i2)];
    }
}
