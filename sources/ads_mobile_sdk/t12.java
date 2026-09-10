package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class t12 extends ContinuationImpl {
    public x12 a;
    public ln0 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ x12 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(x12 x12Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = x12Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return x12.a(this.e, this);
    }
}
