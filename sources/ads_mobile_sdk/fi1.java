package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class fi1 extends ContinuationImpl {
    public ii1 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ii1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi1(ii1 ii1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ii1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return ii1.a(this.d, this);
    }
}
