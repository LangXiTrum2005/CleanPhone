package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends ContinuationImpl {
    public gh1 a;
    public wt0 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gh1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(gh1 gh1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = gh1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
