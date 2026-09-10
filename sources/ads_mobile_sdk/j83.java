package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class j83 extends ContinuationImpl {
    public l83 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l83 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j83(l83 l83Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = l83Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((ia3) null, (l13) null, (u20) null, (a22) null, this);
    }
}
