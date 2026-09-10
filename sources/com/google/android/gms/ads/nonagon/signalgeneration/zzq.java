package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.wh0;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ci0 f11514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f11515i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f11512f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f11513g = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11507a = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.X7)).intValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11508b = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Y7)).longValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11509c = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12099c8)).booleanValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11510d = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12084b8)).booleanValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f11511e = Collections.synchronizedMap(new zzn(this));

    public zzq(ci0 ci0Var) {
        this.f11514h = ci0Var;
    }

    public final synchronized void a() {
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f11511e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((zzo) entry.getValue()).zza.longValue() <= this.f11508b) {
                    break;
                }
                this.f11513g.add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().d("QueryJsonMap.removeExpiredEntries", e10);
        }
    }

    public final synchronized void b(final wh0 wh0Var) {
        if (this.f11509c) {
            ArrayDeque arrayDeque = this.f11513g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f11512f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            l00.f16608a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzq zzqVar = this.f11503a;
                    wh0 wh0Var2 = wh0Var;
                    zzqVar.c(wh0Var2, arrayDequeClone, "to");
                    zzqVar.c(wh0Var2, arrayDequeClone2, "of");
                }
            });
        }
    }

    public final void c(wh0 wh0Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(wh0Var.f21514a);
            this.f11515i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f11515i.put("e_r", str);
            this.f11515i.put("e_id", (String) pair2.first);
            if (this.f11510d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzv.zzb(jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f11515i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f11515i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f11514h.b(this.f11515i);
        }
    }

    public final synchronized void zza(String str, String str2, wh0 wh0Var) {
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.f11511e.put(str, new zzo(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        a();
        b(wh0Var);
    }

    @Nullable
    public final synchronized String zzb(String str, wh0 wh0Var) {
        zzo zzoVar = (zzo) this.f11511e.get(str);
        wh0Var.f21514a.put("request_id", str);
        if (zzoVar == null) {
            wh0Var.f21514a.put("mhit", "false");
            return null;
        }
        wh0Var.f21514a.put("mhit", a.f29610g);
        return zzoVar.zzb;
    }

    public final synchronized void zzc(String str) {
        this.f11511e.remove(str);
    }

    public final synchronized boolean zzd(String str, String str2) {
        zzo zzoVar = (zzo) this.f11511e.get(str);
        return zzoVar != null && zzoVar.zzc.contains(str2);
    }

    public final synchronized boolean zze(String str, String str2, int i10) {
        zzo zzoVar = (zzo) this.f11511e.get(str);
        if (zzoVar == null) {
            return false;
        }
        Set set = zzoVar.zzc;
        set.add(str2);
        return set.size() < i10;
    }
}
