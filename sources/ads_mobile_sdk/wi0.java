package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class wi0 extends ContinuationImpl {
    public yi0 a;
    public technofreak b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yi0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(yi0 yi0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = yi0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return yi0.b(this.d, (technofreak) null, this);
    }
}
