package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class qq2 extends ContinuationImpl {
    public Object a;
    public arytenoidectomy b;
    public String c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ uq2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq2(uq2 uq2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = uq2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
