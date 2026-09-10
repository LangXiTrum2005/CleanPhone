package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class df2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public b12 c;
    public w03 d;
    public w03 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ jf2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df2(jf2 jf2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = jf2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return jf2.a(this.g, null, null, null, null, this);
    }
}
