package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzhil extends zzhan {
    private final String zza;
    private final zzhpw zzb;

    public /* synthetic */ zzhil(String str, zzhpw zzhpwVar, byte[] bArr) {
        this.zza = str;
        this.zzb = zzhpwVar;
    }

    public final String toString() {
        String str;
        String str2 = this.zza;
        int iOrdinal = this.zzb.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return androidx.datastore.preferences.protobuf.a.n("(typeUrl=", str2, ", outputPrefixType=", str, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzb != zzhpw.RAW;
    }
}
