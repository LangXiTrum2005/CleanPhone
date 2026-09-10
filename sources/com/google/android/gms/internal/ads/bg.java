package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bg implements p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sz0 f12757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz f12758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg f12759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag f12760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vf f12761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mg f12762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f12763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g9 f12764h;

    public bg(sz0 sz0Var, hz hzVar, kg kgVar, ag agVar, vf vfVar, mg mgVar, b2 b2Var, g9 g9Var) {
        this.f12757a = sz0Var;
        this.f12758b = hzVar;
        this.f12759c = kgVar;
        this.f12760d = agVar;
        this.f12761e = vfVar;
        this.f12762f = mgVar;
        this.f12763g = b2Var;
        this.f12764h = g9Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x011b A[Catch: all -> 0x00fb, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00fb, blocks: (B:10:0x00ea, B:12:0x00f0, B:14:0x00f7, B:18:0x00fd, B:20:0x0108, B:22:0x010c, B:24:0x0117, B:26:0x011b), top: B:37:0x00ea }] */
    public final HashMap a() {
        long j10;
        HashMap map = new HashMap();
        sz0 sz0Var = this.f12757a;
        Task task = (Task) this.f12758b.f15436e;
        je jeVar = wz0.f21651a;
        if (task.isSuccessful()) {
            jeVar = (je) task.getResult();
        }
        map.put("v", sz0Var.f20087a);
        map.put("gms", Boolean.valueOf(sz0Var.f20089c));
        map.put("gv", Long.valueOf(jeVar.w0()));
        map.put("int", jeVar.u0());
        map.put("attts", Long.valueOf(jeVar.y0().A()));
        map.put("att", jeVar.y0().C());
        map.put("attkid", jeVar.y0().B());
        map.put("up", Boolean.valueOf(this.f12760d.f12027a));
        map.put("t", new Throwable());
        b2 b2Var = this.f12763g;
        map.put("tcq", Long.valueOf(b2Var.f12596a));
        map.put("tpq", Long.valueOf(b2Var.f12597b));
        map.put("tcv", Long.valueOf(b2Var.f12598c));
        map.put("tpv", Long.valueOf(b2Var.f12599d));
        map.put("tchv", Long.valueOf(b2Var.f12600e));
        map.put("tphv", Long.valueOf(b2Var.f12601f));
        map.put("tcc", Long.valueOf(b2Var.f12602g));
        map.put("tpc", Long.valueOf(b2Var.f12603h));
        vf vfVar = this.f12761e;
        if (vfVar != null) {
            synchronized (vf.class) {
                try {
                    NetworkCapabilities networkCapabilities = (NetworkCapabilities) vfVar.f21157b;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j10 = 2;
                        } else if (((NetworkCapabilities) vfVar.f21157b).hasTransport(1)) {
                            j10 = 1;
                        } else {
                            j10 = ((NetworkCapabilities) vfVar.f21157b).hasTransport(0) ? 0L : -1L;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map.put("nt", Long.valueOf(j10));
        }
        mg mgVar = this.f12762f;
        map.put("vs", Long.valueOf(mgVar.f17430d ? mgVar.f17428b - mgVar.f17427a : -1L));
        long j11 = mgVar.f17429c;
        mgVar.f17429c = -1L;
        map.put("vf", Long.valueOf(j11));
        return map;
    }

    @Override // com.google.android.gms.internal.ads.p01
    public final HashMap zzb() {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.p01
    public final HashMap zzc() {
        HashMap mapA = a();
        g9 g9Var = this.f12764h;
        List list = g9Var.f14798a;
        g9Var.f14798a = Collections.EMPTY_LIST;
        mapA.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, list);
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.p01
    public final HashMap zzd() {
        HashMap mapA = a();
        kg kgVar = this.f12759c;
        if (kgVar.l <= -2) {
            WeakReference weakReference = kgVar.f16435h;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                kgVar.l = -3L;
            }
        }
        mapA.put("lts", Long.valueOf(kgVar.l));
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.p01
    public final HashMap zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
