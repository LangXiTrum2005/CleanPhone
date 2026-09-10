package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class p02 extends ContinuationImpl {
    public q02 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q02 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p02(q02 q02Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = q02Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
