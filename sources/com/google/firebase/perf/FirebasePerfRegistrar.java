package com.google.firebase.perf;

import am.e;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.lifecycle.a0;
import androidx.lifecycle.k0;
import bd.a;
import bd.d;
import cd.c;
import com.google.android.gms.internal.ads.em0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import d5.o;
import ea.b0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mb.g;
import o8.f;
import pd.j;
import qk.i0;
import s4.i;
import tb.b;
import tb.h;
import tb.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(q qVar, b bVar) {
        AppStartTrace appStartTrace;
        int i10;
        o oVar;
        g gVar = (g) bVar.a(g.class);
        mb.a aVar = (mb.a) bVar.d(mb.a.class).get();
        Executor executor = (Executor) bVar.g(qVar);
        a aVar2 = new a();
        gVar.a();
        Context context = gVar.f45928a;
        dd.a aVarE = dd.a.e();
        aVarE.getClass();
        dd.a.f38804d.f40789b = i0.R(context);
        aVarE.f38808c.c(context);
        c cVarA = c.a();
        synchronized (cVarA) {
            if (!cVarA.f6364p) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(cVarA);
                    cVarA.f6364p = true;
                }
            }
        }
        d dVar = new d();
        synchronized (cVarA.f6356g) {
            cVarA.f6356g.add(dVar);
        }
        if (aVar != null) {
            if (AppStartTrace.f24690z != null) {
                appStartTrace = AppStartTrace.f24690z;
            } else {
                ld.g gVar2 = ld.g.f45301s;
                jj.d dVar2 = new jj.d(23);
                if (AppStartTrace.f24690z == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.f24690z == null) {
                                AppStartTrace.f24690z = new AppStartTrace(gVar2, dVar2, dd.a.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.f24689y, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                appStartTrace = AppStartTrace.f24690z;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.f24691a) {
                    k0.f4555h.f4561f.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.f24711v = appStartTrace.f24711v || AppStartTrace.e((Application) applicationContext2);
                        int i11 = Build.VERSION.SDK_INT;
                        if (((ActivityManager) ((Application) applicationContext2).getSystemService("activity")) == null) {
                            oVar = new o(2, 10);
                        } else {
                            try {
                                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                                i10 = runningAppProcessInfo.importance;
                            } catch (Throwable unused) {
                                i10 = -1;
                            }
                            if (i11 >= 34) {
                                oVar = new o(i10 == 100 ? 1 : 2, 10);
                            } else {
                                oVar = new o(2, 10);
                            }
                        }
                        appStartTrace.f24712w = oVar;
                        appStartTrace.f24691a = true;
                        appStartTrace.f24695e = (Application) applicationContext2;
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 34) {
                executor.execute(new a0(appStartTrace, 19));
            }
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bd.c providesFirebasePerformance(b bVar) {
        bVar.a(a.class);
        k5.g gVar = new k5.g((g) bVar.a(g.class), (uc.d) bVar.a(uc.d.class), bVar.d(j.class), bVar.d(f.class));
        fc.f fVar = new fc.f(new od.c(gVar, 5), new n5.f(gVar, 9), new i(gVar), new e(gVar, 6), new ea.a0(gVar), new b0(gVar, 10), new b0(gVar, 11), 2);
        ai.a aVar = new ai.a();
        aVar.f3608b = ai.a.f3606c;
        aVar.f3607a = fVar;
        return (bd.c) aVar.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<tb.a> getComponents() {
        q qVar = new q(sb.d.class, Executor.class);
        em0 em0VarA = tb.a.a(bd.c.class);
        em0VarA.f14010a = LIBRARY_NAME;
        em0VarA.a(h.b(g.class));
        em0VarA.a(new h(1, 1, j.class));
        em0VarA.a(h.b(uc.d.class));
        em0VarA.a(new h(1, 1, f.class));
        em0VarA.a(h.b(a.class));
        em0VarA.f14015f = new ae.b(13);
        tb.a aVarB = em0VarA.b();
        em0 em0VarA2 = tb.a.a(a.class);
        em0VarA2.f14010a = EARLY_LIBRARY_NAME;
        em0VarA2.a(h.b(g.class));
        em0VarA2.a(h.a(mb.a.class));
        em0VarA2.a(new h(qVar, 1, 0));
        em0VarA2.c(2);
        em0VarA2.f14015f = new bd.b(qVar, 0);
        return Arrays.asList(aVarB, em0VarA2.b(), com.google.android.gms.internal.auth.i.f(LIBRARY_NAME, "22.0.6"));
    }
}
