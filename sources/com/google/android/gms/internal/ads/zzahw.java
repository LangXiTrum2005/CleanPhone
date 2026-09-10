package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahw extends zzaig {
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzahw(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahw.class == obj.getClass()) {
            zzahw zzahwVar = (zzahw) obj;
            if (this.zzc == zzahwVar.zzc && Objects.equals(this.zza, zzahwVar.zza) && Objects.equals(this.zzb, zzahwVar.zzb) && Arrays.equals(this.zzd, zzahwVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i2 = this.zzc;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((((((i2 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        androidx.media3.extractor.text.ttml.a.C(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzd, this.zzc);
    }
}
