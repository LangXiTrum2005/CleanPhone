package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class bp extends ContinuationImpl {
    public cp a;
    public gq0 b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cp e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(cp cpVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = cpVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
