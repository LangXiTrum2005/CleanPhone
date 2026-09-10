package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface zzfwk {
    static String zzb(File file, String str, zzfwo zzfwoVar) {
        return new File(file, str).getPath();
    }

    default String zza(File file, String str) {
        return zzb(file, str, zzfwo.zza);
    }
}
