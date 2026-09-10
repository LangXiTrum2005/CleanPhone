package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class uw1 extends ContinuationImpl {
    public xw1 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xw1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw1(xw1 xw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = xw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return xw1.a(this.d, this);
    }
}
