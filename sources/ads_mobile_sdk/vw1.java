package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class vw1 extends ContinuationImpl {
    public xw1 a;
    public Object b;
    public Object c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xw1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw1(xw1 xw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = xw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return xw1.a(this.f, null, false, this);
    }
}
