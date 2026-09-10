package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzguw {
    public static Object[] zza(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            zzb(objArr[i3], i3);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(androidx.datastore.preferences.protobuf.a.g(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
    }
}
