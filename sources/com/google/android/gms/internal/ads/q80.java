package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q80 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18982d;

    public /* synthetic */ q80(nm0 nm0Var, du0 du0Var, ju0 ju0Var, tc0 tc0Var, int i10) {
        this.f18979a = i10;
        this.f18980b = nm0Var;
        this.f18981c = du0Var;
        this.f18982d = ju0Var;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) {
        switch (this.f18979a) {
            case 0:
                s80 s80Var = (s80) this.f18980b;
                o8 o8Var = (o8) this.f18981c;
                ListenableFuture listenableFuture = (ListenableFuture) this.f18982d;
                m80 m80Var = (m80) obj;
                s80Var.getClass();
                if (m80Var != null) {
                    o8Var.mo164zzb(m80Var);
                }
                return zw1.v(listenableFuture, ((Long) sn.f20006a.o()).longValue(), TimeUnit.MILLISECONDS, s80Var.f19893b);
            case 1:
                bg0 bg0Var = (bg0) this.f18980b;
                zzb zzbVar = (zzb) this.f18981c;
                bz bzVar = (bz) this.f18982d;
                b30 b30VarA = bg0Var.f12767c.a(zzr.zzb(), null, null);
                kj kjVar = new kj(b30VarA);
                bg0Var.a(b30VarA, zzbVar, bzVar);
                b30VarA.zzP().f14701h = new b21(kjVar, 19);
                b30VarA.loadUrl((String) zzba.zzc().a(am.O4));
                return kjVar;
            case 2:
                ng0 ng0Var = (ng0) this.f18980b;
                String str = (String) this.f18981c;
                JSONObject jSONObject = (JSONObject) this.f18982d;
                b30 b30Var = (b30) obj;
                lq lqVar = ng0Var.f17818h;
                lqVar.getClass();
                m00 m00Var = new m00();
                zzt.zzc();
                String string = UUID.randomUUID().toString();
                lqVar.a(string, new xq(lqVar, m00Var));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", string);
                    jSONObject2.put("args", jSONObject);
                    b30Var.b(str, jSONObject2);
                    break;
                } catch (Exception e10) {
                    m00Var.zzd(e10);
                }
                return m00Var;
            case 3:
                vm0 vm0Var = (vm0) this.f18980b;
                du0 du0Var = (du0) this.f18981c;
                ju0 ju0Var = (ju0) this.f18982d;
                wh0 wh0Var = vm0Var.f21211i;
                ul ulVar = am.V2;
                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "rendering-webview-creation-start");
                }
                eh0 eh0Var = vm0Var.f21204b;
                ou0 ou0Var = vm0Var.f21205c;
                final b30 b30VarA2 = eh0Var.a(ou0Var.f18365f, du0Var, (fu0) ju0Var.f16196b.f20920d);
                b30VarA2.I(du0Var.W);
                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "rendering-webview-creation-end");
                }
                m00 m00Var2 = new m00();
                k70 k70Var = vm0Var.f21203a;
                vu0 vu0Var = new vu0(ju0Var, du0Var, (String) null);
                VersionInfoParcel versionInfoParcel = vm0Var.f21207e;
                boolean z10 = vm0Var.f21209g;
                rq rqVar = vm0Var.f21208f;
                d50 d50Var = (d50) k70Var;
                b50 b50Var = new b50(d50Var.f13403c, d50Var.f13404d, vu0Var, new lj1((Object) new xm0(versionInfoParcel, m00Var2, du0Var, b30VarA2, ou0Var, z10, rqVar, vm0Var.f21210h, vm0Var.f21212j), false, (Object) b30VarA2, 17), new d5.o(du0Var.f13676a0, 2));
                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var, "rendering-ad-component-creation-end");
                }
                fx1 fx1Var = b50Var.f12649o0;
                dh0 dh0Var = (dh0) fx1Var.zzb();
                if (true != z10) {
                    rqVar = null;
                }
                dh0Var.a(b30VarA2, false, rqVar, wh0Var);
                m00Var2.zzc(b50Var);
                final int i10 = 0;
                b50Var.V().P0(new na0() { // from class: com.google.android.gms.internal.ads.um0
                    @Override // com.google.android.gms.internal.ads.na0
                    public final /* synthetic */ void k() {
                        switch (i10) {
                            case 0:
                                b30 b30Var2 = b30VarA2;
                                if (b30Var2.zzP() != null) {
                                    b30Var2.zzP().y0();
                                }
                                break;
                            case 1:
                                b30 b30Var3 = b30VarA2;
                                if (b30Var3.zzP() != null) {
                                    b30Var3.zzP().y0();
                                }
                                break;
                            case 2:
                                b30 b30Var4 = b30VarA2;
                                if (b30Var4.zzP() != null) {
                                    b30Var4.zzP().y0();
                                }
                                break;
                            default:
                                b30 b30Var5 = b30VarA2;
                                if (b30Var5.zzP() != null) {
                                    b30Var5.zzP().y0();
                                }
                                break;
                        }
                    }
                }, l00.f16615h);
                hu0 hu0Var = du0Var.f13708s;
                String strA = hu0Var.f15394a;
                if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue() && ((jm0) b50Var.f12636a0.zzb()).a()) {
                    strA = x30.a(strA, x30.b(du0Var));
                }
                return zw1.z(dh0.b(b30VarA2, hu0Var.f15395b, strA, wh0Var, (jw0) ((d50) k70Var).f13406f.zzb()), new k90(b30VarA2, du0Var, b50Var, 1), vm0Var.f21206d);
            case 4:
                dn0 dn0Var = (dn0) this.f18980b;
                ju0 ju0Var2 = (ju0) this.f18981c;
                du0 du0Var2 = (du0) this.f18982d;
                Executor executor = dn0Var.f13604e;
                wh0 wh0Var2 = dn0Var.f13606g;
                ul ulVar2 = am.V2;
                if (((Boolean) zzba.zzc().a(ulVar2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var2, "rendering-webview-creation-start");
                }
                Context context = dn0Var.f13601b;
                zzr zzrVarC = x10.c(context, du0Var2.f13711u);
                final b30 b30VarA3 = dn0Var.f13602c.a(zzrVarC, du0Var2, (fu0) ju0Var2.f16196b.f20920d);
                b30VarA3.I(du0Var2.W);
                View viewA = (((Boolean) zzba.zzc().a(am.f12151f9)).booleanValue() && du0Var2.g0) ? b80.a(context, b30VarA3.zzE(), du0Var2) : new gh0(context, b30VarA3.zzE(), (zzat) dn0Var.f13605f.apply(du0Var2));
                if (((Boolean) zzba.zzc().a(ulVar2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var2, "rendering-webview-creation-end");
                }
                y70 y70Var = dn0Var.f13600a;
                vu0 vu0Var2 = new vu0(ju0Var2, du0Var2, (String) null);
                hz hzVar = new hz(viewA, b30VarA3, new cn0(b30VarA3), zzrVarC.zzi ? new eu0(-3, 0, true) : new eu0(zzrVarC.zze, zzrVarC.zzb, false));
                f50 f50Var = (f50) y70Var;
                e50 e50Var = new e50(f50Var.f14224d, f50Var.f14226e, vu0Var2, hzVar);
                if (((Boolean) zzba.zzc().a(ulVar2)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var2, "rendering-ad-component-creation-end");
                }
                fx1 fx1Var2 = e50Var.r0;
                ((dh0) fx1Var2.zzb()).a(b30VarA3, false, null, wh0Var2);
                ma0 ma0Var = (ma0) e50Var.f13844f0.zzb();
                final int i11 = 1;
                na0 na0Var = new na0() { // from class: com.google.android.gms.internal.ads.um0
                    @Override // com.google.android.gms.internal.ads.na0
                    public final /* synthetic */ void k() {
                        switch (i11) {
                            case 0:
                                b30 b30Var2 = b30VarA3;
                                if (b30Var2.zzP() != null) {
                                    b30Var2.zzP().y0();
                                }
                                break;
                            case 1:
                                b30 b30Var3 = b30VarA3;
                                if (b30Var3.zzP() != null) {
                                    b30Var3.zzP().y0();
                                }
                                break;
                            case 2:
                                b30 b30Var4 = b30VarA3;
                                if (b30Var4.zzP() != null) {
                                    b30Var4.zzP().y0();
                                }
                                break;
                            default:
                                b30 b30Var5 = b30VarA3;
                                if (b30Var5.zzP() != null) {
                                    b30Var5.zzP().y0();
                                }
                                break;
                        }
                    }
                };
                k00 k00Var = l00.f16615h;
                ma0Var.P0(na0Var, k00Var);
                hu0 hu0Var2 = du0Var2.f13708s;
                String strA2 = hu0Var2.f15394a;
                if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue() && ((jm0) e50Var.f13842d0.zzb()).a()) {
                    strA2 = x30.a(strA2, x30.b(du0Var2));
                }
                m00 m00VarB = dh0.b(b30VarA3, hu0Var2.f15395b, strA2, wh0Var2, (jw0) ((f50) y70Var).l.zzb());
                if (du0Var2.M) {
                    m00VarB.addListener(new m30(b30VarA3, 7), executor);
                }
                m00VarB.addListener(new gm0(2, dn0Var, b30VarA3), executor);
                return zw1.z(m00VarB, new lx(e50Var, 2), k00Var);
            case 5:
                return zw1.d(b80.a(((zm0) this.f18980b).f22670b, (View) this.f18981c, (du0) this.f18982d));
            case 6:
                return zw1.d(b80.a(((gn0) this.f18980b).f14906b, (View) this.f18981c, (du0) this.f18982d));
            case 7:
                mn0 mn0Var = (mn0) this.f18980b;
                du0 du0Var3 = (du0) this.f18981c;
                ju0 ju0Var3 = (ju0) this.f18982d;
                wh0 wh0Var3 = mn0Var.f17502j;
                ul ulVar3 = am.V2;
                if (((Boolean) zzba.zzc().a(ulVar3)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var3, "rendering-webview-creation-start");
                }
                eh0 eh0Var2 = mn0Var.f17495c;
                ou0 ou0Var2 = mn0Var.f17496d;
                final b30 b30VarA4 = eh0Var2.a(ou0Var2.f18365f, du0Var3, (fu0) ju0Var3.f16196b.f20920d);
                b30VarA4.I(du0Var3.W);
                if (((Boolean) zzba.zzc().a(ulVar3)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var3, "rendering-webview-creation-end");
                }
                m00 m00Var3 = new m00();
                ed0 ed0Var = (ed0) mn0Var.l;
                vu0 vu0Var3 = new vu0(ju0Var3, du0Var3, (String) null);
                Context context2 = mn0Var.f17494b;
                VersionInfoParcel versionInfoParcel2 = mn0Var.f17498f;
                boolean z11 = mn0Var.f17500h;
                rq rqVar2 = mn0Var.f17499g;
                i50 i50Var = (i50) ed0Var;
                h50 h50Var = new h50(i50Var.f15577b, i50Var.f15578c, vu0Var3, new lj1((Object) new ln0(context2, versionInfoParcel2, m00Var3, du0Var3, b30VarA4, ou0Var2, z11, rqVar2, mn0Var.f17501i, mn0Var.f17503k), false, (Object) b30VarA4, 17));
                m00Var3.zzc(h50Var);
                if (((Boolean) zzba.zzc().a(ulVar3)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var3, "rendering-ad-component-creation-end");
                }
                final int i12 = 2;
                h50Var.V().P0(new na0() { // from class: com.google.android.gms.internal.ads.um0
                    @Override // com.google.android.gms.internal.ads.na0
                    public final /* synthetic */ void k() {
                        switch (i12) {
                            case 0:
                                b30 b30Var2 = b30VarA4;
                                if (b30Var2.zzP() != null) {
                                    b30Var2.zzP().y0();
                                }
                                break;
                            case 1:
                                b30 b30Var3 = b30VarA4;
                                if (b30Var3.zzP() != null) {
                                    b30Var3.zzP().y0();
                                }
                                break;
                            case 2:
                                b30 b30Var4 = b30VarA4;
                                if (b30Var4.zzP() != null) {
                                    b30Var4.zzP().y0();
                                }
                                break;
                            default:
                                b30 b30Var5 = b30VarA4;
                                if (b30Var5.zzP() != null) {
                                    b30Var5.zzP().y0();
                                }
                                break;
                        }
                    }
                }, l00.f16615h);
                hu0 hu0Var3 = du0Var3.f13708s;
                String strA3 = hu0Var3.f15394a;
                if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue() && ((jm0) h50Var.Z.zzb()).a()) {
                    strA3 = x30.a(strA3, x30.b(du0Var3));
                }
                fx1 fx1Var3 = h50Var.f15166q0;
                dh0 dh0Var2 = (dh0) fx1Var3.zzb();
                if (true != z11) {
                    rqVar2 = null;
                }
                dh0Var2.a(b30VarA4, true, rqVar2, wh0Var3);
                return zw1.z(dh0.b(b30VarA4, hu0Var3.f15395b, strA3, wh0Var3, (jw0) ((i50) ed0Var).f15584i.zzb()), new k90(b30VarA4, du0Var3, h50Var, 2), mn0Var.f17497e);
            case 8:
                rn0 rn0Var = (rn0) this.f18980b;
                ju0 ju0Var4 = (ju0) this.f18981c;
                du0 du0Var4 = (du0) this.f18982d;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return zw1.l(new ck0(3));
                }
                int i13 = ((ou0) ju0Var4.f16195a.f20839b).l;
                if (i13 <= 1) {
                    return zw1.z(rn0Var.c(ju0Var4, du0Var4, jSONArray.getJSONObject(0)), i6.f15611k, rn0Var.f19623b);
                }
                int length = jSONArray.length();
                if (((Boolean) zzba.zzc().a(am.W2)).booleanValue()) {
                    rn0Var.f19627f.b("nsl", String.valueOf(length));
                }
                rn0Var.f19625d.a(Math.min(length, i13));
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    if (i14 < length) {
                        arrayList.add(rn0Var.c(ju0Var4, du0Var4, jSONArray.getJSONObject(i14)));
                    } else {
                        arrayList.add(zw1.l(new ck0(3)));
                    }
                }
                return zw1.d(arrayList);
            default:
                mn0 mn0Var2 = (mn0) this.f18980b;
                du0 du0Var5 = (du0) this.f18981c;
                ju0 ju0Var5 = (ju0) this.f18982d;
                wh0 wh0Var4 = mn0Var2.f17502j;
                ul ulVar4 = am.V2;
                if (((Boolean) zzba.zzc().a(ulVar4)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var4, "rendering-webview-creation-start");
                }
                eh0 eh0Var3 = mn0Var2.f17495c;
                ou0 ou0Var3 = mn0Var2.f17496d;
                final b30 b30VarA5 = eh0Var3.a(ou0Var3.f18365f, du0Var5, (fu0) ju0Var5.f16196b.f20920d);
                b30VarA5.I(du0Var5.W);
                if (((Boolean) zzba.zzc().a(ulVar4)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var4, "rendering-webview-creation-end");
                }
                m00 m00Var4 = new m00();
                xg0 xg0Var = (xg0) mn0Var2.l;
                vu0 vu0Var4 = new vu0(ju0Var5, du0Var5, (String) null);
                Context context3 = mn0Var2.f17494b;
                VersionInfoParcel versionInfoParcel3 = mn0Var2.f17498f;
                rq rqVar3 = mn0Var2.f17499g;
                boolean z12 = mn0Var2.f17500h;
                zl0 zl0Var = mn0Var2.f17501i;
                wh0 wh0Var5 = mn0Var2.f17502j;
                m50 m50Var = (m50) xg0Var;
                l50 l50Var = new l50(m50Var.f17253c, m50Var.f17255d, vu0Var4, new wg0(new lo0(context3, eh0Var3, ou0Var3, versionInfoParcel3, du0Var5, m00Var4, b30VarA5, rqVar3, z12, zl0Var, wh0Var5, mn0Var2.f17503k), b30VarA5, 0));
                m00Var4.zzc(l50Var);
                if (((Boolean) zzba.zzc().a(ulVar4)).booleanValue()) {
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), wh0Var5, "rendering-ad-component-creation-end");
                }
                b30VarA5.D("/reward", new eq((uc0) l50Var.f16737p0.zzb(), 4));
                final int i15 = 3;
                l50Var.W().P0(new na0() { // from class: com.google.android.gms.internal.ads.um0
                    @Override // com.google.android.gms.internal.ads.na0
                    public final /* synthetic */ void k() {
                        switch (i15) {
                            case 0:
                                b30 b30Var2 = b30VarA5;
                                if (b30Var2.zzP() != null) {
                                    b30Var2.zzP().y0();
                                }
                                break;
                            case 1:
                                b30 b30Var3 = b30VarA5;
                                if (b30Var3.zzP() != null) {
                                    b30Var3.zzP().y0();
                                }
                                break;
                            case 2:
                                b30 b30Var4 = b30VarA5;
                                if (b30Var4.zzP() != null) {
                                    b30Var4.zzP().y0();
                                }
                                break;
                            default:
                                b30 b30Var5 = b30VarA5;
                                if (b30Var5.zzP() != null) {
                                    b30Var5.zzP().y0();
                                }
                                break;
                        }
                    }
                }, l00.f16615h);
                fx1 fx1Var4 = l50Var.f16738q0;
                ((dh0) fx1Var4.zzb()).a(b30VarA5, true, true != z12 ? null : rqVar3, wh0Var5);
                hu0 hu0Var4 = du0Var5.f13708s;
                String strA4 = hu0Var4.f15394a;
                if (((Boolean) zzba.zzc().a(am.f12359t6)).booleanValue() && ((jm0) l50Var.Z.zzb()).a()) {
                    strA4 = x30.a(strA4, x30.b(du0Var5));
                }
                return zw1.z(dh0.b(b30VarA5, hu0Var4.f15395b, strA4, wh0Var5, (jw0) ((m50) xg0Var).f17258g.zzb()), new k90(b30VarA5, du0Var5, l50Var, 3), mn0Var2.f17497e);
        }
    }

    public /* synthetic */ q80(Object obj, Object obj2, Object obj3, int i10) {
        this.f18979a = i10;
        this.f18980b = obj;
        this.f18981c = obj2;
        this.f18982d = obj3;
    }
}
