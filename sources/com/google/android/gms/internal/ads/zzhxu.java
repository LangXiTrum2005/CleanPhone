package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhxu extends zzhxy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhxu(zzhxv zzhxvVar) {
        super(zzhxvVar.zza);
        Objects.requireNonNull(zzhxvVar);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return zza();
    }
}
