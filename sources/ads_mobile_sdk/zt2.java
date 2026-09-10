package ads_mobile_sdk;

import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class zt2 extends ContinuationImpl {
    public bu2 a;
    public w03 b;
    public Closeable c;
    public gq0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bu2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt2(bu2 bu2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = bu2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return bu2.a(this.f, this);
    }
}
