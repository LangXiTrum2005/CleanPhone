package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class l30 extends ContinuationImpl {
    public r30 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r30 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(r30 r30Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = r30Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return r30.a(this.c, this);
    }
}
