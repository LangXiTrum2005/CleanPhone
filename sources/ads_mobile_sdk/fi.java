package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.udf;

/* JADX INFO: loaded from: classes.dex */
public final class fi extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public udf d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ hi h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(hi hiVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = hiVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(false, (wretchedly.dern) this);
    }
}
