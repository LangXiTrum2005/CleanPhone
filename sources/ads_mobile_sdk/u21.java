package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class u21 extends ContinuationImpl {
    public v21 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v21 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(v21 v21Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = v21Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return v21.a(this.c, this);
    }
}
