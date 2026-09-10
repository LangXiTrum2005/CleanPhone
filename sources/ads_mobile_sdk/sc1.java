package ads_mobile_sdk;

import android.net.Uri;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class sc1 extends ContinuationImpl {
    public tc1 a;
    public Uri b;
    public h1 c;
    public p002kotlin.time.saneness d;
    public String e;
    public String f;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ tc1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc1(tc1 tc1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = tc1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a((Uri) null, (jm2) null, (h1) null, (Integer) null, (String) null, (p002kotlin.time.saneness) null, (String) null, (a22) null, (hv0) null, this);
    }
}
