package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.InterfaceC0435l1;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba0 f13523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc0 f13524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa0 f13525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa0 f13526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bb0 f13527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tb0 f13528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f13529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oc0 f13530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d70 f13531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzb f13532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bz f13533k;
    public final qf l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ob0 f13534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ul0 f13535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final mx0 f13536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yh0 f13537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m60 f13538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hh0 f13539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ji0 f13540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q90 f13541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n90 f13542u;

    public dh0(ba0 ba0Var, qa0 qa0Var, wa0 wa0Var, bb0 bb0Var, tb0 tb0Var, Executor executor, oc0 oc0Var, d70 d70Var, zzb zzbVar, bz bzVar, qf qfVar, ob0 ob0Var, ul0 ul0Var, mx0 mx0Var, yh0 yh0Var, pc0 pc0Var, m60 m60Var, hh0 hh0Var, ji0 ji0Var, q90 q90Var, n90 n90Var) {
        this.f13523a = ba0Var;
        this.f13525c = qa0Var;
        this.f13526d = wa0Var;
        this.f13527e = bb0Var;
        this.f13528f = tb0Var;
        this.f13529g = executor;
        this.f13530h = oc0Var;
        this.f13531i = d70Var;
        this.f13532j = zzbVar;
        this.f13533k = bzVar;
        this.l = qfVar;
        this.f13534m = ob0Var;
        this.f13535n = ul0Var;
        this.f13536o = mx0Var;
        this.f13537p = yh0Var;
        this.f13524b = pc0Var;
        this.f13538q = m60Var;
        this.f13539r = hh0Var;
        this.f13540s = ji0Var;
        this.f13541t = q90Var;
        this.f13542u = n90Var;
    }

    public static final m00 b(b30 b30Var, String str, String str2, wh0 wh0Var, jw0 jw0Var) {
        if (((Boolean) zzba.zzc().a(am.V2)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "rendering-webview-load-html-start");
        }
        m00 m00Var = new m00();
        if (((Boolean) zzba.zzc().a(am.f12318qa)).booleanValue()) {
            fw0 fw0VarF = fw0.f(b30Var.getContext(), InterfaceC0435l1.d.b.f29113j);
            fw0VarF.zza();
            ps1.a0(m00Var, jw0Var, fw0VarF, false);
        }
        b30Var.zzP().f14700g = new md0(20, wh0Var, m00Var);
        b30Var.t(str, str2);
        return m00Var;
    }

    public final void a(b30 b30Var, boolean z10, rq rqVar, wh0 wh0Var) {
        of ofVar;
        ul ulVar = am.V2;
        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "rendering-configure-webview-start");
        }
        b30Var.zzP().J(new zza() { // from class: com.google.android.gms.internal.ads.ch0
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                this.f13163a.f13523a.onAdClicked();
            }
        }, this.f13526d, this.f13527e, new gq() { // from class: com.google.android.gms.internal.ads.ah0
            @Override // com.google.android.gms.internal.ads.gq
            public final /* synthetic */ void zzb(String str, String str2) {
                this.f12033a.f13528f.zzb(str, str2);
            }
        }, new kg0(this, 2), z10, rqVar, this.f13532j, new b21(this, 20), this.f13533k, this.f13535n, this.f13536o, this.f13537p, null, this.f13524b, null, null, null, this.f13538q, this.f13540s, this.f13541t, this.f13542u);
        b30Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.bh0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                dh0 dh0Var = this.f12777a;
                if (((Boolean) zzba.zzc().a(am.Hb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    dh0Var.f13539r.f15292a = motionEvent;
                }
                dh0Var.f13532j.zza();
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        b30Var.setOnClickListener(new jv(this));
        if (((Boolean) zzba.zzc().a(am.E3)).booleanValue() && (ofVar = this.l.f19044b) != null) {
            ofVar.zzh(b30Var.zzE());
        }
        oc0 oc0Var = this.f13530h;
        Executor executor = this.f13529g;
        oc0Var.P0(b30Var, executor);
        oc0Var.P0(new wf0(b30Var, 2), executor);
        oc0Var.X0(b30Var.zzE());
        b30Var.D("/trackActiveViewUnit", new lq(5, this, b30Var));
        d70 d70Var = this.f13531i;
        d70Var.getClass();
        d70Var.f13445j = new WeakReference(b30Var);
        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "rendering-configure-webview-end");
        }
    }
}
