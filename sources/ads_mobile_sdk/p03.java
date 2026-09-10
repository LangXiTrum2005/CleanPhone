package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class p03 extends ContinuationImpl {
    public q03 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q03 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p03(q03 q03Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = q03Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
