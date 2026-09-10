package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class w91 extends ContinuationImpl {
    public y91 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y91 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w91(y91 y91Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = y91Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return y91.a(this.d, this);
    }
}
