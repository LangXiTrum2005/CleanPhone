package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdr {
    private MotionEvent zzb;
    private final ArrayDeque zza = new ArrayDeque();
    private zzgdp zzc = new zzgdp();

    public final synchronized void zza(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.zzb = MotionEvent.obtain(motionEvent);
            }
            this.zzc.zza(motionEvent);
            ArrayDeque arrayDeque = this.zza;
            if (arrayDeque.size() >= 6) {
                arrayDeque.remove();
            }
            arrayDeque.add(new zzgdq(motionEvent));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Map map) {
        try {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                map.put("nv", motionEvent);
            }
            map.put("oe", this.zzc);
            ArrayDeque arrayDeque = this.zza;
            map.put("ro", arrayDeque.toArray(new zzgdq[arrayDeque.size()]));
            this.zzc = new zzgdp();
            arrayDeque.clear();
            MotionEvent motionEvent2 = this.zzb;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.zzb = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
