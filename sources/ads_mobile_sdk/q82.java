package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class q82 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ k92 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q82(k92 k92Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = k92Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return k92.a(this.b, this);
    }
}
