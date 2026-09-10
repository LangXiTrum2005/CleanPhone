package ads_mobile_sdk;

import java.util.Collection;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class h23 extends ContinuationImpl {
    public m23 a;
    public Object b;
    public Collection c;
    public Object d;
    public Object e;
    public Integer f;
    public String g;
    public a22 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ m23 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h23(m23 m23Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.j = m23Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.q(this);
    }
}
