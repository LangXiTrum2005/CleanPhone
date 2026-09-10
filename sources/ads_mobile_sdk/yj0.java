package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class yj0 extends ContinuationImpl {
    public zj0 a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public mv f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zj0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj0(zj0 zj0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = zj0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return zj0.a(this.h, null, null, this);
    }
}
