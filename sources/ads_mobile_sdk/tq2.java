package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class tq2 extends ContinuationImpl {
    public w03 a;
    public w03 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uq2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(uq2 uq2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = uq2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return uq2.a(this.d, this);
    }
}
