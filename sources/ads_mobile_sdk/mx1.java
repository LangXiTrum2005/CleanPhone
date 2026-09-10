package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mx1 extends ContinuationImpl {
    public tx1 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tx1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx1(tx1 tx1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = tx1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return tx1.c(this.d, this);
    }
}
