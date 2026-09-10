package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class jl0 extends ContinuationImpl {
    public bm0 a;
    public gq0 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bm0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl0(bm0 bm0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = bm0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((gq0) null, (wretchedly.dern) this);
    }
}
