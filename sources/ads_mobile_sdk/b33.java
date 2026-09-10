package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class b33 extends ContinuationImpl {
    public c33 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c33 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b33(c33 c33Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = c33Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(this);
    }
}
