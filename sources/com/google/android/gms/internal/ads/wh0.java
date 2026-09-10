package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f21514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h00 f21515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou0 f21516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qf f21517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f21518e;

    public wh0(Context context, ci0 ci0Var, h00 h00Var, ou0 ou0Var, String str, String str2, qf qfVar, DeviceTierManager deviceTierManager) {
        ActivityManager.MemoryInfo memoryInfoZze;
        zzm zzmVar = ou0Var.f18363d;
        this.f21518e = new Bundle();
        ci0Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(ci0Var.f13169a);
        this.f21514a = concurrentHashMap;
        this.f21515b = h00Var;
        this.f21516c = ou0Var;
        this.f21517d = qfVar;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        d();
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(zzt.zzh().f14139k.get()));
            if (((Boolean) zzba.zzc().a(am.f12079b3)).booleanValue() && (memoryInfoZze = zzf.zze(context)) != null) {
                b("mem_avl", String.valueOf(memoryInfoZze.availMem));
                b("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                b("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) zzba.zzc().a(am.f12191i3)).booleanValue()) {
            b("ad_unit_id", ou0Var.f18366g);
        }
        if (((Boolean) zzba.zzc().a(am.f12096c3)).booleanValue()) {
            b("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) zzba.zzc().a(am.f12112d3)).booleanValue()) {
            b("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (((Boolean) zzba.zzc().a(am.Z7)).booleanValue()) {
            int iZzg = zzv.zzg(ou0Var) - 1;
            if (iZzg == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iZzg == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (iZzg == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iZzg != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", com.ironsource.mediationsdk.metadata.a.f29610g);
            b("ragent", zzmVar.zzp);
            b("rtype", zzv.zzb(zzv.zzc(zzmVar)));
        }
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            b("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            b("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f21514a.put(str, str2);
    }

    public final synchronized void c(long j10, String str) {
        this.f21518e.putLong(str, j10);
    }

    public final void d() {
        String str;
        if (((Boolean) zzba.zzc().a(am.f12102cb)).booleanValue()) {
            of ofVar = this.f21517d.f19044b;
            boolean z10 = ofVar instanceof zzk;
            ConcurrentHashMap concurrentHashMap = this.f21514a;
            if (z10) {
                concurrentHashMap.put("asv", ((zzk) ofVar).zzc());
                return;
            }
            if (!(ofVar instanceof i40)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            m31 m31Var = (m31) ((f21) ((i40) ofVar).f15570b.f20013b).f14180b.f18916f.get();
            int iZzg = (m31Var == null ? 1 : m31Var.zzg()) - 1;
            if (iZzg == 1) {
                str = "1.0";
            } else if (iZzg != 2) {
                str = iZzg != 3 ? "uns" : "3.0";
            } else {
                str = "2.0";
            }
            concurrentHashMap.put("asv", str);
        }
    }
}
