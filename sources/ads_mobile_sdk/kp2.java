package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class kp2 extends ContinuationImpl {
    public op2 a;
    public String b;
    public adjudge.saneness c;
    public arytenoidectomy d;
    public formularization.attabal e;
    public /* synthetic */ Object f;
    public final /* synthetic */ op2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp2(op2 op2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = op2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, this);
    }
}
