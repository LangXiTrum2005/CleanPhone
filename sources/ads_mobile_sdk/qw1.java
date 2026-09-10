package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.fastrack;

/* JADX INFO: loaded from: classes.dex */
public final class qw1 extends ContinuationImpl {
    public xw1 a;
    public Object b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xw1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(xw1 xw1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = xw1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return xw1.a(this.e, (fastrack) null, this);
    }
}
