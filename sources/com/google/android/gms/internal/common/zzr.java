package com.google.android.gms.internal.common;

import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class zzr {
    public static void zza(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static int zzb(int i2, int i3, String str) {
        String strZza;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            strZza = zzx.zza("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(a.g(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
            }
            strZza = zzx.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzc(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zze(i2, i3, "index"));
        }
        return i2;
    }

    public static void zzd(int i2, int i3, int i4) {
        String strZze;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strZze = zze(i2, i4, "start index");
            } else {
                strZze = (i3 < 0 || i3 > i4) ? zze(i3, i4, "end index") : zzx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strZze);
        }
    }

    private static String zze(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzx.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(a.g(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
    }
}
