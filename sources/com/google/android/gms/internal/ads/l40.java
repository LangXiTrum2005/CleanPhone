package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l40 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f16705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f16706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f16707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f16708e;

    public l40(o40 o40Var, u40 u40Var, fx1 fx1Var, fx1 fx1Var2) {
        this.f16704a = 15;
        this.f16706c = o40Var;
        this.f16708e = u40Var;
        this.f16705b = fx1Var;
        this.f16707d = fx1Var2;
    }

    public po0 a() {
        return new po0((yv0) ((fx1) this.f16705b).zzb(), (fe1) this.f16706c.zzb(), (pm0) this.f16707d.zzb(), (tm0) ((gx1) this.f16708e).zzb(), 0);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f16704a) {
            case 0:
                zzj zzjVarZzb = ((k40) this.f16706c).zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((fx1) this.f16705b).zzb();
                uo0 uo0VarA = ((s40) this.f16708e).a();
                p9.a aVar = (p9.a) ((fx1) this.f16707d).zzb();
                if (((Boolean) zzba.zzc().a(am.R)).booleanValue()) {
                    return new qx0(zzjVarZzb, scheduledExecutorService, uo0VarA, aVar);
                }
                return null;
            case 1:
                yv0 yv0Var = (yv0) ((fx1) this.f16705b).zzb();
                fe1 fe1Var = (fe1) this.f16706c.zzb();
                gz gzVar = (gz) this.f16707d;
                return new po0(yv0Var, fe1Var, ((a70) this.f16708e).a(), new bn0((Context) gzVar.f15002b.zzb(), 0, (k70) gzVar.f15003c.f15424a), 0);
            case 2:
                yv0 yv0Var2 = (yv0) ((fx1) this.f16705b).zzb();
                fe1 fe1Var2 = (fe1) this.f16706c.zzb();
                gz gzVar2 = (gz) this.f16707d;
                return new po0(yv0Var2, fe1Var2, ((a70) this.f16708e).a(), new gn0((Context) gzVar2.f15002b.zzb(), (y70) gzVar2.f15003c.f15424a), 0);
            case 3:
                return new e80(((t80) this.f16706c).a(), (ma0) ((fx1) this.f16705b).zzb(), (ya0) ((fx1) this.f16707d).zzb(), (eb0) ((fx1) this.f16708e).zzb());
            case 4:
                return new c90((p9.a) this.f16706c.zzb(), (d90) this.f16707d.zzb(), ((z90) this.f16708e).a(), (String) ((fx1) this.f16705b).zzb());
            case 5:
                yv0 yv0Var3 = (yv0) ((fx1) this.f16705b).zzb();
                fe1 fe1Var3 = (fe1) this.f16706c.zzb();
                gz gzVar3 = (gz) this.f16707d;
                return new po0(yv0Var3, fe1Var3, ((a70) this.f16708e).a(), new bn0((Context) gzVar3.f15002b.zzb(), 1, (ed0) gzVar3.f15003c.f15424a), 0);
            case 6:
                eh0 eh0Var = (eh0) this.f16706c.zzb();
                ng0 ng0Var = (ng0) ((vd0) this.f16707d).f21153b.f20920d;
                ic1.h(ng0Var);
                f70 f70Var = (f70) ((fx1) this.f16705b).zzb();
                td0 td0Var = (td0) ((wd0) this.f16708e).f21494b.zzb();
                ic1.h(td0Var);
                return new ze0(eh0Var, ng0Var, f70Var, td0Var);
            case 7:
                return new hg0(((o40) this.f16706c).a(), ((e60) this.f16705b).a(), ((te0) this.f16707d).a(), (ee0) ((er0) this.f16708e).zzb());
            case 8:
                return new ig0((String) ((t80) this.f16706c).f20240b.f21276d, (ee0) ((er0) this.f16705b).zzb(), ((e60) this.f16707d).a(), (yh0) this.f16708e.zzb());
            case 9:
                yv0 yv0Var4 = (yv0) ((fx1) this.f16705b).zzb();
                fe1 fe1Var4 = (fe1) this.f16706c.zzb();
                gz gzVar4 = (gz) this.f16707d;
                return new po0(yv0Var4, fe1Var4, ((a70) this.f16708e).a(), new bn0((Context) gzVar4.f15002b.zzb(), 2, (xg0) gzVar4.f15003c.f15424a), 0);
            case 10:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new ci0(k00Var, (zzu) this.f16706c.zzb(), ((CsiParamDefaults_Factory) this.f16705b).zzb(), ((CsiUrlBuilder_Factory) this.f16707d).zzb(), ((o40) this.f16708e).a());
            case 11:
                return new ak0((zj0) ((fx1) this.f16705b).zzb(), (yh0) ((fx1) this.f16707d).zzb(), ((o40) this.f16708e).a(), ((k40) this.f16706c).zzb());
            case 12:
                return new zl0(((o40) this.f16706c).a(), (ul0) ((fx1) this.f16705b).zzb(), (zzu) this.f16708e.zzb(), (yh0) ((fx1) this.f16707d).zzb());
            case 13:
                return a();
            case 14:
                return new po0((yv0) ((fx1) this.f16705b).zzb(), (fe1) this.f16706c.zzb(), (jm) ((to0) this.f16707d).f20449b.f20013b, new b21((ed0) ((ni0) this.f16708e).f17835b.f15424a, 28), 1);
            case 15:
                return new kw0(((o40) this.f16706c).a(), ((u40) this.f16708e).a(), (mh0) ((fx1) this.f16705b).zzb(), new jq(11), (h40) ((fx1) this.f16707d).zzb());
            case 16:
                return new zx0((gy0) ((fx1) this.f16705b).zzb(), ((s40) this.f16708e).a(), ((o40) this.f16706c).a(), (p9.a) ((fx1) this.f16707d).zzb());
            case 17:
                return new c31(fx1.b((lx1) this.f16706c), fx1.b((lx1) this.f16707d), (ExecutorService) ((hx1) this.f16708e).f15424a, fx1.b((fx1) this.f16705b));
            default:
                fx1 fx1Var = (fx1) this.f16706c;
                fx1 fx1Var2 = (fx1) this.f16707d;
                dx1 dx1VarB = fx1.b((fx1) this.f16705b);
                dx1 dx1VarB2 = fx1.b(fx1Var2);
                dx1 dx1VarB3 = fx1.b(fx1Var);
                h21 h21Var = (h21) this.f16708e.zzb();
                return new z41(dx1VarB, dx1VarB2, dx1VarB3, h21Var.W().z(), h21Var.W().C());
        }
    }

    public l40(fx1 fx1Var, s40 s40Var, o40 o40Var, fx1 fx1Var2) {
        this.f16704a = 16;
        this.f16705b = fx1Var;
        this.f16708e = s40Var;
        this.f16706c = o40Var;
        this.f16707d = fx1Var2;
    }

    public l40(fx1 fx1Var, vd0 vd0Var, fx1 fx1Var2, wd0 wd0Var) {
        this.f16704a = 6;
        this.f16706c = fx1Var;
        this.f16707d = vd0Var;
        this.f16705b = fx1Var2;
        this.f16708e = wd0Var;
    }

    public l40(fx1 fx1Var, fx1 fx1Var2, o40 o40Var, k40 k40Var) {
        this.f16704a = 11;
        this.f16705b = fx1Var;
        this.f16707d = fx1Var2;
        this.f16708e = o40Var;
        this.f16706c = k40Var;
    }

    public l40(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, hx1 hx1Var) {
        this.f16704a = 18;
        this.f16705b = fx1Var;
        this.f16707d = fx1Var2;
        this.f16706c = fx1Var3;
        this.f16708e = hx1Var;
    }

    public /* synthetic */ l40(fx1 fx1Var, kx1 kx1Var, kx1 kx1Var2, gx1 gx1Var, int i10) {
        this.f16704a = i10;
        this.f16705b = fx1Var;
        this.f16706c = kx1Var;
        this.f16707d = kx1Var2;
        this.f16708e = gx1Var;
    }

    public /* synthetic */ l40(gx1 gx1Var, fx1 fx1Var, kx1 kx1Var, fx1 fx1Var2, int i10) {
        this.f16704a = i10;
        this.f16706c = gx1Var;
        this.f16705b = fx1Var;
        this.f16708e = kx1Var;
        this.f16707d = fx1Var2;
    }

    public /* synthetic */ l40(kx1 kx1Var, kx1 kx1Var2, gx1 gx1Var, fx1 fx1Var, int i10) {
        this.f16704a = i10;
        this.f16706c = kx1Var;
        this.f16707d = kx1Var2;
        this.f16708e = gx1Var;
        this.f16705b = fx1Var;
    }

    public /* synthetic */ l40(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4, int i10) {
        this.f16704a = i10;
        this.f16706c = kx1Var;
        this.f16705b = kx1Var2;
        this.f16707d = kx1Var3;
        this.f16708e = kx1Var4;
    }
}
