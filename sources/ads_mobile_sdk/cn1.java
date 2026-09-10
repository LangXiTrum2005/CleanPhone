package ads_mobile_sdk;

import java.util.Collection;
import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class cn1 extends ContinuationImpl {
    public Collection a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hn1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn1(hn1 hn1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = hn1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
