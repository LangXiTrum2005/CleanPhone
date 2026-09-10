package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oz implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f18414c;

    public /* synthetic */ oz(Object obj, kx1 kx1Var, int i10) {
        this.f18412a = i10;
        this.f18413b = obj;
        this.f18414c = kx1Var;
    }

    public lj1 a() {
        return new lj1((Object) new nl0(((o40) ((v50) this.f18413b).f21035b).a()), false, this.f18414c.zzb(), 23);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        View view;
        switch (this.f18412a) {
            case 0:
                Context context = (Context) ((hx1) this.f18413b).f15424a;
                gz gzVar = (gz) this.f18414c;
                return new nz(context, new lj1(gzVar.f15003c.f15424a, false, gzVar.f15002b.zzb(), 11));
            case 1:
                return new w50(((ix1) this.f18413b).zzb(), ((ix1) this.f18414c).zzb());
            case 2:
                return ((hz) this.f18413b).l(((lx1) this.f18414c).zzb());
            case 3:
                return new vp0(((fz) this.f18413b).b(), ((Integer) zzba.zzc().a(am.f12156fe)).intValue(), (ScheduledExecutorService) this.f18414c.zzb());
            case 4:
                return new vp0(new qp0(((zg0) this.f18413b).f22603b.a(), 2), ((Integer) zzba.zzc().a(am.f12232ke)).intValue(), (ScheduledExecutorService) this.f18414c.zzb());
            case 5:
                return new vp0(((fz) this.f18413b).d(), ((Integer) zzba.zzc().a(am.f12172ge)).intValue(), (ScheduledExecutorService) this.f18414c.zzb());
            case 6:
                Boolean bool = (Boolean) zzba.zzc().a(am.K6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((q70) this.f18413b).c() : ((l40) this.f18414c).a();
            case 7:
                return new a80((b30) ((u70) this.f18413b).f20672b.f15436e, (Executor) this.f18414c.zzb());
            case 8:
                String str = (String) ((fx1) this.f18414c).zzb();
                sm0 sm0Var = ((w90) this.f18413b).f21467f;
                return sm0Var != null ? sm0Var : new sm0(str);
            case 9:
                ((o40) this.f18414c).a();
                Context context2 = ((w90) this.f18413b).f21462a;
                ic1.h(context2);
                return context2;
            case 10:
                Set setZzb = ((lx1) this.f18414c).zzb();
                bc0 bc0Var = (bc0) this.f18413b;
                if (bc0Var.f12733p == null) {
                    bc0Var.f12733p = new ga0(setZzb);
                }
                ga0 ga0Var = bc0Var.f12733p;
                ic1.h(ga0Var);
                return ga0Var;
            case 11:
                return new zc0((jh0) ((kx1) this.f18413b).zzb(), ((t80) this.f18414c).f20240b.n());
            case 12:
                Set setO = ((lj1) this.f18413b).o((m90) ((fx1) this.f18414c).zzb());
                ic1.h(setO);
                return setO;
            case 13:
                return new nc0(new r70((b30) ((lj1) this.f18413b).f17037c, 1), (Executor) this.f18414c.zzb());
            case 14:
                du0 du0VarA = ((t80) this.f18413b).a();
                JSONObject jSONObject = (JSONObject) ((vd0) this.f18414c).f21153b.f20919c;
                ic1.h(jSONObject);
                return new ke0(du0VarA, jSONObject);
            case 15:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new vu0(k00Var, ((uf0) this.f18413b).zzb(), (wh0) ((fx1) this.f18414c).zzb(), 16);
            case 16:
                ee0 ee0Var = (ee0) ((er0) this.f18413b).zzb();
                je0 je0VarA = ((e60) this.f18414c).a();
                dg0 dg0Var = new dg0("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (je0VarA) {
                    view = je0VarA.f16063o;
                }
                dg0Var.f13516a = view;
                dg0Var.f13517b = je0VarA.r();
                dg0Var.f13518c = ee0Var;
                dg0Var.f13519d = false;
                dg0Var.f13520e = false;
                if (je0VarA.h() != null) {
                    je0VarA.h().R(dg0Var);
                }
                return dg0Var;
            case 17:
                return new tg0((qa0) ((fx1) this.f18413b).zzb(), ((t80) this.f18414c).a());
            case 18:
                return new nh0(vu0.h(((n40) this.f18413b).f17639b.a()), (mh0) ((fx1) this.f18414c).zzb());
            case 19:
                return new sh0((pj) ((fx1) this.f18413b).zzb(), ((ix1) this.f18414c).zzb());
            case 20:
                return new oi0((g50) ((hx1) this.f18413b).f15424a, new so0((dr) ((ni0) this.f18414c).f17835b.f15424a, 24));
            case 21:
                k00 k00Var2 = l00.f16609b;
                ic1.h(k00Var2);
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                return new uw(k00Var2, k00Var3, new ok0((Context) ((ej0) this.f18413b).f13995b.zzb(), k00Var3, 0), fx1.b((d80) this.f18414c), 8);
            case 22:
                Map map = ((jx1) this.f18413b).f14102a;
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new wk0(map, k00Var4, new lb0(((ca0) this.f18414c).f13121b.zzb()));
            case 23:
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                return new vu0(k00Var5, ((v50) this.f18413b).a(), fx1.b((d80) this.f18414c), 17);
            case 24:
                return a();
            case 25:
                return new ol0(((d80) this.f18413b).b(), ((k40) this.f18414c).zzb());
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return new ql0(((oz) this.f18413b).a(), ((k40) this.f18414c).zzb());
            case 27:
                pl0 pl0Var = (pl0) ((fx1) this.f18413b).zzb();
                oz ozVar = (oz) this.f18414c;
                return new sh0(pl0Var, new ql0(((oz) ozVar.f18413b).a(), ((k40) ozVar.f18414c).zzb()));
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                oe0 oe0Var = (oe0) this.f18413b;
                k00 k00Var6 = l00.f16608a;
                ic1.h(k00Var6);
                ou0 ou0VarA = oe0Var.f18240b.a();
                return new vp0(new xp0(k00Var6, ou0VarA, 0), ((Integer) zzba.zzc().a(am.f12105ce)).intValue(), (ScheduledExecutorService) this.f18414c.zzb());
            default:
                return new vp0(((ik0) this.f18413b).a(), ((Integer) zzba.zzc().a(am.f12090be)).intValue(), (ScheduledExecutorService) this.f18414c.zzb());
        }
    }
}
