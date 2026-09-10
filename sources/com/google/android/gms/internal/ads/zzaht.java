package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaht implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaht(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = bArr;
    }

    public static zzaht zzb(zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        String strZzh = zzas.zzh(zzerVar.zzK(zzerVar.zzB(), StandardCharsets.US_ASCII));
        String strZzK = zzerVar.zzK(zzerVar.zzB(), StandardCharsets.UTF_8);
        int iZzB2 = zzerVar.zzB();
        int iZzB3 = zzerVar.zzB();
        int iZzB4 = zzerVar.zzB();
        int iZzB5 = zzerVar.zzB();
        int iZzB6 = zzerVar.zzB();
        byte[] bArr = new byte[iZzB6];
        zzerVar.zzm(bArr, 0, iZzB6);
        return new zzaht(iZzB, strZzh, strZzK, iZzB2, iZzB3, iZzB4, iZzB5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaht.class == obj.getClass()) {
            zzaht zzahtVar = (zzaht) obj;
            if (this.zza == zzahtVar.zza && this.zzb.equals(zzahtVar.zzb) && this.zzc.equals(zzahtVar.zzc) && this.zzd == zzahtVar.zzd && this.zze == zzahtVar.zze && this.zzf == zzahtVar.zzf && this.zzg == zzahtVar.zzg && Arrays.equals(this.zzh, zzahtVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int iHashCode = this.zzb.hashCode() + (i2 * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        return androidx.media3.extractor.text.ttml.a.q(new StringBuilder(str2.length() + length + 32), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }
}
