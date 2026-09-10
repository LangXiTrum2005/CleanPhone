package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class r90 extends ContinuationImpl {
    public ja0 a;
    public ip0 b;
    public ja0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ja0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(ja0 ja0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ja0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
