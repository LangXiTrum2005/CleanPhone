package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class qs1 extends ContinuationImpl {
    public rs1 a;
    public xm b;
    public String c;
    public wt0 d;
    public String e;
    public wt0 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ rs1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs1(rs1 rs1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = rs1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
