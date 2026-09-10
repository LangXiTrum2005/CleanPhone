package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ae2 extends ContinuationImpl {
    public ee2 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ee2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae2(ee2 ee2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ee2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
