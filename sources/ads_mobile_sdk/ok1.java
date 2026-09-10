package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.carport;

/* JADX INFO: loaded from: classes.dex */
public final class ok1 extends ContinuationImpl {
    public qk1 a;
    public carport b;
    public PerAdNativeJavscriptEngineJsContext c;
    public /* synthetic */ Object d;
    public final /* synthetic */ qk1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok1(qk1 qk1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = qk1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return qk1.a(this.e, this);
    }
}
