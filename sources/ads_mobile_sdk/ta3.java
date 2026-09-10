package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ta3 extends ContinuationImpl {
    public wa3 a;
    public m73 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wa3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta3(wa3 wa3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = wa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
