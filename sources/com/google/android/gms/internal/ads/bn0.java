package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bn0 implements tm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12826c;

    public /* synthetic */ bn0(Context context, int i10, Object obj) {
        this.f12824a = i10;
        this.f12825b = context;
        this.f12826c = obj;
    }

    @Override // com.google.android.gms.internal.ads.tm0
    public final Object a(ju0 ju0Var, du0 du0Var, qm0 qm0Var) {
        switch (this.f12824a) {
            case 0:
                hz hzVar = new hz(du0Var, (av) qm0Var.f19127b, AdFormat.APP_OPEN_AD);
                vu0 vu0Var = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                lj1 lj1Var = new lj1((Object) hzVar, false, (Object) null, 17);
                d5.o oVar = new d5.o(du0Var.f13676a0, 2);
                d50 d50Var = (d50) ((k70) this.f12826c);
                b50 b50Var = new b50(d50Var.f13403c, d50Var.f13404d, vu0Var, lj1Var, oVar);
                hzVar.f15436e = b50Var.V();
                ((jn0) qm0Var.f19128c).y1(new oo0((ba0) b50Var.f12641f0.zzb(), (pc0) b50Var.f12642h0.zzb(), (ma0) b50Var.f12637b0.zzb(), (qa0) b50Var.f12640e0.zzb(), (sa0) b50Var.f12643i0.zzb(), (tb0) b50Var.W.S.zzb(), (bb0) b50Var.f12644j0.zzb(), (xc0) b50Var.f12645k0.zzb(), (qb0) b50Var.f12646l0.zzb(), (ka0) b50Var.f12648n0.zzb()));
                return b50Var.W();
            case 1:
                hz hzVar2 = new hz(du0Var, (av) qm0Var.f19127b, AdFormat.INTERSTITIAL);
                vu0 vu0Var2 = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                lj1 lj1Var2 = new lj1((Object) hzVar2, false, (Object) null, 17);
                i50 i50Var = (i50) ((ed0) this.f12826c);
                h50 h50Var = new h50(i50Var.f15577b, i50Var.f15578c, vu0Var2, lj1Var2);
                hzVar2.f15436e = h50Var.V();
                ((jn0) qm0Var.f19128c).y1(new oo0((ba0) h50Var.f15155e0.zzb(), (pc0) h50Var.f15157h0.zzb(), (ma0) h50Var.f15151a0.zzb(), (qa0) h50Var.f15154d0.zzb(), (sa0) h50Var.f15158i0.zzb(), (tb0) h50Var.V.S.zzb(), (bb0) h50Var.f15160k0.zzb(), (xc0) h50Var.f15161l0.zzb(), (qb0) h50Var.f15162m0.zzb(), (ka0) h50Var.f15164o0.zzb()));
                return h50Var.W();
            default:
                hz hzVar3 = new hz(du0Var, (av) qm0Var.f19127b, AdFormat.REWARDED);
                vu0 vu0Var3 = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                wg0 wg0Var = new wg0(hzVar3, null, 0);
                m50 m50Var = (m50) ((xg0) this.f12826c);
                a50 a50Var = m50Var.f17253c;
                m50 m50Var2 = m50Var.f17255d;
                l50 l50Var = new l50(a50Var, m50Var2, vu0Var3, wg0Var);
                hzVar3.f15436e = l50Var.W();
                ((jn0) qm0Var.f19128c).y1(new no0((ba0) l50Var.f16727e0.zzb(), (pc0) l50Var.g0.zzb(), (ma0) l50Var.f16723a0.zzb(), (qa0) l50Var.f16726d0.zzb(), (sa0) l50Var.f16729h0.zzb(), (ka0) l50Var.f16735n0.zzb(), (tb0) m50Var2.W.zzb(), (xc0) l50Var.f16732k0.zzb(), (bb0) l50Var.f16731j0.zzb(), (uc0) l50Var.f16737p0.zzb(), (qb0) l50Var.f16733l0.zzb()));
                return l50Var.X();
        }
    }

    @Override // com.google.android.gms.internal.ads.tm0
    public final void b(ju0 ju0Var, du0 du0Var, qm0 qm0Var) throws qu0 {
        switch (this.f12824a) {
            case 0:
                try {
                    av avVar = (av) qm0Var.f19127b;
                    avVar.zzo(du0Var.Z);
                    avVar.N(du0Var.U, du0Var.f13713v.toString(), ((ou0) ju0Var.f16195a.f20839b).f18363d, new s9.b(this.f12825b), new an0(qm0Var), (xt) qm0Var.f19128c);
                    return;
                } catch (RemoteException e10) {
                    zze.zzb("Remote exception loading an app open RTB ad", e10);
                    throw new qu0(e10);
                }
            case 1:
                try {
                    av avVar2 = (av) qm0Var.f19127b;
                    avVar2.zzo(du0Var.Z);
                    avVar2.g1(du0Var.U, du0Var.f13713v.toString(), ((ou0) ju0Var.f16195a.f20839b).f18363d, new s9.b(this.f12825b), new on0(this, qm0Var), (xt) qm0Var.f19128c);
                    return;
                } catch (RemoteException e11) {
                    zze.zzb("Remote exception loading a interstitial RTB ad", e11);
                    throw new qu0(e11);
                }
            default:
                try {
                    Object obj = qm0Var.f19127b;
                    IInterface iInterface = qm0Var.f19128c;
                    av avVar3 = (av) obj;
                    String str = du0Var.Z;
                    JSONObject jSONObject = du0Var.f13713v;
                    avVar3.zzo(str);
                    ou0 ou0Var = (ou0) ju0Var.f16195a.f20839b;
                    int i10 = ou0Var.f18374p.f38703b;
                    Context context = this.f12825b;
                    if (i10 == 3) {
                        avVar3.t0(du0Var.U, jSONObject.toString(), ou0Var.f18363d, new s9.b(context), new io0(this, qm0Var), (xt) iInterface);
                    } else {
                        avVar3.R0(du0Var.U, jSONObject.toString(), ou0Var.f18363d, new s9.b(context), new io0(this, qm0Var), (xt) iInterface);
                    }
                    return;
                } catch (RemoteException e12) {
                    zze.zzb("Remote exception loading a rewarded RTB ad", e12);
                    return;
                }
        }
    }
}
