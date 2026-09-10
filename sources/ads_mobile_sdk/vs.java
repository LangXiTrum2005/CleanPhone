package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class vs extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ bt b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(bt btVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = btVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return bt.a(this.b, null, this);
    }
}
