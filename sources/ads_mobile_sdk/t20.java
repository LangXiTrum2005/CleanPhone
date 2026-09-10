package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class t20 extends ContinuationImpl {
    public u20 a;
    public String b;
    public String c;
    public formularization.attabal d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u20 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(u20 u20Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = u20Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((String) null, (String) null, 0L, this);
    }
}
