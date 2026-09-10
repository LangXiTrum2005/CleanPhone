package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ol1 extends ContinuationImpl {
    public ql1 a;
    public String b;
    public long c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ql1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol1(ql1 ql1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ql1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
