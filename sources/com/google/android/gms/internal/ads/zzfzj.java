package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzj extends zzfzi {
    private static zzfzj zzd;

    private zzfzj(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfzj zzh(Context context) {
        zzfzj zzfzjVar;
        synchronized (zzfzj.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfzj(context);
                }
                zzfzjVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfzjVar;
    }

    public final zzfzf zzi(long j, boolean z2) throws IOException {
        zzfzf zzfzfVarZza;
        synchronized (zzfzj.class) {
            zzfzfVarZza = zza(null, null, j, z2);
        }
        return zzfzfVarZza;
    }

    public final zzfzf zzj(String str, String str2, long j, boolean z2) throws IOException {
        zzfzf zzfzfVarZza;
        synchronized (zzfzj.class) {
            zzfzfVarZza = zza(str, str2, j, z2);
        }
        return zzfzfVarZza;
    }

    public final void zzk() throws IOException {
        synchronized (zzfzj.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfzj.class) {
            zzc(true);
        }
    }
}
