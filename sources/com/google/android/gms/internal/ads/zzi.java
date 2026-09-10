package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
public final class zzi {
    public static final zzi zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzh zzhVar = new zzh();
        zzhVar.zza(1);
        zzhVar.zzb(2);
        zzhVar.zzc(3);
        zza = zzhVar.zzg();
        zzh zzhVar2 = new zzh();
        zzhVar2.zza(1);
        zzhVar2.zzb(1);
        zzhVar2.zzc(2);
        zzhVar2.zzg();
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzi(int i2, int i3, int i4, byte[] bArr, int i5, int i6, byte[] bArr2) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = bArr;
        this.zzf = i5;
        this.zzg = i6;
    }

    @EnsuresNonNullIf
    public static boolean zza(zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i2 = zziVar.zzb;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = zziVar.zzc;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = zziVar.zzd;
        if ((i4 != -1 && i4 != 3) || zziVar.zze != null) {
            return false;
        }
        int i5 = zziVar.zzg;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = zziVar.zzf;
        return i6 == -1 || i6 == 8;
    }

    @Pure
    public static int zzb(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzc(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i2) {
        if (i2 == -1) {
            return "Unset color space";
        }
        if (i2 == 6) {
            return "BT2020";
        }
        if (i2 != 1) {
            return i2 != 2 ? androidx.datastore.preferences.protobuf.a.g(i2, "Undefined color space ", new StringBuilder(String.valueOf(i2).length() + 22)) : "BT601";
        }
        return "BT709";
    }

    private static String zzi(int i2) {
        if (i2 == -1) {
            return "Unset color transfer";
        }
        if (i2 == 10) {
            return "Gamma 2.2";
        }
        if (i2 == 1) {
            return "Linear";
        }
        if (i2 == 2) {
            return "sRGB";
        }
        if (i2 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i2 != 6) {
            return i2 != 7 ? androidx.datastore.preferences.protobuf.a.g(i2, "Undefined color transfer ", new StringBuilder(String.valueOf(i2).length() + 25)) : "HLG";
        }
        return "ST2084 PQ";
    }

    private static String zzj(int i2) {
        if (i2 == -1) {
            return "Unset color range";
        }
        if (i2 != 1) {
            return i2 != 2 ? androidx.datastore.preferences.protobuf.a.g(i2, "Undefined color range ", new StringBuilder(String.valueOf(i2).length() + 22)) : "Limited range";
        }
        return "Full range";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd && Arrays.equals(this.zze, zziVar.zze) && this.zzf == zziVar.zzf && this.zzg == zziVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzh;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i2 = this.zzf;
        int i3 = this.zzd;
        int i4 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i4);
        String strZzi = zzi(i3);
        String strI = i2 != -1 ? android.support.v4.media.a.i(i2, "bit Luma", new StringBuilder(String.valueOf(i2).length() + 8)) : "NA";
        int i5 = this.zzg;
        String strI2 = i5 != -1 ? android.support.v4.media.a.i(i5, "bit Chroma", new StringBuilder(String.valueOf(i5).length() + 10)) : "NA";
        boolean z2 = this.zze != null;
        StringBuilder sb = new StringBuilder(Z.d(strI2, Z.d(strI, Z.d(String.valueOf(z2), Z.d(strZzj, strZzh.length() + 12, 2) + strZzi.length() + 2, 2), 2), 1));
        sb.append("ColorInfo(");
        sb.append(strZzh);
        sb.append(", ");
        sb.append(strZzj);
        sb.append(", ");
        sb.append(strZzi);
        sb.append(", ");
        sb.append(z2);
        androidx.media3.extractor.text.ttml.a.C(sb, ", ", strI, ", ", strI2);
        sb.append(")");
        return sb.toString();
    }

    public final zzh zzd() {
        return new zzh(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String string;
        if (zzf()) {
            String strZzh = zzh(this.zzb);
            String strZzj = zzj(this.zzc);
            String strZzi = zzi(this.zzd);
            String str2 = zzfj.zza;
            Locale locale = Locale.US;
            str = strZzh + "/" + strZzj + "/" + strZzi;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i2 = this.zzf;
            int i3 = this.zzg;
            StringBuilder sb = new StringBuilder(Z.a(i2, 1) + String.valueOf(i3).length());
            sb.append(i2);
            sb.append("/");
            sb.append(i3);
            string = sb.toString();
        } else {
            string = "NA/NA";
        }
        return android.support.v4.media.a.s(new StringBuilder(string.length() + str.length() + 1), str, "/", string);
    }
}
