package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaio {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzaio(long j, long j2, int i2) {
        zzgqa.zza(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaio.class == obj.getClass()) {
            zzaio zzaioVar = (zzaio) obj;
            if (this.zza == zzaioVar.zza && this.zzb == zzaioVar.zzb && this.zzc == zzaioVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        int i2 = this.zzc;
        String str = zzfj.zza;
        Locale locale = Locale.US;
        StringBuilder sbV = android.support.v4.media.a.v(j, "Segment: startTimeMs=", ", endTimeMs=");
        sbV.append(j2);
        sbV.append(", speedDivisor=");
        sbV.append(i2);
        return sbV.toString();
    }
}
