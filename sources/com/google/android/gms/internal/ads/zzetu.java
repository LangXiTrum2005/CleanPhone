package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.umeng.ccg.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetu {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhh zzd;
    private final zzdrw zze;
    private long zzf = 0;

    @GuardedBy("this")
    private int zzg = 0;

    public zzetu(Context context, Executor executor, Set set, zzfhh zzfhhVar, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhhVar;
        this.zze = zzdrwVar;
    }

    public final AI zza(final Object obj, @Nullable final Bundle bundle, final boolean z) {
        zzfgw zzfgwVarZza = zzfgv.zza(this.zza, 8);
        zzfgwVarZza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbcc zzbccVar = zzbcl.zzlC;
        if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).split(","));
        }
        List list = arrayList2;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (obj instanceof zzcuv) {
                bundle.putLong(zzdre.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdre.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzetr zzetrVar : this.zzb) {
            if (!list.contains(String.valueOf(zzetrVar.zza()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                AI aiZzb = zzetrVar.zzb();
                aiZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzets
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb(jElapsedRealtime, zzetrVar, bundle2);
                    }
                }, zzbzw.zzg);
                arrayList.add(aiZzb);
            }
        }
        AI aiZza = zzgch.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzett
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzetq zzetqVar = (zzetq) ((AI) it.next()).get();
                    if (zzetqVar != null) {
                        boolean z2 = z;
                        zzetqVar.zzb(obj2);
                        if (z2) {
                            zzetqVar.zza(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                    if (obj2 instanceof zzcuv) {
                        bundle3.putLong(zzdre.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdre.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfhk.zza()) {
            zzfhg.zza(aiZza, this.zzd, zzfgwVarZza);
        }
        return aiZza;
    }

    public final void zzb(long j, zzetr zzetrVar, Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j;
        if (((Boolean) zzben.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfve.zzc(zzetrVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzco)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzetrVar.zza(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzci)).booleanValue()) {
            zzdrv zzdrvVarZza = this.zze.zza();
            zzdrvVarZza.zzb(a.w, "lat_ms");
            zzdrvVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdrvVarZza.zzb("lat_id", String.valueOf(zzetrVar.zza()));
            zzdrvVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcj)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdrvVarZza.zzb("seq_num", com.google.android.gms.ads.internal.zzv.zzp().zzh().zzd());
                synchronized (this) {
                    try {
                        if (this.zzg == this.zzb.size() && this.zzf != 0) {
                            this.zzg = 0;
                            String strValueOf = String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzf);
                            if (zzetrVar.zza() <= 39 || zzetrVar.zza() >= 52) {
                                zzdrvVarZza.zzb("lat_clsg", strValueOf);
                            } else {
                                zzdrvVarZza.zzb("lat_gmssg", strValueOf);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzdrvVarZza.zzh();
        }
    }
}
