package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ko1 extends ContinuationImpl {
    public Object a;
    public w03 b;
    public w03 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ so1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko1(so1 so1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = so1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return so1.a(this.e, null, null, this);
    }
}
