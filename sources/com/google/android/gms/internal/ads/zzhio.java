package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhio {
    private HashMap zza = new HashMap();

    public final zzhip zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhip zzhipVar = new zzhip(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhipVar;
    }
}
