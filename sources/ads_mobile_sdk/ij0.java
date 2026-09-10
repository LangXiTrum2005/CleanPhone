package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ij0 extends ContinuationImpl {
    public sj0 a;
    public Object b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sj0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij0(sj0 sj0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = sj0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return sj0.a(this.e, this);
    }
}
