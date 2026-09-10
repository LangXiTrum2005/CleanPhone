package ads_mobile_sdk;

import android.net.Uri;
import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class lg2 extends ContinuationImpl {
    public qg2 a;
    public Uri b;
    public os1 c;
    public String d;
    public Map e;
    public e2 f;
    public h1 g;
    public Boolean h;
    public l13 i;
    public int j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qg2 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg2(qg2 qg2Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.m = qg2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, 0, 0L, null, null, null, null, null, null, this);
    }
}
