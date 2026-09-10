package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class oe2 extends ContinuationImpl {
    public ve2 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ve2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe2(ve2 ve2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ve2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return ve2.a(this.d, this);
    }
}
