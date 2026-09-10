package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgnl extends zzgnt {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzgnl(String str, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgnt) {
            zzgnt zzgntVar = (zzgnt) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzgntVar.zza()) : zzgntVar.zza() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzgntVar.zzb()) : zzgntVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgnt
    public final String zzb() {
        return this.zzb;
    }
}
