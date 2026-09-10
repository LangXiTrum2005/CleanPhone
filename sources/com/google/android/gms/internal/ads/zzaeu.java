package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface zzaeu {
    zzaeo[] zza();

    default zzaeo[] zzb(Uri uri, Map map) {
        return zza();
    }
}
