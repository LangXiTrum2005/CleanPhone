package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class lg extends ContinuationImpl {
    public vg a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(vg vgVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = vgVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return vg.a(this.d, this);
    }
}
