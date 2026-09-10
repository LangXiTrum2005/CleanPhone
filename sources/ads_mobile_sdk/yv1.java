package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class yv1 extends ContinuationImpl {
    public Object a;
    public xq0 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ kw1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv1(kw1 kw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = kw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((xq0) null, (wretchedly.dern) this);
    }
}
