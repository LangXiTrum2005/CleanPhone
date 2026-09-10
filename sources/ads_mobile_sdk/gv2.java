package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class gv2 extends ContinuationImpl {
    public hv2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hv2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv2(hv2 hv2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = hv2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return hv2.a(this.c, this);
    }
}
