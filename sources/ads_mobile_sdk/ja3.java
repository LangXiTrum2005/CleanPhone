package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ja3 extends ContinuationImpl {
    public la3 a;
    public m73 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ la3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja3(la3 la3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = la3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return la3.a(this.e, null, this);
    }
}
