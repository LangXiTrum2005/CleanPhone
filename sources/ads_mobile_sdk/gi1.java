package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class gi1 extends ContinuationImpl {
    public ii1 a;
    public m73 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ii1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi1(ii1 ii1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ii1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return ii1.a(this.e, null, this);
    }
}
