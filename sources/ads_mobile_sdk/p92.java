package ads_mobile_sdk;

import java.io.Closeable;
import java.io.Serializable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class p92 extends ContinuationImpl {
    public Object a;
    public Closeable b;
    public Closeable c;
    public Serializable d;
    public Object e;
    public Object f;
    public Ref$ObjectRef g;
    public Object h;
    public Ref$ObjectRef i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ s92 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p92(s92 s92Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.l = s92Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return s92.a(this.l, (wretchedly.dern) this);
    }
}
