package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.cord;

/* JADX INFO: loaded from: classes.dex */
public final class ca1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ da1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca1(da1 da1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = da1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((cord) null, this);
    }
}
