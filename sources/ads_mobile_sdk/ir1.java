package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends ContinuationImpl {
    public jr1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jr1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir1(jr1 jr1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = jr1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((formularize) null, this);
    }
}
