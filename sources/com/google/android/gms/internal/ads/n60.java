package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n60 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f17681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f17682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f17683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f17684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f17685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx1 f17686g;

    public n60(o40 o40Var, k40 k40Var, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4) {
        this.f17680a = 0;
        this.f17681b = o40Var;
        this.f17682c = k40Var;
        this.f17685f = fx1Var;
        this.f17686g = fx1Var2;
        this.f17683d = fx1Var3;
        this.f17684e = fx1Var4;
    }

    public k80 a() {
        Context contextA = ((o40) this.f17681b).a();
        jw0 jw0Var = (jw0) ((fx1) this.f17685f).zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new k80(contextA, jw0Var, k00Var, (ScheduledExecutorService) this.f17682c.zzb(), (o80) ((fx1) this.f17686g).zzb(), (bo0) ((fx1) this.f17683d).zzb(), (lx0) ((fx1) this.f17684e).zzb());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f17680a) {
            case 0:
                Context contextA = ((o40) this.f17681b).a();
                zzj zzjVarZzb = ((k40) this.f17682c).zzb();
                lm0 lm0Var = (lm0) ((fx1) this.f17685f).zzb();
                hh0 hh0Var = (hh0) ((fx1) this.f17686g).zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new m60(contextA, zzjVarZzb, lm0Var, hh0Var, k00Var, (fe1) this.f17683d.zzb(), (ScheduledExecutorService) this.f17684e.zzb());
            case 1:
                w70 w70Var = (w70) this.f17684e;
                iz izVar = new iz(((o40) w70Var.f21437b).a(), ((z90) w70Var.f21438c).a().f18366g);
                Context contextA2 = ((o40) this.f17681b).a();
                kz kzVar = (kz) this.f17682c.zzb();
                b30 b30Var = (b30) ((cd0) this.f17685f).f13137b.f17037c;
                return new kd0(izVar, contextA2, kzVar, b30Var == null ? null : b30Var.zzD(), (qj) this.f17683d.zzb(), ((t80) this.f17686g).a());
            case 2:
                a50 a50Var = (a50) this.f17681b.zzb();
                v90 v90VarA = ((x90) this.f17683d).f21797b.a();
                bc0 bc0Var = ((cc0) this.f17684e).f13134b;
                md0 md0Var = (md0) ((e60) this.f17686g).f13858b;
                jb0 jb0VarZzb = ((n70) this.f17682c).zzb();
                bo0 bo0Var = (bo0) ((fx1) this.f17685f).zzb();
                a50 a50Var2 = a50Var.f11854b;
                w90 w90Var = new w90(v90VarA);
                so0 so0Var = null;
                so0 so0Var2 = new so0((Object) null, 0);
                md0 md0Var2 = new md0(15, jb0VarZzb, (Object) null);
                vf vfVar = new vf(null, 15);
                if (((Boolean) zzba.zzc().a(am.H4)).booleanValue()) {
                    so0Var = new so0(29);
                    so0Var.f20013b = bo0Var;
                }
                ic1.j(bc0Var, bc0.class);
                if (so0Var == null) {
                    so0Var = new so0(29);
                }
                ic1.j(md0Var, md0.class);
                o80 o80Var = (o80) new f50(a50Var2, vfVar, md0Var, new tc0(9), bc0Var, w90Var, so0Var, so0Var2, md0Var2, null, null).f14243s.zzb();
                ic1.h(o80Var);
                return o80Var;
            case 3:
                Context contextA3 = ((o40) this.f17681b).a();
                ou0 ou0VarA = ((z90) this.f17683d).a();
                oz ozVar = (oz) this.f17684e;
                k00 k00Var2 = l00.f16609b;
                ic1.h(k00Var2);
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                uw uwVar = new uw(k00Var2, k00Var3, new ok0((Context) ((ej0) ozVar.f18413b).f13995b.zzb(), k00Var3, 0), fx1.b((d80) ozVar.f18414c), 8);
                ic1.h(k00Var3);
                return new lk0(contextA3, ou0VarA, uwVar, k00Var3, (ScheduledExecutorService) this.f17682c.zzb(), (pl0) ((fx1) this.f17685f).zzb(), (jw0) ((fx1) this.f17686g).zzb());
            case 4:
                return a();
            case 5:
                return new vn0((a50) this.f17681b.zzb(), (md0) ((e60) this.f17682c).f13858b, ((x90) this.f17683d).f21797b.a(), ((cc0) this.f17684e).f13134b, (bo0) ((fx1) this.f17685f).zzb(), (sm0) ((fx1) this.f17686g).zzb());
            case 6:
                return new vn0((a50) this.f17681b.zzb(), ((x90) this.f17682c).f21797b.a(), ((to0) this.f17683d).f20449b, ((cc0) this.f17684e).f13134b, (bo0) ((fx1) this.f17685f).zzb(), (sm0) ((fx1) this.f17686g).zzb());
            case 7:
                return new vn0((a50) this.f17681b.zzb(), ((x90) this.f17682c).f21797b.a(), ((cc0) this.f17683d).f13134b, ((x90) this.f17684e).f21797b.f21465d, (bo0) ((fx1) this.f17685f).zzb(), (sm0) ((fx1) this.f17686g).zzb());
            case 8:
                zzj zzjVarZzb2 = ((k40) this.f17681b).zzb();
                Context contextA4 = ((o40) this.f17682c).a();
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new gs0(zzjVarZzb2, contextA4, k00Var4, (ScheduledExecutorService) this.f17683d.zzb(), new mm0(((o40) ((v50) this.f17685f).f21035b).a()), ((z90) this.f17686g).a(), ((u40) this.f17684e).a());
            case 9:
                return new us0((Context) ((hx1) this.f17684e).f15424a, (Executor) this.f17681b.zzb(), (a50) this.f17682c.zzb(), ((mt0) this.f17686g).a(), (ts0) ((fx1) this.f17685f).zzb(), new nu0(), ((u40) this.f17683d).a());
            case 10:
                return new yt0((Context) ((hx1) this.f17683d).f15424a, (Executor) this.f17681b.zzb(), (a50) this.f17682c.zzb(), ((mt0) this.f17684e).a(), (ut0) ((fx1) this.f17685f).zzb(), new nu0(), (ku0) ((fx1) this.f17686g).zzb());
            case 11:
                return new ru0((mx0) this.f17681b.zzb(), (kx0) this.f17682c.zzb(), ((t80) this.f17684e).a(), ((t80) this.f17686g).f20240b.n(), (m60) ((fx1) this.f17685f).zzb(), (jw0) this.f17683d.zzb());
            case 12:
                Context contextA5 = ((o40) this.f17682c).a();
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                return new mx0(contextA5, k00Var5, (ge1) ((fx1) this.f17685f).zzb(), (zzu) this.f17681b.zzb(), (kx0) ((fx1) this.f17686g).zzb(), (kw0) ((fx1) this.f17683d).zzb(), (h40) ((fx1) this.f17684e).zzb());
            case 13:
                return new sx0((gy0) ((fx1) this.f17685f).zzb(), ((s40) this.f17681b).a(), ((o40) this.f17682c).a(), (p9.a) ((fx1) this.f17686g).zzb(), (qx0) ((fx1) this.f17683d).zzb(), ((k40) this.f17684e).zzb());
            case 14:
                return new p31(fx1.b((fx1) this.f17685f), fx1.b((fx1) this.f17686g), fx1.b((fx1) this.f17681b), (h21) ((hx1) this.f17682c).f15424a, (ExecutorService) ((hx1) this.f17683d).f15424a, (a71) ((fx1) this.f17684e).zzb());
            case 15:
                return new s41((xd) ((hx1) this.f17683d).f15424a, (h41) this.f17681b.zzb(), (p21) ((hx1) this.f17684e).f15424a, (Context) ((hx1) this.f17685f).f15424a, (Map) ((hx1) this.f17686g).f15424a, (a71) this.f17682c.zzb());
            case 16:
                l61 l61Var = (l61) ((fx1) this.f17685f).zzb();
                v51 v51Var = (v51) ((fx1) this.f17686g).zzb();
                c61 c61Var = (c61) ((fx1) this.f17684e).zzb();
                a71 a71Var = (a71) this.f17681b.zzb();
                t21 t21Var = (t21) this.f17682c.zzb();
                h21 h21Var = (h21) this.f17683d.zzb();
                return new g51(l61Var, v51Var, c61Var, a71Var, t21Var, h21Var.W().D(), h21Var.W().E(), h21Var.W().F());
            default:
                return new a61((Context) this.f17681b.zzb(), (ExecutorService) this.f17682c.zzb(), (h21) this.f17683d.zzb(), (s21) this.f17684e.zzb(), (a71) this.f17686g.zzb(), (b61) ((fx1) this.f17685f).zzb());
        }
    }

    public n60(o40 o40Var, fx1 fx1Var, kx1 kx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4) {
        this.f17680a = 12;
        this.f17682c = o40Var;
        this.f17685f = fx1Var;
        this.f17681b = kx1Var;
        this.f17686g = fx1Var2;
        this.f17683d = fx1Var3;
        this.f17684e = fx1Var4;
    }

    public n60(w70 w70Var, o40 o40Var, fx1 fx1Var, cd0 cd0Var, gx1 gx1Var, t80 t80Var) {
        this.f17680a = 1;
        this.f17684e = w70Var;
        this.f17681b = o40Var;
        this.f17682c = fx1Var;
        this.f17685f = cd0Var;
        this.f17683d = gx1Var;
        this.f17686g = t80Var;
    }

    public n60(fx1 fx1Var, s40 s40Var, o40 o40Var, fx1 fx1Var2, fx1 fx1Var3, k40 k40Var) {
        this.f17680a = 13;
        this.f17685f = fx1Var;
        this.f17681b = s40Var;
        this.f17682c = o40Var;
        this.f17686g = fx1Var2;
        this.f17683d = fx1Var3;
        this.f17684e = k40Var;
    }

    public n60(fx1 fx1Var, fx1 fx1Var2, t80 t80Var, t80 t80Var2, fx1 fx1Var3, fx1 fx1Var4) {
        this.f17680a = 11;
        this.f17681b = fx1Var;
        this.f17682c = fx1Var2;
        this.f17684e = t80Var;
        this.f17686g = t80Var2;
        this.f17685f = fx1Var3;
        this.f17683d = fx1Var4;
    }

    public n60(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, hx1 hx1Var) {
        this.f17680a = 16;
        this.f17685f = fx1Var;
        this.f17686g = fx1Var2;
        this.f17684e = fx1Var3;
        this.f17681b = fx1Var4;
        this.f17682c = fx1Var5;
        this.f17683d = hx1Var;
    }

    public n60(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, hx1 hx1Var, hx1 hx1Var2, fx1 fx1Var4) {
        this.f17680a = 14;
        this.f17685f = fx1Var;
        this.f17686g = fx1Var2;
        this.f17681b = fx1Var3;
        this.f17682c = hx1Var;
        this.f17683d = hx1Var2;
        this.f17684e = fx1Var4;
    }

    public n60(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, mt0 mt0Var, fx1 fx1Var2, u40 u40Var) {
        this.f17680a = 9;
        this.f17684e = hx1Var;
        this.f17681b = fx1Var;
        this.f17682c = hx1Var2;
        this.f17686g = mt0Var;
        this.f17685f = fx1Var2;
        this.f17683d = u40Var;
    }

    public n60(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, mt0 mt0Var, fx1 fx1Var2, fx1 fx1Var3) {
        this.f17680a = 10;
        this.f17683d = hx1Var;
        this.f17681b = fx1Var;
        this.f17682c = hx1Var2;
        this.f17684e = mt0Var;
        this.f17685f = fx1Var2;
        this.f17686g = fx1Var3;
    }

    public n60(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, hx1 hx1Var3, hx1 hx1Var4, fx1 fx1Var2) {
        this.f17680a = 15;
        this.f17683d = hx1Var;
        this.f17681b = fx1Var;
        this.f17684e = hx1Var2;
        this.f17685f = hx1Var3;
        this.f17686g = hx1Var4;
        this.f17682c = fx1Var2;
    }

    public n60(hx1 hx1Var, hx1 hx1Var2, hx1 hx1Var3, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3) {
        this.f17680a = 17;
        this.f17681b = hx1Var;
        this.f17682c = hx1Var2;
        this.f17683d = hx1Var3;
        this.f17684e = fx1Var;
        this.f17686g = fx1Var2;
        this.f17685f = fx1Var3;
    }

    public n60(kx1 kx1Var, x90 x90Var, cc0 cc0Var, e60 e60Var, kx1 kx1Var2, fx1 fx1Var) {
        this.f17680a = 2;
        this.f17681b = kx1Var;
        this.f17683d = x90Var;
        this.f17684e = cc0Var;
        this.f17686g = e60Var;
        this.f17682c = kx1Var2;
        this.f17685f = fx1Var;
    }

    public n60(kx1 kx1Var, z90 z90Var, oz ozVar, kx1 kx1Var2, fx1 fx1Var, fx1 fx1Var2) {
        this.f17680a = 3;
        this.f17681b = kx1Var;
        this.f17683d = z90Var;
        this.f17684e = ozVar;
        this.f17682c = kx1Var2;
        this.f17685f = fx1Var;
        this.f17686g = fx1Var2;
    }

    public n60(kx1 kx1Var, fx1 fx1Var, kx1 kx1Var2, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4) {
        this.f17680a = 4;
        this.f17681b = kx1Var;
        this.f17685f = fx1Var;
        this.f17682c = kx1Var2;
        this.f17686g = fx1Var2;
        this.f17683d = fx1Var3;
        this.f17684e = fx1Var4;
    }

    public /* synthetic */ n60(kx1 kx1Var, gx1 gx1Var, gx1 gx1Var2, gx1 gx1Var3, fx1 fx1Var, fx1 fx1Var2, int i10) {
        this.f17680a = i10;
        this.f17681b = kx1Var;
        this.f17682c = gx1Var;
        this.f17683d = gx1Var2;
        this.f17684e = gx1Var3;
        this.f17685f = fx1Var;
        this.f17686g = fx1Var2;
    }

    public n60(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, v50 v50Var, z90 z90Var, kx1 kx1Var4) {
        this.f17680a = 8;
        this.f17681b = kx1Var;
        this.f17682c = kx1Var2;
        this.f17683d = kx1Var3;
        this.f17685f = v50Var;
        this.f17686g = z90Var;
        this.f17684e = kx1Var4;
    }
}
