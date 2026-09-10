package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ji extends ContinuationImpl {
    public ki a;
    public formularization.attabal b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ki e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(ki kiVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = kiVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(false, this);
    }
}
