package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ea3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ fa3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea3(fa3 fa3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = fa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return fa3.d(this.b, this);
    }
}
