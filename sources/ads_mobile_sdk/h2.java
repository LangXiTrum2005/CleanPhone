package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ j2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(j2 j2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = j2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return j2.a(this.b, (wretchedly.dern) this);
    }
}
