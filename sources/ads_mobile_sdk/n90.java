package ads_mobile_sdk;

import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class n90 extends ContinuationImpl {
    public Object a;
    public Closeable b;
    public Object c;
    public Object d;
    public hobby e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ja0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(ja0 ja0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = ja0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
