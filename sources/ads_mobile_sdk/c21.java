package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class c21 extends ContinuationImpl {
    public f21 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f21 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c21(f21 f21Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = f21Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
