package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwy {
    private final ConcurrentHashMap zza;
    private final zzcdf zzb;
    private final zzfik zzc;
    private final String zzd;
    private final String zze;
    private final zzayq zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdwy(Context context, zzdxj zzdxjVar, zzcdf zzcdfVar, zzfik zzfikVar, String str, String str2, zzayq zzayqVar) {
        ActivityManager.MemoryInfo memoryInfoZze;
        ConcurrentHashMap concurrentHashMapZzd = zzdxjVar.zzd();
        this.zza = concurrentHashMapZzd;
        this.zzb = zzcdfVar;
        this.zzc = zzfikVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzayqVar;
        this.zzh = context;
        concurrentHashMapZzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzl()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcQ)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", String.valueOf(memoryInfoZze.availMem));
                zzd("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                zzd("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcS)).booleanValue()) {
            zzd("ad_unit_id", zzfikVar.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhM)).booleanValue()) {
            int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfikVar) - 1;
            if (iZzg == 0) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("scar", "false");
                return;
            }
            if (iZzg == 1) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("se", "query_g");
            } else if (iZzg == 2) {
                concurrentHashMapZzd.put("se", "r_adinfo");
            } else if (iZzg != 3) {
                concurrentHashMapZzd.put("se", "r_both");
            } else {
                concurrentHashMapZzd.put("se", "r_adstring");
            }
            concurrentHashMapZzd.put("scar", com.p004ironsource.mediationsdk.metadata.a.g);
            zzd("ragent", zzfikVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfikVar.zzd)));
        }
    }

    public final void zza(zzfic zzficVar) {
        zzfib zzfibVar = zzficVar.zzb;
        List list = zzfibVar.zza;
        if (!list.isEmpty()) {
            int i2 = ((zzfhr) list.get(0)).zzb;
            zzd("ad_format", zzfhr.zza(i2));
            if (i2 == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcK)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfibVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Bundle zze() {
        return this.zzg;
    }

    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoG)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkS)).booleanValue()) {
            zzayl zzaylVarZzb = this.zzf.zzb();
            if (zzaylVarZzb instanceof com.google.android.gms.ads.internal.zzk) {
                this.zza.put("asv", ((com.google.android.gms.ads.internal.zzk) zzaylVarZzb).zzc());
            } else if (zzaylVarZzb instanceof zzclf) {
                this.zza.put("asv", ((zzclf) zzaylVarZzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }
}
