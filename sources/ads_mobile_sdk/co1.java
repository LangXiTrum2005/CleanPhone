package ads_mobile_sdk;

import com.ironsource.X3;
import java.io.Closeable;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.collection;
import saneness.evenfall;
import saneness.gerenuk;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class co1 {
    public final saran a;
    public final saran b;
    public final jk0 c;
    public final g83 d;
    public final ri2 e;
    public final adultoid f;
    public final collection g;

    public co1(saran uiScope, saran backgroundScope, jk0 flags, g83 webViewFactory, ri2 rootTraceCreator, coffeecake singletonEngineProvider, collection singletonNativeJavascriptEngineConfigurator) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(singletonEngineProvider, "singletonEngineProvider");
        Intrinsics.checkNotNullParameter(singletonNativeJavascriptEngineConfigurator, "singletonNativeJavascriptEngineConfigurator");
        this.a = uiScope;
        this.b = backgroundScope;
        this.c = flags;
        this.d = webViewFactory;
        this.e = rootTraceCreator;
        this.f = singletonEngineProvider;
        this.g = singletonNativeJavascriptEngineConfigurator;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0105 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x00ff, B:56:0x0105, B:57:0x011c), top: B:85:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011c A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:54:0x00ff, B:56:0x0105, B:57:0x011c), top: B:85:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013e A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:63:0x0137, B:65:0x013e, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0151, B:75:0x0156, B:76:0x0157, B:77:0x015e, B:78:0x015f, B:79:0x0166, B:80:0x0167), top: B:92:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0145 A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:63:0x0137, B:65:0x013e, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0151, B:75:0x0156, B:76:0x0157, B:77:0x015e, B:78:0x015f, B:79:0x0166, B:80:0x0167), top: B:92:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0149 A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:63:0x0137, B:65:0x013e, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0151, B:75:0x0156, B:76:0x0157, B:77:0x015e, B:78:0x015f, B:79:0x0166, B:80:0x0167), top: B:92:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x014d A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:63:0x0137, B:65:0x013e, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0151, B:75:0x0156, B:76:0x0157, B:77:0x015e, B:78:0x015f, B:79:0x0166, B:80:0x0167), top: B:92:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:63:0x0137, B:65:0x013e, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0151, B:75:0x0156, B:76:0x0157, B:77:0x015e, B:78:0x015f, B:79:0x0166, B:80:0x0167), top: B:92:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0157 A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:63:0x0137, B:65:0x013e, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0151, B:75:0x0156, B:76:0x0157, B:77:0x015e, B:78:0x015f, B:79:0x0166, B:80:0x0167), top: B:92:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x015f A[Catch: all -> 0x014e, TryCatch #4 {all -> 0x014e, blocks: (B:63:0x0137, B:65:0x013e, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0151, B:75:0x0156, B:76:0x0157, B:77:0x015e, B:78:0x015f, B:79:0x0166, B:80:0x0167), top: B:92:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0167 A[Catch: all -> 0x014e, TRY_LEAVE, TryCatch #4 {all -> 0x014e, blocks: (B:63:0x0137, B:65:0x013e, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0151, B:75:0x0156, B:76:0x0157, B:77:0x015e, B:78:0x015f, B:79:0x0166, B:80:0x0167), top: B:92:0x0137 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ads_mobile_sdk.h1] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ads_mobile_sdk.w03, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ads_mobile_sdk.w03] */
    public static Object a(co1 co1Var, h1 h1Var, wretchedly.dern dernVar) {
        ao1 ao1Var;
        wx0 wx0Var;
        ?? r5;
        ?? r1;
        gq0 gq0Var;
        collection collectionVar;
        gerenuk gerenukVarC;
        co1 co1Var2;
        gq0 gq0Var2;
        co1 co1Var3;
        ?? r2;
        Object tn0Var;
        co1 co1Var4 = co1Var;
        ?? A = h1Var;
        if (dernVar instanceof ao1) {
            ao1Var = (ao1) dernVar;
            int i = ao1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ao1Var.g = i - Integer.MIN_VALUE;
            } else {
                ao1Var = new ao1(co1Var4, dernVar);
            }
        } else {
            ao1Var = new ao1(co1Var4, dernVar);
        }
        Object objA = ao1Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r6 = ao1Var.g;
        try {
            if (r6 == 0) {
                p002kotlin.dern.saneness(objA);
                wx0 wx0Var2 = A.H;
                String str = wx0Var2 != null ? wx0Var2.d : null;
                if ((str != null && !StringsKt.empress(str)) || ((wx0Var = A.H) != null && wx0Var.e)) {
                    return new tn0(co1Var4.f.get());
                }
                no0 no0Var = no0.CUI_NAME_LOAD_NATIVE_JS_ENGINE;
                WeakHashMap weakHashMap = j13.a;
                A = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                try {
                    g83 g83Var = co1Var4.d;
                    ia3 ia3Var = new ia3(ha3.DEFAULT, 0, 0, 14);
                    ao1Var.a = co1Var4;
                    ao1Var.b = A;
                    ao1Var.c = A;
                    ao1Var.g = 1;
                    objA = g83Var.a(ia3Var, null, ao1Var);
                    if (objA != objBeachfront) {
                        r5 = A;
                        r1 = A;
                        gq0Var = (gq0) objA;
                        gq0Var.setWillNotDraw(true);
                        collectionVar = co1Var4.g;
                        gerenukVarC = gq0Var.c();
                        ao1Var.a = co1Var4;
                        ao1Var.b = r5;
                        ao1Var.c = r1;
                        ao1Var.d = gq0Var;
                        ao1Var.g = 2;
                        if (collectionVar.a(gerenukVarC, ao1Var) == objBeachfront) {
                            co1Var2 = co1Var4;
                            gq0Var2 = gq0Var;
                            A = r1;
                            r6 = r5;
                            jk0 jk0Var = co1Var2.c;
                            jk0Var.getClass();
                            Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                            Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                            String str2 = (String) jk0Var.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                            ao1Var.a = co1Var2;
                            ao1Var.b = r6;
                            ao1Var.c = A;
                            ao1Var.d = gq0Var2;
                            ao1Var.g = 3;
                            objA = gq0Var2.b(str2, ao1Var);
                            if (objA != objBeachfront) {
                                co1Var3 = co1Var2;
                                r2 = A;
                                tn0Var = (spartacist) objA;
                                if (tn0Var instanceof nn0) {
                                    cutely.wireman(co1Var3.a, dhss.f32190kowloon, null, new bo1(gq0Var2, null), 2, null);
                                    y13.a((nn0) tn0Var, false);
                                } else {
                                    tn0Var = new tn0(new ce0(new e51(gq0Var2, co1Var3.b, co1Var3.e, false)));
                                }
                                interaction.saneness.attabal(r2, null);
                                return tn0Var;
                            }
                        }
                    }
                    return objBeachfront;
                } catch (Throwable th) {
                    th = th;
                    r6 = A;
                    r6.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    r6.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                }
            }
            if (r6 == 1) {
                Closeable closeable = ao1Var.c;
                w03 w03Var = ao1Var.b;
                co1Var4 = ao1Var.a;
                p002kotlin.dern.saneness(objA);
                r1 = closeable;
                r5 = w03Var;
                gq0Var = (gq0) objA;
                gq0Var.setWillNotDraw(true);
                collectionVar = co1Var4.g;
                gerenukVarC = gq0Var.c();
                ao1Var.a = co1Var4;
                ao1Var.b = r5;
                ao1Var.c = r1;
                ao1Var.d = gq0Var;
                ao1Var.g = 2;
                if (collectionVar.a(gerenukVarC, ao1Var) == objBeachfront) {
                    co1Var2 = co1Var4;
                    gq0Var2 = gq0Var;
                    A = r1;
                    r6 = r5;
                    jk0 jk0Var2 = co1Var2.c;
                    jk0Var2.getClass();
                    Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                    Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                    String str3 = (String) jk0Var2.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                    ao1Var.a = co1Var2;
                    ao1Var.b = r6;
                    ao1Var.c = A;
                    ao1Var.d = gq0Var2;
                    ao1Var.g = 3;
                    objA = gq0Var2.b(str3, ao1Var);
                    if (objA != objBeachfront) {
                        co1Var3 = co1Var2;
                        r2 = A;
                    }
                }
                return objBeachfront;
            }
            if (r6 == 2) {
                gq0Var2 = ao1Var.d;
                Closeable closeable2 = ao1Var.c;
                w03 w03Var2 = ao1Var.b;
                co1Var2 = ao1Var.a;
                p002kotlin.dern.saneness(objA);
                A = closeable2;
                r6 = w03Var2;
                jk0 jk0Var3 = co1Var2.c;
                jk0Var3.getClass();
                Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                String str4 = (String) jk0Var3.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                ao1Var.a = co1Var2;
                ao1Var.b = r6;
                ao1Var.c = A;
                ao1Var.d = gq0Var2;
                ao1Var.g = 3;
                objA = gq0Var2.b(str4, ao1Var);
                if (objA != objBeachfront) {
                    co1Var3 = co1Var2;
                    r2 = A;
                }
                return objBeachfront;
            }
            if (r6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gq0Var2 = ao1Var.d;
            A = ao1Var.c;
            w03 w03Var3 = ao1Var.b;
            co1Var3 = ao1Var.a;
            try {
                p002kotlin.dern.saneness(objA);
                r2 = A;
            } catch (Throwable th2) {
                th = th2;
                r6 = w03Var3;
                try {
                    r6.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    r6.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        interaction.saneness.attabal(A, th3);
                        throw th4;
                    }
                }
            }
            tn0Var = (spartacist) objA;
            if (tn0Var instanceof nn0) {
                cutely.wireman(co1Var3.a, dhss.f32190kowloon, null, new bo1(gq0Var2, null), 2, null);
                y13.a((nn0) tn0Var, false);
            } else {
                tn0Var = new tn0(new ce0(new e51(gq0Var2, co1Var3.b, co1Var3.e, false)));
            }
            interaction.saneness.attabal(r2, null);
            return tn0Var;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
