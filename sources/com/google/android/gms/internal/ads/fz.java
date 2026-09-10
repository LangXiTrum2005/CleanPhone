package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fz implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f14601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f14602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f14603d;

    public fz(fx1 fx1Var, fx1 fx1Var2, hx1 hx1Var) {
        this.f14600a = 28;
        this.f14602c = fx1Var;
        this.f14603d = fx1Var2;
        this.f14601b = hx1Var;
    }

    public hz a() {
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        tf0 tf0VarA = ((uf0) this.f14601b).zzb();
        oz ozVar = (oz) this.f14602c;
        ic1.h(k00Var);
        return new hz(k00Var, tf0VarA, new vu0(k00Var, ((uf0) ozVar.f18413b).zzb(), (wh0) ((fx1) ozVar.f18414c).zzb(), 16), (wh0) ((fx1) this.f14603d).zzb(), 6);
    }

    public tp0 b() {
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new tp0(k00Var, ((o40) this.f14601b).a(), ((z90) this.f14602c).a(), (ViewGroup) ((vf) ((e60) this.f14603d).f13858b).f21157b, 0);
    }

    public zp0 c() {
        ic1.h(((mx) ((ps0) this.f14601b).f18793b.f5411c).f17569d);
        f00 f00Var = (f00) this.f14602c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f14603d.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new zp0(f00Var, scheduledExecutorService, k00Var);
    }

    public tp0 d() {
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new tp0(k00Var, (ViewGroup) ((vf) ((e60) this.f14601b).f13858b).f21157b, (Context) ((fx1) this.f14602c).zzb(), ((lx1) this.f14603d).zzb());
    }

    public tp0 e() {
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new tp0(k00Var, ((o40) this.f14601b).a(), (bk0) ((fx1) this.f14602c).zzb(), (String) ((fx1) this.f14603d).zzb(), 7);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Set setSingleton;
        switch (this.f14600a) {
            case 0:
                zzg zzgVar = (zzg) ((hx1) this.f14602c).f15424a;
                return new ez(zzgVar);
            case 1:
                VersionInfoParcel versionInfoParcelA = ((u40) this.f14601b).a();
                JSONObject jSONObject = (JSONObject) ((fx1) this.f14602c).zzb();
                String str = (String) ((gx1) this.f14603d).zzb();
                boolean zEquals = IronSourceConstants.EVENTS_NATIVE.equals(str);
                zzt.zzc();
                return new yh(UUID.randomUUID().toString(), versionInfoParcelA, str, jSONObject, zEquals);
            case 2:
                return new x70((b30) ((u70) this.f14601b).f20672b.f15436e, (yh0) this.f14602c.zzb(), ((t80) this.f14603d).a());
            case 3:
                Context context = (Context) this.f14601b.zzb();
                VersionInfoParcel versionInfoParcelA2 = ((u40) this.f14602c).a();
                du0 du0VarA = ((t80) this.f14603d).a();
                az azVar = du0VarA.A;
                if (azVar == null) {
                    return null;
                }
                hu0 hu0Var = du0VarA.f13708s;
                return new zy(context, versionInfoParcelA2, azVar, hu0Var != null ? hu0Var.f15395b : null);
            case 4:
                ja0 ja0Var = new ja0(((ca0) this.f14601b).f13121b.zzb());
                Set setZzb = ((lx1) this.f14602c).zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new ka0(ja0Var, setZzb, k00Var, (ScheduledExecutorService) this.f14603d.zzb());
            case 5:
                return new cb0(((lx1) this.f14601b).zzb(), ((t80) this.f14602c).a(), ((t80) this.f14603d).b());
            case 6:
                return new oc0((Context) this.f14601b.zzb(), ((lx1) this.f14602c).zzb(), ((t80) this.f14603d).a());
            case 7:
                je0 je0VarA = ((e60) this.f14601b).a();
                ke0 ke0Var = (ke0) ((g90) this.f14602c).f14800b.zzb();
                ic1.h(ke0Var);
                Executor executor = (Executor) this.f14603d.zzb();
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new ff0(je0VarA, ke0Var, executor, k00Var2);
            case 8:
                return a();
            case 9:
                int i10 = ((z90) this.f14603d).a().f18374p.f38703b;
                if (i10 != 0) {
                    return i10 + (-1) != 0 ? ((l40) this.f14602c).a() : ((l40) this.f14601b).a();
                }
                throw null;
            case 10:
                String str2 = ((mx) ((ps0) this.f14601b).f18793b.f5411c).f17573h;
                ic1.h(str2);
                Context contextA = ((o40) this.f14602c).a();
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                Map mapZzb = ((ix1) this.f14603d).zzb();
                if (((Boolean) zzba.zzc().a(am.f12225k6)).booleanValue()) {
                    pj pjVar = new pj(new t6.l(contextA, 5));
                    synchronized (pjVar) {
                        if (pjVar.f18694c) {
                            try {
                                ml mlVar = pjVar.f18693b;
                                mlVar.b();
                                ((nl) mlVar.f19193b).A(str2);
                            } catch (NullPointerException e10) {
                                zzt.zzh().d("AdMobClearcutLogger.modify", e10);
                            }
                        }
                        break;
                    }
                    setSingleton = Collections.singleton(new nc0(new sh0(pjVar, mapZzb), k00Var3));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                ic1.h(setSingleton);
                return setSingleton;
            case 11:
                Context contextA2 = ((o40) this.f14601b).a();
                WeakReference weakReference = ((m40) this.f14602c).f17239b.f15968d;
                ic1.h(weakReference);
                oj0 oj0Var = (oj0) ((fx1) this.f14603d).zzb();
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new vj0(contextA2, weakReference, oj0Var, k00Var4);
            case 12:
                return b();
            case 13:
                n40 n40Var = (n40) this.f14601b;
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                hq0 hq0Var = new hq0(k00Var5, n40Var.f17639b.a(), 2);
                p9.a aVar = (p9.a) ((fx1) this.f14602c).zzb();
                ic1.h(k00Var5);
                return new xq0(hq0Var, ((Long) xm.f21923c.o()).longValue(), aVar, k00Var5, (yh0) ((fx1) this.f14603d).zzb());
            case 14:
                Context contextA3 = ((n40) this.f14601b).f17639b.a();
                k00 k00Var6 = l00.f16608a;
                ic1.h(k00Var6);
                hq0 hq0Var2 = new hq0(contextA3, k00Var6, 6);
                p9.a aVar2 = (p9.a) ((fx1) this.f14602c).zzb();
                ic1.h(k00Var6);
                return new xq0(hq0Var2, 2147483647L, aVar2, k00Var6, (yh0) ((fx1) this.f14603d).zzb());
            case 15:
                tp0 tp0VarE = ((fz) this.f14601b).e();
                p9.a aVar3 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var7 = l00.f16608a;
                ic1.h(k00Var7);
                return new xq0(tp0VarE, ((Long) xm.f21924d.o()).longValue(), aVar3, k00Var7, (yh0) ((fx1) this.f14603d).zzb());
            case 16:
                qp0 qp0Var = new qp0(((o40) ((sp0) this.f14601b).f20016a).a(), 0);
                p9.a aVar4 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var8 = l00.f16608a;
                ic1.h(k00Var8);
                return new xq0(qp0Var, 2147483647L, aVar4, k00Var8, (yh0) ((fx1) this.f14603d).zzb());
            case 17:
                jq0 jq0VarZzb = ((lq0) this.f14601b).zzb();
                p9.a aVar5 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var9 = l00.f16608a;
                ic1.h(k00Var9);
                return new xq0(jq0VarZzb, ((Long) xm.f21921a.o()).longValue(), aVar5, k00Var9, (yh0) ((fx1) this.f14603d).zzb());
            case 18:
                jq0 jq0VarZzb2 = ((rq0) this.f14601b).zzb();
                p9.a aVar6 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var10 = l00.f16608a;
                ic1.h(k00Var10);
                return new xq0(jq0VarZzb2, 2147483647L, aVar6, k00Var10, (yh0) ((fx1) this.f14603d).zzb());
            case 19:
                hq0 hq0VarZzb = ((tq0) this.f14601b).zzb();
                p9.a aVar7 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var11 = l00.f16608a;
                ic1.h(k00Var11);
                return new xq0(hq0VarZzb, ((Long) xm.f21922b.o()).longValue(), aVar7, k00Var11, (yh0) ((fx1) this.f14603d).zzb());
            case 20:
                jq0 jq0VarZzb3 = ((ir0) this.f14601b).zzb();
                p9.a aVar8 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var12 = l00.f16608a;
                ic1.h(k00Var12);
                return new xq0(jq0VarZzb3, ((Long) xm.f21925e.o()).longValue(), aVar8, k00Var12, (yh0) ((fx1) this.f14603d).zzb());
            case 21:
                zp0 zp0VarZzb = ((qr0) this.f14601b).zzb();
                p9.a aVar9 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var13 = l00.f16608a;
                ic1.h(k00Var13);
                return new xq0(zp0VarZzb, 2147483647L, aVar9, k00Var13, (yh0) ((fx1) this.f14603d).zzb());
            case 22:
                tp0 tp0VarZzb = ((yr0) this.f14601b).zzb();
                p9.a aVar10 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var14 = l00.f16608a;
                ic1.h(k00Var14);
                return new xq0(tp0VarZzb, ((Long) xm.f21927g.o()).longValue(), aVar10, k00Var14, (yh0) ((fx1) this.f14603d).zzb());
            case 23:
                hq0 hq0VarZzb2 = ((fs0) this.f14601b).zzb();
                p9.a aVar11 = (p9.a) ((fx1) this.f14602c).zzb();
                k00 k00Var15 = l00.f16608a;
                ic1.h(k00Var15);
                return new xq0(hq0VarZzb2, ((Long) xm.f21928h.o()).longValue(), aVar11, k00Var15, (yh0) ((fx1) this.f14603d).zzb());
            case 24:
                return d();
            case 25:
                return e();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return c();
            case 27:
                return new bu0((yt0) ((fx1) this.f14601b).zzb(), (ut0) ((fx1) this.f14602c).zzb(), (ku0) ((fx1) this.f14603d).zzb());
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                t21 t21Var = ((h21) ((hx1) this.f14601b).f15424a).h0() ? (t21) fx1.b((fx1) this.f14602c).zzb() : (t21) fx1.b((fx1) this.f14603d).zzb();
                ic1.h(t21Var);
                return t21Var;
            default:
                Context context2 = (Context) ((hx1) this.f14601b).f15424a;
                return new x61(context2, (ExecutorService) ((hx1) this.f14602c).f15424a, x61.f21756g);
        }
    }

    public fz(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2) {
        this.f14600a = 29;
        this.f14601b = hx1Var;
        this.f14603d = fx1Var;
        this.f14602c = hx1Var2;
    }

    public /* synthetic */ fz(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, int i10) {
        this.f14600a = i10;
        this.f14601b = kx1Var;
        this.f14602c = kx1Var2;
        this.f14603d = kx1Var3;
    }
}
