package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w80 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21442a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f21443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f21444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f21445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f21446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f21447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx1 f21448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kx1 f21449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kx1 f21450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kx1 f21451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kx1 f21452k;
    public final kx1 l;

    public w80(q70 q70Var, z90 z90Var, fx1 fx1Var, oz ozVar, go0 go0Var, fx1 fx1Var2, hx1 hx1Var, oz ozVar2, t90 t90Var, oz ozVar3, fx1 fx1Var3) {
        this.f21446e = q70Var;
        this.f21447f = z90Var;
        this.f21443b = fx1Var;
        this.f21448g = ozVar;
        this.f21449h = go0Var;
        this.f21444c = fx1Var2;
        this.f21450i = hx1Var;
        this.f21451j = ozVar2;
        this.f21452k = t90Var;
        this.l = ozVar3;
        this.f21445d = fx1Var3;
    }

    public k80 a() {
        return new k80(((t80) this.f21446e).b(), ((t80) this.f21447f).a(), (pa0) this.f21443b.zzb(), (sa0) this.f21448g.zzb(), ((dc0) this.f21449h).f13492a.f12732o, ((d80) this.f21450i).a(), (nb0) this.f21444c.zzb(), new ua0(((ca0) this.f21451j).f13121b.zzb()), (lc0) this.f21445d.zzb(), (n90) ((fx1) this.f21452k).zzb(), (ji0) this.l.zzb());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21442a) {
            case 0:
                nk0 nk0VarB = ((q70) this.f21446e).b();
                ou0 ou0VarA = ((z90) this.f21447f).a();
                yv0 yv0Var = (yv0) this.f21443b.zzb();
                oz ozVar = (oz) this.f21448g;
                w50 w50Var = new w50(((ix1) ozVar.f18413b).zzb(), ((ix1) ozVar.f18414c).zzb());
                fo0 fo0VarA = ((go0) this.f21449h).zzb();
                vb0 vb0Var = (vb0) this.f21444c.zzb();
                ju0 ju0Var = (ju0) ((hx1) this.f21450i).f15424a;
                oz ozVar2 = (oz) this.f21451j;
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                vu0 vu0Var = new vu0(k00Var, ((v50) ozVar2.f18413b).a(), fx1.b((d80) ozVar2.f18414c), 17);
                s90 s90VarA = ((t90) this.f21452k).zzb();
                ic1.h(k00Var);
                oz ozVar3 = (oz) this.l;
                Map map = ((jx1) ozVar3.f18413b).f14102a;
                ic1.h(k00Var);
                return new v80(nk0VarB, ou0VarA, yv0Var, w50Var, fo0VarA, vb0Var, ju0Var, vu0Var, s90VarA, k00Var, new wk0(map, k00Var, new lb0(((ca0) ozVar3.f18414c).f13121b.zzb())), (sm0) this.f21445d.zzb());
            case 1:
                return a();
            case 2:
                return new gf0(((if0) this.f21446e).f15726b.f15274c, ((if0) this.f21448g).f15726b.f15273b, ((if0) this.f21449h).f15726b.f15272a, (ma0) this.f21443b.zzb(), (eb0) this.f21444c.zzb(), (ba0) this.f21445d.zzb(), (pc0) ((fx1) this.f21450i).zzb(), (Context) this.f21451j.zzb(), ((t80) this.f21452k).a(), ((u40) this.l).a(), ((z90) this.f21447f).a());
            case 3:
                Context context = (Context) this.f21443b.zzb();
                qf qfVar = (qf) this.f21446e.zzb();
                sm smVar = (sm) this.f21444c.zzb();
                VersionInfoParcel versionInfoParcelA = ((u40) this.f21447f).a();
                jq jqVar = ((o50) this.f21448g).f18148a;
                return new eh0(context, qfVar, smVar, versionInfoParcelA, o50.a(), (pj) this.f21445d.zzb(), (jb0) ((gx1) this.f21449h).zzb(), (zl0) this.f21450i.zzb(), (pu0) this.f21451j.zzb(), (yh0) this.f21452k.zzb(), (b40) this.l.zzb());
            default:
                return new jo0((ba0) this.f21443b.zzb(), (pc0) this.f21444c.zzb(), (ma0) this.f21445d.zzb(), (qa0) ((fx1) this.f21446e).zzb(), (sa0) ((fx1) this.f21447f).zzb(), (ka0) ((fx1) this.f21448g).zzb(), (tb0) this.f21449h.zzb(), (xc0) ((fx1) this.f21450i).zzb(), (bb0) ((fx1) this.f21451j).zzb(), (uc0) ((fx1) this.f21452k).zzb(), (qb0) ((fx1) this.l).zzb());
        }
    }

    public w80(t80 t80Var, t80 t80Var2, fx1 fx1Var, kx1 kx1Var, dc0 dc0Var, d80 d80Var, fx1 fx1Var2, ca0 ca0Var, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5) {
        this.f21446e = t80Var;
        this.f21447f = t80Var2;
        this.f21443b = fx1Var;
        this.f21448g = kx1Var;
        this.f21449h = dc0Var;
        this.f21450i = d80Var;
        this.f21444c = fx1Var2;
        this.f21451j = ca0Var;
        this.f21445d = fx1Var3;
        this.f21452k = fx1Var4;
        this.l = fx1Var5;
    }

    public w80(if0 if0Var, if0 if0Var2, if0 if0Var3, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, t80 t80Var, u40 u40Var, z90 z90Var) {
        this.f21446e = if0Var;
        this.f21448g = if0Var2;
        this.f21449h = if0Var3;
        this.f21443b = fx1Var;
        this.f21444c = fx1Var2;
        this.f21445d = fx1Var3;
        this.f21450i = fx1Var4;
        this.f21451j = fx1Var5;
        this.f21452k = t80Var;
        this.l = u40Var;
        this.f21447f = z90Var;
    }

    public w80(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, fx1 fx1Var6, fx1 fx1Var7, fx1 fx1Var8, fx1 fx1Var9, fx1 fx1Var10, fx1 fx1Var11) {
        this.f21443b = fx1Var;
        this.f21444c = fx1Var2;
        this.f21445d = fx1Var3;
        this.f21446e = fx1Var4;
        this.f21447f = fx1Var5;
        this.f21448g = fx1Var6;
        this.f21449h = fx1Var7;
        this.f21450i = fx1Var8;
        this.f21451j = fx1Var9;
        this.f21452k = fx1Var10;
        this.l = fx1Var11;
    }

    public w80(fx1 fx1Var, kx1 kx1Var, fx1 fx1Var2, kx1 kx1Var2, kx1 kx1Var3, fx1 fx1Var3, gx1 gx1Var, kx1 kx1Var4, kx1 kx1Var5, kx1 kx1Var6, kx1 kx1Var7) {
        this.f21443b = fx1Var;
        this.f21446e = kx1Var;
        this.f21444c = fx1Var2;
        this.f21447f = kx1Var2;
        this.f21448g = kx1Var3;
        this.f21445d = fx1Var3;
        this.f21449h = gx1Var;
        this.f21450i = kx1Var4;
        this.f21451j = kx1Var5;
        this.f21452k = kx1Var6;
        this.l = kx1Var7;
    }
}
