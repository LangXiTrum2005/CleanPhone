package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class o92 extends ContinuationImpl {
    public s92 a;
    public xt0 b;
    public w03 c;
    public w03 d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ s92 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o92(s92 s92Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = s92Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a((xt0) null, this);
    }
}
