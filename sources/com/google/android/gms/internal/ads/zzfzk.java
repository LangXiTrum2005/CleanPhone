package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzk extends zzfzi {
    private static zzfzk zzd;

    private zzfzk(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfzk zzh(Context context) {
        zzfzk zzfzkVar;
        synchronized (zzfzk.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfzk(context);
                }
                zzfzkVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfzkVar;
    }

    public final zzfzf zzi(long j, boolean z2) throws IOException {
        synchronized (zzfzk.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j, z2);
                }
                return new zzfzf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfzk.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
