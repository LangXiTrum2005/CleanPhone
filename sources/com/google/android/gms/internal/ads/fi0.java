package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fi0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ci0 f14441f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14437b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14438c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14439d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzj f14436a = zzt.zzh().g();

    public fi0(ci0 ci0Var, String str) {
        this.f14440e = str;
        this.f14441f = ci0Var;
    }

    public final synchronized void a(String str) {
        if (((Boolean) zzba.zzc().a(am.P2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_started");
            mapE.put("ancn", str);
            this.f14437b.add(mapE);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) zzba.zzc().a(am.P2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            this.f14437b.add(mapE);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) zzba.zzc().a(am.P2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            mapE.put("rqe", str2);
            this.f14437b.add(mapE);
        }
    }

    public final synchronized void d() {
        if (((Boolean) zzba.zzc().a(am.P2)).booleanValue() && !this.f14438c) {
            HashMap mapE = e();
            mapE.put("action", "init_started");
            this.f14437b.add(mapE);
            this.f14438c = true;
        }
    }

    public final HashMap e() {
        ci0 ci0Var = this.f14441f;
        ci0Var.getClass();
        HashMap map = new HashMap(ci0Var.f13169a);
        ((p9.b) zzt.zzk()).getClass();
        map.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        map.put(ScarConstants.TOKEN_ID_KEY, this.f14436a.zzx() ? "" : this.f14440e);
        return map;
    }
}
