package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhr {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhhr() {
    }

    public final zzhhr zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzhhs zzb() {
        return new zzhhs(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzhhr(byte[] bArr) {
    }
}
