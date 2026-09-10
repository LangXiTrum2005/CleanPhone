package ads_mobile_sdk;

import android.net.Uri;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class z53 extends ContinuationImpl {
    public b63 a;
    public Uri b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b63 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z53(b63 b63Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = b63Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
