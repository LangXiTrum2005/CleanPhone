package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaps {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzaps(int i2, String str, int i3, List list, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = i3;
        this.zzd = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i2 = this.zzc;
        if (i2 != 2) {
            return i2 != 3 ? 0 : 512;
        }
        return com.p004ironsource.mediationsdk.metadata.a.f25965n;
    }
}
