package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.gerenuk;

/* JADX INFO: loaded from: classes.dex */
public final class h83 extends ContinuationImpl {
    public l83 a;
    public ia3 b;
    public l13 c;
    public u20 d;
    public gerenuk e;
    public a22 f;
    public String g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ l83 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h83(l83 l83Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.j = l83Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, null, null, false, null, this);
    }
}
