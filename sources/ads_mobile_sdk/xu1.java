package ads_mobile_sdk;

import android.webkit.WebView;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class xu1 extends Lambda implements Function0 {
    public final /* synthetic */ lv1 a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu1(lv1 lv1Var, WebView webView, boolean z) {
        super(0);
        this.a = lv1Var;
        this.b = webView;
        this.c = z;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new d91(this.a.j, this.b, this.c);
    }
}
