package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class zzahu implements zzao {
    public final String zza;
    public final String zzb;

    public zzahu(String str, String str2) {
        this.zza = zzgpj.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahu zzahuVar = (zzahu) obj;
            if (this.zza.equals(zzahuVar.zza) && this.zzb.equals(zzahuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return androidx.media3.extractor.text.ttml.a.q(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, d9.i.f24747b, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        switch (this.zza) {
            case "TITLE":
                zzamVar.zza(this.zzb);
                break;
            case "ARTIST":
                zzamVar.zzb(this.zzb);
                break;
            case "ALBUM":
                zzamVar.zzc(this.zzb);
                break;
            case "ALBUMARTIST":
                zzamVar.zzd(this.zzb);
                break;
            case "TRACKNUMBER":
                Integer numZzh = zzgwx.zzh(this.zzb, 10);
                if (numZzh != null) {
                    zzamVar.zzg(numZzh);
                    break;
                }
                break;
            case "TOTALTRACKS":
                Integer numZzh2 = zzgwx.zzh(this.zzb, 10);
                if (numZzh2 != null) {
                    zzamVar.zzh(numZzh2);
                    break;
                }
                break;
            case "DISCNUMBER":
                Integer numZzh3 = zzgwx.zzh(this.zzb, 10);
                if (numZzh3 != null) {
                    zzamVar.zzr(numZzh3);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numZzh4 = zzgwx.zzh(this.zzb, 10);
                if (numZzh4 != null) {
                    zzamVar.zzs(numZzh4);
                    break;
                }
                break;
            case "GENRE":
                zzamVar.zzt(this.zzb);
                break;
            case "DESCRIPTION":
                zzamVar.zze(this.zzb);
                break;
        }
    }
}
