package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ix2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ jx2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix2(jx2 jx2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = jx2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(false, (wretchedly.dern) this);
    }
}
