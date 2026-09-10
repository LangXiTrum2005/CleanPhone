package ads_mobile_sdk;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class rc1 extends ContinuationImpl {
    public tc1 a;
    public jm2 b;
    public h1 c;
    public Integer d;
    public String e;
    public p002kotlin.time.saneness f;
    public String g;
    public a22 h;
    public hv0 i;
    public Collection j;
    public Iterator k;
    public Collection l;
    public /* synthetic */ Object m;
    public final /* synthetic */ tc1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc1(tc1 tc1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.n = tc1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a((List) null, (jm2) null, (h1) null, (Integer) null, (String) null, (p002kotlin.time.saneness) null, (String) null, (a22) null, (hv0) null, this);
    }
}
