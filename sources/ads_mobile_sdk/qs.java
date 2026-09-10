package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class qs extends ContinuationImpl {
    public bt a;
    public formularization.attabal b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bt e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(bt btVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = btVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return bt.a(this.e, false, null, this);
    }
}
