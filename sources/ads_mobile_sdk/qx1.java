package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class qx1 extends ContinuationImpl {
    public tx1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tx1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx1(tx1 tx1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = tx1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return tx1.d(this.c, this);
    }
}
