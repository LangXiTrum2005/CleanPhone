package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ca2 extends ContinuationImpl {
    public na2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ na2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca2(na2 na2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = na2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return na2.a(this.c, (d41) null, this);
    }
}
