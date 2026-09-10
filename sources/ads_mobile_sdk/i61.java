package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.powdery;

/* JADX INFO: loaded from: classes.dex */
public final class i61 extends ContinuationImpl {
    public d41 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ powdery c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i61(powdery powderyVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = powderyVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.attabal(null, this);
    }
}
