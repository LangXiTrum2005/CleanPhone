package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgqa {
    public static void zza(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z2, String str, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(zzgqr.zzd(str, Character.valueOf(c2)));
        }
    }

    public static void zzd(boolean z2, String str, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(zzgqr.zzd(str, Integer.valueOf(i2)));
        }
    }

    public static void zze(boolean z2, String str, long j) {
        if (!z2) {
            throw new IllegalArgumentException(zzgqr.zzd(str, Long.valueOf(j)));
        }
    }

    public static void zzf(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(zzgqr.zzd(str, obj));
        }
    }

    public static void zzg(boolean z2, String str, int i2, int i3) {
        if (!z2) {
            throw new IllegalArgumentException(zzgqr.zzd(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void zzh(boolean z2, String str, Object obj, Object obj2) {
        if (!z2) {
            throw new IllegalArgumentException(zzgqr.zzd(str, obj, obj2));
        }
    }

    public static void zzi(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgqr.zzd(str, obj2));
    }

    public static int zzm(int i2, int i3, String str) {
        String strZzd;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            strZzd = zzgqr.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.g(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
            }
            strZzd = zzgqr.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzp(i2, i3, "index"));
        }
        return i2;
    }

    public static void zzo(int i2, int i3, int i4) {
        String strZzp;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strZzp = zzp(i2, i4, "start index");
            } else {
                strZzp = (i3 < 0 || i3 > i4) ? zzp(i3, i4, "end index") : zzgqr.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strZzp);
        }
    }

    private static String zzp(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzgqr.zzd("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzgqr.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.g(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
    }
}
