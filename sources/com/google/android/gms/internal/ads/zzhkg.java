package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhkg {
    private final Class zza;
    private final zzhxc zzb;

    public /* synthetic */ zzhkg(Class cls, zzhxc zzhxcVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzhxcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhkg)) {
            return false;
        }
        zzhkg zzhkgVar = (zzhkg) obj;
        return zzhkgVar.zza.equals(this.zza) && zzhkgVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzhxc zzhxcVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zzhxcVar);
        return android.support.v4.media.a.s(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
