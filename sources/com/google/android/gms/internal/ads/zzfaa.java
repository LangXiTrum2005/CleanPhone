package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfaa {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfno zzd;
    private final zzdxe zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzfaa(Context context, Executor executor, Set set, zzfno zzfnoVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfnoVar;
        this.zze = zzdxeVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle, final boolean z2) {
        zzfne zzfneVarZzn = zzfne.zzn(this.zza, 8);
        zzfneVarZzn.zza();
        Set<zzezx> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbgb zzbgbVar = zzbgk.zznc;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof zzczm) {
                bundle.putLong(zzdwm.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdwm.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzezx zzezxVar : set) {
            if (!arrayList2.contains(String.valueOf(zzezxVar.zzb()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                ListenableFuture listenableFutureZza = zzezxVar.zza();
                final Bundle bundle3 = bundle2;
                listenableFutureZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb(jElapsedRealtime, zzezxVar, bundle3);
                    }
                }, zzcdo.zzg);
                arrayList.add(listenableFutureZza);
                bundle2 = bundle3;
            }
        }
        ListenableFuture listenableFutureZza2 = zzgym.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzezv zzezvVar = (zzezv) ((ListenableFuture) it.next()).get();
                    if (zzezvVar != null) {
                        boolean z3 = z2;
                        zzezvVar.zza(obj2);
                        if (z3) {
                            zzezvVar.zzb(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof zzczm) {
                        bundle4.putLong(zzdwm.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(zzdwm.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfnr.zza()) {
            zzfnn.zzd(listenableFutureZza2, this.zzd, zzfneVarZzn);
        }
        return listenableFutureZza2;
    }

    public final /* synthetic */ void zzb(long j, zzezx zzezxVar, Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
        if (((Boolean) zzbim.zza.zze()).booleanValue()) {
            String strZza = zzgqr.zza(zzezxVar.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(strZza.length() + 25 + String.valueOf(jElapsedRealtime).length());
            android.support.v4.media.a.A(sb, "Signal runtime (ms) : ", strZza, " = ");
            sb.append(jElapsedRealtime);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcO)).booleanValue()) {
                synchronized (this) {
                    int iZzb = zzezxVar.zzb();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                    sb2.append("sig");
                    sb2.append(iZzb);
                    bundle.putLong(sb2.toString(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcG)).booleanValue()) {
            zzdxd zzdxdVarZza = this.zze.zza();
            zzdxdVarZza.zzc("action", "lat_ms");
            zzdxdVarZza.zzc("lat_grp", "sig_lat_grp");
            zzdxdVarZza.zzc("lat_id", String.valueOf(zzezxVar.zzb()));
            zzdxdVarZza.zzc("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcH)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdxdVarZza.zzc("seq_num", com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm());
                synchronized (this) {
                    try {
                        if (this.zzg == this.zzb.size() && this.zzf != 0) {
                            this.zzg = 0;
                            String strValueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzf);
                            if (zzezxVar.zzb() <= 39 || zzezxVar.zzb() >= 52) {
                                zzdxdVarZza.zzc("lat_clsg", strValueOf);
                            } else {
                                zzdxdVarZza.zzc("lat_gmssg", strValueOf);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzdxdVarZza.zzh();
        }
    }
}
