package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfy implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfy(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfy)) {
            return false;
        }
        zzfy zzfyVar = (zzfy) obj;
        return this.zza == zzfyVar.zza && this.zzb == zzfyVar.zzb && this.zzc == zzfyVar.zzc;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return Long.hashCode(this.zzc) + ((Long.hashCode(this.zzb) + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        long j3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j3).length());
        androidx.datastore.preferences.protobuf.a.A(sb, "Mp4Timestamp: creation time=", j, ", modification time=");
        sb.append(j2);
        return androidx.media3.extractor.text.ttml.a.k(j3, ", timescale=", sb);
    }
}
