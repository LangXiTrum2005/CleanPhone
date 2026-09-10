package mi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityManager;
import android.view.textservice.TextServicesManager;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.ads.p12;
import com.google.android.gms.internal.ads.sr0;
import com.google.android.gms.internal.measurement.f2;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f45983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ni.c f45984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f45985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i3.f f45986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bj.a f45987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f45988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45990h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f45993k;
    public final io.flutter.embedding.engine.renderer.a l = new io.flutter.embedding.engine.renderer.a(this, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45991i = false;

    public e(d dVar) {
        this.f45983a = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, mi.d] */
    public final void a(sr0 sr0Var) {
        String strM = this.f45983a.m();
        if (strM == null || strM.isEmpty()) {
            strM = (String) ((ri.d) v9.e.F().f52503b).f49603d.f5778c;
        }
        oi.a aVar = new oi.a(strM, this.f45983a.s());
        String strL = this.f45983a.l();
        if (strL == null && (strL = d(this.f45983a.getActivity().getIntent())) == null) {
            strL = "/";
        }
        sr0Var.f20042f = aVar;
        sr0Var.f20040d = strL;
        sr0Var.f20041e = this.f45983a.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, mi.d] */
    public final void b() {
        if (!this.f45983a.z()) {
            this.f45983a.k();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f45983a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final void c() {
        if (this.f45983a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mi.d] */
    public final String d(Intent intent) {
        Uri data;
        if (!this.f45983a.t() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e(int i10, int i11, Intent intent) {
        c();
        if (this.f45984b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Objects.toString(intent);
        p12 p12Var = this.f45984b.f46740d;
        if (!p12Var.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return;
        }
        uj.a.c("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            fc.f fVar = (fc.f) p12Var.f18443g;
            fVar.getClass();
            Iterator it = new HashSet((HashSet) fVar.f40783e).iterator();
            while (true) {
                boolean z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        Trace.endSection();
                        return;
                    } else if (((xi.r) it.next()).onActivityResult(i10, i11, intent) || z10) {
                        z10 = true;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, mi.d] */
    public final void f() {
        c();
        if (this.f45984b == null) {
            String strH = this.f45983a.h();
            if (strH != null) {
                if (d5.e.f38687b == null) {
                    d5.e.f38687b = new d5.e(2);
                }
                ni.c cVar = (ni.c) d5.e.f38687b.f38688a.get(strH);
                this.f45984b = cVar;
                this.f45989g = true;
                if (cVar == null) {
                    throw new IllegalStateException(defpackage.e.o("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", strH, "'"));
                }
            } else {
                ?? r0 = this.f45983a;
                r0.getContext();
                ni.c cVarB = r0.b();
                this.f45984b = cVarB;
                if (cVarB != null) {
                    this.f45989g = true;
                } else {
                    String strX = this.f45983a.x();
                    if (strX != null) {
                        if (ni.f.f46763b == null) {
                            synchronized (ni.f.class) {
                                try {
                                    if (ni.f.f46763b == null) {
                                        ni.f.f46763b = new ni.f(0);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        ni.e eVar = (ni.e) ni.f.f46763b.f46764a.get(strX);
                        if (eVar == null) {
                            throw new IllegalStateException(defpackage.e.o("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", strX, "'"));
                        }
                        sr0 sr0Var = new sr0(this.f45983a.getContext());
                        a(sr0Var);
                        this.f45984b = eVar.a(sr0Var);
                        this.f45989g = false;
                    } else {
                        Context context = this.f45983a.getContext();
                        HashSet hashSet = this.f45983a.n().f46767a;
                        ni.e eVar2 = new ni.e(context, (String[]) hashSet.toArray(new String[hashSet.size()]));
                        sr0 sr0Var2 = new sr0(this.f45983a.getContext());
                        sr0Var2.f20037a = false;
                        sr0Var2.f20038b = this.f45983a.i();
                        a(sr0Var2);
                        this.f45984b = eVar2.a(sr0Var2);
                        this.f45989g = false;
                    }
                }
            }
        }
        if (this.f45983a.y()) {
            p12 p12Var = this.f45984b.f46740d;
            androidx.lifecycle.o lifecycle = this.f45983a.getLifecycle();
            p12Var.getClass();
            uj.a.c("FlutterEngineConnectionRegistry#attachToActivity");
            try {
                e eVar3 = (e) p12Var.f18442f;
                if (eVar3 != null) {
                    eVar3.b();
                }
                p12Var.e();
                p12Var.f18442f = this;
                Activity activity = this.f45983a.getActivity();
                if (activity == null) {
                    throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
                }
                p12Var.b(activity, lifecycle);
                Trace.endSection();
            } catch (Throwable th3) {
                try {
                    Trace.endSection();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        Activity activity2 = this.f45983a.getActivity();
        this.f45986d = this.f45983a.B(activity2, this.f45984b);
        this.f45987e = this.f45983a.p(activity2, this.f45984b);
        this.f45983a.a(this.f45984b);
        this.f45992j = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x0159  */
    /* JADX WARN: Code duplicated, block: B:35:0x015f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0164  */
    /* JADX WARN: Code duplicated, block: B:41:0x01be A[LOOP:0: B:39:0x01b8->B:41:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x01d3 A[LOOP:1: B:43:0x01cd->B:45:0x01d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x01e8 A[LOOP:2: B:47:0x01e2->B:49:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0205 A[LOOP:3: B:51:0x01ff->B:53:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0219 A[LOOP:4: B:54:0x0213->B:56:0x0219, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0233  */
    /* JADX WARN: Code duplicated, block: B:61:0x0237  */
    /* JADX WARN: Code duplicated, block: B:74:0x0274  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final s g(int i10, boolean z10) {
        io.flutter.embedding.engine.renderer.h hVar;
        FlutterJNI flutterJNI;
        boolean zIsEnabled;
        io.flutter.plugin.platform.n nVar;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i11;
        int i12;
        int i13;
        io.flutter.plugin.platform.m mVar;
        SparseArray sparseArray4;
        SparseArray sparseArray5;
        int i14;
        Iterator it;
        boolean z11;
        c();
        if (this.f45983a.o() == 1) {
            n nVar2 = new n(this.f45983a.getContext(), this.f45983a.q() == 2);
            this.f45983a.getClass();
            this.f45985c = new s(this.f45983a.getContext(), nVar2);
        } else {
            p pVar = new p(this.f45983a.getContext());
            pVar.setOpaque(this.f45983a.q() == 1);
            this.f45983a.getClass();
            this.f45985c = new s(this.f45983a.getContext(), pVar);
        }
        this.f45985c.f46057h.add(this.l);
        this.f45983a.getClass();
        s sVar = this.f45985c;
        ni.c cVar = this.f45984b;
        io.flutter.embedding.engine.renderer.a aVar = sVar.f46073y;
        Objects.toString(cVar);
        if (!sVar.c()) {
            sVar.f46059j = cVar;
            hVar = cVar.f46738b;
            boolean z12 = hVar.f43250d;
            flutterJNI = hVar.f43247a;
            sVar.f46058i = z12;
            sVar.f46055f.a(hVar);
            flutterJNI.addIsDisplayingFlutterUiListener(aVar);
            if (hVar.f43250d) {
                aVar.d();
            }
            if (sVar.f46051b) {
                flutterJNI.addResizingFlutterUiListener(sVar.f46072x);
            }
            qj.x xVar = sVar.f46059j.f46744h;
            wi.b bVar = new wi.b();
            bVar.f53211a = sVar;
            bVar.f53212b = xVar;
            xVar.f49096b = new rb.c(bVar, 23);
            sVar.l = bVar;
            ni.c cVar2 = sVar.f46059j;
            sVar.f46061m = new io.flutter.plugin.editing.j(sVar, cVar2.f46753r, cVar2.f46748m, cVar2.f46754s, cVar2.f46755t);
            try {
                TextServicesManager textServicesManager = (TextServicesManager) sVar.getContext().getSystemService("textservices");
                sVar.f46067s = textServicesManager;
                sVar.f46062n = new io.flutter.plugin.editing.h(textServicesManager, sVar.f46059j.f46751p);
            } catch (Exception unused) {
                Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
            }
            new io.flutter.plugin.editing.g(sVar, sVar.f46061m.f43296b, sVar.f46059j.f46748m);
            sVar.f46063o = sVar.f46059j.f46741e;
            sVar.f46064p = new v9.e(sVar);
            sVar.f46065q = new a(sVar.f46059j.f46738b, false);
            io.flutter.view.g gVar = new io.flutter.view.g(sVar, cVar.f46742f, (AccessibilityManager) sVar.getContext().getSystemService("accessibility"), sVar.getContext().getContentResolver(), cVar.f46756u);
            sVar.f46066r = gVar;
            gVar.f43496s = sVar.f46070v;
            zIsEnabled = gVar.f43481c.isEnabled();
            boolean zIsTouchExplorationEnabled = sVar.f46066r.f43481c.isTouchExplorationEnabled();
            if (sVar.f46059j.f46738b.f43247a.getIsSoftwareRenderingEnabled()) {
                sVar.setWillNotDraw(false);
            } else {
                if (!zIsEnabled || zIsTouchExplorationEnabled) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                sVar.setWillNotDraw(z11);
            }
            ni.c cVar3 = sVar.f46059j;
            io.flutter.plugin.platform.n nVar3 = cVar3.f46754s;
            nVar3.f43360i.f43310a = sVar.f46066r;
            nVar3.f43353b = new a(cVar3.f46738b, true);
            ni.c cVar4 = sVar.f46059j;
            io.flutter.plugin.platform.m mVar2 = cVar4.f46755t;
            mVar2.f43343h.f43310a = sVar.f46066r;
            mVar2.f43337b = new a(cVar4.f46738b, true);
            sVar.f46061m.f43296b.restartInput(sVar);
            sVar.d();
            sVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, sVar.f46071w);
            sVar.e();
            nVar = cVar.f46754s;
            sparseArray = nVar.l;
            sparseArray2 = nVar.f43363m;
            sparseArray3 = nVar.f43365o;
            nVar.f43355d = sVar;
            for (i11 = 0; i11 < sparseArray3.size(); i11++) {
                nVar.f43355d.addView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i11));
            }
            for (i12 = 0; i12 < sparseArray2.size(); i12++) {
                nVar.f43355d.addView((si.a) sparseArray2.valueAt(i12));
            }
            for (i13 = 0; i13 < sparseArray.size(); i13++) {
                ((io.flutter.plugin.platform.d) sparseArray.valueAt(i13)).onFlutterViewAttached(nVar.f43355d);
            }
            mVar = cVar.f46755t;
            sparseArray4 = mVar.f43344i;
            sparseArray5 = mVar.f43345j;
            mVar.f43339d = sVar;
            for (i14 = 0; i14 < sparseArray5.size(); i14++) {
                mVar.f43339d.addView((si.a) sparseArray5.valueAt(i14));
            }
            for (int i15 = 0; i15 < sparseArray4.size(); i15++) {
                ((io.flutter.plugin.platform.d) sparseArray4.valueAt(i15)).onFlutterViewAttached(mVar.f43339d);
            }
            it = sVar.f46060k.iterator();
            if (!it.hasNext()) {
                throw f2.j(it);
            }
            if (sVar.f46058i) {
                aVar.d();
            }
        } else if (cVar != sVar.f46059j) {
            sVar.a();
            sVar.f46059j = cVar;
            hVar = cVar.f46738b;
            boolean z13 = hVar.f43250d;
            flutterJNI = hVar.f43247a;
            sVar.f46058i = z13;
            sVar.f46055f.a(hVar);
            flutterJNI.addIsDisplayingFlutterUiListener(aVar);
            if (hVar.f43250d) {
                aVar.d();
            }
            if (sVar.f46051b) {
                flutterJNI.addResizingFlutterUiListener(sVar.f46072x);
            }
            qj.x xVar2 = sVar.f46059j.f46744h;
            wi.b bVar2 = new wi.b();
            bVar2.f53211a = sVar;
            bVar2.f53212b = xVar2;
            xVar2.f49096b = new rb.c(bVar2, 23);
            sVar.l = bVar2;
            ni.c cVar5 = sVar.f46059j;
            sVar.f46061m = new io.flutter.plugin.editing.j(sVar, cVar5.f46753r, cVar5.f46748m, cVar5.f46754s, cVar5.f46755t);
            TextServicesManager textServicesManager2 = (TextServicesManager) sVar.getContext().getSystemService("textservices");
            sVar.f46067s = textServicesManager2;
            sVar.f46062n = new io.flutter.plugin.editing.h(textServicesManager2, sVar.f46059j.f46751p);
            new io.flutter.plugin.editing.g(sVar, sVar.f46061m.f43296b, sVar.f46059j.f46748m);
            sVar.f46063o = sVar.f46059j.f46741e;
            sVar.f46064p = new v9.e(sVar);
            sVar.f46065q = new a(sVar.f46059j.f46738b, false);
            io.flutter.view.g gVar2 = new io.flutter.view.g(sVar, cVar.f46742f, (AccessibilityManager) sVar.getContext().getSystemService("accessibility"), sVar.getContext().getContentResolver(), cVar.f46756u);
            sVar.f46066r = gVar2;
            gVar2.f43496s = sVar.f46070v;
            zIsEnabled = gVar2.f43481c.isEnabled();
            boolean zIsTouchExplorationEnabled2 = sVar.f46066r.f43481c.isTouchExplorationEnabled();
            if (sVar.f46059j.f46738b.f43247a.getIsSoftwareRenderingEnabled()) {
                if (zIsEnabled) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                sVar.setWillNotDraw(z11);
            } else {
                sVar.setWillNotDraw(false);
            }
            ni.c cVar6 = sVar.f46059j;
            io.flutter.plugin.platform.n nVar4 = cVar6.f46754s;
            nVar4.f43360i.f43310a = sVar.f46066r;
            nVar4.f43353b = new a(cVar6.f46738b, true);
            ni.c cVar7 = sVar.f46059j;
            io.flutter.plugin.platform.m mVar3 = cVar7.f46755t;
            mVar3.f43343h.f43310a = sVar.f46066r;
            mVar3.f43337b = new a(cVar7.f46738b, true);
            sVar.f46061m.f43296b.restartInput(sVar);
            sVar.d();
            sVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, sVar.f46071w);
            sVar.e();
            nVar = cVar.f46754s;
            sparseArray = nVar.l;
            sparseArray2 = nVar.f43363m;
            sparseArray3 = nVar.f43365o;
            nVar.f43355d = sVar;
            while (i11 < sparseArray3.size()) {
                nVar.f43355d.addView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i11));
            }
            while (i12 < sparseArray2.size()) {
                nVar.f43355d.addView((si.a) sparseArray2.valueAt(i12));
            }
            while (i13 < sparseArray.size()) {
                ((io.flutter.plugin.platform.d) sparseArray.valueAt(i13)).onFlutterViewAttached(nVar.f43355d);
            }
            mVar = cVar.f46755t;
            sparseArray4 = mVar.f43344i;
            sparseArray5 = mVar.f43345j;
            mVar.f43339d = sVar;
            while (i14 < sparseArray5.size()) {
                mVar.f43339d.addView((si.a) sparseArray5.valueAt(i14));
            }
            while (i15 < sparseArray4.size()) {
                ((io.flutter.plugin.platform.d) sparseArray4.valueAt(i15)).onFlutterViewAttached(mVar.f43339d);
            }
            it = sVar.f46060k.iterator();
            if (!it.hasNext()) {
                throw f2.j(it);
            }
            if (sVar.f46058i) {
                aVar.d();
            }
        }
        this.f45985c.setId(i10);
        if (z10) {
            s sVar2 = this.f45985c;
            if (this.f45983a.o() != 1) {
                throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
            }
            if (this.f45988f != null) {
                sVar2.getViewTreeObserver().removeOnPreDrawListener(this.f45988f);
            }
            this.f45988f = new c(this, sVar2);
            sVar2.getViewTreeObserver().addOnPreDrawListener(this.f45988f);
        }
        return this.f45985c;
    }

    public final void h() {
        c();
        if (this.f45988f != null) {
            this.f45985c.getViewTreeObserver().removeOnPreDrawListener(this.f45988f);
            this.f45988f = null;
        }
        s sVar = this.f45985c;
        if (sVar != null) {
            sVar.a();
            s sVar2 = this.f45985c;
            sVar2.f46057h.remove(this.l);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, mi.d] */
    public final void i() {
        if (this.f45992j) {
            c();
            this.f45983a.e(this.f45984b);
            if (this.f45983a.y()) {
                if (this.f45983a.getActivity().isChangingConfigurations()) {
                    p12 p12Var = this.f45984b.f46740d;
                    if (p12Var.f()) {
                        uj.a.c("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                        try {
                            p12Var.f18437a = true;
                            Iterator it = ((HashMap) p12Var.f18441e).values().iterator();
                            while (it.hasNext()) {
                                ((ui.a) it.next()).onDetachedFromActivityForConfigChanges();
                            }
                            p12Var.d();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                    }
                } else {
                    this.f45984b.f46740d.c();
                }
            }
            i3.f fVar = this.f45986d;
            if (fVar != null) {
                ((v6.c) fVar.f42854d).f52488b = null;
                this.f45986d = null;
            }
            bj.a aVar = this.f45987e;
            if (aVar != null) {
                aVar.f5707c.f47269b = null;
                aVar.f5705a = null;
                this.f45987e = null;
            }
            this.f45983a.getClass();
            ni.c cVar = this.f45984b;
            if (cVar != null) {
                b2.l lVar = cVar.f46743g;
                lVar.e(1, lVar.f5319c);
            }
            if (this.f45983a.z()) {
                ni.c cVar2 = this.f45984b;
                FlutterJNI flutterJNI = cVar2.f46737a;
                Iterator it2 = cVar2.f46757v.iterator();
                while (it2.hasNext()) {
                    ((ni.b) it2.next()).b();
                }
                p12 p12Var2 = cVar2.f46740d;
                p12Var2.e();
                HashMap map = (HashMap) p12Var2.f18438b;
                for (Class cls : new HashSet(map.keySet())) {
                    ti.b bVar = (ti.b) map.get(cls);
                    if (bVar != null) {
                        uj.a.c("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar instanceof ui.a) {
                                if (p12Var2.f()) {
                                    ((ui.a) bVar).onDetachedFromActivity();
                                }
                                ((HashMap) p12Var2.f18441e).remove(cls);
                            }
                            bVar.onDetachedFromEngine((ti.a) p12Var2.f18440d);
                            map.remove(cls);
                            Trace.endSection();
                        } catch (Throwable th4) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                }
                map.clear();
                io.flutter.plugin.platform.n nVar = cVar2.f46754s;
                SparseArray sparseArray = nVar.l;
                while (sparseArray.size() > 0) {
                    nVar.f43373w.K(sparseArray.keyAt(0));
                }
                io.flutter.plugin.platform.m mVar = cVar2.f46755t;
                SparseArray sparseArray2 = mVar.f43344i;
                while (sparseArray2.size() > 0) {
                    mVar.f43350p.K(sparseArray2.keyAt(0));
                }
                ((FlutterJNI) cVar2.f46739c.f46321c).setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(cVar2.f46759x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                v9.e.F().getClass();
                ni.c.f46736z.remove(Long.valueOf(cVar2.f46758w));
                if (this.f45983a.h() != null) {
                    if (d5.e.f38687b == null) {
                        d5.e.f38687b = new d5.e(2);
                    }
                    d5.e eVar = d5.e.f38687b;
                    eVar.f38688a.remove(this.f45983a.h());
                }
                this.f45984b = null;
            }
            this.f45992j = false;
        }
    }

    public final void j(Intent intent) {
        c();
        ni.c cVar = this.f45984b;
        if (cVar == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        p12 p12Var = cVar.f46740d;
        if (p12Var.f()) {
            uj.a.c("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                Iterator it = ((HashSet) ((fc.f) p12Var.f18443g).f40784f).iterator();
                while (it.hasNext()) {
                    ((xi.s) it.next()).onNewIntent(intent);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
        String strD = d(intent);
        if (strD == null || strD.isEmpty()) {
            return;
        }
        rb.c cVar2 = this.f45984b.f46745i;
        cVar2.getClass();
        HashMap map = new HashMap();
        map.put("location", strD);
        ((xi.p) cVar2.f49529b).a("pushRouteInformation", map, null);
    }

    public final void k() {
        c();
        if (this.f45984b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        i3.f fVar = this.f45986d;
        if (fVar != null) {
            fVar.v();
        }
        this.f45984b.f46754s.i();
    }

    public final void l(int i10, String[] strArr, int[] iArr) {
        c();
        if (this.f45984b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Arrays.toString(strArr);
        Arrays.toString(iArr);
        p12 p12Var = this.f45984b.f46740d;
        if (!p12Var.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return;
        }
        uj.a.c("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            Iterator it = ((HashSet) ((fc.f) p12Var.f18443g).f40782d).iterator();
            while (true) {
                boolean z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        Trace.endSection();
                        return;
                    } else if (((xi.t) it.next()).onRequestPermissionsResult(i10, strArr, iArr) || z10) {
                        z10 = true;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, mi.d] */
    public final void m(Bundle bundle) {
        byte[] byteArray;
        c();
        if (bundle != null) {
            bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
        } else {
            byteArray = null;
        }
        if (this.f45983a.i()) {
            p.s sVar = this.f45984b.f46747k;
            sVar.f47791d = true;
            wi.j jVar = (wi.j) sVar.f47789b;
            if (jVar != null) {
                jVar.a(p.s.d(byteArray));
                sVar.f47789b = null;
                sVar.f47793f = byteArray;
            } else if (sVar.f47792e) {
                ((xi.p) sVar.f47788a).a(Constants.PUSH, p.s.d(byteArray), new wi.j(0, sVar, byteArray));
            } else {
                sVar.f47793f = byteArray;
            }
        }
        if (this.f45983a.y()) {
            p12 p12Var = this.f45984b.f46740d;
            if (!p12Var.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
                return;
            }
            uj.a.c("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                Iterator it = ((HashSet) ((fc.f) p12Var.f18443g).f40786h).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public final void n() {
        c();
        this.f45984b.f46738b.c();
        this.f45983a.getClass();
        ni.c cVar = this.f45984b;
        if (cVar != null) {
            b2.l lVar = cVar.f46743g;
            lVar.e(2, lVar.f5319c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, mi.d] */
    public final void o(Bundle bundle) {
        c();
        if (this.f45983a.i()) {
            bundle.putByteArray("framework", (byte[]) this.f45984b.f46747k.f47793f);
        }
        if (this.f45983a.y()) {
            Bundle bundle2 = new Bundle();
            p12 p12Var = this.f45984b.f46740d;
            if (p12Var.f()) {
                uj.a.c("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((fc.f) p12Var.f18443g).f40786h).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
        }
        if (this.f45983a.h() == null || this.f45983a.z()) {
            return;
        }
        bundle.putBoolean("enableOnBackInvokedCallbackState", this.f45983a.v());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, mi.d] */
    public final void p() {
        c();
        if (this.f45983a.h() == null && !this.f45984b.f46739c.f46320b) {
            String strL = this.f45983a.l();
            if (strL == null && (strL = d(this.f45983a.getActivity().getIntent())) == null) {
                strL = "/";
            }
            String strA = this.f45983a.A();
            this.f45983a.s();
            ((xi.p) this.f45984b.f46745i.f49529b).a("setInitialRoute", strL, null);
            String strM = this.f45983a.m();
            if (strM == null || strM.isEmpty()) {
                strM = (String) ((ri.d) v9.e.F().f52503b).f49603d.f5778c;
            }
            this.f45984b.f46739c.d(strA == null ? new oi.a(strM, this.f45983a.s()) : new oi.a(strM, strA, this.f45983a.s()), this.f45983a.f());
        }
        Integer num = this.f45993k;
        if (num != null) {
            this.f45985c.setVisibility(num.intValue());
        }
    }

    public final void q() {
        c();
        this.f45983a.getClass();
        ni.c cVar = this.f45984b;
        if (cVar != null) {
            b2.l lVar = cVar.f46743g;
            lVar.e(5, lVar.f5319c);
        }
        this.f45993k = Integer.valueOf(this.f45985c.getVisibility());
        this.f45985c.setVisibility(8);
        ni.c cVar2 = this.f45984b;
        if (cVar2 != null) {
            cVar2.f46738b.b(40);
        }
    }

    public final void r(int i10) {
        c();
        ni.c cVar = this.f45984b;
        if (cVar != null) {
            if (this.f45991i && i10 >= 10) {
                FlutterJNI flutterJNI = (FlutterJNI) cVar.f46739c.f46321c;
                if (flutterJNI.isAttached()) {
                    flutterJNI.notifyLowMemoryWarning();
                }
                rb.c cVar2 = this.f45984b.f46752q;
                cVar2.getClass();
                HashMap map = new HashMap(1);
                map.put("type", "memoryPressure");
                ((k5.g) cVar2.f49529b).y(map, null);
            }
            this.f45984b.f46738b.b(i10);
            io.flutter.plugin.platform.n nVar = this.f45984b.f46754s;
            if (i10 < 40) {
                nVar.getClass();
                return;
            }
            Iterator it = nVar.f43361j.values().iterator();
            while (it.hasNext()) {
                ((io.flutter.plugin.platform.x) it.next()).f43399h.setSurface(null);
            }
        }
    }

    public final void s() {
        c();
        ni.c cVar = this.f45984b;
        if (cVar == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        p12 p12Var = cVar.f46740d;
        if (!p12Var.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        uj.a.c("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            Iterator it = ((HashSet) ((fc.f) p12Var.f18443g).f40785g).iterator();
            if (!it.hasNext()) {
                Trace.endSection();
            } else {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void t(boolean z10) {
        c();
        this.f45983a.getClass();
        ni.c cVar = this.f45984b;
        if (cVar != null) {
            b2.l lVar = cVar.f46743g;
            if (z10) {
                lVar.e(lVar.f5317a, true);
            } else {
                lVar.e(lVar.f5317a, false);
            }
        }
    }
}
