package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class rf2 extends ContinuationImpl {
    public uf2 a;
    public String b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ uf2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf2(uf2 uf2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = uf2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return uf2.a(this.e, null, this);
    }
}
