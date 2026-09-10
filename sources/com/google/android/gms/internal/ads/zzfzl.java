package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzl {
    private static zzfzl zzb;
    final zzfzh zza;

    private zzfzl(Context context) {
        this.zza = zzfzh.zza(context);
        zzfzg.zza(context);
    }

    public static final zzfzl zza(Context context) {
        zzfzl zzfzlVar;
        synchronized (zzfzl.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfzl(context);
                }
                zzfzlVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfzlVar;
    }

    public final void zzb(zzfzf zzfzfVar) throws IOException {
        synchronized (zzfzl.class) {
            zzfzh zzfzhVar = this.zza;
            zzfzhVar.zzf("vendor_scoped_gpid_v2_id");
            zzfzhVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
