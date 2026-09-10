package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ba2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ na2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(na2 na2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = na2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return na2.a(this.b, (wretchedly.dern) this);
    }
}
