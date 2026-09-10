package ads_mobile_sdk;

import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class r8 extends ContinuationImpl {
    public v8 a;
    public w03 b;
    public Closeable c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v8 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(v8 v8Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = v8Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return v8.a(this.e, this);
    }
}
