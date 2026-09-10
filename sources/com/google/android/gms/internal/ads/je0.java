package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class je0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzea f16051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ho f16052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f16053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f16054e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzew f16056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f16057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b30 f16058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b30 f16059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b30 f16060k;
    public km0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ListenableFuture f16061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m00 f16062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f16063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f16064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s9.a f16065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f16066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public mo f16067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public mo f16068t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f16069u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f16072x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f16073y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x.i f16070v = new x.i(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x.i f16071w = new x.i(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f16055f = Collections.EMPTY_LIST;

    public static je0 l(eu euVar) {
        ie0 ie0Var;
        eu euVar2;
        try {
            zzea zzeaVarZzn = euVar.zzn();
            if (zzeaVarZzn == null) {
                euVar2 = euVar;
                ie0Var = null;
            } else {
                euVar2 = euVar;
                ie0Var = new ie0(zzeaVarZzn, euVar2);
            }
            return m(ie0Var, euVar2.zzo(), (View) n(euVar2.zzp()), euVar2.zze(), euVar2.zzf(), euVar2.zzg(), euVar2.zzs(), euVar2.zzi(), (View) n(euVar2.zzq()), euVar2.zzr(), euVar2.zzl(), euVar2.zzm(), euVar2.zzk(), euVar2.zzh(), euVar2.zzj(), euVar2.zzz());
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public static je0 m(ie0 ie0Var, ho hoVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, s9.a aVar, String str4, String str5, double d10, mo moVar, String str6, float f10) {
        je0 je0Var = new je0();
        je0Var.f16050a = 6;
        je0Var.f16051b = ie0Var;
        je0Var.f16052c = hoVar;
        je0Var.f16053d = view;
        je0Var.o("headline", str);
        je0Var.f16054e = list;
        je0Var.o("body", str2);
        je0Var.f16057h = bundle;
        je0Var.o("call_to_action", str3);
        je0Var.f16063o = view2;
        je0Var.f16065q = aVar;
        je0Var.o(X3.i.U, str4);
        je0Var.o("price", str5);
        je0Var.f16066r = d10;
        je0Var.f16067s = moVar;
        je0Var.o(X3.i.F0, str6);
        synchronized (je0Var) {
            je0Var.f16072x = f10;
        }
        return je0Var;
    }

    public static Object n(s9.a aVar) {
        if (aVar == null) {
            return null;
        }
        return s9.b.y1(aVar);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final mo b() {
        List list = this.f16054e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f16054e.get(0);
        if (obj instanceof IBinder) {
            return yn.x1((IBinder) obj);
        }
        return null;
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        try {
            if (this.f16057h == null) {
                this.f16057h = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f16057h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p(X3.i.F0);
    }

    public final synchronized String g() {
        return this.f16069u;
    }

    public final synchronized b30 h() {
        return this.f16058i;
    }

    public final synchronized b30 i() {
        return this.f16059j;
    }

    public final synchronized b30 j() {
        return this.f16060k;
    }

    public final synchronized km0 k() {
        return this.l;
    }

    public final synchronized void o(String str, String str2) {
        try {
            if (str2 == null) {
                this.f16071w.remove(str);
            } else {
                this.f16071w.put(str, str2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized String p(String str) {
        return (String) this.f16071w.get(str);
    }

    public final synchronized int q() {
        return this.f16050a;
    }

    public final synchronized zzea r() {
        return this.f16051b;
    }

    public final synchronized ho s() {
        return this.f16052c;
    }
}
