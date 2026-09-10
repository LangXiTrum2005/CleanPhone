package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class j63 extends ContinuationImpl {
    public k63 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k63 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j63(k63 k63Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = k63Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return k63.b(this.d, this);
    }
}
