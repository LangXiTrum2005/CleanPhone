package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzba {
    public final Object zza;
    public final int zzb;
    public final zzak zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzba(Object obj, int i2, zzak zzakVar, Object obj2, int i3, long j, long j2, int i4, int i5) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = zzakVar;
        this.zzd = obj2;
        this.zze = i3;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i4;
        this.zzi = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzb == zzbaVar.zzb && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && this.zzh == zzbaVar.zzh && this.zzi == zzbaVar.zzi && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zza, zzbaVar.zza) && Objects.equals(this.zzd, zzbaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i2 = this.zzb;
        int length = String.valueOf(i2).length();
        int i3 = this.zze;
        int length2 = String.valueOf(i3).length();
        long j = this.zzf;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j).length());
        androidx.datastore.preferences.protobuf.a.z(sb, "mediaItem=", i2, ", period=", i3);
        String strK = androidx.media3.extractor.text.ttml.a.k(j, ", pos=", sb);
        int i4 = this.zzh;
        if (i4 == -1) {
            return strK;
        }
        long j2 = this.zzg;
        int i5 = this.zzi;
        int length3 = strK.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + length3 + 13 + String.valueOf(j2).length() + 10 + 5 + String.valueOf(i5).length());
        sb2.append(strK);
        sb2.append(", contentPos=");
        sb2.append(j2);
        return p005e.a.a(sb2, i4, ", adGroup=", i5, ", ad=");
    }
}
