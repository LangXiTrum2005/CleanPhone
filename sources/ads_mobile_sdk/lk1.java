package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.carport;

/* JADX INFO: loaded from: classes.dex */
public final class lk1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ qk1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk1(qk1 qk1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = qk1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((carport) null, (h1) null, this);
    }
}
