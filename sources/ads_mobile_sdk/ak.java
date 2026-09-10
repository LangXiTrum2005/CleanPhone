package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ak extends ContinuationImpl {
    public ik a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ik c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(ik ikVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = ikVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return ik.a(this.c, this);
    }
}
