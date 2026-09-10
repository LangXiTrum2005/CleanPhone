package ads_mobile_sdk;

import java.io.Closeable;
import kotlinx.coroutines.gintrap;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class zp0 extends ContinuationImpl {
    public Object a;
    public Closeable b;
    public Object c;
    public gintrap d;
    public /* synthetic */ Object e;
    public final /* synthetic */ gq0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(gq0 gq0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = gq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
