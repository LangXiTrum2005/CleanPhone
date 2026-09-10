package ads_mobile_sdk;

import kotlinx.coroutines.walach;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class g63 extends ContinuationImpl {
    public Object a;
    public Object b;
    public walach c;
    public /* synthetic */ Object d;
    public final /* synthetic */ k63 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g63(k63 k63Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = k63Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return k63.a(this.e, this);
    }
}
