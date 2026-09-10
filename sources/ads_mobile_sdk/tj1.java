package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class tj1 extends ContinuationImpl {
    public w03 a;
    public w03 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vj1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj1(vj1 vj1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = vj1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return vj1.a(this.d, (hj1) null, (gq0) null, this);
    }
}
