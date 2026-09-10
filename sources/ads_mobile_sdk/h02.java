package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class h02 extends ContinuationImpl {
    public Object a;
    public Object b;
    public w03 c;
    public w03 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ q02 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h02(q02 q02Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = q02Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((jm2) null, this);
    }
}
