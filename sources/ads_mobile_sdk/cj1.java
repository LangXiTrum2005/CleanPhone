package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class cj1 extends ContinuationImpl {
    public ej1 a;
    public Object b;
    public Object c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ej1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj1(ej1 ej1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ej1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
