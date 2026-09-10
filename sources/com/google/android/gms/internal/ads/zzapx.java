package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzapx {
    public static final boolean zza = zzapy.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzapy.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzapw(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            long j2 = ((zzapw) this.zzb.get(0)).zzc;
            List list = this.zzb;
            j = ((zzapw) list.get(list.size() - 1)).zzc - j2;
        }
        if (j > 0) {
            long j3 = ((zzapw) this.zzb.get(0)).zzc;
            zzapy.zza("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzapw zzapwVar : this.zzb) {
                long j4 = zzapwVar.zzc;
                zzapy.zza("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzapwVar.zzb), zzapwVar.zza);
                j3 = j4;
            }
        }
    }
}
