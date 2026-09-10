package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13858b;

    public /* synthetic */ e60(Object obj, int i10) {
        this.f13857a = i10;
        this.f13858b = obj;
    }

    public je0 a() {
        je0 je0Var = (je0) ((so0) this.f13858b).f20013b;
        ic1.h(je0Var);
        return je0Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Object ja1Var;
        int i10 = this.f13857a;
        int i11 = 5;
        int i12 = 4;
        int i13 = 8;
        Object obj = this.f13858b;
        switch (i10) {
            case 0:
                return new d60(new mm0(((o40) ((v50) obj).f21035b).a()), 0);
            case 1:
                return (ViewGroup) ((vf) obj).f21157b;
            case 2:
                return ((q70) obj).a();
            case 3:
                fz fzVar = (fz) obj;
                return new nc0(new x70((b30) ((u70) fzVar.f14601b).f20672b.f15436e, (yh0) fzVar.f14602c.zzb(), ((t80) fzVar.f14603d).a()), l00.f16608a);
            case 4:
                oz ozVar = (oz) obj;
                a80 a80Var = new a80((b30) ((u70) ozVar.f18413b).f20672b.f15436e, (Executor) ozVar.f18414c.zzb());
                if (((Boolean) zzba.zzc().a(am.f12275ne)).booleanValue()) {
                    nc0 nc0Var = new nc0(a80Var, l00.f16608a);
                    int i14 = ia1.f15692c;
                    ja1Var = new ja1(nc0Var);
                } else {
                    int i15 = ia1.f15692c;
                    ja1Var = eb1.f13923j;
                }
                ic1.h(ja1Var);
                return ja1Var;
            case 5:
                return ((j90) obj).a();
            case 6:
                w70 w70Var = (w70) obj;
                return new i80(new iz(((o40) w70Var.f21437b).a(), ((z90) w70Var.f21438c).a().f18366g));
            case 7:
                return new n80(((ix1) obj).zzb());
            case 8:
                return new n90(((t80) obj).b());
            case 9:
                return (md0) obj;
            case 10:
                ne0 ne0Var = (ne0) ((od0) obj).f18238a.f17399b;
                ic1.h(ne0Var);
                Set setSingleton = ne0Var.f17784d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                ic1.h(setSingleton);
                return setSingleton;
            case 11:
                ke0 ke0Var = (ke0) ((g90) obj).f14800b.zzb();
                ic1.h(ke0Var);
                JSONObject jSONObject = ke0Var.f16413b;
                if (jSONObject != null) {
                    return jSONObject;
                }
                try {
                    return new JSONObject(ke0Var.f16874a.f13721z);
                } catch (JSONException unused) {
                    return null;
                }
            case 12:
                yd0 yd0Var = new yd0(((zd0) obj).f22581b.a());
                ge0 ge0Var = new ge0();
                ge0Var.f14835a = yd0Var;
                return ge0Var;
            case 13:
                je0 je0Var = (je0) ((so0) obj).f20013b;
                ic1.h(je0Var);
                return je0Var;
            case 14:
                return new k60((b30) ((gx1) obj).zzb(), 1);
            case 15:
                return new nc0(new k60((b30) ((gx1) ((e60) obj).f13858b).zzb(), 1), l00.f16613f);
            case 16:
                g40 g40Var = (g40) obj;
                s0.i iVar = (s0.i) g40Var.f14752b.zzb();
                ExecutorService executorService = l00.f16614g;
                ic1.h(executorService);
                return new jh0(new w11(iVar, new wv0(executorService, 2), (kh0) g40Var.f14753c.zzb(), new tt0((byte) 0, 4)));
            case 17:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                oz ozVar2 = (oz) obj;
                Set setSingleton2 = ((Boolean) zzba.zzc().a(am.f12225k6)).booleanValue() ? Collections.singleton(new nc0(new sh0((pj) ((fx1) ozVar2.f18413b).zzb(), ((ix1) ozVar2.f18414c).zzb()), k00Var)) : Collections.EMPTY_SET;
                ic1.h(setSingleton2);
                return setSingleton2;
            case 18:
                w70 w70Var2 = (w70) obj;
                vk0 vk0Var = new vk0(((o40) w70Var2.f21437b).a(), (kz) w70Var2.f21438c.zzb());
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new nc0(vk0Var, k00Var2);
            case 19:
                oz ozVar3 = (oz) obj;
                pl0 pl0Var = (pl0) ((fx1) ozVar3.f18413b).zzb();
                oz ozVar4 = (oz) ozVar3.f18414c;
                sh0 sh0Var = new sh0(pl0Var, new ql0(((oz) ozVar4.f18413b).a(), ((k40) ozVar4.f18414c).zzb()));
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                return new nc0(sh0Var, k00Var3);
            case 20:
                return new qp0(((x90) obj).f21797b.f21464c, 5);
            case 21:
                ic1.h(l00.f16608a);
                ic1.h(((mx) ((ps0) obj).f18793b.f5411c).f17569d);
                return new os0();
            case 22:
                final Context context = ((m40) obj).f17239b.f15966b;
                ic1.h(context);
                ExecutorService executorService2 = l00.f16614g;
                ic1.h(executorService2);
                return s0.j.c(g11.f14656a, null, null, cn.d0.b(new cn.z0(executorService2)), new jk.a() { // from class: com.google.android.gms.internal.ads.h11
                    @Override // jk.a
                    public final /* synthetic */ Object invoke() {
                        return x7.a.l(context, "ad_quality_data.pb");
                    }
                }, 6);
            case 23:
                m31 m31Var = (m31) ((fx1) new hz((ac0) ((at0) ((i21) obj).zzb()).f12510b).f15435d).zzb();
                ic1.h(m31Var);
                return m31Var;
            case 24:
                ac0 ac0Var = (ac0) ((x11) ((i21) obj).zzb()).f21703b;
                hx1 hx1Var = (hx1) ac0Var.f11978b;
                hx1 hx1Var2 = (hx1) ac0Var.f11980d;
                int i16 = 7;
                fx1 fx1VarA = fx1.a(new do0(hx1Var, hx1Var2, (fx1) ac0Var.f11984h, i16));
                fx1 fx1VarA2 = fx1.a(new a70(hx1Var, fx1VarA, 13));
                fx1 fx1Var = (fx1) ac0Var.f11985i;
                fx1 fx1Var2 = (fx1) ac0Var.f11979c;
                hx1 hx1Var3 = (hx1) ac0Var.f11981e;
                fx1 fx1VarA3 = fx1.a(new xd0(fx1VarA2, fx1Var, fx1Var2, hx1Var3, 1));
                fx1 fx1Var3 = (fx1) ac0Var.f11989n;
                fx1 fx1VarA4 = fx1.a(new er0(fx1Var3, 17));
                fx1 fx1Var4 = (fx1) ac0Var.f11990o;
                fx1 fx1VarA5 = fx1.a(new k51(fx1.a(new og0(fx1.a(new tm(fx1VarA4, fx1Var4, fx1Var, 6)), fx1.a(new tm(fx1.a(new er0(fx1Var3, 19)), fx1Var4, fx1Var, i16)), fx1.a(new tm(fx1.a(new er0(fx1Var3, 21)), fx1Var4, fx1Var, i13)), fx1.a(new tm(fx1.a(new er0(fx1Var3, 14)), fx1Var4, fx1Var, 3)), fx1.a(new tm(fx1.a(new er0(fx1Var3, 15)), fx1Var4, fx1Var, i12)), fx1.a(new tm(fx1.a(new er0(fx1Var3, 16)), fx1Var4, fx1Var, i11)), fx1.a(new er0(fx1Var3, 18)), hx1Var2, fx1Var)), fx1.a(new tm(fx1.a(new tm(fx1VarA2, fx1Var, hx1Var)), hx1Var2, fx1Var, 9)), hx1Var3, 1));
                fx1 fx1VarA6 = fx1.a(new er0(fx1Var3, 20));
                fx1 fx1VarA7 = fx1.a(v71.f21096t);
                m31 m31Var2 = (m31) fx1.a(new l40(fx1.a(new n60(fx1VarA3, fx1.a(new j90(hx1Var, fx1VarA2, fx1VarA5, fx1Var, hx1Var2, fx1.a(new k51(fx1VarA6, fx1VarA7, fx1Var, 0)), fx1VarA)), fx1VarA5, fx1Var, (fx1) ac0Var.f11982f, hx1Var3)), fx1.a(new e70(fx1.a(new e70(hx1Var, fx1.a(new do0(hx1Var, hx1Var3, (fx1) ac0Var.f11987k, 6)), fx1VarA, hx1Var3, fx1VarA7)), fx1VarA5, fx1VarA3, fx1Var, hx1Var2, 2)), fx1VarA5, hx1Var3)).zzb();
                ic1.h(m31Var2);
                return m31Var2;
            default:
                ac0 ac0Var2 = (ac0) ((wv0) ((i21) obj).zzb()).f21612b;
                fx1 fx1Var5 = (fx1) ac0Var2.f11979c;
                fx1 fx1Var6 = (fx1) ac0Var2.f11985i;
                hx1 hx1Var4 = (hx1) ac0Var2.f11981e;
                fx1 fx1VarA8 = fx1.a(new do0(fx1Var5, fx1Var6, hx1Var4, i13));
                fx1 fx1VarA9 = fx1.a(pi1.M);
                hx1 hx1Var5 = (hx1) ac0Var2.f11978b;
                hx1 hx1Var6 = (hx1) ac0Var2.f11980d;
                fx1 fx1VarA10 = fx1.a(new n60(hx1Var5, hx1Var6, hx1Var4, (fx1) ac0Var2.f11983g, fx1Var6, fx1VarA9));
                fx1 fx1Var7 = (fx1) ac0Var2.f11989n;
                fx1 fx1VarA11 = fx1.a(new er0(fx1Var7, 22));
                fx1 fx1Var8 = (fx1) ac0Var2.f11990o;
                fx1 fx1VarA12 = fx1.a(new e70(fx1.a(new tm(fx1VarA11, fx1Var8, fx1Var6, 10)), fx1.a(new tm(fx1.a(new er0(fx1Var7, 23)), fx1Var8, fx1Var6, 11)), fx1.a(new tm(fx1.a(new er0(fx1Var7, 24)), fx1Var8, fx1Var6, 12)), hx1Var6, fx1Var6, 3));
                m31 m31Var3 = (m31) fx1.a(new l40(fx1.a(new n60(fx1VarA8, fx1VarA10, fx1VarA12, fx1Var6, (fx1) ac0Var2.f11982f, hx1Var4)), fx1.a(new j90((fx1) ac0Var2.f11984h, fx1VarA8, fx1VarA12, (fx1) ac0Var2.f11987k, fx1Var6, hx1Var4, hx1Var6)), fx1VarA12, hx1Var4)).zzb();
                ic1.h(m31Var3);
                return m31Var3;
        }
    }
}
