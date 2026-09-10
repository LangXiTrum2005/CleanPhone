package ads_mobile_sdk;

import com.ironsource.X3;
import http.polloi;
import igo.beachfront;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.kowloon;
import kotlinx.coroutines.saran;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.adultoid;
import saneness.blighty;
import saneness.coffeecake;
import saneness.gelandelaufer;
import saneness.iconoclasm;
import saneness.microchemistry;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class v83 extends ox0 {
    public final microchemistry c;
    public final ns d;
    public final jk0 e;
    public final saran f;
    public final saran g;
    public final ri2 h;
    public final adultoid i;
    public final blighty j;
    public final cord k;
    public final taiyuan l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v83(microchemistry webViewCompatWrapper, ns concurrencyObjects, jk0 flags, saran backgroundScope, saran webViewInitializationScope, ri2 rootTraceCreator, coffeecake webViewProfileInitializer, blighty userAgentProvider) {
        super((no0) null, 1);
        Intrinsics.checkNotNullParameter(webViewCompatWrapper, "webViewCompatWrapper");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(webViewInitializationScope, "webViewInitializationScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(webViewProfileInitializer, "webViewProfileInitializer");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.c = webViewCompatWrapper;
        this.d = concurrencyObjects;
        this.e = flags;
        this.f = backgroundScope;
        this.g = webViewInitializationScope;
        this.h = rootTraceCreator;
        this.i = webViewProfileInitializer;
        this.j = userAgentProvider;
        this.k = JobKt__JobKt.saneness(null, 1, null);
        this.l = p002kotlin.saneness.saneness(new u83(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(v83 v83Var, wretchedly.dern dernVar) {
        s83 s83Var;
        v83Var.getClass();
        if (dernVar instanceof s83) {
            s83Var = (s83) dernVar;
            int i = s83Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s83Var.d = i - Integer.MIN_VALUE;
            } else {
                s83Var = new s83(v83Var, dernVar);
            }
        } else {
            s83Var = new s83(v83Var, dernVar);
        }
        Object objCuirassed = s83Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = s83Var.d;
        if (i2 != 0) {
            if (i2 == 1) {
                v83Var = s83Var.a;
                p002kotlin.dern.saneness(objCuirassed);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objCuirassed);
            }
            return Unit.f29295attabal;
        }
        p002kotlin.dern.saneness(objCuirassed);
        s83Var.a = v83Var;
        s83Var.d = 1;
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(s83Var), 1);
        kowloonVar.kattegat();
        try {
            microchemistry microchemistryVar = v83Var.c;
            jk0 jk0Var = v83Var.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:webview_initialization_executor:enabled", X3.i.W);
            Boolean bool = Boolean.FALSE;
            jk jkVar = zk.b;
            ms msVar = ((Boolean) jk0Var.a("gads:webview_initialization_executor:enabled", bool, jkVar)).booleanValue() ? v83Var.d.h : v83Var.d.c;
            jk0 jk0Var2 = v83Var.e;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:run_ui_thread_webview_startup_tasks", X3.i.W);
            microchemistryVar.a(msVar, ((Boolean) jk0Var2.a("gads:run_ui_thread_webview_startup_tasks", Boolean.TRUE, jkVar)).booleanValue(), new t83(kowloonVar));
        } catch (Exception e) {
            Result.Companion companion = Result.INSTANCE;
            kowloonVar.resumeWith(Result.m3351constructorimpl(new on0(e, null, null, 6)));
        }
        objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            beachfront.dern(s83Var);
        }
        if (objCuirassed == objBeachfront) {
            return objBeachfront;
        }
        spartacist spartacistVar = (spartacist) objCuirassed;
        if (spartacistVar instanceof tn0) {
            polloi polloiVar = (polloi) ((tn0) spartacistVar).b;
            o12 o12VarE = j13.a().e();
            iconoclasm builder = f83.o();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            Long totalTimeInUiThreadMillis = polloiVar.getTotalTimeInUiThreadMillis();
            if (totalTimeInUiThreadMillis != null) {
                Intrinsics.beachfront(totalTimeInUiThreadMillis);
                builder.wireman(totalTimeInUiThreadMillis.longValue());
            }
            Long maxTimePerTaskInUiThreadMillis = polloiVar.getMaxTimePerTaskInUiThreadMillis();
            if (maxTimePerTaskInUiThreadMillis != null) {
                Intrinsics.beachfront(maxTimePerTaskInUiThreadMillis);
                builder.attabal(maxTimePerTaskInUiThreadMillis.longValue());
            }
            List<http.beachfront> listAttabal = polloiVar.attabal();
            if (listAttabal != null) {
                Intrinsics.beachfront(listAttabal);
                List listCompetently = builder.competently();
                Intrinsics.checkNotNullExpressionValue(listCompetently, "getUiThreadBlockingStartupLocationsList(...)");
                yd0 yd0Var = new yd0(listCompetently);
                ArrayList values = new ArrayList(dovishness.gintrap(listAttabal, 10));
                Iterator<T> it = listAttabal.iterator();
                while (it.hasNext()) {
                    values.add(((http.beachfront) it.next()).attabal().toString());
                }
                Intrinsics.checkNotNullParameter(yd0Var, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                builder.marial(values);
            }
            List<http.beachfront> listSaneness = polloiVar.saneness();
            if (listSaneness != null) {
                Intrinsics.beachfront(listSaneness);
                List listBeachfront = builder.beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront, "getNonUiThreadBlockingStartupLocationsList(...)");
                yd0 yd0Var2 = new yd0(listBeachfront);
                ArrayList values2 = new ArrayList(dovishness.gintrap(listSaneness, 10));
                Iterator<T> it2 = listSaneness.iterator();
                while (it2.hasNext()) {
                    values2.add(((http.beachfront) it2.next()).attabal().toString());
                }
                Intrinsics.checkNotNullParameter(yd0Var2, "<this>");
                Intrinsics.checkNotNullParameter(values2, "values");
                builder.dern(values2);
            }
            xm0 xm0VarA = builder.a();
            Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
            o12VarE.G = (f83) xm0VarA;
            jk0 jk0Var3 = v83Var.e;
            jk0Var3.getClass();
            Intrinsics.checkNotNullParameter("init_profile_after_webview_startup:enabled", X3.i.W);
            if (((Boolean) jk0Var3.a("init_profile_after_webview_startup:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                gelandelaufer gelandelauferVar = (gelandelaufer) v83Var.i.get();
                s83Var.a = null;
                s83Var.d = 2;
                fa3 fa3Var = (fa3) gelandelauferVar;
                fa3Var.getClass();
                if (fa3.c(fa3Var, s83Var) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else if (spartacistVar instanceof nn0) {
            Throwable exception = ((nn0) spartacistVar).b();
            if (exception == null) {
                exception = new Exception("WebView Startup Failed");
            }
            Intrinsics.checkNotNullParameter(exception, "exception");
            w03 w03VarA = j13.a();
            w03VarA.e().m = false;
            w03VarA.a(exception);
        }
        return Unit.f29295attabal;
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        if (((Boolean) this.l.getValue()).booleanValue()) {
            jk0 jk0Var = this.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:webview_initialization_executor:enabled", X3.i.W);
            saran saranVar = ((Boolean) jk0Var.a("gads:webview_initialization_executor:enabled", Boolean.FALSE, zk.b)).booleanValue() ? this.g : this.f;
            r83 block = new r83(this, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        } else {
            this.k.dern();
        }
        return new tn0(Unit.f29295attabal);
    }

    public final Object a(ContinuationImpl continuationImpl) {
        if (((Boolean) this.l.getValue()).booleanValue()) {
            Object objStarveling = this.k.starveling(continuationImpl);
            return objStarveling == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objStarveling : Unit.f29295attabal;
        }
        Object objB = this.j.b(continuationImpl);
        return objB == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objB : Unit.f29295attabal;
    }
}
