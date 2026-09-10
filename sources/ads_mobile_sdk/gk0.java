package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class gk0 extends ContinuationImpl {
    public jk0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jk0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk0(jk0 jk0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = jk0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return jk0.a(this.c, null, null, this);
    }
}
