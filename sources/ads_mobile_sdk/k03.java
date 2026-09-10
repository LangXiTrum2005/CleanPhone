package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class k03 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ l03 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k03(l03 l03Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = l03Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return l03.a(this.b, false, this);
    }
}
