package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class na0 extends ContinuationImpl {
    public oa0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oa0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(oa0 oa0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = oa0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return oa0.a(this.c, this);
    }
}
