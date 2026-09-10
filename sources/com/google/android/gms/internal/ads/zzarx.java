package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
final class zzarx implements zzarj {
    private final Map zza = new HashMap();
    private final zzaqw zzb;
    private final BlockingQueue zzc;
    private final zzarb zzd;

    public zzarx(zzaqw zzaqwVar, BlockingQueue blockingQueue, zzarb zzarbVar) {
        this.zzd = zzarbVar;
        this.zzb = zzaqwVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final void zza(zzark zzarkVar, zzarq zzarqVar) {
        List list;
        zzaqt zzaqtVar = zzarqVar.zzb;
        if (zzaqtVar == null || zzaqtVar.zza(System.currentTimeMillis())) {
            zzb(zzarkVar);
            return;
        }
        String strZzi = zzarkVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(strZzi);
        }
        if (list != null) {
            if (zzarw.zzb) {
                zzarw.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzark) it.next(), zzarqVar, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarj
    public final synchronized void zzb(zzark zzarkVar) {
        try {
            Map map = this.zza;
            String strZzi = zzarkVar.zzi();
            List list = (List) map.remove(strZzi);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzarw.zzb) {
                zzarw.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzi);
            }
            zzark zzarkVar2 = (zzark) list.remove(0);
            map.put(strZzi, list);
            zzarkVar2.zzu(this);
            try {
                this.zzc.put(zzarkVar2);
            } catch (InterruptedException e2) {
                zzarw.zzc("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.zzb.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzc(zzark zzarkVar) {
        try {
            Map map = this.zza;
            String strZzi = zzarkVar.zzi();
            if (!map.containsKey(strZzi)) {
                map.put(strZzi, null);
                zzarkVar.zzu(this);
                if (zzarw.zzb) {
                    zzarw.zzb("new request, sending to network %s", strZzi);
                }
                return false;
            }
            List arrayList = (List) map.get(strZzi);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzarkVar.zzc("waiting-for-response");
            arrayList.add(zzarkVar);
            map.put(strZzi, arrayList);
            if (zzarw.zzb) {
                zzarw.zzb("Request for cacheKey=%s is in flight, putting on hold.", strZzi);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
