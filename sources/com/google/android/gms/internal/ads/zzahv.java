package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahv implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzahv(int i2, String str, String str2, String str3, boolean z2, int i3) {
        boolean z3 = true;
        if (i3 != -1 && i3 <= 0) {
            z3 = false;
        }
        zzgqa.zza(z3);
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z2;
        this.zzf = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahv.class == obj.getClass()) {
            zzahv zzahvVar = (zzahv) obj;
            if (this.zza == zzahvVar.zza && Objects.equals(this.zzb, zzahvVar.zzb) && Objects.equals(this.zzc, zzahvVar.zzc) && Objects.equals(this.zzd, zzahvVar.zzd) && this.zze == zzahvVar.zze && this.zzf == zzahvVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i2 = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i3 = ((i2 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i3 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int i2 = this.zza;
        int length3 = String.valueOf(i2).length();
        int i3 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i3).length());
        androidx.media3.extractor.text.ttml.a.C(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return p005e.a.a(sb, i2, "\", bitrate=", i3, ", metadataInterval=");
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        String str = this.zzc;
        if (str != null) {
            zzamVar.zzu(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzamVar.zzt(str2);
        }
    }
}
