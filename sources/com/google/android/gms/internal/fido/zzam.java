package com.google.android.gms.internal.fido;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes4.dex */
public final class zzam {
    public static int zza(int i2, int i3, String str) {
        String strZza;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            strZza = zzan.zza("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(a.h(i3, "negative size: "));
            }
            strZza = zzan.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzf(i2, i3, "index"));
        }
        return i2;
    }

    public static void zzc(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z2, String str, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(zzan.zza(str, Character.valueOf(c2)));
        }
    }

    public static void zze(int i2, int i3, int i4) {
        String strZzf;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strZzf = zzf(i2, i4, "start index");
            } else {
                strZzf = (i3 < 0 || i3 > i4) ? zzf(i3, i4, "end index") : zzan.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    private static String zzf(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzan.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzan.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(a.h(i3, "negative size: "));
    }
}
