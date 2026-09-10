package ads_mobile_sdk;

import android.webkit.WebView;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ww1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ xw1 a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww1(xw1 xw1Var, WebView webView, boolean z, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.a = xw1Var;
        this.b = webView;
        this.c = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new ww1(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ww1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        lv1 lv1Var = this.a.c;
        WebView webView = this.b;
        boolean z = this.c;
        lv1Var.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        return (d91) lv1Var.f.attabal("CreateJavaScriptSessionService", new xu1(lv1Var, webView, z));
    }
}
