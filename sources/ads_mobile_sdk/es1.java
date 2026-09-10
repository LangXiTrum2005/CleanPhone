package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class es1 extends ContinuationImpl {
    public js1 a;
    public Object b;
    public Object c;
    public formularization.attabal d;
    public long e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ js1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es1(js1 js1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = js1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(0L, null, null, false, this);
    }
}
