package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class d9 extends ContinuationImpl {
    public e9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(e9 e9Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = e9Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
