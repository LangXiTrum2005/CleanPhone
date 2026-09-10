package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahr implements zzao {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm("application/id3");
        zztVar.zzM();
        zzt zztVar2 = new zzt();
        zztVar2.zzm("application/x-scte35");
        zztVar2.zzM();
    }

    public zzahr(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahr.class == obj.getClass()) {
            zzahr zzahrVar = (zzahr) obj;
            if (this.zzc == zzahrVar.zzc && this.zzd == zzahrVar.zzd && Objects.equals(this.zza, zzahrVar.zza) && Objects.equals(this.zzb, zzahrVar.zzb) && Arrays.equals(this.zze, zzahrVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzf;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        long j = this.zzc;
        long j2 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) j2)) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        long j = this.zzd;
        int length = String.valueOf(j).length();
        long j2 = this.zzc;
        int length2 = String.valueOf(j2).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(str2.length() + length3 + 8);
        android.support.v4.media.a.A(sb, "EMSG: scheme=", str, ", id=");
        sb.append(j);
        androidx.datastore.preferences.protobuf.a.A(sb, ", durationMs=", j2, ", value=");
        sb.append(str2);
        return sb.toString();
    }
}
