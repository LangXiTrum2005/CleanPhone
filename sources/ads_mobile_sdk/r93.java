package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class r93 extends ContinuationImpl {
    public fa3 a;
    public w03 b;
    public w03 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fa3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r93(fa3 fa3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = fa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return fa3.a(this.e, this);
    }
}
