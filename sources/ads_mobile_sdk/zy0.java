package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class zy0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public int c;
    public boolean d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ wz0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.h(this);
    }
}
