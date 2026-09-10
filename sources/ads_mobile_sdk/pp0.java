package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class pp0 extends ContinuationImpl {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gq0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp0(gq0 gq0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = gq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, null, this);
    }
}
