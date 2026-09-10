package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.gerenuk;

/* JADX INFO: loaded from: classes.dex */
public final class xo1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ yo1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo1(yo1 yo1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = yo1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((gerenuk) null, this);
    }
}
