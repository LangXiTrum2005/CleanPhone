package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class kl0 extends ContinuationImpl {
    public gq0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bm0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl0(bm0 bm0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = bm0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((gq0) null, this);
    }
}
