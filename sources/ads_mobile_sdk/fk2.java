package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class fk2 extends ContinuationImpl {
    public gk2 a;
    public String b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gk2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk2(gk2 gk2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = gk2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return gk2.a(this.e, (String) null, this);
    }
}
