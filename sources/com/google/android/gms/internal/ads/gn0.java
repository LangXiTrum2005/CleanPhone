package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gn0 implements tm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14905a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14909e;

    public gn0(Context context, VersionInfoParcel versionInfoParcel, ed0 ed0Var, k00 k00Var) {
        this.f14906b = context;
        this.f14908d = versionInfoParcel;
        this.f14907c = ed0Var;
        this.f14909e = k00Var;
    }

    @Override // com.google.android.gms.internal.ads.tm0
    public final Object a(ju0 ju0Var, du0 du0Var, qm0 qm0Var) throws eo0, qu0 {
        View view;
        int i10 = this.f14905a;
        Object obj = this.f14907c;
        Object obj2 = null;
        switch (i10) {
            case 0:
                if (((Boolean) zzba.zzc().a(am.f12151f9)).booleanValue() && du0Var.g0) {
                    try {
                        view = (View) s9.b.y1(((zt) this.f14909e).zze());
                        boolean zZzf = ((zt) this.f14909e).zzf();
                        if (view == null) {
                            throw new qu0(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (zZzf) {
                            try {
                                view = (View) zw1.x(be1.f12743b, new q80(this, view, du0Var, 6), l00.f16613f).get();
                            } catch (InterruptedException | ExecutionException e10) {
                                throw new qu0(e10);
                            }
                        }
                    } catch (RemoteException e11) {
                        throw new qu0(e11);
                    }
                    break;
                } else {
                    view = (View) this.f14908d;
                }
                f50 f50Var = (f50) ((y70) obj);
                e50 e50Var = new e50(f50Var.f14224d, f50Var.f14226e, new vu0(ju0Var, du0Var, qm0Var.f19126a), new hz(view, (b30) null, new vf(qm0Var, 25), (eu0) du0Var.f13711u.get(0)));
                ((oc0) e50Var.f13854q0.zzb()).X0(view);
                ((jn0) qm0Var.f19128c).y1(new oo0((ba0) e50Var.f13841c0.zzb(), (pc0) e50Var.f13846i0.zzb(), (ma0) e50Var.f13844f0.zzb(), (qa0) e50Var.f13840b0.zzb(), e50Var.V(), (tb0) e50Var.V.U.zzb(), (bb0) e50Var.f13849l0.zzb(), (xc0) e50Var.f13850m0.zzb(), (qb0) e50Var.f13851n0.zzb(), (ka0) e50Var.f13852o0.zzb()));
                return e50Var.W();
            case 1:
                boolean z10 = false;
                i50 i50Var = (i50) ((ed0) obj);
                h50 h50Var = new h50(i50Var.f15577b, i50Var.f15578c, new vu0(ju0Var, du0Var, qm0Var.f19126a), new lj1(new vu0(this, qm0Var, du0Var, false, 24), z10, obj2, 17));
                ((pa0) h50Var.W.zzb()).P0(new k60((wu0) qm0Var.f19127b, 0), (Executor) this.f14909e);
                ((jn0) qm0Var.f19128c).y1(new qo0((ba0) h50Var.f15155e0.zzb(), (pc0) h50Var.f15157h0.zzb(), (ma0) h50Var.f15151a0.zzb(), (qa0) h50Var.f15154d0.zzb(), (sa0) h50Var.f15158i0.zzb(), (tb0) h50Var.V.S.zzb(), (bb0) h50Var.f15160k0.zzb(), (xc0) h50Var.f15161l0.zzb(), (qb0) h50Var.f15162m0.zzb(), (ka0) h50Var.f15164o0.zzb()));
                return h50Var.W();
            default:
                ArrayList arrayList = ((ou0) ju0Var.f16195a.f20839b).f18367h;
                if (!arrayList.contains(Integer.toString(6))) {
                    throw new eo0(2, "Unified must be used for RTB.");
                }
                je0 je0VarL = je0.l((eu) this.f14908d);
                int i11 = 1;
                if (!arrayList.contains(Integer.toString(je0VarL.q()))) {
                    throw new eo0(1, "No corresponding native ad listener");
                }
                vu0 vu0Var = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                so0 so0Var = new so0(je0VarL, 21);
                hf0 hf0Var = new hf0(null, null, (eu) this.f14908d);
                y40 y40Var = (y40) ((pd0) obj);
                a50 a50Var = y40Var.f22103b;
                y40 y40Var2 = y40Var.f22104c;
                t80 t80Var = new t80(vu0Var, 0);
                fx1 fx1Var = y40Var2.f22109h;
                ei eiVar = a50Var.G0;
                fx1 fx1VarA = fx1.a(new p60(fx1Var, t80Var, i11));
                fx1 fx1VarA2 = fx1.a(new g90(fx1VarA, 7));
                int i12 = lx1.f17149c;
                ArrayList arrayList2 = new ArrayList(1);
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(y40Var2.f22117q);
                arrayList3.add(y40Var2.f22118r);
                arrayList2.add(fx1VarA2);
                fx1 fx1VarA3 = fx1.a(new ca0(new lx1(arrayList2, arrayList3), 3));
                fx1 fx1VarA4 = fx1.a(ps1.f18799g);
                fx1 fx1Var2 = a50Var.f11856c;
                fx1 fx1VarA5 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 4));
                t80 t80Var2 = new t80(vu0Var, 3);
                t80 t80Var3 = new t80(vu0Var, 2);
                o40 o40Var = a50Var.f11864g;
                fx1 fx1VarA6 = fx1.a(new n60(a50Var.N, a50Var.M, t80Var, t80Var3, fx1.a(new n60(o40Var, a50Var.F, fx1.a(new v50(o40Var, 24)), fx1.a(rb0.f19504g), a50Var.E0, a50Var.f11858d)), y40Var2.f22106e));
                qd0 qd0Var = new qd0(4);
                qd0 qd0Var2 = new qd0(2);
                fx1 fx1VarA7 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 9));
                fx1 fx1VarA8 = fx1.a(dv.f13735g);
                wd0 wd0Var = new wd0(fx1VarA8, 2);
                ArrayList arrayList4 = new ArrayList(2);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(y40Var2.f22123w);
                arrayList4.add(fx1VarA7);
                arrayList4.add(wd0Var);
                fx1 fx1VarA9 = fx1.a(new fz(new lx1(arrayList4, arrayList5), t80Var, t80Var2, 5));
                fx1 fx1VarA10 = fx1.a(new e60(t80Var2, 8));
                fx1 fx1VarA11 = fx1.a(new v60(a50Var.f11864g, a50Var.f11856c, a50Var.f11858d, t80Var2, t80Var, y40Var2.f22113m, fx1VarA6, qd0Var, qd0Var2, a50Var.J, y40Var2.f22114n, y40Var2.f22106e, y40Var2.f22122v, fx1VarA9, fx1VarA10, y40Var2.f22112k));
                r40 r40Var = new r40(fx1VarA11, 24);
                g90 g90Var = new g90(fx1.a(new p60(t80Var, a50Var.Z, 0)), 11);
                ArrayList arrayList6 = new ArrayList(4);
                ArrayList arrayList7 = new ArrayList(2);
                arrayList6.add(y40Var2.f22119s);
                arrayList7.add(y40Var2.f22120t);
                arrayList7.add(y40Var2.f22121u);
                arrayList6.add(fx1VarA5);
                arrayList6.add(r40Var);
                arrayList6.add(g90Var);
                fx1 fx1VarA12 = fx1.a(new ca0(new lx1(arrayList6, arrayList7), 4));
                fx1 fx1VarA13 = fx1.a(new j90(a50Var.f11864g, a50Var.D0, a50Var.f11874m, t80Var2, t80Var, a50Var.L, ps1.f18800h));
                fx1 fx1VarA14 = fx1.a(new g90(fx1VarA13, 5));
                fx1 fx1VarA15 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 3));
                fx1 fx1Var3 = a50Var.f11899z0;
                z90 z90Var = y40Var2.f22105d;
                fx1 fx1VarA16 = fx1.a(new g90(fx1.a(new w70(fx1Var3, z90Var, 1)), 3));
                r40 r40Var2 = new r40(fx1VarA11, 23);
                ArrayList arrayList8 = new ArrayList(5);
                ArrayList arrayList9 = new ArrayList(3);
                arrayList8.add(y40Var2.f22124x);
                arrayList8.add(y40Var2.f22125y);
                arrayList9.add(y40Var2.f22126z);
                arrayList9.add(y40Var2.A);
                arrayList8.add(fx1VarA14);
                arrayList8.add(fx1VarA15);
                arrayList9.add(fx1VarA16);
                arrayList8.add(r40Var2);
                fx1 fx1VarA17 = fx1.a(new ca0(new lx1(arrayList8, arrayList9), 0));
                int i13 = 6;
                fx1 fx1VarA18 = fx1.a(new g90(fx1VarA13, i13));
                fx1 fx1VarA19 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, i13));
                fx1 fx1VarA20 = fx1.a(new v50(y40Var2.f22108g, 14));
                r40 r40Var3 = new r40(fx1VarA9, 12);
                r40 r40Var4 = new r40(fx1VarA11, 26);
                ArrayList arrayList10 = new ArrayList(7);
                ArrayList arrayList11 = new ArrayList(2);
                arrayList10.add(y40Var2.B);
                arrayList10.add(y40Var2.C);
                arrayList11.add(y40Var2.D);
                arrayList11.add(y40Var2.E);
                arrayList10.add(fx1VarA18);
                arrayList10.add(fx1VarA19);
                arrayList10.add(fx1VarA20);
                arrayList10.add(r40Var3);
                arrayList10.add(r40Var4);
                fx1 fx1VarA21 = fx1.a(new ca0(new lx1(arrayList10, arrayList11), 2));
                r40 r40Var5 = new r40(fx1VarA11, 29);
                ArrayList arrayList12 = new ArrayList(1);
                ArrayList arrayList13 = new ArrayList(1);
                arrayList13.add(y40Var2.F);
                arrayList12.add(r40Var5);
                fx1 fx1VarA22 = fx1.a(new ca0(new lx1(arrayList12, arrayList13), 19));
                r40 r40Var6 = new r40(fx1.a(new p60(t80Var, a50Var.N, 2)), 22);
                ArrayList arrayList14 = new ArrayList(1);
                new ArrayList(1).add(y40Var2.G);
                arrayList14.add(r40Var6);
                fx1 fx1VarA23 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 10));
                ArrayList arrayList15 = new ArrayList(1);
                ArrayList arrayList16 = new ArrayList(1);
                arrayList16.add(y40Var2.H);
                arrayList15.add(fx1VarA23);
                fx1 fx1VarA24 = fx1.a(new ca0(new lx1(arrayList15, arrayList16), 20));
                fx1 fx1VarA25 = fx1.a(new g90(fx1VarA, 8));
                r40 r40Var7 = new r40(fx1VarA11, 27);
                ArrayList arrayList17 = new ArrayList(7);
                ArrayList arrayList18 = new ArrayList(4);
                arrayList17.add(y40Var2.I);
                arrayList18.add(y40Var2.J);
                arrayList17.add(y40Var2.K);
                arrayList17.add(y40Var2.L);
                arrayList18.add(y40Var2.M);
                arrayList18.add(y40Var2.N);
                arrayList18.add(y40Var2.O);
                arrayList17.add(y40Var2.P);
                arrayList17.add(y40Var2.Q);
                arrayList17.add(fx1VarA25);
                arrayList17.add(r40Var7);
                fx1 fx1VarA26 = fx1.a(new ca0(new lx1(arrayList17, arrayList18), 5));
                g90 g90Var2 = new g90(fx1.a(new r40(fx1VarA12, 11)), 1);
                fx1 fx1VarA27 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 8));
                ArrayList arrayList19 = new ArrayList(2);
                ArrayList arrayList20 = new ArrayList(1);
                arrayList20.add(y40Var2.S);
                arrayList19.add(g90Var2);
                arrayList19.add(fx1VarA27);
                fx1 fx1VarA28 = fx1.a(new ca0(new lx1(arrayList19, arrayList20), 9));
                e60 e60Var = new e60(so0Var, 13);
                jf0 jf0Var = new jf0(new zd0(e60Var, 1), fx1Var2);
                ArrayList arrayList21 = new ArrayList(1);
                ArrayList arrayList22 = new ArrayList(1);
                arrayList22.add(y40Var2.T);
                arrayList21.add(jf0Var);
                fx1 fx1VarA29 = fx1.a(new yc0(new lx1(arrayList21, arrayList22)));
                fx1 fx1VarA30 = fx1.a(new g90(fx1VarA13, 4));
                if0 if0Var = new if0(hf0Var, 0);
                if0 if0Var2 = new if0(hf0Var, 1);
                if0 if0Var3 = new if0(hf0Var, 2);
                fx1 fx1VarA31 = fx1.a(new g90(fx1VarA13, 2));
                r40 r40Var8 = new r40(fx1VarA11, 28);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(y40Var2.f22102a0);
                arrayList23.add(fx1VarA31);
                arrayList23.add(r40Var8);
                fx1 fx1VarA32 = fx1.a(new w80(if0Var, if0Var2, if0Var3, fx1VarA21, fx1.a(new ca0(new lx1(arrayList23, arrayList24), 10)), fx1VarA17, fx1VarA24, y40Var2.f22109h, t80Var, a50Var.f11865h, z90Var));
                wd0 wd0Var2 = new wd0(fx1VarA32, 5);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList25.add(fx1VarA30);
                arrayList26.add(wd0Var2);
                fx1 fx1VarA33 = fx1.a(new ca0(new lx1(arrayList25, arrayList26), 13));
                fx1 fx1VarA34 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 5));
                r40 r40Var9 = new r40(fx1VarA11, 25);
                ArrayList arrayList27 = new ArrayList(2);
                ArrayList arrayList28 = new ArrayList(1);
                arrayList28.add(y40Var2.U);
                arrayList27.add(fx1VarA34);
                arrayList27.add(r40Var9);
                ca0 ca0Var = new ca0(new lx1(arrayList27, arrayList28), 1);
                fx1 fx1VarA35 = fx1.a(new g90(fx1VarA13, 0));
                ArrayList arrayList29 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList29.add(fx1VarA35);
                fx1 fx1VarA36 = fx1.a(new fz(ca0Var, new lx1(arrayList29, list), a50Var.f11858d, 4));
                t80 t80Var4 = new t80(vu0Var, 1);
                d80 d80Var = new d80(t80Var, t80Var4, y40Var2.f22110i, t80Var3, y40Var2.f22107f);
                ArrayList arrayList30 = new ArrayList(1);
                ArrayList arrayList31 = new ArrayList(1);
                arrayList31.add(y40Var2.W);
                arrayList30.add(y40Var2.X);
                w80 w80Var = new w80(t80Var2, t80Var, fx1VarA3, fx1VarA26, y40Var2.V, d80Var, fx1VarA4, new ca0(new lx1(arrayList30, arrayList31), 6), fx1VarA22, fx1VarA10, a50Var.f11879o0);
                wd0 wd0Var3 = new wd0(fx1VarA32, 4);
                fx1 fx1VarA37 = fx1.a(new g70(t80Var, 1));
                qd0 qd0Var3 = new qd0(5);
                qd0 qd0Var4 = new qd0(6);
                fx1 fx1VarA38 = fx1.a(new e60(new zd0(e60Var, 0), 12));
                k40 k40Var = a50Var.F;
                fx1 fx1Var4 = a50Var.f11856c;
                te0 te0Var = new te0(k40Var, z90Var, fx1VarA37, e60Var, qd0Var3, qd0Var4, fx1Var4, fx1VarA38);
                er0 er0Var = new er0();
                fx1 fx1VarA39 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 1));
                fx1 fx1VarA40 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 0));
                fx1 fx1VarA41 = fx1.a(new l40((kx1) t80Var4, (kx1) er0Var, (kx1) e60Var, (kx1) a50Var.f11874m, 8));
                fx1 fx1VarA42 = fx1.a(new oz(er0Var, e60Var, 16));
                o40 o40Var2 = a50Var.f11864g;
                er0.a(er0Var, fx1.a(new fe0(w80Var, fx1Var4, e60Var, wd0Var3, te0Var, fx1VarA37, y40Var2.f22111j, fx1VarA39, fx1VarA40, fx1VarA41, fx1VarA42, fx1.a(new l40(o40Var2, e60Var, te0Var, er0Var, 7)), new oe0(o40Var2, z90Var), a50Var.J, a50Var.f11865h, o40Var2, fx1VarA38, fx1VarA8, a50Var.N0)));
                ((jn0) qm0Var.f19128c).y1(new oo0((ba0) fx1VarA17.zzb(), (pc0) fx1VarA24.zzb(), (ma0) fx1VarA21.zzb(), (qa0) fx1VarA12.zzb(), (sa0) fx1VarA26.zzb(), (tb0) y40Var2.R.zzb(), (bb0) fx1VarA28.zzb(), (xc0) fx1VarA29.zzb(), (qb0) fx1VarA33.zzb(), (ka0) fx1VarA36.zzb()));
                return (ee0) er0Var.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.tm0
    public final void b(ju0 ju0Var, du0 du0Var, qm0 qm0Var) throws qu0 {
        switch (this.f14905a) {
            case 0:
                try {
                    Object obj = qm0Var.f19127b;
                    IInterface iInterface = qm0Var.f19128c;
                    av avVar = (av) obj;
                    String str = du0Var.Z;
                    JSONObject jSONObject = du0Var.f13713v;
                    avVar.zzo(str);
                    boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12151f9)).booleanValue();
                    Context context = this.f14906b;
                    if (zBooleanValue && du0Var.g0) {
                        String str2 = du0Var.U;
                        String string = jSONObject.toString();
                        ou0 ou0Var = (ou0) ju0Var.f16195a.f20839b;
                        avVar.P(str2, string, ou0Var.f18363d, new s9.b(context), new fn0(this, qm0Var), (xt) iInterface, ou0Var.f18365f);
                        return;
                    }
                    String str3 = du0Var.U;
                    String string2 = jSONObject.toString();
                    ou0 ou0Var2 = (ou0) ju0Var.f16195a.f20839b;
                    avVar.Q0(str3, string2, ou0Var2.f18363d, new s9.b(context), new fn0(this, qm0Var), (xt) iInterface, ou0Var2.f18365f);
                    return;
                } catch (RemoteException e10) {
                    throw new qu0(e10);
                }
            case 1:
                wu0 wu0Var = (wu0) qm0Var.f19127b;
                ou0 ou0Var3 = (ou0) ju0Var.f16195a.f20839b;
                String string3 = du0Var.f13713v.toString();
                String strZzm = zzbp.zzm(du0Var.f13708s);
                Context context2 = this.f14906b;
                xt xtVar = (xt) qm0Var.f19128c;
                try {
                    wu0Var.f21609a.p0(new s9.b(context2), ou0Var3.f18363d, string3, strZzm, xtVar);
                    return;
                } catch (Throwable th2) {
                    throw new qu0(th2);
                }
            default:
                try {
                    Object obj2 = qm0Var.f19127b;
                    IInterface iInterface2 = qm0Var.f19128c;
                    av avVar2 = (av) obj2;
                    String str4 = du0Var.Z;
                    JSONObject jSONObject2 = du0Var.f13713v;
                    avVar2.zzo(str4);
                    int i10 = ((VersionInfoParcel) this.f14909e).clientJarVersion;
                    int iIntValue = ((Integer) zzba.zzc().a(am.f12416x2)).intValue();
                    Context context3 = this.f14906b;
                    if (i10 < iIntValue) {
                        avVar2.C(du0Var.U, jSONObject2.toString(), ((ou0) ju0Var.f16195a.f20839b).f18363d, new s9.b(context3), new sn0(this, qm0Var), (xt) iInterface2);
                        return;
                    }
                    String str5 = du0Var.U;
                    String string4 = jSONObject2.toString();
                    ou0 ou0Var4 = (ou0) ju0Var.f16195a.f20839b;
                    avVar2.s1(str5, string4, ou0Var4.f18363d, new s9.b(context3), new sn0(this, qm0Var), (xt) iInterface2, ou0Var4.f18369j);
                    return;
                } catch (RemoteException e11) {
                    throw new qu0(e11);
                }
        }
    }

    public gn0(Context context, y70 y70Var) {
        this.f14906b = context;
        this.f14907c = y70Var;
    }

    public gn0(Context context, pd0 pd0Var, VersionInfoParcel versionInfoParcel) {
        this.f14906b = context;
        this.f14907c = pd0Var;
        this.f14909e = versionInfoParcel;
    }
}
