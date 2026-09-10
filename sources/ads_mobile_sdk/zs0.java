package ads_mobile_sdk;

import java.net.URL;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class zs0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ it0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs0(it0 it0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = it0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((URL) null, (eh0) null, this);
    }
}
