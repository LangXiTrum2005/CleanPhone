package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaim extends zzaig {
    public final String zza;
    public final String zzb;

    public zzaim(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaim.class == obj.getClass()) {
            zzaim zzaimVar = (zzaim) obj;
            if (this.zzf.equals(zzaimVar.zzf) && Objects.equals(this.zza, zzaimVar.zza) && Objects.equals(this.zzb, zzaimVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return android.support.v4.media.a.s(new StringBuilder(str2.length() + length + 6), str, ": url=", str2);
    }
}
