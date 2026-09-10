package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.conclusively;

/* JADX INFO: loaded from: classes.dex */
public final class hx2 extends ContinuationImpl {
    public jx2 a;
    public conclusively b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jx2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx2(jx2 jx2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = jx2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((conclusively) null, this);
    }
}
