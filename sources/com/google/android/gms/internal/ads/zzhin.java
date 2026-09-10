package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhin extends zzhan {
    private final zzhka zza;

    public zzhin(zzhka zzhkaVar) {
        this.zza = zzhkaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhin)) {
            return false;
        }
        zzhka zzhkaVar = ((zzhin) obj).zza;
        zzhka zzhkaVar2 = this.zza;
        return zzhkaVar2.zzc().zzc().equals(zzhkaVar.zzc().zzc()) && zzhkaVar2.zzc().zza().equals(zzhkaVar.zzc().zza()) && zzhkaVar2.zzc().zzb().equals(zzhkaVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhka zzhkaVar = this.zza;
        return Objects.hash(zzhkaVar.zzc(), zzhkaVar.zzf());
    }

    public final String toString() {
        String str;
        zzhka zzhkaVar = this.zza;
        String strZza = zzhkaVar.zzc().zza();
        int iOrdinal = zzhkaVar.zzc().zzc().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return androidx.datastore.preferences.protobuf.a.n("(typeUrl=", strZza, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhpw.RAW;
    }

    public final zzhka zzb() {
        return this.zza;
    }
}
