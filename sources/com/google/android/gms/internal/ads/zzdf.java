package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdf {
    private static final String zzb;
    public final String zza;

    static {
        String str = zzfj.zza;
        zzb = Integer.toString(0, 36);
    }

    public zzdf(String str) {
        this.zza = str;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}
