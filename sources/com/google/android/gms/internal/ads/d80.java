package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d80 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f13459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f13460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f13461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f13462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13463f;

    public d80(o40 o40Var, u40 u40Var, t80 t80Var, gx1 gx1Var, fx1 fx1Var) {
        this.f13458a = 10;
        this.f13461d = o40Var;
        this.f13462e = u40Var;
        this.f13460c = t80Var;
        this.f13463f = gx1Var;
        this.f13459b = fx1Var;
    }

    public aa0 a() {
        return new aa0(((t80) this.f13460c).a(), (String) ((t80) this.f13463f).f20240b.f21276d, (sm0) this.f13461d.zzb(), ((t80) this.f13459b).f20240b.n(), (String) this.f13462e.zzb());
    }

    public rl0 b() {
        return new rl0(((o40) this.f13461d).a(), ((t90) this.f13463f).zzb(), (pl0) ((fx1) this.f13459b).zzb(), ((oz) this.f13460c).a(), ((k40) this.f13462e).zzb());
    }

    public is0 c() {
        zz zzVar = new zz();
        Context contextA = ((o40) this.f13461d).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13462e.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new is0(zzVar, contextA, scheduledExecutorService, k00Var, ((ps0) this.f13463f).f18793b.f5410b, ((mx) ((ps0) this.f13460c).f18793b.f5411c).l, ((mx) ((ps0) this.f13459b).f18793b.f5411c).f17576k);
    }

    public qs0 d() {
        f00 f00Var = (f00) this.f13461d.zzb();
        boolean z10 = ((mx) ((ps0) this.f13463f).f18793b.f5411c).f17576k;
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        ic1.h(((mx) ((ps0) this.f13460c).f18793b.f5411c).f17569d);
        return new qs0(f00Var, z10, k00Var, (ScheduledExecutorService) this.f13462e.zzb(), ((ps0) this.f13459b).a().intValue());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f13458a) {
            case 0:
                return new c80(((o40) this.f13461d).a(), (b30) ((u70) this.f13463f).f20672b.f15436e, ((t80) this.f13460c).a(), ((u40) this.f13462e).a(), (jm0) ((fx1) this.f13459b).zzb());
            case 1:
                ma0 ma0Var = (ma0) ((fx1) this.f13459b).zzb();
                du0 du0VarA = ((t80) this.f13460c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13461d.zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new m90(ma0Var, du0VarA, scheduledExecutorService, k00Var, (String) ((t80) this.f13462e).f20240b.f21276d, (eb0) ((fx1) this.f13463f).zzb());
            case 2:
                return new q90(((t80) this.f13463f).b(), ((t80) this.f13460c).a(), (p9.a) this.f13461d.zzb(), (yh0) this.f13462e.zzb(), (ScheduledExecutorService) this.f13459b.zzb());
            case 3:
                return a();
            case 4:
                return new hd0(((o40) this.f13461d).a(), (b30) ((cd0) this.f13463f).f13137b.f17037c, ((t80) this.f13460c).a(), ((u40) this.f13462e).a(), (jm0) ((fx1) this.f13459b).zzb());
            case 5:
                Map mapZzb = ((ix1) this.f13461d).zzb();
                Map mapZzb2 = ((ix1) this.f13462e).zzb();
                Map mapZzb3 = ((ix1) this.f13463f).zzb();
                ne0 ne0Var = (ne0) ((od0) this.f13460c).f18238a.f17399b;
                ic1.h(ne0Var);
                return new ld0(mapZzb, mapZzb2, mapZzb3, (fx1) this.f13459b, ne0Var);
            case 6:
                return new yf0((Executor) this.f13461d.zzb(), (f70) ((fx1) this.f13459b).zzb(), (oc0) ((fx1) this.f13462e).zzb(), (m60) ((fx1) this.f13463f).zzb(), (n90) ((fx1) this.f13460c).zzb());
            case 7:
                Context contextA = ((o40) this.f13461d).a();
                String packageName = ((o40) ((v50) this.f13463f).f21035b).a().getPackageName();
                ic1.h(packageName);
                VersionInfoParcel versionInfoParcelA = ((u40) this.f13462e).a();
                qj qjVar = (qj) this.f13460c.zzb();
                String str = (String) ((fx1) this.f13459b).zzb();
                pj pjVar = new pj(new t6.l(contextA, 5));
                gk gkVarA = hk.A();
                int i10 = versionInfoParcelA.buddyApkVersion;
                gkVarA.b();
                ((hk) gkVarA.f19193b).B(i10);
                int i11 = versionInfoParcelA.clientJarVersion;
                gkVarA.b();
                ((hk) gkVarA.f19193b).C(i11);
                int i12 = true != versionInfoParcelA.isClientJar ? 2 : 0;
                gkVarA.b();
                ((hk) gkVarA.f19193b).z(i12);
                pjVar.a(new hz((Object) qjVar, (Object) packageName, gkVarA.e(), (Object) str, 7));
                return pjVar;
            case 8:
                Context contextA2 = ((o40) this.f13461d).a();
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                jq jqVar = new jq(11);
                a50 a50Var = (a50) ((t40) this.f13462e).f20162a.f15424a;
                ic1.h(a50Var);
                return new hl0(contextA2, k00Var2, jqVar, a50Var, new b21(((w40) ((v50) this.f13463f).f21035b).zzb(), 24), (ArrayDeque) this.f13460c.zzb(), (kw0) this.f13459b.zzb());
            case 9:
                return b();
            case 10:
                return new jm0(((o40) this.f13461d).a(), ((u40) this.f13462e).a(), ((t80) this.f13460c).a(), (b30) ((gx1) this.f13463f).zzb(), (yh0) this.f13459b.zzb());
            case 11:
                return new in0((Context) ((fx1) this.f13459b).zzb(), (Executor) this.f13461d.zzb(), (ed0) ((hx1) this.f13463f).f15424a, (cu0) this.f13462e.zzb(), (yh0) this.f13460c.zzb());
            case 12:
                return new xn0((a50) this.f13461d.zzb(), ((x90) this.f13462e).f21797b.a(), ((cc0) this.f13463f).f13134b, (bo0) ((fx1) this.f13459b).zzb(), (sm0) ((fx1) this.f13460c).zzb());
            case 13:
                p9.a aVar = (p9.a) this.f13461d.zzb();
                do0 do0Var = (do0) this.f13460c;
                vu0 vu0Var = new vu0((tu0) do0Var.f13608b.zzb(), (mh0) do0Var.f13609c.zzb(), (yh0) do0Var.f13610d.zzb(), 25);
                sm0 sm0Var = (sm0) ((fx1) this.f13459b).zzb();
                mx0 mx0Var = (mx0) this.f13462e.zzb();
                bo0 bo0Var = (bo0) ((so0) this.f13463f).f20013b;
                return bo0Var != null ? bo0Var : new bo0(aVar, vu0Var, sm0Var, mx0Var);
            case 14:
                return new in0((Context) ((fx1) this.f13459b).zzb(), (y70) ((hx1) this.f13462e).f15424a, (yv0) ((fx1) this.f13463f).zzb(), (fe1) this.f13461d.zzb(), (jm) ((to0) this.f13460c).f20449b.f20013b);
            case 15:
                return new cp0((Context) this.f13461d.zzb(), (zzbh) ((nd0) this.f13462e).f17779a.f17400c, ((z90) ((kx1) this.f13463f)).a(), ((q70) ((e60) this.f13460c).f13858b).a(), (yh0) this.f13459b.zzb());
            case 16:
                return c();
            case 17:
                return d();
            case 18:
                return new rt0((Context) ((hx1) this.f13463f).f15424a, (Executor) this.f13461d.zzb(), (a50) this.f13462e.zzb(), (hp0) ((fx1) this.f13459b).zzb(), (ut0) ((fx1) this.f13460c).zzb(), new nu0());
            case 19:
                Context context = (Context) ((hx1) this.f13461d).f15424a;
                t21 t21Var = (t21) ((fx1) this.f13459b).zzb();
                ExecutorService executorService = (ExecutorService) ((hx1) this.f13462e).f15424a;
                s21 s21Var = (s21) ((fx1) this.f13463f).zzb();
                h21 h21Var = (h21) ((hx1) this.f13460c).f15424a;
                return new g31(context, t21Var, executorService, s21Var, new Random(), h21Var.S().z(), h21Var.S().B(), h21Var.S().C(), h21Var.S().A(), h21Var.Q(), h21Var.K(), h21Var.I() - 1);
            case 20:
                return new q31((h21) ((hx1) this.f13461d).f15424a, (p31) ((fx1) this.f13459b).zzb(), (n31) ((fx1) this.f13462e).zzb(), (ExecutorService) ((hx1) this.f13463f).f15424a, (a71) ((fx1) this.f13460c).zzb());
            default:
                return new o41((xd) ((hx1) this.f13463f).f15424a, (h41) this.f13461d.zzb(), (Map) ((hx1) this.f13460c).f15424a, (Context) this.f13462e.zzb(), (a71) this.f13459b.zzb());
        }
    }

    public d80(o40 o40Var, v50 v50Var, u40 u40Var, kx1 kx1Var, fx1 fx1Var) {
        this.f13458a = 7;
        this.f13461d = o40Var;
        this.f13463f = v50Var;
        this.f13462e = u40Var;
        this.f13460c = kx1Var;
        this.f13459b = fx1Var;
    }

    public d80(t80 t80Var, t80 t80Var2, fx1 fx1Var, t80 t80Var3, fx1 fx1Var2) {
        this.f13458a = 3;
        this.f13460c = t80Var;
        this.f13463f = t80Var2;
        this.f13461d = fx1Var;
        this.f13459b = t80Var3;
        this.f13462e = fx1Var2;
    }

    public d80(t80 t80Var, t80 t80Var2, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3) {
        this.f13458a = 2;
        this.f13463f = t80Var;
        this.f13460c = t80Var2;
        this.f13461d = fx1Var;
        this.f13462e = fx1Var2;
        this.f13459b = fx1Var3;
    }

    public d80(so0 so0Var, kx1 kx1Var, do0 do0Var, fx1 fx1Var, kx1 kx1Var2) {
        this.f13458a = 13;
        this.f13463f = so0Var;
        this.f13461d = kx1Var;
        this.f13460c = do0Var;
        this.f13459b = fx1Var;
        this.f13462e = kx1Var2;
    }

    public d80(fx1 fx1Var, t80 t80Var, fx1 fx1Var2, t80 t80Var2, fx1 fx1Var3) {
        this.f13458a = 1;
        this.f13459b = fx1Var;
        this.f13460c = t80Var;
        this.f13461d = fx1Var2;
        this.f13462e = t80Var2;
        this.f13463f = fx1Var3;
    }

    public d80(fx1 fx1Var, hx1 hx1Var, fx1 fx1Var2, kx1 kx1Var, to0 to0Var) {
        this.f13458a = 14;
        this.f13459b = fx1Var;
        this.f13462e = hx1Var;
        this.f13463f = fx1Var2;
        this.f13461d = kx1Var;
        this.f13460c = to0Var;
    }

    public d80(fx1 fx1Var, kx1 kx1Var, hx1 hx1Var, kx1 kx1Var2, kx1 kx1Var3) {
        this.f13458a = 11;
        this.f13459b = fx1Var;
        this.f13461d = kx1Var;
        this.f13463f = hx1Var;
        this.f13462e = kx1Var2;
        this.f13460c = kx1Var3;
    }

    public /* synthetic */ d80(gx1 gx1Var, gx1 gx1Var2, gx1 gx1Var3, fx1 fx1Var, kx1 kx1Var, int i10) {
        this.f13458a = i10;
        this.f13461d = gx1Var;
        this.f13462e = gx1Var2;
        this.f13463f = gx1Var3;
        this.f13459b = fx1Var;
        this.f13460c = kx1Var;
    }

    public d80(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, fx1 fx1Var2, fx1 fx1Var3) {
        this.f13458a = 18;
        this.f13463f = hx1Var;
        this.f13461d = fx1Var;
        this.f13462e = hx1Var2;
        this.f13459b = fx1Var2;
        this.f13460c = fx1Var3;
    }

    public d80(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, hx1 hx1Var3, fx1 fx1Var2) {
        this.f13458a = 21;
        this.f13463f = hx1Var;
        this.f13461d = fx1Var;
        this.f13460c = hx1Var2;
        this.f13462e = hx1Var3;
        this.f13459b = fx1Var2;
    }

    public d80(kx1 kx1Var, t90 t90Var, fx1 fx1Var, oz ozVar, kx1 kx1Var2) {
        this.f13458a = 9;
        this.f13461d = kx1Var;
        this.f13463f = t90Var;
        this.f13459b = fx1Var;
        this.f13460c = ozVar;
        this.f13462e = kx1Var2;
    }

    public /* synthetic */ d80(kx1 kx1Var, gx1 gx1Var, gx1 gx1Var2, kx1 kx1Var2, kx1 kx1Var3, int i10) {
        this.f13458a = i10;
        this.f13461d = kx1Var;
        this.f13463f = gx1Var;
        this.f13460c = gx1Var2;
        this.f13462e = kx1Var2;
        this.f13459b = kx1Var3;
    }

    public /* synthetic */ d80(kx1 kx1Var, kx1 kx1Var2, gx1 gx1Var, kx1 kx1Var3, kx1 kx1Var4, int i10) {
        this.f13458a = i10;
        this.f13461d = kx1Var;
        this.f13462e = kx1Var2;
        this.f13463f = gx1Var;
        this.f13460c = kx1Var3;
        this.f13459b = kx1Var4;
    }

    public /* synthetic */ d80(Object obj, fx1 fx1Var, Object obj2, Object obj3, Object obj4, int i10) {
        this.f13458a = i10;
        this.f13461d = (kx1) obj;
        this.f13459b = fx1Var;
        this.f13462e = (kx1) obj2;
        this.f13463f = obj3;
        this.f13460c = (kx1) obj4;
    }
}
