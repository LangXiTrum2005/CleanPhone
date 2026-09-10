package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpn {
    public static final zzpn zza;
    public final String zzb;
    private final zzpm zzc;

    static {
        new zzpn("");
        zza = new zzpn("preload");
    }

    public zzpn(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzpm() : null;
    }

    public final synchronized LogSessionId zza() {
        zzpm zzpmVar;
        zzpmVar = this.zzc;
        if (zzpmVar == null) {
            throw null;
        }
        return zzpmVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzpm zzpmVar = this.zzc;
        if (zzpmVar == null) {
            throw null;
        }
        LogSessionId logSessionId2 = zzpmVar.zza;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        zzgqa.zzi(logSessionId2.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzpmVar.zza = logSessionId;
    }
}
