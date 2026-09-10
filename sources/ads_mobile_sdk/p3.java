package ads_mobile_sdk;

import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends ContinuationImpl {
    public Object a;
    public Closeable b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(x3 x3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = x3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(this);
    }
}
