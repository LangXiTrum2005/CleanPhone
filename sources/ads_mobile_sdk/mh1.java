package ads_mobile_sdk;

import android.view.ViewGroup;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mh1 extends ContinuationImpl {
    public qh1 a;
    public ViewGroup b;
    public Object c;
    public Object d;
    public Object e;
    public gq0 f;
    public xq0 g;
    public formularization.attabal h;
    public /* synthetic */ Object i;
    public final /* synthetic */ qh1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh1(qh1 qh1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.j = qh1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, null, null, null, null, this);
    }
}
