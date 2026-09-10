package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.amphitheatre;
import saneness.conclusively;
import svd.AdapterVersionData;

/* JADX INFO: loaded from: classes.dex */
public final class t8 extends ContinuationImpl {
    public v8 a;
    public String b;
    public AdapterVersionData c;
    public amphitheatre d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ v8 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(v8 v8Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = v8Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((conclusively) null, (String) null, (j8) null, this);
    }
}
