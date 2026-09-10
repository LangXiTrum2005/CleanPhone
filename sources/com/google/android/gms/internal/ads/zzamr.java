package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import com.applovin.impl.Z;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class zzamr {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamr(String str, int i2, Integer num, Integer num2, float f, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = z4;
        this.zzi = z5;
        this.zzj = i3;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117 A[Catch: RuntimeException -> 0x00ba, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00ba, blocks: (B:33:0x00c0, B:35:0x00c6, B:39:0x00d6, B:41:0x00da, B:45:0x00e9, B:47:0x00ed, B:51:0x00fe, B:53:0x0102, B:57:0x0113, B:59:0x0117, B:60:0x011f, B:68:0x013d, B:66:0x0130, B:28:0x00a1, B:23:0x008d), top: B:73:0x008d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    public static zzamr zza(String str, zzamp zzampVar) {
        float f;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        String strTrim;
        int i8;
        zzgqa.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i9 = zzampVar.zzk;
        zzamr zzamrVar = null;
        if (length != i9) {
            String str2 = zzfj.zza;
            Locale locale = Locale.US;
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i9, length, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
            sbP.append(str);
            sbP.append("'");
            zzee.zzc("SsaStyle", sbP.toString());
            return null;
        }
        try {
            String strTrim2 = strArrSplit[zzampVar.zza].trim();
            int i10 = zzampVar.zzb;
            int iZzd = i10 != -1 ? zzd(strArrSplit[i10].trim()) : -1;
            int i11 = zzampVar.zzc;
            Integer numZzb = i11 != -1 ? zzb(strArrSplit[i11].trim()) : null;
            int i12 = zzampVar.zzd;
            Integer numZzb2 = i12 != -1 ? zzb(strArrSplit[i12].trim()) : null;
            int i13 = zzampVar.zze;
            if (i13 != -1) {
                String strTrim3 = strArrSplit[i13].trim();
                try {
                    try {
                        f = Float.parseFloat(strTrim3);
                        zzamrVar = null;
                    } catch (RuntimeException e2) {
                        e = e2;
                        zzee.zzd("SsaStyle", android.support.v4.media.a.s(new StringBuilder(str.length() + 36), "Skipping malformed 'Style:' line: '", str, "'"), e);
                        return zzamrVar;
                    }
                } catch (NumberFormatException e3) {
                    StringBuilder sb = new StringBuilder(String.valueOf(strTrim3).length() + 29);
                    sb.append("Failed to parse font size: '");
                    sb.append(strTrim3);
                    sb.append("'");
                    zzee.zzd("SsaStyle", sb.toString(), e3);
                    f = -3.4028235E38f;
                }
                i2 = zzampVar.zzf;
                boolean z5 = false;
                if (i2 == -1 && zze(strArrSplit[i2].trim())) {
                    z5 = true;
                }
                i3 = zzampVar.zzg;
                if (i3 == -1 && zze(strArrSplit[i3].trim())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i4 = zzampVar.zzh;
                if (i4 == -1 && zze(strArrSplit[i4].trim())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i5 = zzampVar.zzi;
                if (i5 == -1 && zze(strArrSplit[i5].trim())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i6 = zzampVar.zzj;
                if (i6 != -1) {
                    strTrim = strArrSplit[i6].trim();
                    try {
                        i8 = Integer.parseInt(strTrim.trim());
                        if (i8 != 1 || i8 == 3) {
                            i7 = i8;
                        } else {
                            zzee.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim)));
                            i7 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    i7 = -1;
                }
                return new zzamr(strTrim2, iZzd, numZzb, numZzb2, f, z5, z2, z3, z4, i7);
            }
            f = -3.4028235E38f;
            i2 = zzampVar.zzf;
            boolean z6 = false;
            if (i2 == -1) {
            }
            i3 = zzampVar.zzg;
            if (i3 == -1) {
                z2 = false;
            } else {
                z2 = false;
            }
            i4 = zzampVar.zzh;
            if (i4 == -1) {
                z3 = false;
            } else {
                z3 = false;
            }
            i5 = zzampVar.zzi;
            if (i5 == -1) {
                z4 = false;
            } else {
                z4 = false;
            }
            i6 = zzampVar.zzj;
            if (i6 != -1) {
                strTrim = strArrSplit[i6].trim();
                i8 = Integer.parseInt(strTrim.trim());
                if (i8 != 1) {
                }
                i7 = i8;
            } else {
                i7 = -1;
            }
            return new zzamr(strTrim2, iZzd, numZzb, numZzb2, f, z6, z2, z3, z4, i7);
        } catch (RuntimeException e4) {
            e = e4;
            zzamrVar = null;
        }
    }

    public static Integer zzb(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgqa.zza(j <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgwx.zza(((j >> 24) & 255) ^ 255), zzgwx.zza(j & 255), zzgwx.zza((j >> 8) & 255), zzgwx.zza((j >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            zzee.zzd("SsaStyle", android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int i2 = Integer.parseInt(str.trim());
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i2;
                default:
                    Z.D(str, "Ignoring unknown alignment: ", "SsaStyle");
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static boolean zze(String str) {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e2) {
            zzee.zzd("SsaStyle", android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e2);
            return false;
        }
    }
}
