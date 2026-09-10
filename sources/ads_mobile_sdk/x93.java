package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class x93 extends ContinuationImpl {
    public fa3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fa3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x93(fa3 fa3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = fa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return fa3.b(this.c, this);
    }
}
