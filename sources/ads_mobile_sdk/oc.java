package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class oc extends ContinuationImpl {
    public dd a;
    public formularization.attabal b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dd e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(dd ddVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ddVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(0L, this);
    }
}
