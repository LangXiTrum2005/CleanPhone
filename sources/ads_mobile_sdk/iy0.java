package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class iy0 extends ContinuationImpl {
    public jy0 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jy0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(jy0 jy0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = jy0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return jy0.a(this.d, this);
    }
}
