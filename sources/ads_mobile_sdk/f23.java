package ads_mobile_sdk;

import java.util.Collection;
import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class f23 extends ContinuationImpl {
    public m23 a;
    public String b;
    public Collection c;
    public Iterator d;
    public Collection e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m23 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f23(m23 m23Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = m23Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.n(this);
    }
}
