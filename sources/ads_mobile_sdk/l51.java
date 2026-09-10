package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class l51 extends ContinuationImpl {
    public w03 a;
    public w03 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z51 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(z51 z51Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = z51Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
