package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends ContinuationImpl {
    public x3 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ x3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(x3 x3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = x3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return x3.d(this.d, this);
    }
}
