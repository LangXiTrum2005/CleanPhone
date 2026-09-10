package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class vl extends ContinuationImpl {
    public wl a;
    public double b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(wl wlVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = wlVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return wl.a(this.e, null, 0.0d, false, this);
    }
}
