package ads_mobile_sdk;

import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.gerenuk;

/* JADX INFO: loaded from: classes.dex */
public final class gr0 extends ContinuationImpl {
    public gerenuk a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hr0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(hr0 hr0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = hr0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((gerenuk) null, this);
    }
}
