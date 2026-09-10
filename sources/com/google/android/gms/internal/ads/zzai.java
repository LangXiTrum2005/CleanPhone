package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzai {
    public static final zzai zza = new zzai(new zzah());
    public final Uri zzb = null;
    public final String zzc = null;
    public final Bundle zzd = null;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    private zzai(zzah zzahVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        Uri uri = ((zzai) obj).zzb;
        return true;
    }

    public final int hashCode() {
        return 0;
    }
}
