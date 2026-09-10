package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pj extends ContinuationImpl {
    public Object a;
    public Function2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rj d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(rj rjVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = rjVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
