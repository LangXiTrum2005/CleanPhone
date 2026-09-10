package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ro1 extends ContinuationImpl {
    public gq0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ so1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro1(so1 so1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = so1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return so1.a(this.c, null, this);
    }
}
