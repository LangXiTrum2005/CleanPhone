package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class t91 extends ContinuationImpl {
    public y91 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y91 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t91(y91 y91Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = y91Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
