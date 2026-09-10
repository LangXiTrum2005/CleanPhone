package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class dw1 extends ContinuationImpl {
    public Object a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kw1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw1(kw1 kw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = kw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return kw1.b(this.d, this);
    }
}
