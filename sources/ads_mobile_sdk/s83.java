package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class s83 extends ContinuationImpl {
    public v83 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v83 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s83(v83 v83Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = v83Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return v83.a(this.c, this);
    }
}
