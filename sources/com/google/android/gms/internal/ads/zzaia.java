package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaia extends zzaig {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaia(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaia.class == obj.getClass()) {
            zzaia zzaiaVar = (zzaia) obj;
            if (Objects.equals(this.zzb, zzaiaVar.zzb) && Objects.equals(this.zza, zzaiaVar.zza) && Objects.equals(this.zzc, zzaiaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() + ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        String str = this.zzc;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        int length3 = str3.length() + length + 11;
        String str4 = this.zzb;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 14 + 7 + length2);
        androidx.media3.extractor.text.ttml.a.C(sb, str, ": language=", str3, ", description=");
        return android.support.v4.media.a.s(sb, str4, ", text=", str2);
    }
}
