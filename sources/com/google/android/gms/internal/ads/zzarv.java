package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzarv {
    public static final boolean zza = zzarw.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzarw.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzaru(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzaru> list = this.zzb;
        long j = list.size() == 0 ? 0L : ((zzaru) list.get(list.size() - 1)).zzc - ((zzaru) list.get(0)).zzc;
        if (j > 0) {
            long j2 = ((zzaru) list.get(0)).zzc;
            zzarw.zzb("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzaru zzaruVar : list) {
                long j3 = zzaruVar.zzc;
                zzarw.zzb("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzaruVar.zzb), zzaruVar.zza);
                j2 = j3;
            }
        }
    }
}
