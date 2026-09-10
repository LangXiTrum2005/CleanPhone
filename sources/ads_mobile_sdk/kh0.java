package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.blindfish;

/* JADX INFO: loaded from: classes.dex */
public final class kh0 extends ContinuationImpl {
    public xq0 a;
    public h1 b;
    public oa0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ blindfish e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh0(blindfish blindfishVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = blindfishVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return blindfish.attabal(this.e, null, null, null, this);
    }
}
