package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class d4 extends ContinuationImpl {
    public e4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(e4 e4Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = e4Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return e4.a(this.c, this);
    }
}
