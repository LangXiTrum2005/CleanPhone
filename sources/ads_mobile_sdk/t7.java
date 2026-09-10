package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends ContinuationImpl {
    public v7 a;
    public m73 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v7 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(v7 v7Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = v7Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return v7.a(this.e, null, this);
    }
}
