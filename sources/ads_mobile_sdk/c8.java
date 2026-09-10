package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class c8 extends ContinuationImpl {
    public f8 a;
    public m73 b;
    public formularization.attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ f8 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(f8 f8Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = f8Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
