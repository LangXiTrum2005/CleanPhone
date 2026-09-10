package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class dy0 extends ContinuationImpl {
    public gy0 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gy0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(gy0 gy0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = gy0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return gy0.a(this.d, this);
    }
}
