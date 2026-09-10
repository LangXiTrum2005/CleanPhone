package ads_mobile_sdk;

import complexometry.ResponseInfo;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class da2 extends ContinuationImpl {
    public na2 a;
    public spartacist b;
    public /* synthetic */ Object c;
    public final /* synthetic */ na2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da2(na2 na2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = na2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((spartacist) null, (ResponseInfo) null, this);
    }
}
