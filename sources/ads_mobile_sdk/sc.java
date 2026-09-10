package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class sc extends ContinuationImpl {
    public dd a;
    public Object b;
    public Object c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(dd ddVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ddVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.h(this);
    }
}
