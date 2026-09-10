package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemr {
    private final Clock zza;
    private final zzemt zzb;
    private final zzfpi zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhG)).booleanValue();
    private final zzejl zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzemr(Clock clock, zzemt zzemtVar, zzejl zzejlVar, zzfpi zzfpiVar) {
        this.zza = clock;
        this.zzb = zzemtVar;
        this.zzf = zzejlVar;
        this.zzc = zzfpiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfhr zzfhrVar) {
        zzemq zzemqVar = (zzemq) this.zzd.get(zzfhrVar);
        if (zzemqVar == null) {
            return false;
        }
        return zzemqVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfhr zzfhrVar = (zzfhr) it.next();
            String str = zzfhrVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfhrVar, new zzemq(str, zzfhrVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(zzfhr zzfhrVar) {
        try {
            this.zzh = this.zza.elapsedRealtime() - this.zzi;
            if (zzfhrVar != null) {
                this.zzf.zzi(zzfhrVar);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ListenableFuture zze(zzfic zzficVar, zzfhr zzfhrVar, ListenableFuture listenableFuture, zzfpe zzfpeVar) {
        zzfhu zzfhuVar = zzficVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfhrVar.zzw;
        if (str != null) {
            this.zzd.put(zzfhrVar, new zzemq(str, zzfhrVar.zzaf, 9, 0L, null));
            zzgym.zzr(listenableFuture, new zzemp(this, jElapsedRealtime, zzfhuVar, zzfhrVar, str, zzfpeVar, zzficVar), zzcdo.zzg);
        }
        return listenableFuture;
    }

    public final synchronized void zzf(zzfhr zzfhrVar) {
        zzemq zzemqVar = (zzemq) this.zzd.get(zzfhrVar);
        if (zzemqVar == null || this.zzg) {
            return;
        }
        zzemqVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzemq zzemqVar = (zzemq) ((Map.Entry) it.next()).getValue();
                if (zzemqVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzemqVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    public final /* synthetic */ Clock zzj() {
        return this.zza;
    }

    public final /* synthetic */ zzemt zzk() {
        return this.zzb;
    }

    public final /* synthetic */ zzfpi zzl() {
        return this.zzc;
    }

    public final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    public final /* synthetic */ zzejl zzo() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
