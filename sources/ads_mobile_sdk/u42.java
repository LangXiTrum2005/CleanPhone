package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class u42 extends ContinuationImpl {
    public w52 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w52 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u42(w52 w52Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = w52Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(this);
    }
}
