package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class bl1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gl1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl1(gl1 gl1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = gl1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(this);
    }
}
