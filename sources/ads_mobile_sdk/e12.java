package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class e12 extends ContinuationImpl {
    public PerAdNativeJavscriptEngineJsContext a;
    public String b;
    public hemolysin c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ PerAdNativeJavscriptEngineJsContext f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e12(PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = perAdNativeJavscriptEngineJsContext;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((String) null, (hemolysin) null, this);
    }
}
