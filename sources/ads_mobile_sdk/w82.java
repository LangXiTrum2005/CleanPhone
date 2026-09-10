package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class w82 extends ContinuationImpl {
    public k92 a;
    public Throwable b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k92 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w82(k92 k92Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = k92Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((wretchedly.dern) this);
    }
}
