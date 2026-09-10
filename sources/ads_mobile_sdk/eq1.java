package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.gerenuk;

/* JADX INFO: loaded from: classes.dex */
public final class eq1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ fq1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(fq1 fq1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = fq1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((gerenuk) null, this);
    }
}
