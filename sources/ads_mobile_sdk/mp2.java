package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mp2 extends ContinuationImpl {
    public op2 a;
    public String b;
    public String c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ op2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp2(op2 op2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = op2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
