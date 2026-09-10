package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhxw extends zzhxy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhxw(zzhxx zzhxxVar) {
        super(zzhxxVar.zza);
        Objects.requireNonNull(zzhxxVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
