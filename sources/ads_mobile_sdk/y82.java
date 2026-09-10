package ads_mobile_sdk;

import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class y82 extends ContinuationImpl {
    public k92 a;
    public orthocephalic b;
    public CoroutineContext c;
    public /* synthetic */ Object d;
    public final /* synthetic */ k92 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y82(k92 k92Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = k92Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return k92.a(this.e, null, this);
    }
}
