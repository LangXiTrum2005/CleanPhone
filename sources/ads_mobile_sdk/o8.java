package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends ContinuationImpl {
    public v8 a;
    public String b;
    public w03 c;
    public w03 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ v8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(v8 v8Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = v8Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return v8.a(this.f, (String) null, (j8) null, this);
    }
}
