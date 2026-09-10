package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzicr {
    public static final /* synthetic */ zzhzl zza(zzhzl zzhzlVar, zzhzl zzhzlVar2, ArrayDeque arrayDeque) {
        zzb(zzhzlVar, arrayDeque);
        zzb(zzhzlVar2, arrayDeque);
        zzhzl zzictVar = (zzhzl) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzictVar = new zzict((zzhzl) arrayDeque.pop(), zzictVar, null);
        }
        return zzictVar;
    }

    private static final void zzb(zzhzl zzhzlVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzhzlVar.zzg()) {
            if (!(zzhzlVar instanceof zzict)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzhzlVar.getClass())));
            }
            zzict zzictVar = (zzict) zzhzlVar;
            zzb(zzictVar.zzD(), arrayDeque);
            zzb(zzictVar.zzE(), arrayDeque);
            return;
        }
        int iZzc = zzc(zzhzlVar.zzc(), arrayDeque);
        int iZzh = zzict.zzh(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzhzl) arrayDeque.peek()).zzc() >= iZzh) {
            arrayDeque.push(zzhzlVar);
            return;
        }
        int iZzh2 = zzict.zzh(iZzc);
        zzhzl zzictVar2 = (zzhzl) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zzhzl) arrayDeque.peek()).zzc() >= iZzh2) {
                break;
            } else {
                zzictVar2 = new zzict((zzhzl) arrayDeque.pop(), zzictVar2, bArr);
            }
        }
        zzict zzictVar3 = new zzict(zzictVar2, zzhzlVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zzhzl) arrayDeque.peek()).zzc() >= zzict.zzh(zzc(zzictVar3.zzc(), arrayDeque) + 1)) {
                break;
            } else {
                zzictVar3 = new zzict((zzhzl) arrayDeque.pop(), zzictVar3, bArr);
            }
        }
        arrayDeque.push(zzictVar3);
    }

    private static final int zzc(int i2, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(zzict.zza, i2);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
