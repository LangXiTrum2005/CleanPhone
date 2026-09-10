package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class uc extends ContinuationImpl {
    public dd a;
    public formularization.attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dd d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(dd ddVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = ddVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(this);
    }
}
