package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class dj1 extends ContinuationImpl {
    public ej1 a;
    public Object b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ej1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj1(ej1 ej1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ej1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
