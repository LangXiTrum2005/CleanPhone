package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class dv1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ lv1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv1(lv1 lv1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.b = lv1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return lv1.a(this.b, this);
    }
}
