package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class cl1 extends ContinuationImpl {
    public gl1 a;
    public xk1 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gl1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl1(gl1 gl1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = gl1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(0L, this);
    }
}
