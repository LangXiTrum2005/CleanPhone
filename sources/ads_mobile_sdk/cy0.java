package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class cy0 extends ContinuationImpl {
    public gy0 a;
    public jm2 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gy0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(gy0 gy0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = gy0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return gy0.a(this.e, (jm2) null, this);
    }
}
