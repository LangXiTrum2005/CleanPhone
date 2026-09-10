package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ee0 extends m80 {
    public static final ya1 J;
    public boolean A;
    public final iz B;
    public final qf C;
    public final VersionInfoParcel D;
    public final Context E;
    public final ge0 F;
    public final ip0 G;
    public final HashMap H;
    public final ArrayList I;
    public final Executor l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final je0 f13937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final me0 f13938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final se0 f13939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final le0 f13940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ne0 f13941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dx1 f13942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dx1 f13943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dx1 f13944t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final dx1 f13945u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final dx1 f13946v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public qh f13947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13948x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13949y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13950z;

    static {
        aa1 aa1Var = ca1.f13122b;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        ps1.s(6, objArr);
        J = ca1.A(6, objArr);
    }

    public ee0(k80 k80Var, Executor executor, je0 je0Var, me0 me0Var, se0 se0Var, le0 le0Var, ne0 ne0Var, dx1 dx1Var, dx1 dx1Var2, dx1 dx1Var3, dx1 dx1Var4, dx1 dx1Var5, iz izVar, qf qfVar, VersionInfoParcel versionInfoParcel, Context context, ge0 ge0Var, ip0 ip0Var) {
        super(k80Var);
        this.l = executor;
        this.f13937m = je0Var;
        this.f13938n = me0Var;
        this.f13939o = se0Var;
        this.f13940p = le0Var;
        this.f13941q = ne0Var;
        this.f13942r = dx1Var;
        this.f13943s = dx1Var2;
        this.f13944t = dx1Var3;
        this.f13945u = dx1Var4;
        this.f13946v = dx1Var5;
        this.B = izVar;
        this.C = qfVar;
        this.D = versionInfoParcel;
        this.E = context;
        this.F = ge0Var;
        this.G = ip0Var;
        this.H = new HashMap();
        this.I = new ArrayList();
    }

    public static boolean d(View view) {
        if (!((Boolean) zzba.zzc().a(am.f12230kc)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        zzt.zzc();
        long jZzy = zzs.zzy(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return jZzy >= ((long) ((Integer) zzba.zzc().a(am.lc)).intValue());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a() {
        be0 be0Var = new be0(this, 1);
        Executor executor = this.l;
        executor.execute(be0Var);
        if (this.f13937m.q() != 7) {
            me0 me0Var = this.f13938n;
            Objects.requireNonNull(me0Var);
            executor.execute(new x60(me0Var, 7));
        }
        super.a();
    }

    public final synchronized void c(final View view, final int i10) {
        if (((Boolean) zzba.zzc().a(am.f12216jd)).booleanValue()) {
            qh qhVar = this.f13947w;
            if (qhVar == null) {
                int i11 = zze.zza;
                zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z10 = qhVar instanceof pe0;
                this.l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.de0
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
                    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
                    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        ee0 ee0Var = this.f13506a;
                        ?? r2 = ee0Var.f13947w;
                        if (r2 == 0) {
                            int i12 = zze.zza;
                            zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        ee0Var.f13938n.g(view, r2.w1(), ee0Var.f13947w.zzi(), ee0Var.f13947w.zzj(), z10, ee0Var.k(), i10);
                    }
                });
            }
        }
    }

    public final km0 e(String str, boolean z10) {
        boolean z11;
        boolean z12;
        String str2;
        int i10;
        int i11;
        String str3;
        le0 le0Var = this.f13940p;
        if (le0Var.c() && !TextUtils.isEmpty(str)) {
            je0 je0Var = this.f13937m;
            b30 b30VarJ = je0Var.j();
            b30 b30VarH = je0Var.h();
            if (b30VarJ == null && b30VarH == null) {
                int i12 = zze.zza;
                zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            le0Var.f();
            int iQ = le0Var.f().Q();
            int i13 = iQ - 1;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (iQ != 1) {
                        str3 = iQ != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    String strJ = q4.a.j(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i14 = zze.zza;
                    zzo.zzi(strJ);
                    return null;
                }
                if (b30VarJ == null) {
                    int i15 = zze.zza;
                    zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z12 = false;
                z11 = true;
            } else if (b30VarH != null) {
                z11 = false;
                z12 = true;
            } else {
                int i16 = zze.zza;
                zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z11) {
                str2 = null;
            } else if (z12) {
                str2 = "javascript";
                b30VarJ = b30VarH;
            } else {
                b30VarJ = null;
                str2 = null;
            }
            if (b30VarJ == null) {
                int i17 = zze.zza;
                zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!((tc0) zzt.zzu()).d(this.E)) {
                int i18 = zze.zza;
                zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.D;
            int i19 = versionInfoParcel.buddyApkVersion;
            int i20 = versionInfoParcel.clientJarVersion;
            StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.e(i19, 1) + String.valueOf(i20).length());
            sb2.append(i19);
            sb2.append(".");
            sb2.append(i20);
            String string = sb2.toString();
            if (z12) {
                i11 = 3;
                i10 = 2;
            } else {
                i10 = je0Var.q() == 3 ? 4 : 3;
                i11 = 2;
            }
            im0 im0VarZzu = zzt.zzu();
            WebView webViewZzD = b30VarJ.zzD();
            String str4 = this.f17335b.f13696l0;
            ((tc0) im0VarZzu).getClass();
            km0 km0Var = (((Boolean) zzba.zzc().a(am.q6)).booleanValue() && pi1.L.f17679b) ? (km0) tc0.n(new em0(str, string, str2, i11, webViewZzD, str4, i10)) : null;
            if (km0Var == null) {
                int i21 = zze.zza;
                zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            synchronized (je0Var) {
                je0Var.l = km0Var;
            }
            b30VarJ.a0(km0Var);
            if (z12) {
                ky0 ky0Var = km0Var.f16480a;
                if (b30VarH != null) {
                    ((tc0) zzt.zzu()).i(ky0Var, b30VarH.zzE());
                }
                this.A = true;
            }
            if (z10) {
                ((tc0) zzt.zzu()).h(km0Var.f16480a);
                b30VarJ.e("onSdkLoaded", new x.e(0));
            }
            return km0Var;
        }
        return null;
    }

    public final void f(View view) {
        m00 m00Var;
        je0 je0Var = this.f13937m;
        if (!((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue() || je0Var.q() == 3) {
            m(view, je0Var.k());
            return;
        }
        synchronized (je0Var) {
            m00Var = je0Var.f16062n;
        }
        if (m00Var == null) {
            return;
        }
        md0 md0Var = new md0((Object) this, false, (Object) view, 17);
        m00Var.addListener(new zd1(0, m00Var, md0Var), this.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    public final synchronized void g(df0 df0Var) {
        Iterator<String> itKeys;
        View view;
        of ofVar;
        try {
            if (!this.f13948x) {
                this.f13947w = (qh) df0Var;
                se0 se0Var = this.f13939o;
                se0Var.f19945g.execute(new zd1(se0Var, df0Var));
                this.f13938n.a(df0Var.w1(), df0Var.zzj(), df0Var.zzk(), df0Var, df0Var);
                if (((Boolean) zzba.zzc().a(am.E3)).booleanValue() && (ofVar = this.C.f19044b) != null) {
                    ofVar.zzh(df0Var.w1());
                }
                if (((Boolean) zzba.zzc().a(am.A2)).booleanValue()) {
                    du0 du0Var = this.f17335b;
                    if (du0Var.f13695k0 && (itKeys = du0Var.f13693j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ?? r2 = this.f13947w;
                            WeakReference weakReference = r2 == 0 ? null : (WeakReference) r2.zzi().get(next);
                            this.H.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                bi biVar = new bi(this.E, view);
                                this.I.add(biVar);
                                biVar.l.add(new ae0(this, next));
                                biVar.d(3);
                            }
                        }
                    }
                }
                if (df0Var.zzg() != null) {
                    bi biVarZzg = df0Var.zzg();
                    biVarZzg.l.add(this.B);
                    biVarZzg.d(3);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void h(df0 df0Var) {
        View viewW1 = df0Var.w1();
        df0Var.zzi();
        this.f13938n.d(viewW1);
        if (df0Var.v1() != null) {
            df0Var.v1().setClickable(false);
            df0Var.v1().removeAllViews();
        }
        if (df0Var.zzg() != null) {
            bi biVarZzg = df0Var.zzg();
            biVarZzg.l.remove(this.B);
        }
        this.f13947w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized void i(View view, Map map, Map map2) {
        this.f13939o.a(this.f13947w);
        this.f13938n.s(view, map, map2, k());
        this.f13949y = true;
    }

    public final synchronized void j(View view, Map map, Map map2) {
        View view2;
        if (!this.f13950z) {
            synchronized (this) {
                if (map == null) {
                    view2 = null;
                } else {
                    try {
                        ya1 ya1Var = J;
                        int i10 = ya1Var.f22210d;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i10) {
                                WeakReference weakReference = (WeakReference) map.get((String) ya1Var.get(i11));
                                i11++;
                                if (weakReference != null) {
                                    view2 = (View) weakReference.get();
                                }
                            } else {
                                view2 = null;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (view2 != null) {
                    if (((Boolean) zzba.zzc().a(am.f12307pf)).booleanValue()) {
                        Rect rect = new Rect();
                        if (view2.getGlobalVisibleRect(rect, new Point()) && view2.getHeight() == rect.height() && view2.getWidth() == rect.width()) {
                            this.f13938n.r(view, map, map2, k());
                            this.f13950z = true;
                        }
                    } else {
                        if (!((Boolean) zzba.zzc().a(am.qf)).booleanValue()) {
                            ul ulVar = am.f12335rf;
                            if (((Float) zzba.zzc().a(ulVar)).floatValue() > 0.0d) {
                                double dFloatValue = ((Float) zzba.zzc().a(ulVar)).floatValue();
                                Rect rect2 = new Rect();
                                if (view2.getGlobalVisibleRect(rect2, new Point())) {
                                    if (rect2.height() * rect2.width() >= ((double) (view2.getHeight() * view2.getWidth())) * (dFloatValue / 100.0d)) {
                                        this.f13938n.r(view, map, map2, k());
                                        this.f13950z = true;
                                    }
                                }
                            }
                        } else if (d(view2)) {
                            this.f13938n.r(view, map, map2, k());
                            this.f13950z = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    public final synchronized ImageView.ScaleType k() {
        ?? r0 = this.f13947w;
        if (r0 == 0) {
            int i10 = zze.zza;
            zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        s9.a aVarZzn = r0.zzn();
        if (aVarZzn != null) {
            return (ImageView.ScaleType) s9.b.y1(aVarZzn);
        }
        return se0.f19938k;
    }

    public final void l() {
        ListenableFuture listenableFuture;
        if (!((Boolean) zzba.zzc().a(am.f12420x6)).booleanValue()) {
            e("Google", true);
            return;
        }
        je0 je0Var = this.f13937m;
        synchronized (je0Var) {
            listenableFuture = je0Var.f16061m;
        }
        if (listenableFuture == null) {
            return;
        }
        vf vfVar = new vf(this, 20);
        listenableFuture.addListener(new zd1(0, listenableFuture, vfVar), this.l);
    }

    public final void m(View view, km0 km0Var) {
        b30 b30VarJ = this.f13937m.j();
        if (!this.f13940p.c() || km0Var == null || b30VarJ == null || view == null) {
            return;
        }
        ((tc0) zzt.zzu()).i(km0Var.f16480a, view);
    }

    public final synchronized void n() {
        this.f13948x = true;
        this.l.execute(new be0(this, 0));
        pa0 pa0Var = this.f17336c;
        pa0Var.getClass();
        pa0Var.S0(new zl(null, 1));
    }

    public final synchronized boolean o(Bundle bundle) {
        if (this.f13949y) {
            return true;
        }
        boolean zJ = this.f13938n.j(bundle);
        this.f13949y = zJ;
        return zJ;
    }

    public final synchronized void p(df0 df0Var) {
        if (((Boolean) zzba.zzc().a(am.f12432y2)).booleanValue()) {
            zzs.zza.post(new ce0(this, df0Var, 0));
        } else {
            g(df0Var);
        }
    }

    public final synchronized void q(df0 df0Var) {
        if (((Boolean) zzba.zzc().a(am.f12432y2)).booleanValue()) {
            zzs.zza.post(new ce0(this, df0Var, 1));
        } else {
            h(df0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:10:0x0012, B:12:0x001a, B:15:0x0027, B:16:0x002c, B:18:0x003e, B:21:0x0047, B:23:0x004d), top: B:34:0x0001, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    public final synchronized void r(View view, View view2, Map map, Map map2, boolean z10) {
        je0 je0Var;
        b30 b30VarH;
        ze0 ze0Var;
        se0 se0Var = this.f13939o;
        ?? r2 = this.f13947w;
        if (r2 == 0 || (ze0Var = se0Var.f19943e) == null || r2.v1() == null || !se0Var.f19941c.a()) {
            this.f13938n.q(view, view2, map, map2, z10, k());
            if (this.A) {
                je0Var = this.f13937m;
                if (je0Var.h() != null && (b30VarH = je0Var.h()) != null) {
                    b30VarH.e("onSdkAdUserInteractionClick", new x.e(0));
                    return;
                }
            }
            return;
        }
        try {
            r2.v1().addView(ze0Var.a());
        } catch (k30 e10) {
            zze.zzb("web view can not be obtained", e10);
        }
        this.f13938n.q(view, view2, map, map2, z10, k());
        if (this.A) {
            je0Var = this.f13937m;
            if (je0Var.h() != null) {
                b30VarH.e("onSdkAdUserInteractionClick", new x.e(0));
                return;
            }
        }
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    public final synchronized void s(View view, Map map, Map map2, boolean z10) {
        Iterator it;
        View view2;
        if (this.f13949y) {
            j(view, map, map2);
            return;
        }
        if (((Boolean) zzba.zzc().a(am.A2)).booleanValue() && this.f17335b.f13695k0) {
            HashMap map3 = this.H;
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) map3.get((String) it2.next())).booleanValue()) {
                }
            }
            if (!z10) {
                i(view, map, map2);
                j(view, map, map2);
                return;
            }
            if (((Boolean) zzba.zzc().a(am.U4)).booleanValue()) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null) {
                    }
                }
            }
        } else {
            if (!z10) {
                i(view, map, map2);
                j(view, map, map2);
                return;
            }
            if (((Boolean) zzba.zzc().a(am.U4)).booleanValue() && map != null) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null && d(view2)) {
                        i(view, map, map2);
                        return;
                    }
                }
            }
        }
    }
}
