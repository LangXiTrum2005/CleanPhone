package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mz0 extends ContinuationImpl {
    public wz0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wz0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return wz0.b(this.c, this);
    }
}
