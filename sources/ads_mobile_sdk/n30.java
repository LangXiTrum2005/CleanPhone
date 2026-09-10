package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class n30 extends ContinuationImpl {
    public r30 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ r30 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(r30 r30Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = r30Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return r30.a(this.d, null, this);
    }
}
