package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class i91 extends ContinuationImpl {
    public Object a;
    public e51 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y91 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(y91 y91Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = y91Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((e51) null, this);
    }
}
