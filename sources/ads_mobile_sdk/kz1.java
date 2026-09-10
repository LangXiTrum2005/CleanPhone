package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends ContinuationImpl {
    public nz1 a;
    public pz1 b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ nz1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz1(nz1 nz1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = nz1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return nz1.a(this.e, (pz1) null, this);
    }
}
