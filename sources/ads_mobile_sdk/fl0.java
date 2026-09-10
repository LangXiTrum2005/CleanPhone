package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class fl0 extends ContinuationImpl {
    public Object a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bm0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl0(bm0 bm0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = bm0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return bm0.a(this.d, this);
    }
}
