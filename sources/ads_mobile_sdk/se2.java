package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class se2 extends ContinuationImpl {
    public ve2 a;
    public spartacist b;
    public h1 c;
    public me2 d;
    public Integer e;
    public formularization.attabal f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ve2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se2(ve2 ve2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = ve2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, null, 0L, this);
    }
}
