package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class p90 extends ContinuationImpl {
    public ja0 a;
    public w03 b;
    public w03 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ja0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(ja0 ja0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ja0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return ja0.a(this.e, null, null, null, null, this);
    }
}
