package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbzj extends zzbzl {
    private final String zza;
    private final int zzb;

    public zzbzj(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbzj)) {
            return false;
        }
        zzbzj zzbzjVar = (zzbzj) obj;
        if (Objects.equal(this.zza, zzbzjVar.zza)) {
            if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbzjVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final int zzc() {
        return this.zzb;
    }
}
