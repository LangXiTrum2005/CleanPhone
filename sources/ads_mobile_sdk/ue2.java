package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ue2 extends ContinuationImpl {
    public ve2 a;
    public h1 b;
    public formularization.attabal c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ve2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue2(ve2 ve2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ve2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, (h1) null, this);
    }
}
