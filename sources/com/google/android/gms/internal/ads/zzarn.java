package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarn {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaqu zze;
    private final zzard zzf;
    private final zzare[] zzg;
    private zzaqw zzh;
    private final List zzi;
    private final List zzj;
    private final zzarb zzk;

    public zzarn(zzaqu zzaquVar, zzard zzardVar, int i2) {
        zzarb zzarbVar = new zzarb(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaquVar;
        this.zzf = zzardVar;
        this.zzg = new zzare[4];
        this.zzk = zzarbVar;
    }

    public final void zza() {
        zzaqw zzaqwVar = this.zzh;
        if (zzaqwVar != null) {
            zzaqwVar.zza();
        }
        zzare[] zzareVarArr = this.zzg;
        for (int i2 = 0; i2 < 4; i2++) {
            zzare zzareVar = zzareVarArr[i2];
            if (zzareVar != null) {
                zzareVar.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzaqu zzaquVar = this.zze;
        zzarb zzarbVar = this.zzk;
        zzaqw zzaqwVar2 = new zzaqw(priorityBlockingQueue, priorityBlockingQueue2, zzaquVar, zzarbVar);
        this.zzh = zzaqwVar2;
        zzaqwVar2.start();
        for (int i3 = 0; i3 < 4; i3++) {
            zzare zzareVar2 = new zzare(priorityBlockingQueue2, this.zzf, zzaquVar, zzarbVar);
            zzareVarArr[i3] = zzareVar2;
            zzareVar2.start();
        }
    }

    public final zzark zzb(zzark zzarkVar) {
        zzarkVar.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzarkVar);
        }
        zzarkVar.zzg(this.zza.incrementAndGet());
        zzarkVar.zzc("add-to-queue");
        zzd(zzarkVar, 0);
        this.zzc.add(zzarkVar);
        return zzarkVar;
    }

    public final void zzc(zzark zzarkVar) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzarkVar);
        }
        List list = this.zzi;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzarm) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzd(zzarkVar, 5);
    }

    public final void zzd(zzark zzarkVar, int i2) {
        List list = this.zzj;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzarl) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
