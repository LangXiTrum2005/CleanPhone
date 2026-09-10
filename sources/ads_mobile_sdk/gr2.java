package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class gr2 extends ContinuationImpl {
    public w03 a;
    public w03 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ portwide d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr2(portwide portwideVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = portwideVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return portwide.attabal(this.d, this);
    }
}
