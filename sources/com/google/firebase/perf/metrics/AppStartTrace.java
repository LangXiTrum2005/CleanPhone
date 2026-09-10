package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.annotation.Keep;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import d5.o;
import dd.a;
import gd.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jj.d;
import ld.g;
import md.e;
import md.h;
import nd.l;
import nd.o0;
import nd.r0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, u {
    public static ThreadPoolExecutor A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f24688x = new h();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f24689y = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile AppStartTrace f24690z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f24692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f24693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f24694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Application f24695e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f24697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f24698h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jd.a f24707r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24691a = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24696f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f24699i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f24700j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f24701k = null;
    public h l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f24702m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f24703n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f24704o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f24705p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f24706q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24708s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24709t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f24710u = new b(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f24711v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f24712w = null;

    public AppStartTrace(g gVar, d dVar, a aVar, ThreadPoolExecutor threadPoolExecutor) {
        h hVar = null;
        this.f24692b = gVar;
        this.f24693c = aVar;
        A = threadPoolExecutor;
        o0 o0VarZ = r0.z();
        o0VarZ.q("_experiment_app_start_ttid");
        this.f24694d = o0VarZ;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.f24697g = new h((micros - h.a()) + h.e(), micros);
        mb.a aVar2 = (mb.a) mb.g.e().c(mb.a.class);
        if (aVar2 != null) {
            long micros2 = timeUnit.toMicros(aVar2.f45917b);
            hVar = new h((micros2 - h.a()) + h.e(), micros2);
        }
        this.f24698h = hVar;
    }

    public static boolean e(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strH = wi.d.h(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strH))) {
                return true;
            }
        }
        return false;
    }

    public final h b() {
        h hVar = this.f24698h;
        return hVar != null ? hVar : f24688x;
    }

    public final h c() {
        h hVar = this.f24697g;
        return hVar != null ? hVar : b();
    }

    public final void f(o0 o0Var) {
        if (this.f24704o == null || this.f24705p == null || this.f24706q == null) {
            return;
        }
        A.execute(new com.unity3d.services.ads.operation.show.b(18, this, o0Var));
        g();
    }

    public final synchronized void g() {
        if (this.f24691a) {
            k0.f4555h.f4561f.b(this);
            this.f24695e.unregisterActivityLifecycleCallbacks(this);
            this.f24691a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                o oVar = this.f24712w;
                if (oVar == null || oVar.f38703b != 1) {
                    this.f24708s = true;
                }
            } else if (this.f24700j != null) {
                this.f24708s = true;
                this.f24700j = null;
            }
            if (!this.f24708s && this.f24699i == null) {
                this.f24711v = this.f24711v || e(this.f24695e);
                new WeakReference(activity);
                this.f24699i = new h();
                if (c().c(this.f24699i) > f24689y) {
                    this.f24696f = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f24708s || this.f24696f) {
            return;
        }
        a aVar = this.f24693c;
        aVar.getClass();
        md.d dVarH = aVar.h(dd.d.V());
        if ((dVarH.b() ? ((Boolean) dVarH.a()).booleanValue() : false) && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
            viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f24710u);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [gd.a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [gd.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [gd.a] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f24708s && !this.f24696f) {
                a aVar = this.f24693c;
                aVar.getClass();
                md.d dVarH = aVar.h(dd.d.V());
                boolean zBooleanValue = dVarH.b() ? ((Boolean) dVarH.a()).booleanValue() : false;
                if (zBooleanValue && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f24710u);
                    final int i10 = 0;
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(new md.b(viewFindViewById, new Runnable(this) { // from class: gd.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f41841b;

                        {
                            this.f41841b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            AppStartTrace appStartTrace = this.f41841b;
                            switch (i11) {
                                case 0:
                                    o0 o0Var = appStartTrace.f24694d;
                                    if (appStartTrace.f24706q == null) {
                                        appStartTrace.f24706q = new h();
                                        o0 o0VarZ = r0.z();
                                        o0VarZ.q("_experiment_onDrawFoQ");
                                        o0VarZ.o(appStartTrace.c().f45967a);
                                        o0VarZ.p(appStartTrace.c().c(appStartTrace.f24706q));
                                        o0Var.j((r0) o0VarZ.build());
                                        if (appStartTrace.f24697g != null) {
                                            o0 o0VarZ2 = r0.z();
                                            o0VarZ2.q("_experiment_procStart_to_classLoad");
                                            o0VarZ2.o(appStartTrace.c().f45967a);
                                            o0VarZ2.p(appStartTrace.c().c(appStartTrace.b()));
                                            o0Var.j((r0) o0VarZ2.build());
                                        }
                                        o0Var.n(appStartTrace.f24711v ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
                                        o0Var.m(appStartTrace.f24709t, "onDrawCount");
                                        o0Var.i(appStartTrace.f24707r.a());
                                        appStartTrace.f(o0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    o0 o0Var2 = appStartTrace.f24694d;
                                    if (appStartTrace.f24704o == null) {
                                        appStartTrace.f24704o = new h();
                                        o0Var2.o(appStartTrace.c().f45967a);
                                        o0Var2.p(appStartTrace.c().c(appStartTrace.f24704o));
                                        appStartTrace.f(o0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    o0 o0Var3 = appStartTrace.f24694d;
                                    if (appStartTrace.f24705p == null) {
                                        appStartTrace.f24705p = new h();
                                        o0 o0VarZ3 = r0.z();
                                        o0VarZ3.q("_experiment_preDrawFoQ");
                                        o0VarZ3.o(appStartTrace.c().f45967a);
                                        o0VarZ3.p(appStartTrace.c().c(appStartTrace.f24705p));
                                        o0Var3.j((r0) o0VarZ3.build());
                                        appStartTrace.f(o0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    h hVar = AppStartTrace.f24688x;
                                    o0 o0VarZ4 = r0.z();
                                    o0VarZ4.q("_as");
                                    o0VarZ4.o(appStartTrace.b().f45967a);
                                    o0VarZ4.p(appStartTrace.b().c(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    o0 o0VarZ5 = r0.z();
                                    o0VarZ5.q("_astui");
                                    o0VarZ5.o(appStartTrace.b().f45967a);
                                    o0VarZ5.p(appStartTrace.b().c(appStartTrace.f24699i));
                                    arrayList.add((r0) o0VarZ5.build());
                                    if (appStartTrace.f24701k != null) {
                                        o0 o0VarZ6 = r0.z();
                                        o0VarZ6.q("_astfd");
                                        o0VarZ6.o(appStartTrace.f24699i.f45967a);
                                        o0VarZ6.p(appStartTrace.f24699i.c(appStartTrace.f24701k));
                                        arrayList.add((r0) o0VarZ6.build());
                                        o0 o0VarZ7 = r0.z();
                                        o0VarZ7.q("_asti");
                                        o0VarZ7.o(appStartTrace.f24701k.f45967a);
                                        o0VarZ7.p(appStartTrace.f24701k.c(appStartTrace.l));
                                        arrayList.add((r0) o0VarZ7.build());
                                    }
                                    o0VarZ4.h(arrayList);
                                    o0VarZ4.i(appStartTrace.f24707r.a());
                                    appStartTrace.f24692b.c((r0) o0VarZ4.build(), l.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                    final int i11 = 1;
                    final int i12 = 2;
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new e(viewFindViewById, new Runnable(this) { // from class: gd.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f41841b;

                        {
                            this.f41841b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i11;
                            AppStartTrace appStartTrace = this.f41841b;
                            switch (i13) {
                                case 0:
                                    o0 o0Var = appStartTrace.f24694d;
                                    if (appStartTrace.f24706q == null) {
                                        appStartTrace.f24706q = new h();
                                        o0 o0VarZ = r0.z();
                                        o0VarZ.q("_experiment_onDrawFoQ");
                                        o0VarZ.o(appStartTrace.c().f45967a);
                                        o0VarZ.p(appStartTrace.c().c(appStartTrace.f24706q));
                                        o0Var.j((r0) o0VarZ.build());
                                        if (appStartTrace.f24697g != null) {
                                            o0 o0VarZ2 = r0.z();
                                            o0VarZ2.q("_experiment_procStart_to_classLoad");
                                            o0VarZ2.o(appStartTrace.c().f45967a);
                                            o0VarZ2.p(appStartTrace.c().c(appStartTrace.b()));
                                            o0Var.j((r0) o0VarZ2.build());
                                        }
                                        o0Var.n(appStartTrace.f24711v ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
                                        o0Var.m(appStartTrace.f24709t, "onDrawCount");
                                        o0Var.i(appStartTrace.f24707r.a());
                                        appStartTrace.f(o0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    o0 o0Var2 = appStartTrace.f24694d;
                                    if (appStartTrace.f24704o == null) {
                                        appStartTrace.f24704o = new h();
                                        o0Var2.o(appStartTrace.c().f45967a);
                                        o0Var2.p(appStartTrace.c().c(appStartTrace.f24704o));
                                        appStartTrace.f(o0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    o0 o0Var3 = appStartTrace.f24694d;
                                    if (appStartTrace.f24705p == null) {
                                        appStartTrace.f24705p = new h();
                                        o0 o0VarZ3 = r0.z();
                                        o0VarZ3.q("_experiment_preDrawFoQ");
                                        o0VarZ3.o(appStartTrace.c().f45967a);
                                        o0VarZ3.p(appStartTrace.c().c(appStartTrace.f24705p));
                                        o0Var3.j((r0) o0VarZ3.build());
                                        appStartTrace.f(o0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    h hVar = AppStartTrace.f24688x;
                                    o0 o0VarZ4 = r0.z();
                                    o0VarZ4.q("_as");
                                    o0VarZ4.o(appStartTrace.b().f45967a);
                                    o0VarZ4.p(appStartTrace.b().c(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    o0 o0VarZ5 = r0.z();
                                    o0VarZ5.q("_astui");
                                    o0VarZ5.o(appStartTrace.b().f45967a);
                                    o0VarZ5.p(appStartTrace.b().c(appStartTrace.f24699i));
                                    arrayList.add((r0) o0VarZ5.build());
                                    if (appStartTrace.f24701k != null) {
                                        o0 o0VarZ6 = r0.z();
                                        o0VarZ6.q("_astfd");
                                        o0VarZ6.o(appStartTrace.f24699i.f45967a);
                                        o0VarZ6.p(appStartTrace.f24699i.c(appStartTrace.f24701k));
                                        arrayList.add((r0) o0VarZ6.build());
                                        o0 o0VarZ7 = r0.z();
                                        o0VarZ7.q("_asti");
                                        o0VarZ7.o(appStartTrace.f24701k.f45967a);
                                        o0VarZ7.p(appStartTrace.f24701k.c(appStartTrace.l));
                                        arrayList.add((r0) o0VarZ7.build());
                                    }
                                    o0VarZ4.h(arrayList);
                                    o0VarZ4.i(appStartTrace.f24707r.a());
                                    appStartTrace.f24692b.c((r0) o0VarZ4.build(), l.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: gd.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f41841b;

                        {
                            this.f41841b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i12;
                            AppStartTrace appStartTrace = this.f41841b;
                            switch (i13) {
                                case 0:
                                    o0 o0Var = appStartTrace.f24694d;
                                    if (appStartTrace.f24706q == null) {
                                        appStartTrace.f24706q = new h();
                                        o0 o0VarZ = r0.z();
                                        o0VarZ.q("_experiment_onDrawFoQ");
                                        o0VarZ.o(appStartTrace.c().f45967a);
                                        o0VarZ.p(appStartTrace.c().c(appStartTrace.f24706q));
                                        o0Var.j((r0) o0VarZ.build());
                                        if (appStartTrace.f24697g != null) {
                                            o0 o0VarZ2 = r0.z();
                                            o0VarZ2.q("_experiment_procStart_to_classLoad");
                                            o0VarZ2.o(appStartTrace.c().f45967a);
                                            o0VarZ2.p(appStartTrace.c().c(appStartTrace.b()));
                                            o0Var.j((r0) o0VarZ2.build());
                                        }
                                        o0Var.n(appStartTrace.f24711v ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
                                        o0Var.m(appStartTrace.f24709t, "onDrawCount");
                                        o0Var.i(appStartTrace.f24707r.a());
                                        appStartTrace.f(o0Var);
                                        break;
                                    }
                                    break;
                                case 1:
                                    o0 o0Var2 = appStartTrace.f24694d;
                                    if (appStartTrace.f24704o == null) {
                                        appStartTrace.f24704o = new h();
                                        o0Var2.o(appStartTrace.c().f45967a);
                                        o0Var2.p(appStartTrace.c().c(appStartTrace.f24704o));
                                        appStartTrace.f(o0Var2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    o0 o0Var3 = appStartTrace.f24694d;
                                    if (appStartTrace.f24705p == null) {
                                        appStartTrace.f24705p = new h();
                                        o0 o0VarZ3 = r0.z();
                                        o0VarZ3.q("_experiment_preDrawFoQ");
                                        o0VarZ3.o(appStartTrace.c().f45967a);
                                        o0VarZ3.p(appStartTrace.c().c(appStartTrace.f24705p));
                                        o0Var3.j((r0) o0VarZ3.build());
                                        appStartTrace.f(o0Var3);
                                        break;
                                    }
                                    break;
                                default:
                                    h hVar = AppStartTrace.f24688x;
                                    o0 o0VarZ4 = r0.z();
                                    o0VarZ4.q("_as");
                                    o0VarZ4.o(appStartTrace.b().f45967a);
                                    o0VarZ4.p(appStartTrace.b().c(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    o0 o0VarZ5 = r0.z();
                                    o0VarZ5.q("_astui");
                                    o0VarZ5.o(appStartTrace.b().f45967a);
                                    o0VarZ5.p(appStartTrace.b().c(appStartTrace.f24699i));
                                    arrayList.add((r0) o0VarZ5.build());
                                    if (appStartTrace.f24701k != null) {
                                        o0 o0VarZ6 = r0.z();
                                        o0VarZ6.q("_astfd");
                                        o0VarZ6.o(appStartTrace.f24699i.f45967a);
                                        o0VarZ6.p(appStartTrace.f24699i.c(appStartTrace.f24701k));
                                        arrayList.add((r0) o0VarZ6.build());
                                        o0 o0VarZ7 = r0.z();
                                        o0VarZ7.q("_asti");
                                        o0VarZ7.o(appStartTrace.f24701k.f45967a);
                                        o0VarZ7.p(appStartTrace.f24701k.c(appStartTrace.l));
                                        arrayList.add((r0) o0VarZ7.build());
                                    }
                                    o0VarZ4.h(arrayList);
                                    o0VarZ4.i(appStartTrace.f24707r.a());
                                    appStartTrace.f24692b.c((r0) o0VarZ4.build(), l.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                }
                if (this.l != null) {
                    return;
                }
                new WeakReference(activity);
                this.l = new h();
                this.f24707r = SessionManager.getInstance().perfSession();
                fd.a.d().a("onResume(): " + activity.getClass().getName() + ": " + b().c(this.l) + " microseconds");
                final int i13 = 3;
                A.execute(new Runnable(this) { // from class: gd.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f41841b;

                    {
                        this.f41841b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i14 = i13;
                        AppStartTrace appStartTrace = this.f41841b;
                        switch (i14) {
                            case 0:
                                o0 o0Var = appStartTrace.f24694d;
                                if (appStartTrace.f24706q == null) {
                                    appStartTrace.f24706q = new h();
                                    o0 o0VarZ = r0.z();
                                    o0VarZ.q("_experiment_onDrawFoQ");
                                    o0VarZ.o(appStartTrace.c().f45967a);
                                    o0VarZ.p(appStartTrace.c().c(appStartTrace.f24706q));
                                    o0Var.j((r0) o0VarZ.build());
                                    if (appStartTrace.f24697g != null) {
                                        o0 o0VarZ2 = r0.z();
                                        o0VarZ2.q("_experiment_procStart_to_classLoad");
                                        o0VarZ2.o(appStartTrace.c().f45967a);
                                        o0VarZ2.p(appStartTrace.c().c(appStartTrace.b()));
                                        o0Var.j((r0) o0VarZ2.build());
                                    }
                                    o0Var.n(appStartTrace.f24711v ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
                                    o0Var.m(appStartTrace.f24709t, "onDrawCount");
                                    o0Var.i(appStartTrace.f24707r.a());
                                    appStartTrace.f(o0Var);
                                    break;
                                }
                                break;
                            case 1:
                                o0 o0Var2 = appStartTrace.f24694d;
                                if (appStartTrace.f24704o == null) {
                                    appStartTrace.f24704o = new h();
                                    o0Var2.o(appStartTrace.c().f45967a);
                                    o0Var2.p(appStartTrace.c().c(appStartTrace.f24704o));
                                    appStartTrace.f(o0Var2);
                                    break;
                                }
                                break;
                            case 2:
                                o0 o0Var3 = appStartTrace.f24694d;
                                if (appStartTrace.f24705p == null) {
                                    appStartTrace.f24705p = new h();
                                    o0 o0VarZ3 = r0.z();
                                    o0VarZ3.q("_experiment_preDrawFoQ");
                                    o0VarZ3.o(appStartTrace.c().f45967a);
                                    o0VarZ3.p(appStartTrace.c().c(appStartTrace.f24705p));
                                    o0Var3.j((r0) o0VarZ3.build());
                                    appStartTrace.f(o0Var3);
                                    break;
                                }
                                break;
                            default:
                                h hVar = AppStartTrace.f24688x;
                                o0 o0VarZ4 = r0.z();
                                o0VarZ4.q("_as");
                                o0VarZ4.o(appStartTrace.b().f45967a);
                                o0VarZ4.p(appStartTrace.b().c(appStartTrace.l));
                                ArrayList arrayList = new ArrayList(3);
                                o0 o0VarZ5 = r0.z();
                                o0VarZ5.q("_astui");
                                o0VarZ5.o(appStartTrace.b().f45967a);
                                o0VarZ5.p(appStartTrace.b().c(appStartTrace.f24699i));
                                arrayList.add((r0) o0VarZ5.build());
                                if (appStartTrace.f24701k != null) {
                                    o0 o0VarZ6 = r0.z();
                                    o0VarZ6.q("_astfd");
                                    o0VarZ6.o(appStartTrace.f24699i.f45967a);
                                    o0VarZ6.p(appStartTrace.f24699i.c(appStartTrace.f24701k));
                                    arrayList.add((r0) o0VarZ6.build());
                                    o0 o0VarZ7 = r0.z();
                                    o0VarZ7.q("_asti");
                                    o0VarZ7.o(appStartTrace.f24701k.f45967a);
                                    o0VarZ7.p(appStartTrace.f24701k.c(appStartTrace.l));
                                    arrayList.add((r0) o0VarZ7.build());
                                }
                                o0VarZ4.h(arrayList);
                                o0VarZ4.i(appStartTrace.f24707r.a());
                                appStartTrace.f24692b.c((r0) o0VarZ4.build(), l.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!zBooleanValue) {
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f24708s && this.f24701k == null && !this.f24696f) {
            this.f24701k = new h();
        }
    }

    @Keep
    @h0(m.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.f24708s || this.f24696f || this.f24703n != null) {
            return;
        }
        this.f24703n = new h();
        o0 o0VarZ = r0.z();
        o0VarZ.q("_experiment_firstBackgrounding");
        o0VarZ.o(c().f45967a);
        o0VarZ.p(c().c(this.f24703n));
        this.f24694d.j((r0) o0VarZ.build());
    }

    @Keep
    @h0(m.ON_START)
    public void onAppEnteredForeground() {
        if (this.f24708s || this.f24696f || this.f24702m != null) {
            return;
        }
        this.f24702m = new h();
        o0 o0VarZ = r0.z();
        o0VarZ.q("_experiment_firstForegrounding");
        o0VarZ.o(c().f45967a);
        o0VarZ.p(c().c(this.f24702m));
        this.f24694d.j((r0) o0VarZ.build());
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
