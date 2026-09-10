package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfqy {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfjg zzd;
    protected com.google.android.gms.ads.internal.client.zzft zze;
    protected final zzfpp zzf;
    protected AtomicBoolean zzg;
    protected com.google.android.gms.ads.internal.client.zzch zzh;
    private com.google.android.gms.ads.internal.client.zzce zzi;
    private final Queue zzj;
    private final zzfpy zzk;
    private final String zzl;
    private AtomicBoolean zzm;
    private final ScheduledExecutorService zzn;
    private final zzfly zzo;
    private AtomicBoolean zzp;
    private AtomicBoolean zzq;
    private zzfqd zzr;
    private final Clock zzs;
    private final zzfqk zzt;

    public zzfqy(ClientApi clientApi, Context context, int i2, zzfjg zzfjgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfly zzflyVar, zzfpy zzfpyVar, Clock clock) {
        this("none", clientApi, context, i2, zzfjgVar, zzftVar, scheduledExecutorService, zzflyVar, zzfpyVar, clock, null);
        this.zzi = zzceVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzz(Object obj) {
        try {
            this.zzm.set(false);
            if (obj != null) {
                this.zzk.zza();
                this.zzq.set(true);
                zzN(obj);
            }
            if (obj == null || this.zzf == null) {
                zzO(obj == null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzA(Throwable th) {
        try {
            this.zzm.set(false);
            if ((th instanceof zzfpq) && ((zzfpq) th).zza() == 0) {
                throw null;
            }
            zzO(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfqr(this, zzeVar));
            }
            this.zzm.set(false);
            int i2 = zzeVar.zza;
            if (i2 != 1 && i2 != 8 && i2 != 10 && i2 != 11) {
                zzO(true);
                return;
            }
            com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
            int i3 = zzftVar.zzb;
            String str = zzftVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 26 + String.valueOf(str).length() + 61);
            sb.append("Preloading ");
            sb.append(i3);
            sb.append(", for adUnitId:");
            sb.append(str);
            sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
            String string = sb.toString();
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
            this.zzg.set(false);
            zzfpp zzfppVar = this.zzf;
            if (zzfppVar != null) {
                zzfppVar.zza(this);
            }
            zzfqj zzfqjVar = new zzfqj(this.zze.zza, zzn());
            zzfqjVar.zza(this.zzl);
            this.zzr.zzk(this.zzs.currentTimeMillis(), new zzfqk(zzfqjVar, null), zzeVar, this.zze.zzd, zzo(), zzF());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzN(Object obj) {
        try {
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = zzb(obj);
            double dZzl = !(zzeaVarZzb instanceof zzdad) ? 0.0d : ((zzdad) zzeaVarZzb).zzl();
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzb2 = zzb(obj);
            int iZzm = zzeaVarZzb2 instanceof zzdad ? ((zzdad) zzeaVarZzb2).zzm() : 2;
            Clock clock = this.zzs;
            zzfqm zzfqmVar = new zzfqm(obj, clock, dZzl, iZzm);
            this.zzj.add(zzfqmVar);
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzb3 = zzb(obj);
            long jCurrentTimeMillis = clock.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfqp(this, zzeaVarZzb3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzn;
            scheduledExecutorService.execute(new zzfqq(this, jCurrentTimeMillis, zzeaVarZzb3));
            if (this.zzf != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzE)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy();
                        }
                    }, zzfqmVar.zzc(), TimeUnit.MILLISECONDS);
                    return;
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzx();
                        }
                    }, zzfqmVar.zzc(), TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzE)).booleanValue()) {
                this.zzo.zzb(new zzfqo(this), zzfqmVar.zzc(), TimeUnit.MILLISECONDS);
            } else {
                scheduledExecutorService.schedule(new zzfqo(this), zzfqmVar.zzc(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzO(boolean z2) {
        try {
            zzfpp zzfppVar = this.zzf;
            if (zzfppVar != null) {
                if (z2) {
                    this.zzk.zzc();
                }
                zzfppVar.zza(this);
            } else {
                zzfpy zzfpyVar = this.zzk;
                if (zzfpyVar.zze()) {
                    return;
                }
                if (z2) {
                    zzfpyVar.zzc();
                }
                this.zzn.schedule(new zzfqo(this), zzfpyVar.zzb(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzy() {
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            if (((zzfqm) it.next()).zzb()) {
                it.remove();
                zzfpp zzfppVar = this.zzf;
                if (zzfppVar != null) {
                    zzfppVar.zza(this);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzg(this.zzl, zzeVar);
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0028, please report this as an issue */
    /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzD(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar;
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar == null) {
            zzchVar = this.zzh;
            if (zzchVar != null) {
                zzchVar.zze(this.zzl, zzeaVar);
                return;
            }
            return;
        }
        try {
            zzceVar.zze(this.zze);
        } catch (RemoteException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
        }
        zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zze(this.zzl, zzeaVar);
                return;
            } catch (RemoteException unused2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
                return;
            }
        }
        return;
        throw th;
    }

    private final synchronized void zzS() {
        try {
            if (this.zzq.get() && this.zzj.isEmpty()) {
                this.zzq.set(false);
                if (this.zzp.get()) {
                    com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfqs(this));
                }
                this.zzn.execute(new zzfqt(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0028, please report this as an issue */
    /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzE() {
        com.google.android.gms.ads.internal.client.zzch zzchVar;
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar == null) {
            zzchVar = this.zzh;
            if (zzchVar != null) {
                zzchVar.zzf(this.zzl);
                return;
            }
            return;
        }
        try {
            zzceVar.zzf(this.zze);
        } catch (RemoteException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
        }
        zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzf(this.zzl);
                return;
            } catch (RemoteException unused2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
                return;
            }
        }
        return;
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final String zzF() {
        return true != "none".equals(this.zzl) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzV(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzdad) {
            return ((zzdad) zzeaVar).zzk();
        }
        return null;
    }

    public final /* synthetic */ zzfqd zzG() {
        return this.zzr;
    }

    public final /* synthetic */ Clock zzH() {
        return this.zzs;
    }

    public final /* synthetic */ zzfqk zzI() {
        return this.zzt;
    }

    public abstract ListenableFuture zza(Context context);

    public abstract com.google.android.gms.ads.internal.client.zzea zzb(Object obj);

    public final synchronized zzfqy zzc() {
        this.zzn.submit(new zzfqo(this));
        return this;
    }

    public final synchronized void zzd() {
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            this.zzn.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu();
                }
            });
        }
    }

    public final synchronized boolean zze() {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzK)).booleanValue()) {
                this.zzk.zza();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzD)).booleanValue() && this.zzf == null) {
                zzt();
            } else {
                zzy();
            }
        } catch (Throwable th) {
            throw th;
        }
        return !this.zzj.isEmpty();
    }

    public final synchronized Object zzf() {
        try {
            boolean z2 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzN)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzL)).booleanValue() || this.zzj.size() == 1) {
                    this.zzk.zza();
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzM)).booleanValue()) {
                zzy();
            }
            Queue queue = this.zzj;
            zzfqm zzfqmVar = (zzfqm) queue.poll();
            AtomicBoolean atomicBoolean = this.zzq;
            if (zzfqmVar == null) {
                z2 = false;
            }
            atomicBoolean.set(z2);
            if (zzfqmVar == null) {
                zzfqmVar = null;
            } else if (!queue.isEmpty()) {
                zzfqm zzfqmVar2 = (zzfqm) queue.peek();
                AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
                String strZzV = zzV(zzb(zzfqmVar.zza()));
                if (zzfqmVar2 != null && adFormat != null && strZzV != null && zzfqmVar2.zzd() < zzfqmVar.zzd()) {
                    this.zzr.zzg(this.zzs.currentTimeMillis(), this.zze.zzd, zzo(), strZzV, this.zzt, zzF());
                }
            }
            zzfpp zzfppVar = this.zzf;
            if (zzfppVar != null) {
                zzfppVar.zzb(this);
            } else {
                zzbgb zzbgbVar = zzbgk.zzP;
                if (((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).longValue() > 0) {
                    this.zzn.schedule(new zzfqo(this), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).longValue(), TimeUnit.MILLISECONDS);
                } else {
                    zzt();
                }
            }
            if (zzfqmVar == null) {
                return null;
            }
            return zzfqmVar.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzg() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzh() {
        this.zzg.set(false);
    }

    public final synchronized void zzi() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzn.submit(new zzfqo(this));
        }
    }

    public final synchronized String zzj() {
        Object objZzr;
        objZzr = zzr();
        return zzV(objZzr == null ? null : zzb(objZzr));
    }

    public final void zzk(zzfqd zzfqdVar) {
        this.zzr = zzfqdVar;
    }

    public final synchronized void zzl(int i2) {
        Preconditions.checkArgument(i2 >= 5);
        this.zzk.zzf(i2);
    }

    public final String zzm() {
        return this.zzl;
    }

    public final AdFormat zzn() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    public final synchronized int zzo() {
        return this.zzj.size();
    }

    public final boolean zzp() {
        return this.zzg.get() && !this.zzm.get() && zzo() < this.zze.zzd && !this.zzk.zzd();
    }

    public final synchronized void zzq() {
        this.zzj.clear();
    }

    public final synchronized Object zzr() {
        zzfqm zzfqmVar = (zzfqm) this.zzj.peek();
        if (zzfqmVar == null) {
            return null;
        }
        return zzfqmVar.zza();
    }

    public final boolean zzs() {
        return this.zzm.get();
    }

    public final synchronized void zzt() {
        zzy();
        zzS();
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            zzu();
        }
    }

    public final synchronized void zzu() {
        ListenableFuture listenableFutureZza;
        try {
            Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
            if (activityZzd == null) {
                String strValueOf = String.valueOf(this.zze.zza);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
                listenableFutureZza = zza(this.zzb);
            } else {
                listenableFutureZza = zza(activityZzd);
            }
            zzgym.zzr(listenableFutureZza, new zzfqn(this), this.zzn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzv(int i2) {
        zzfpp zzfppVar;
        Preconditions.checkArgument(i2 > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i3 = this.zze.zzd;
        int size = this.zzj.size();
        synchronized (this) {
            try {
                com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
                this.zze = new com.google.android.gms.ads.internal.client.zzft(zzftVar.zza, zzftVar.zzb, zzftVar.zzc, i2 > 0 ? i2 : zzftVar.zzd);
                Queue queue = this.zzj;
                if (queue.size() > i2) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzx)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < i2; i4++) {
                            zzfqm zzfqmVar = (zzfqm) queue.poll();
                            if (zzfqmVar != null) {
                                arrayList.add(zzfqmVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        if (size > arrayList.size() && (zzfppVar = this.zzf) != null) {
                            int size2 = size - arrayList.size();
                            if (arrayList.isEmpty()) {
                                size2--;
                            }
                            zzfppVar.zzc(this, size2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfqd zzfqdVar = this.zzr;
        if (zzfqdVar == null || adFormat == null) {
            return;
        }
        zzfqdVar.zzc(i3, i2, this.zzs.currentTimeMillis(), new zzfqk(new zzfqj(this.zze.zza, adFormat), null));
    }

    public final void zzw(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzC)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzo());
            bundle.putInt("plbs", this.zze.zzd);
            bundle.putString("plid", this.zzl);
        }
    }

    public zzfqy(String str, ClientApi clientApi, Context context, int i2, zzfjg zzfjgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfly zzflyVar, zzfpy zzfpyVar, Clock clock, zzfpp zzfppVar) {
        this(str, clientApi, context, i2, zzfjgVar, zzftVar, scheduledExecutorService, zzflyVar, zzfpyVar, clock, zzfppVar);
        this.zzh = zzchVar;
    }

    private zzfqy(String str, ClientApi clientApi, Context context, int i2, zzfjg zzfjgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, ScheduledExecutorService scheduledExecutorService, zzfly zzflyVar, zzfpy zzfpyVar, Clock clock, zzfpp zzfppVar) {
        Queue priorityQueue;
        this.zzl = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i2;
        this.zzd = zzfjgVar;
        this.zze = zzftVar;
        int iMax = Math.max(1, zzftVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzV)).booleanValue()) {
            priorityQueue = new zzfrb();
        } else {
            priorityQueue = new PriorityQueue(iMax, zzfqu.zza);
        }
        this.zzj = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzm = new AtomicBoolean(false);
        this.zzn = scheduledExecutorService;
        this.zzo = zzflyVar;
        this.zzk = zzfpyVar;
        this.zzp = new AtomicBoolean(true);
        this.zzq = new AtomicBoolean(false);
        this.zzs = clock;
        zzfqj zzfqjVar = new zzfqj(zzftVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfqjVar.zza(str);
        this.zzt = new zzfqk(zzfqjVar, null);
        this.zzf = zzfppVar;
    }
}
