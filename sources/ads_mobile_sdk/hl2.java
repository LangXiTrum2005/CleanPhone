package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class hl2 extends ContinuationImpl {
    public ll2 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ll2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl2(ll2 ll2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ll2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return ll2.a(this.d, this);
    }
}
