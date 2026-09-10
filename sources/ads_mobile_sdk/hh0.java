package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class hh0 extends ContinuationImpl {
    public ih0 a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ih0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh0(ih0 ih0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ih0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
