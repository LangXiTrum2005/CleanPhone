package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ff extends ContinuationImpl {
    public hf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hf c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(hf hfVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = hfVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return hf.a(this.c, this);
    }
}
