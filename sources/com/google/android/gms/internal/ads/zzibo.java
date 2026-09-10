package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzibo {
    public static final List zza(Object obj, long j) {
        zzibd zzibdVar = (zzibd) zzidm.zzn(obj, j);
        if (zzibdVar.zza()) {
            return zzibdVar;
        }
        int size = zzibdVar.size();
        zzibd zzibdVarZzh = zzibdVar.zzh(size == 0 ? 10 : size + size);
        zzidm.zzo(obj, j, zzibdVarZzh);
        return zzibdVarZzh;
    }
}
