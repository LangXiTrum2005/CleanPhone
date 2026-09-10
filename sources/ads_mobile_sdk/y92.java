package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class y92 extends ContinuationImpl {
    public na2 a;
    public na2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ na2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y92(na2 na2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = na2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return na2.b(this.d, this);
    }
}
