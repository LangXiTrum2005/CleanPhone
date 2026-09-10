package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class vg0 extends ContinuationImpl {
    public wg0 a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wg0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg0(wg0 wg0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = wg0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return wg0.a(this.d, this);
    }
}
