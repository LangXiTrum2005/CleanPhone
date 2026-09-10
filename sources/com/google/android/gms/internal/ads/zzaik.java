package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaik extends zzaig {
    public final String zza;
    public final byte[] zzb;

    public zzaik(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaik.class == obj.getClass()) {
            zzaik zzaikVar = (zzaik) obj;
            if (Objects.equals(this.zza, zzaikVar.zza) && Arrays.equals(this.zzb, zzaikVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return Arrays.hashCode(this.zzb) + (iHashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        return android.support.v4.media.a.s(new StringBuilder(str2.length() + length + 8), str, ": owner=", str2);
    }
}
