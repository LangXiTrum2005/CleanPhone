package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class sw1 extends ContinuationImpl {
    public Object a;
    public xq0 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xw1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw1(xw1 xw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = xw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return xw1.a(this.e, (xq0) null, this);
    }
}
