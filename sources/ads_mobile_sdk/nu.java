package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class nu extends ContinuationImpl {
    public nn0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iv c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((nn0) null, this);
    }
}
