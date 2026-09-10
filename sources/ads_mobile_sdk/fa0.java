package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends ContinuationImpl {
    public ja0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ja0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(ja0 ja0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = ja0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(false, null, null, false, this);
    }
}
