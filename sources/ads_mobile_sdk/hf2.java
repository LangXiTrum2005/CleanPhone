package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class hf2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jf2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf2(jf2 jf2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = jf2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((spartacist) null, this);
    }
}
