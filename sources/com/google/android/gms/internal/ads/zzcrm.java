package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrm implements zzdak, zzdby, zzdbe, com.google.android.gms.ads.internal.client.zza, zzdba, zzdii, zzddf {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfic zze;
    private final zzfhr zzf;
    private final zzfpe zzg;
    private final zzfix zzh;
    private final zzayq zzi;
    private final zzbhr zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzczl zzm;
    private final zzdcz zzn;
    private final zzcze zzo;
    private final Set zzp;
    private boolean zzq;
    private final AtomicBoolean zzr = new AtomicBoolean();
    private zzcdb zzs = null;

    public zzcrm(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfic zzficVar, zzfhr zzfhrVar, zzfpe zzfpeVar, zzfix zzfixVar, View view, zzcir zzcirVar, zzayq zzayqVar, zzbhr zzbhrVar, zzbht zzbhtVar, zzfno zzfnoVar, zzczl zzczlVar, zzdcz zzdczVar, zzcze zzczeVar, Set set) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzficVar;
        this.zzf = zzfhrVar;
        this.zzg = zzfpeVar;
        this.zzh = zzfixVar;
        this.zzi = zzayqVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcirVar);
        this.zzj = zzbhrVar;
        this.zzm = zzczlVar;
        this.zzn = zzdczVar;
        this.zzo = zzczeVar;
        this.zzp = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzG(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                Integer numZzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
                if (numZzw != null) {
                    int iMin = Math.min(numZzw.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzy(final int i2, final int i3) {
        View view;
        if (i2 <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcri
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(i2, i3);
                }
            }, i3, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String strZzj;
        int i2;
        zzfhr zzfhrVar = this.zzf;
        List list = zzfhrVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpe)).booleanValue() && this.zzs == null) {
            this.zzs = com.google.android.gms.ads.internal.zzt.zzh().zzr().zzn(this.zzp, this.zze.zza.zza.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeq)).booleanValue()) {
            strZzj = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzj = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaX)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbij.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfhrVar, false, strZzj, null, zzp(), this.zzo, this.zzs), this.zzn);
            return;
        }
        if (((Boolean) zzbij.zzg.zze()).booleanValue() && ((i2 = zzfhrVar.zzb) == 1 || i2 == 2 || i2 == 5)) {
        }
        zzgym.zzr((zzgye) zzgym.zzi(zzgye.zzw(zzgym.zza(null)), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbA)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcrg(this, strZzj), this.zzb);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaX)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbij.zzd.zze()).booleanValue()) {
            zzgym.zzr((zzgye) zzgym.zzg(zzgye.zzw(this.zzj.zzb()), Throwable.class, zzcrl.zza, zzcdo.zzg), new zzcrf(this), this.zzb);
            return;
        }
        zzfix zzfixVar = this.zzh;
        zzfpe zzfpeVar = this.zzg;
        zzfic zzficVar = this.zze;
        zzfhr zzfhrVar = this.zzf;
        zzfixVar.zzb(zzfpeVar.zza(zzficVar, zzfhrVar, zzfhrVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzd(zzbzm zzbzmVar, String str, String str2) {
        zzfpe zzfpeVar = this.zzg;
        zzfix zzfixVar = this.zzh;
        zzfhr zzfhrVar = this.zzf;
        zzfixVar.zza(zzfpeVar.zzc(zzfhrVar, zzfhrVar.zzh, zzbzmVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        if (this.zzr.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzez)).intValue();
            if (iIntValue > 0) {
                zzy(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeA)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzey)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zze() {
        zzfpe zzfpeVar = this.zzg;
        zzfic zzficVar = this.zze;
        zzfix zzfixVar = this.zzh;
        zzfhr zzfhrVar = this.zzf;
        zzfixVar.zza(zzfpeVar.zza(zzficVar, zzfhrVar, zzfhrVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzf() {
        zzfpe zzfpeVar = this.zzg;
        zzfic zzficVar = this.zze;
        zzfix zzfixVar = this.zzh;
        zzfhr zzfhrVar = this.zzf;
        zzfixVar.zza(zzfpeVar.zza(zzficVar, zzfhrVar, zzfhrVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final synchronized void zzg() {
        zzczl zzczlVar;
        try {
            if (this.zzq) {
                ArrayList arrayList = new ArrayList(zzp());
                zzfhr zzfhrVar = this.zzf;
                arrayList.addAll(zzfhrVar.zzf);
                this.zzh.zza(this.zzg.zzb(this.zze, zzfhrVar, true, null, null, arrayList, null, null), null);
            } else {
                zzfix zzfixVar = this.zzh;
                zzfpe zzfpeVar = this.zzg;
                zzfic zzficVar = this.zze;
                zzfhr zzfhrVar2 = this.zzf;
                zzfixVar.zza(zzfpeVar.zza(zzficVar, zzfhrVar2, zzfhrVar2.zzm), null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzev)).booleanValue() && (zzczlVar = this.zzm) != null) {
                    List list = zzczlVar.zzb().zzm;
                    String strZzg = zzczlVar.zzc().zzg();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfpe.zzd((String) it.next(), "@gw_adnetstatus@", strZzg));
                    }
                    long jZzh = zzczlVar.zzc().zzh();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfpe.zzd((String) it2.next(), "@gw_ttr@", Long.toString(jZzh, 10)));
                    }
                    zzfixVar.zza(zzfpeVar.zza(zzczlVar.zza(), zzczlVar.zzb(), arrayList3), null);
                }
                zzfixVar.zza(zzfpeVar.zza(zzficVar, zzfhrVar2, zzfhrVar2.zzf), null);
            }
            this.zzq = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzi() {
        zzfpe zzfpeVar = this.zzg;
        zzfic zzficVar = this.zze;
        zzfix zzfixVar = this.zzh;
        zzfhr zzfhrVar = this.zzf;
        zzfixVar.zza(zzfpeVar.zza(zzficVar, zzfhrVar, zzfhrVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbZ)).booleanValue()) {
            int i2 = zzeVar.zza;
            zzfhr zzfhrVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String str : zzfhrVar.zzo) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 2);
                sb.append("2.");
                sb.append(i2);
                arrayList.add(zzfpe.zzd(str, "@gw_mpe@", sb.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfhrVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzk() {
        zzfhr zzfhrVar = this.zzf;
        if (zzfhrVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfhrVar, zzfhrVar.zzaA), null);
        }
    }

    public final /* synthetic */ void zzl() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo();
            }
        });
    }

    public final /* synthetic */ void zzm(final int i2, final int i3) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(i2, i3);
            }
        });
    }

    public final /* synthetic */ void zzn(int i2, int i3) {
        zzy(i2 - 1, i3);
    }

    public final /* synthetic */ Context zzq() {
        return this.zza;
    }

    public final /* synthetic */ zzfic zzr() {
        return this.zze;
    }

    public final /* synthetic */ zzfhr zzs() {
        return this.zzf;
    }

    public final /* synthetic */ zzfpe zzt() {
        return this.zzg;
    }

    public final /* synthetic */ zzfix zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzdcz zzv() {
        return this.zzn;
    }

    public final /* synthetic */ zzcze zzw() {
        return this.zzo;
    }

    public final /* synthetic */ zzcdb zzx() {
        return this.zzs;
    }
}
