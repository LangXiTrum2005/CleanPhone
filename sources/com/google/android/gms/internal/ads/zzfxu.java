package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxu extends zzial implements zzicd {
    private zzfxu() {
        throw null;
    }

    public final zzfxu zza(String str) {
        str.getClass();
        zzbg();
        ((zzfxw) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzfxw) this.zza).zzb());
    }

    public final zzfxu zzc(String str, zzfxs zzfxsVar) {
        str.getClass();
        zzfxsVar.getClass();
        zzbg();
        ((zzfxw) this.zza).zze().put(str, zzfxsVar);
        return this;
    }

    public /* synthetic */ zzfxu(byte[] bArr) {
        super(zzfxw.zzb);
    }
}
