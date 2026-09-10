package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class em0 extends ContinuationImpl {
    public hm0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hm0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(hm0 hm0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = hm0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return hm0.b(this.c, this);
    }
}
