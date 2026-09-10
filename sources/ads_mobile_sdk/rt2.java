package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import svd.arytenoidectomy;
import svd.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class rt2 extends ContinuationImpl {
    public ir2 a;
    public arytenoidectomy b;
    public /* synthetic */ Object c;
    public final /* synthetic */ polloi d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt2(polloi polloiVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = polloiVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.attabal(null, null, this);
    }
}
