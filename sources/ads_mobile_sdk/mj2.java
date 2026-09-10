package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mj2 extends ContinuationImpl {
    public pj2 a;
    public Object b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pj2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj2(pj2 pj2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = pj2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, null, null, this);
    }
}
