package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class vu1 extends ContinuationImpl {
    public lv1 a;
    public gq0 b;
    public sz1 c;
    public iv0 d;
    public fw e;
    public sz1 f;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ lv1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu1(lv1 lv1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = lv1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return lv1.a(this.i, null, null, null, null, null, null, this);
    }
}
