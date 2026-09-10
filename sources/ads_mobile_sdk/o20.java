package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class o20 extends ContinuationImpl {
    public u20 a;
    public String b;
    public b03 c;
    public b03 d;
    public formularization.attabal e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u20 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o20(u20 u20Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = u20Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
