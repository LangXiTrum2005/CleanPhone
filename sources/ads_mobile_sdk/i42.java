package ads_mobile_sdk;

import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i42 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Function1 c;
    public i42 d;
    public Iterator e;
    public Iterator f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ w52 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i42(w52 w52Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = w52Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(0L, this);
    }
}
