package ads_mobile_sdk;

import android.content.Context;
import com.ironsource.X3;
import http.kowloon;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.gerenuk;
import saneness.hobby;
import saneness.loun;
import saneness.microchemistry;
import saneness.midian;
import saneness.tarantism;
import saneness.tithonia;
import saneness.toxiphobia;

/* JADX INFO: loaded from: classes.dex */
public final class i83 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gerenuk a;
    public final /* synthetic */ l83 b;
    public final /* synthetic */ l13 c;
    public final /* synthetic */ a22 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ u20 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ ia3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i83(gerenuk gerenukVar, l83 l83Var, l13 l13Var, a22 a22Var, boolean z, u20 u20Var, String str, ia3 ia3Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gerenukVar;
        this.b = l83Var;
        this.c = l13Var;
        this.d = a22Var;
        this.e = z;
        this.f = u20Var;
        this.g = str;
        this.h = ia3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new i83(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i83) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w03 w03Var;
        gq0 gq0Var;
        pq0 client;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        no0 no0Var = no0.CUI_NAME_WEBVIEW_INITIALIZATION;
        l83 l83Var = this.b;
        u20 u20Var = this.f;
        String str = this.g;
        ia3 ia3Var = this.h;
        WeakHashMap weakHashMap = j13.a;
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), false);
        try {
            CoroutineContext coroutineContext = l83Var.d;
            saran saranVar = l83Var.c;
            saran saranVar2 = l83Var.b;
            loun lounVar = l83Var.g;
            g6 g6Var = l83Var.f;
            Context context = l83Var.a;
            rs0 rs0Var = l83Var.j;
            jk0 jk0Var = l83Var.l;
            microchemistry microchemistryVar = l83Var.m;
            w03Var = w03VarA;
            try {
                gq0 gmaWebView = new gq0(coroutineContext, saranVar, saranVar2, u20Var, lounVar, g6Var, context, str, ia3Var, microchemistryVar, rs0Var, jk0Var);
                interaction.saneness.attabal(w03Var, null);
                gerenuk jsContext = this.a;
                if (jsContext == null) {
                    l83 l83Var2 = this.b;
                    jsContext = new b93(gmaWebView, l83Var2.e, this.c, l83Var2.h, l83Var2.b, l83Var2.l);
                }
                midian midianVar = pq0.s;
                l83 l83Var3 = this.b;
                saran backgroundScope = l83Var3.b;
                ip0 gmaUtil = l83Var3.h;
                g6 adSpamClient = l83Var3.f;
                jk0 flags = l83Var3.l;
                tithonia tithoniaVar = l83Var3.p;
                hobby httpClient = l83Var3.n;
                midianVar.getClass();
                Intrinsics.checkNotNullParameter(jsContext, "jsContext");
                Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
                Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
                Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
                Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
                Intrinsics.checkNotNullParameter(flags, "flags");
                Intrinsics.checkNotNullParameter(httpClient, "httpClient");
                flags.getClass();
                Intrinsics.checkNotNullParameter("gads:gma_webview_client_without_should_intercept_request:enabled", X3.i.W);
                Boolean bool = Boolean.FALSE;
                jk jkVar = zk.b;
                if (((Boolean) flags.a("gads:gma_webview_client_without_should_intercept_request:enabled", bool, jkVar)).booleanValue()) {
                    client = new tarantism(jsContext, gmaWebView, backgroundScope, gmaUtil, adSpamClient, flags);
                    gq0Var = gmaWebView;
                } else {
                    uq0 uq0Var = new uq0(jsContext, gmaWebView, backgroundScope, gmaUtil, adSpamClient, flags, tithoniaVar, httpClient);
                    gq0Var = gmaWebView;
                    client = uq0Var;
                }
                toxiphobia toxiphobiaVar = this.b.k;
                l13 l13Var = this.c;
                a22 a22Var = this.d;
                x41 x41Var = ((w41) toxiphobiaVar).a;
                u41 u41Var = new u41(gq0Var, l13Var, a22Var, (ri2) x41Var.a.get(), (g6) x41Var.b.get(), (jk0) x41Var.c.get());
                gq0 webView = gq0Var;
                webView.addJavascriptInterface(u41Var, "googleAdsJsInterface");
                Intrinsics.checkNotNullParameter(client, "client");
                webView.setWebViewClient(client);
                Intrinsics.checkNotNullParameter(client, "<set-?>");
                webView.x = client;
                Intrinsics.checkNotNullParameter(jsContext, "<set-?>");
                webView.w = jsContext;
                if (!this.e) {
                    jk0 jk0Var2 = this.b.l;
                    jk0Var2.getClass();
                    Intrinsics.checkNotNullParameter("creative_webview_init_set_profile:enabled", X3.i.W);
                    if (((Boolean) jk0Var2.a("creative_webview_init_set_profile:enabled", bool, jkVar)).booleanValue()) {
                        microchemistry microchemistryVar2 = this.b.m;
                        microchemistryVar2.getClass();
                        Intrinsics.checkNotNullParameter(webView, "webView");
                        try {
                            String strB = ((fa3) microchemistryVar2.b).b();
                            if (strB != null) {
                                w03 w03VarA2 = j13.a(no0.CUI_NAME_WEBVIEW_PROFILE_SET, adultoid.formularize(), true);
                                try {
                                    kowloon.kowloon(webView, strB);
                                    Unit unit = Unit.f29295attabal;
                                    interaction.saneness.attabal(w03VarA2, null);
                                    return webView;
                                } catch (Throwable th) {
                                    try {
                                        w03VarA2.b(th);
                                        if (th instanceof evenfall) {
                                            throw th;
                                        }
                                        w03VarA2.a(th);
                                        if (th instanceof TimeoutCancellationException) {
                                            throw new cp0(th);
                                        }
                                        if (th instanceof CancellationException) {
                                            throw new bn0(th);
                                        }
                                        if (th instanceof yn0) {
                                            throw th;
                                        }
                                        throw new gn0(th);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            interaction.saneness.attabal(w03VarA2, th2);
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                return webView;
            } catch (Throwable th4) {
                th = th4;
                try {
                    w03Var.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    w03Var.a(th);
                    if (th instanceof TimeoutCancellationException) {
                        throw new cp0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        interaction.saneness.attabal(w03Var, th5);
                        throw th6;
                    }
                }
            }
        } catch (Throwable th7) {
            th = th7;
            w03Var = w03VarA;
        }
    }
}
