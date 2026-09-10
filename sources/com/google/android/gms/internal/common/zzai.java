package com.google.android.gms.internal.common;

import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(a.g(i3, "at index ", new StringBuilder(String.valueOf(i3).length() + 9)));
            }
        }
        return objArr;
    }
}
