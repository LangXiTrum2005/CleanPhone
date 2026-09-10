package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpp {
    private final int zzc;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzfqd zzg;
    private final Clock zzh;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    final Map zza = new LinkedHashMap();
    final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzfpp(int i2, ScheduledExecutorService scheduledExecutorService, zzfqd zzfqdVar, Clock clock) {
        this.zzc = i2;
        this.zzf = scheduledExecutorService;
        this.zzg = zzfqdVar;
        this.zzh = clock;
    }

    private static String zzl(String str, AdFormat adFormat) {
        return str + ":" + adFormat;
    }

    private final boolean zzm(zzfqy zzfqyVar) {
        AdFormat adFormatZzn = zzfqyVar.zzn();
        if (adFormatZzn == null) {
            return true;
        }
        Map map = this.zza;
        synchronized (map) {
            try {
                return !map.containsKey(zzl(zzfqyVar.zzm(), adFormatZzn));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean zzn() {
        Map map = this.zza;
        synchronized (map) {
            try {
                for (zzfqy zzfqyVar : map.values()) {
                    if (zzfqyVar.zzo() == 0 && zzfqyVar.zzp()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzo(long j) {
        if (this.zzb.compareAndSet(false, true)) {
            if (j > 0) {
                this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, j, TimeUnit.MILLISECONDS);
            } else {
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzh();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzk() {
        zzgtd zzgtdVarZzq;
        try {
            if (this.zzd.get()) {
                return;
            }
            zzfqy zzfqyVar = null;
            this.zze = null;
            if (zzf() < this.zzc || zzn()) {
                Map map = this.zza;
                synchronized (map) {
                    zzgtdVarZzq = zzgtd.zzq(map.values());
                }
                int size = zzgtdVarZzq.size();
                double d = Double.MAX_VALUE;
                for (int i2 = 0; i2 < size; i2++) {
                    zzfqy zzfqyVar2 = (zzfqy) zzgtdVarZzq.get(i2);
                    if (zzfqyVar2.zzp()) {
                        double dZzo = ((double) zzfqyVar2.zzo()) / ((double) zzfqyVar2.zze.zzd);
                        if (dZzo < d) {
                            d = dZzo;
                        }
                        if (dZzo < d) {
                            zzfqyVar = zzfqyVar2;
                        }
                    }
                }
                if (zzfqyVar != null) {
                    zzfqyVar.zzd();
                    if (zzfqyVar.zzo() > 0) {
                        this.zzg.zzq(this.zzh.currentTimeMillis(), zzfqyVar.zzm(), zzfqyVar.zze.zza, zzfqyVar.zzn(), zzfqyVar.zze.zzd, zzfqyVar.zzo(), zzf(), this.zzc);
                    }
                }
                int iZzf = zzf();
                int i3 = this.zzc;
                if (iZzf >= i3) {
                    zzr();
                }
                if (zzf() >= i3) {
                    if (zzn()) {
                    }
                }
                if (zzn()) {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpn
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzk();
                        }
                    });
                    return;
                }
                this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzj();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzS)).longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            zzr();
            this.zzb.set(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg() {
        this.zzd.set(false);
        zzk();
    }

    private final void zzr() {
        int size;
        Map map = this.zza;
        synchronized (map) {
            size = map.size();
        }
        zzfqd zzfqdVar = this.zzg;
        Clock clock = this.zzh;
        zzfqdVar.zzs(clock.currentTimeMillis(), this.zzc, size);
    }

    private final void zzs(zzfqy zzfqyVar, int i2) {
        this.zzg.zzr(this.zzh.currentTimeMillis(), zzfqyVar.zzm(), zzfqyVar.zze.zza, zzfqyVar.zzn(), zzfqyVar.zze.zzd, zzfqyVar.zzo(), i2, zzf(), this.zzc);
    }

    private final synchronized boolean zzt(zzfqy zzfqyVar) {
        if (!this.zzd.get() && zzfqyVar.zzo() == 0 && zzfqyVar.zzp()) {
            zzfqyVar.zzd();
            return true;
        }
        return false;
    }

    private static final int zzu(zzfqy zzfqyVar) {
        int iZzo = zzfqyVar.zzo();
        int i2 = iZzo - 1;
        if (!zzfqyVar.zzs()) {
            iZzo = i2;
        }
        return Math.max(iZzo, 0);
    }

    public final void zza(zzfqy zzfqyVar) {
        int i2 = 1;
        if (zzfqyVar.zzo() <= 0 && !zzfqyVar.zzs()) {
            i2 = 0;
        }
        zzc(zzfqyVar, i2);
    }

    public final synchronized void zzb(zzfqy zzfqyVar) {
        try {
            if (zzm(zzfqyVar)) {
                return;
            }
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzT)).longValue();
            if (jLongValue <= 0) {
                zza(zzfqyVar);
                return;
            }
            if (zzfqyVar.zzo() > 0 || zzfqyVar.zzs()) {
                zzs(zzfqyVar, 1);
            }
            this.zzd.set(true);
            ScheduledFuture scheduledFuture = this.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zze = null;
            this.zzb.set(true);
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg();
                }
            }, jLongValue, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzc(zzfqy zzfqyVar, int i2) {
        if (zzm(zzfqyVar)) {
            return;
        }
        if (i2 > 0) {
            zzs(zzfqyVar, i2);
        }
        if (!zzt(zzfqyVar)) {
            zzo(0L);
        } else {
            zzo(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzR)).longValue());
        }
    }

    public final void zzd(String str, AdFormat adFormat, zzfqy zzfqyVar) {
        Map map = this.zza;
        String strZzl = zzl(str, adFormat);
        synchronized (map) {
            try {
                if (!map.containsKey(strZzl)) {
                    map.put(strZzl, zzfqyVar);
                    zzt(zzfqyVar);
                    zzo(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzR)).longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(String str, AdFormat adFormat) {
        zzfqy zzfqyVar;
        Map map = this.zza;
        String strZzl = zzl(str, adFormat);
        synchronized (map) {
            zzfqyVar = (zzfqy) map.remove(strZzl);
        }
        if (zzfqyVar == null) {
            return;
        }
        int iZzu = zzu(zzfqyVar);
        if (iZzu > 0) {
            zzs(zzfqyVar, iZzu);
        }
        if (zzfqyVar.zzo() > 0 || zzfqyVar.zzs()) {
            zzo(0L);
        }
    }

    public final int zzf() {
        int iZzu;
        Map map = this.zza;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                iZzu = 0;
                while (it.hasNext()) {
                    iZzu += zzu((zzfqy) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iZzu;
    }
}
