package ads_mobile_sdk;

import acidy.impromptu;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.truantry;

/* JADX INFO: loaded from: classes.dex */
public final class k61 extends ContinuationImpl {
    public impromptu a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l61 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k61(l61 l61Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = l61Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((truantry) null, (wretchedly.dern) this);
    }
}
