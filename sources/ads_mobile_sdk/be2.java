package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class be2 extends ContinuationImpl {
    public ee2 a;
    public formularization.attabal b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ee2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be2(ee2 ee2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ee2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0L, this);
    }
}
