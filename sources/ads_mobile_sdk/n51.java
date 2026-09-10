package ads_mobile_sdk;

import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class n51 extends ContinuationImpl {
    public z51 a;
    public Object b;
    public Closeable c;
    public /* synthetic */ Object d;
    public final /* synthetic */ z51 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(z51 z51Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = z51Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
