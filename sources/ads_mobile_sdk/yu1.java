package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class yu1 extends ContinuationImpl {
    public lv1 a;
    public gq0 b;
    public String c;
    public String d;
    public fw e;
    public iv0 f;
    public sz1 g;
    public sz1 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ lv1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu1(lv1 lv1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.j = lv1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return lv1.a(this.j, null, null, null, null, null, null, null, this);
    }
}
