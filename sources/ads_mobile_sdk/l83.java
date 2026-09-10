package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.blighty;
import saneness.gerenuk;
import saneness.hobby;
import saneness.loun;
import saneness.microchemistry;
import saneness.tithonia;
import saneness.toxiphobia;

/* JADX INFO: loaded from: classes.dex */
public final class l83 {
    public final Context a;
    public final saran b;
    public final saran c;
    public final CoroutineContext d;
    public final ri2 e;
    public final g6 f;
    public final loun g;
    public final ip0 h;
    public final blighty i;
    public final rs0 j;
    public final toxiphobia k;
    public final jk0 l;
    public final microchemistry m;
    public final hobby n;
    public final v83 o;
    public tithonia p;

    public l83(Context context, CoroutineContext backgroundContext, saran backgroundScope, saran uiScope, CoroutineContext uiContext, ri2 rootTraceCreator, g6 adSpamClient, loun traceLogger, ip0 gmaUtil, blighty userAgentProvider, rs0 htmlUtil, toxiphobia bridgeFactory, jk0 flags, microchemistry webViewCompatWrapper, hobby httpClient, v83 webViewInitializationTask) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
        Intrinsics.checkNotNullParameter(bridgeFactory, "bridgeFactory");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(webViewCompatWrapper, "webViewCompatWrapper");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(webViewInitializationTask, "webViewInitializationTask");
        this.a = context;
        this.b = backgroundScope;
        this.c = uiScope;
        this.d = uiContext;
        this.e = rootTraceCreator;
        this.f = adSpamClient;
        this.g = traceLogger;
        this.h = gmaUtil;
        this.i = userAgentProvider;
        this.j = htmlUtil;
        this.k = bridgeFactory;
        this.l = flags;
        this.m = webViewCompatWrapper;
        this.n = httpClient;
        this.o = webViewInitializationTask;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(ia3 ia3Var, l13 l13Var, u20 u20Var, ya1 ya1Var, boolean z, a22 a22Var, wretchedly.dern dernVar) {
        h83 h83Var;
        l13 l13Var2;
        u20 u20Var2;
        gerenuk gerenukVar;
        boolean z2;
        a22 a22Var2;
        ia3 ia3Var2;
        l83 l83Var;
        String str;
        l83 l83Var2;
        l13 l13Var3;
        gerenuk gerenukVar2;
        boolean z3;
        Object objCompetently;
        if (dernVar instanceof h83) {
            h83Var = (h83) dernVar;
            int i = h83Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h83Var.k = i - Integer.MIN_VALUE;
            } else {
                h83Var = new h83(this, dernVar);
            }
        } else {
            h83Var = new h83(this, dernVar);
        }
        Object objA = h83Var.i;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = h83Var.k;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            blighty blightyVar = this.i;
            h83Var.a = this;
            h83Var.b = ia3Var;
            l13Var2 = l13Var;
            h83Var.c = l13Var2;
            u20Var2 = u20Var;
            h83Var.d = u20Var2;
            gerenukVar = ya1Var;
            h83Var.e = gerenukVar;
            h83Var.f = a22Var;
            z2 = z;
            h83Var.h = z2;
            h83Var.k = 1;
            objA = blightyVar.a(h83Var);
            if (objA != objBeachfront) {
                a22Var2 = a22Var;
                ia3Var2 = ia3Var;
                l83Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            boolean z4 = h83Var.h;
            a22Var2 = h83Var.f;
            gerenuk gerenukVar3 = h83Var.e;
            u20Var2 = h83Var.d;
            l13 l13Var4 = h83Var.c;
            ia3Var2 = h83Var.b;
            l83 l83Var3 = h83Var.a;
            p002kotlin.dern.saneness(objA);
            z2 = z4;
            l83Var = l83Var3;
            gerenukVar = gerenukVar3;
            l13Var2 = l13Var4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objA);
                return objA;
            }
            boolean z5 = h83Var.h;
            String str2 = h83Var.g;
            a22Var2 = h83Var.f;
            gerenuk gerenukVar4 = h83Var.e;
            u20Var2 = h83Var.d;
            l13 l13Var5 = h83Var.c;
            ia3Var2 = h83Var.b;
            l83 l83Var4 = h83Var.a;
            p002kotlin.dern.saneness(objA);
            z3 = z5;
            str = str2;
            gerenukVar2 = gerenukVar4;
            l13Var3 = l13Var5;
            l83Var2 = l83Var4;
        }
        a22 a22Var3 = a22Var2;
        u20 u20Var3 = u20Var2;
        ia3 ia3Var3 = ia3Var2;
        CoroutineContext coroutineContext = l83Var2.d;
        i83 i83Var = new i83(gerenukVar2, l83Var2, l13Var3, a22Var3, z3, u20Var3, str, ia3Var3, null);
        h83Var.a = null;
        h83Var.b = null;
        h83Var.c = null;
        h83Var.d = null;
        h83Var.e = null;
        h83Var.f = null;
        h83Var.g = null;
        h83Var.k = 3;
        objCompetently = impromptu.competently(coroutineContext, i83Var, h83Var);
        if (objCompetently != objBeachfront) {
            return objBeachfront;
        }
        return objCompetently;
        String str3 = (String) objA;
        v83 v83Var = l83Var.o;
        h83Var.a = l83Var;
        h83Var.b = ia3Var2;
        h83Var.c = l13Var2;
        h83Var.d = u20Var2;
        h83Var.e = gerenukVar;
        h83Var.f = a22Var2;
        h83Var.g = str3;
        h83Var.h = z2;
        h83Var.k = 2;
        if (v83Var.a(h83Var) != objBeachfront) {
            str = str3;
            l83Var2 = l83Var;
            l13Var3 = l13Var2;
            gerenukVar2 = gerenukVar;
            z3 = z2;
            a22 a22Var4 = a22Var2;
            u20 u20Var4 = u20Var2;
            ia3 ia3Var4 = ia3Var2;
            CoroutineContext coroutineContext2 = l83Var2.d;
            i83 i83Var2 = new i83(gerenukVar2, l83Var2, l13Var3, a22Var4, z3, u20Var4, str, ia3Var4, null);
            h83Var.a = null;
            h83Var.b = null;
            h83Var.c = null;
            h83Var.d = null;
            h83Var.e = null;
            h83Var.f = null;
            h83Var.g = null;
            h83Var.k = 3;
            objCompetently = impromptu.competently(coroutineContext2, i83Var2, h83Var);
            if (objCompetently != objBeachfront) {
                return objCompetently;
            }
        }
        return objBeachfront;
    }

    public final Object a(ia3 ia3Var, ya1 ya1Var, boolean z, a22 a22Var, wretchedly.dern dernVar) {
        return a(ia3Var, new l13(new xb2(), new j71(), new le2(), new o6()), null, ya1Var, z, a22Var, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(ia3 ia3Var, l13 l13Var, u20 u20Var, a22 a22Var, wretchedly.dern dernVar) {
        j83 j83Var;
        l83 l83Var;
        if (dernVar instanceof j83) {
            j83Var = (j83) dernVar;
            int i = j83Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j83Var.d = i - Integer.MIN_VALUE;
            } else {
                j83Var = new j83(this, dernVar);
            }
        } else {
            j83Var = new j83(this, dernVar);
        }
        j83 j83Var2 = j83Var;
        Object objA = j83Var2.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = j83Var2.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            j83Var2.a = this;
            j83Var2.d = 1;
            objA = a(ia3Var, l13Var, u20Var, null, false, a22Var, j83Var2);
            if (objA != objBeachfront) {
                l83Var = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
            return objA;
        }
        l83Var = j83Var2.a;
        p002kotlin.dern.saneness(objA);
        CoroutineContext coroutineContext = l83Var.d;
        k83 k83Var = new k83((gq0) objA, null);
        j83Var2.a = null;
        j83Var2.d = 2;
        Object objCompetently = impromptu.competently(coroutineContext, k83Var, j83Var2);
        return objCompetently == objBeachfront ? objBeachfront : objCompetently;
    }
}
