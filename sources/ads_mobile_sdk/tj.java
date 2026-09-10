package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.sheafer;

/* JADX INFO: loaded from: classes.dex */
public final class tj extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public sheafer d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(vj vjVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = vjVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return vj.a(this.h, this);
    }
}
