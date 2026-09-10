package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class pn2 extends ContinuationImpl {
    public sn2 a;
    public Object b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sn2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn2(sn2 sn2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = sn2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return sn2.a(this.e, this);
    }
}
