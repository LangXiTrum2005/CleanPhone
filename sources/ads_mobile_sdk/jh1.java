package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class jh1 extends ContinuationImpl {
    public qh1 a;
    public formularization.attabal b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ qh1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh1(qh1 qh1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = qh1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return qh1.a(this.e, false, (wretchedly.dern) this);
    }
}
