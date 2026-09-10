package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class np2 extends ContinuationImpl {
    public op2 a;
    public String b;
    public String c;
    public jp2 d;
    public formularization.attabal e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ op2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np2(op2 op2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = op2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, null, 0, this);
    }
}
