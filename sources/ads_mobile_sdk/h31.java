package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class h31 extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j31 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h31(j31 j31Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = j31Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
