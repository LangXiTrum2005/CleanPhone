package ads_mobile_sdk;

import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class oa1 extends ContinuationImpl {
    public Object a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pa1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa1(pa1 pa1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = pa1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
