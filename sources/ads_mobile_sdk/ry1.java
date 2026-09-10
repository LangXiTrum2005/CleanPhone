package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ry1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ vy1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry1(vy1 vy1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = vy1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((gq0) null, (String) null, this);
    }
}
