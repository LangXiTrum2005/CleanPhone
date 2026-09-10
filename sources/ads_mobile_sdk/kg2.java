package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class kg2 extends ContinuationImpl {
    public qg2 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qg2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg2(qg2 qg2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = qg2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
