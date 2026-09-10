package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ri1 extends ContinuationImpl {
    public si1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ si1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri1(si1 si1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = si1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, 0, this);
    }
}
