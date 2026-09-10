package ads_mobile_sdk;

import android.content.Context;
import complexometry.dovishness;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.gerenuk;
import saneness.unkink;

/* JADX INFO: loaded from: classes.dex */
public final class so1 {
    public final Context a;
    public final saran b;
    public final g83 c;
    public final unkink d;
    public final jk0 e;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern f;

    public so1(Context applicationContext, saran uiScope, g83 webViewFactory, unkink nativeMediaWebViewConfigurator, jk0 flags, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(nativeMediaWebViewConfigurator, "nativeMediaWebViewConfigurator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        this.a = applicationContext;
        this.b = uiScope;
        this.c = webViewFactory;
        this.d = nativeMediaWebViewConfigurator;
        this.e = flags;
        this.f = nativeRequest;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a2 A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:41:0x009b, B:43:0x00a2, B:45:0x00a9, B:47:0x00ad, B:49:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00c2, B:56:0x00c3, B:57:0x00ca, B:58:0x00cb), top: B:65:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:41:0x009b, B:43:0x00a2, B:45:0x00a9, B:47:0x00ad, B:49:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00c2, B:56:0x00c3, B:57:0x00ca, B:58:0x00cb), top: B:65:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:41:0x009b, B:43:0x00a2, B:45:0x00a9, B:47:0x00ad, B:49:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00c2, B:56:0x00c3, B:57:0x00ca, B:58:0x00cb), top: B:65:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1 A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:41:0x009b, B:43:0x00a2, B:45:0x00a9, B:47:0x00ad, B:49:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00c2, B:56:0x00c3, B:57:0x00ca, B:58:0x00cb), top: B:65:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5 A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:41:0x009b, B:43:0x00a2, B:45:0x00a9, B:47:0x00ad, B:49:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00c2, B:56:0x00c3, B:57:0x00ca, B:58:0x00cb), top: B:65:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:41:0x009b, B:43:0x00a2, B:45:0x00a9, B:47:0x00ad, B:49:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00c2, B:56:0x00c3, B:57:0x00ca, B:58:0x00cb), top: B:65:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:41:0x009b, B:43:0x00a2, B:45:0x00a9, B:47:0x00ad, B:49:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00c2, B:56:0x00c3, B:57:0x00ca, B:58:0x00cb), top: B:65:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #1 {all -> 0x00b2, blocks: (B:41:0x009b, B:43:0x00a2, B:45:0x00a9, B:47:0x00ad, B:49:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00c2, B:56:0x00c3, B:57:0x00ca, B:58:0x00cb), top: B:65:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object a(so1 so1Var, ia3 ia3Var, a22 a22Var, wretchedly.dern dernVar) {
        ko1 ko1Var;
        TimeoutCancellationException timeoutCancellationException;
        TimeoutCancellationException timeoutCancellationException2;
        w03 w03Var;
        w03 w03Var2;
        so1 so1Var2;
        so1Var.getClass();
        if (dernVar instanceof ko1) {
            ko1Var = (ko1) dernVar;
            int i = ko1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ko1Var.f = i - Integer.MIN_VALUE;
            } else {
                ko1Var = new ko1(so1Var, dernVar);
            }
        } else {
            ko1Var = new ko1(so1Var, dernVar);
        }
        ko1 ko1Var2 = ko1Var;
        Object obj = ko1Var2.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ko1Var2.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_CREATIVE_WEBVIEW_INITIALIZATION;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                g83 g83Var = so1Var.c;
                ko1Var2.a = so1Var;
                try {
                    ko1Var2.b = w03VarA;
                    ko1Var2.c = w03VarA;
                    ko1Var2.f = 1;
                    Object objA = g83Var.a.a(ia3Var, (ya1) null, false, a22Var, (wretchedly.dern) ko1Var2);
                    if (objA != objBeachfront) {
                        so1Var2 = so1Var;
                        w03Var = w03VarA;
                        obj = objA;
                        w03Var2 = w03Var;
                    }
                } catch (Throwable th) {
                    timeoutCancellationException = th;
                    timeoutCancellationException2 = timeoutCancellationException;
                    w03Var = w03VarA;
                    w03Var2 = w03Var;
                    w03Var2.b(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                        throw timeoutCancellationException2;
                    }
                    w03Var2.a(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException2);
                    }
                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException2);
                    }
                    if (timeoutCancellationException2 instanceof yn0) {
                        throw timeoutCancellationException2;
                    }
                    throw new gn0(timeoutCancellationException2);
                }
            } catch (Throwable th2) {
                timeoutCancellationException = th2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gq0 gq0Var = (gq0) ko1Var2.a;
                p002kotlin.dern.saneness(obj);
                return gq0Var;
            }
            w03Var = ko1Var2.c;
            w03Var2 = ko1Var2.b;
            so1Var2 = (so1) ko1Var2.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th3) {
                timeoutCancellationException2 = th3;
                try {
                    w03Var2.b(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                        throw timeoutCancellationException2;
                    }
                    w03Var2.a(timeoutCancellationException2);
                    if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                        throw new cp0(timeoutCancellationException2);
                    }
                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                        throw new bn0(timeoutCancellationException2);
                    }
                    if (timeoutCancellationException2 instanceof yn0) {
                        throw timeoutCancellationException2;
                    }
                    throw new gn0(timeoutCancellationException2);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        interaction.saneness.attabal(w03Var, th4);
                        throw th5;
                    }
                }
            }
        }
        gq0 gq0Var2 = (gq0) obj;
        interaction.saneness.attabal(w03Var, null);
        unkink unkinkVar = so1Var2.d;
        gerenuk gerenukVarC = gq0Var2.c();
        ko1Var2.a = gq0Var2;
        ko1Var2.b = null;
        ko1Var2.c = null;
        ko1Var2.f = 2;
        return unkinkVar.a(gerenukVarC, ko1Var2) == objBeachfront ? objBeachfront : gq0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(so1 so1Var, gq0 gq0Var, wretchedly.dern dernVar) {
        ro1 ro1Var;
        dovishness videoOptions;
        so1Var.getClass();
        if (dernVar instanceof ro1) {
            ro1Var = (ro1) dernVar;
            int i = ro1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ro1Var.d = i - Integer.MIN_VALUE;
            } else {
                ro1Var = new ro1(so1Var, dernVar);
            }
        } else {
            ro1Var = new ro1(so1Var, dernVar);
        }
        Object obj = ro1Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ro1Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gq0 gq0Var2 = ro1Var.a;
            p002kotlin.dern.saneness(obj);
            return gq0Var2;
        }
        p002kotlin.dern.saneness(obj);
        er0 er0VarD = gq0Var.d();
        if (er0VarD != null && (videoOptions = so1Var.f.getVideoOptions()) != null) {
            ro1Var.a = gq0Var;
            ro1Var.d = 1;
            if (er0VarD.a(videoOptions, ro1Var) == objBeachfront) {
                return objBeachfront;
            }
        }
        return gq0Var;
    }
}
