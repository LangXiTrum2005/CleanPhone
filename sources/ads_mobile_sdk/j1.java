package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends ContinuationImpl {
    public l1 a;
    public w03 b;
    public w03 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ l1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = l1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return l1.a(this.e, null, 0, this);
    }
}
