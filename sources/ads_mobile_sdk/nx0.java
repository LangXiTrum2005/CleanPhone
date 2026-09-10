package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class nx0 extends ContinuationImpl {
    public ox0 a;
    public w03 b;
    public w03 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ox0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx0(ox0 ox0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ox0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
