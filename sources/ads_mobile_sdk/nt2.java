package ads_mobile_sdk;

import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import svd.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class nt2 extends ContinuationImpl {
    public Object a;
    public Closeable b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ polloi e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt2(polloi polloiVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = polloiVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return polloi.wireman(this.e, this);
    }
}
