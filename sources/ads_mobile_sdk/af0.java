package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class af0 extends ContinuationImpl {
    public Object a;
    public e51 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cf0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(cf0 cf0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = cf0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((ue0) null, this);
    }
}
