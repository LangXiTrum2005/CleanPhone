package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class dx1 extends ContinuationImpl {
    public tx1 a;
    public String b;
    public iv0 c;
    public formularization.attabal d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tx1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx1(tx1 tx1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = tx1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((String) null, false, (iv0) null, (wretchedly.dern) this);
    }
}
