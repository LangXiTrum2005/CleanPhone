package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzijc implements zzijg {
    private final Map zza;

    public zzijc(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    public final Map zza() {
        return this.zza;
    }
}
