package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcvm implements zzcvn {
    private final Map zza;

    public zzcvm(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcvn
    public final zzejg zza(int i2, String str) {
        return (zzejg) this.zza.get(str);
    }
}
