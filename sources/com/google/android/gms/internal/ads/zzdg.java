package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdg {
    @EnsuresNonNull
    @Deprecated
    @Pure
    public static String zza(String str) {
        zzgqa.zza(!TextUtils.isEmpty(str));
        return str;
    }
}
