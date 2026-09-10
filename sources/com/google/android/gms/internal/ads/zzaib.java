package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaib extends zzaig {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzaib(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaib.class == obj.getClass()) {
            zzaib zzaibVar = (zzaib) obj;
            if (Objects.equals(this.zza, zzaibVar.zza) && Objects.equals(this.zzb, zzaibVar.zzb) && Objects.equals(this.zzc, zzaibVar.zzc) && Arrays.equals(this.zzd, zzaibVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        return Arrays.hashCode(this.zzd) + ((this.zzc.hashCode() + ((this.zzb.hashCode() + ((iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        int length3 = str3.length() + android.support.v4.media.a.b(length, 11, length2, 11);
        String str4 = this.zzc;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 14);
        androidx.media3.extractor.text.ttml.a.C(sb, str, ": mimeType=", str2, ", filename=");
        return android.support.v4.media.a.s(sb, str3, ", description=", str4);
    }
}
