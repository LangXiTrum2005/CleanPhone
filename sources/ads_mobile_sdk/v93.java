package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class v93 extends ContinuationImpl {
    public fa3 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fa3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v93(fa3 fa3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = fa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return fa3.c(this.d, this);
    }
}
