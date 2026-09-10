package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class wg1 extends ContinuationImpl {
    public yg1 a;
    public gq0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yg1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(yg1 yg1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = yg1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
