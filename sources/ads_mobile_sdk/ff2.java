package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ff2 extends ContinuationImpl {
    public jf2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jf2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff2(jf2 jf2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = jf2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
