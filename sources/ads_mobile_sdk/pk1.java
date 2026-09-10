package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.carport;

/* JADX INFO: loaded from: classes.dex */
public final class pk1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public carport c;
    public PerAdNativeJavscriptEngineJsContext d;
    public a22 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qk1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk1(qk1 qk1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = qk1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((JsonObject) null, (carport) null, (PerAdNativeJavscriptEngineJsContext) null, this);
    }
}
