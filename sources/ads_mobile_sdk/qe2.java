package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class qe2 extends ContinuationImpl {
    public ve2 a;
    public jm2 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ve2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe2(ve2 ve2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ve2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((jm2) null, this);
    }
}
