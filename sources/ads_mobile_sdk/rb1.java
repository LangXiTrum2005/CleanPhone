package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class rb1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public w03 c;
    public w03 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vb1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(vb1 vb1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = vb1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
