package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class i23 extends ContinuationImpl {
    public w03 a;
    public w03 b;
    public m23 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ m23 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i23(m23 m23Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = m23Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(this);
    }
}
