package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.canephora;
import saneness.pigboat;

/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends ContinuationImpl {
    public nz1 a;
    public pigboat b;
    public pz1 c;
    public canephora d;
    public formularization.attabal e;
    public /* synthetic */ Object f;
    public final /* synthetic */ nz1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz1(nz1 nz1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = nz1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((pigboat) null, (pz1) null, this);
    }
}
