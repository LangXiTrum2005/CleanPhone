package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ie extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ je b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(je jeVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = jeVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, false, null, null, null, this);
    }
}
