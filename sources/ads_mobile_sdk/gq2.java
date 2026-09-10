package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class gq2 extends ContinuationImpl {
    public Object a;
    public arytenoidectomy b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uq2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq2(uq2 uq2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = uq2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((arytenoidectomy) null, this);
    }
}
