package ads_mobile_sdk;

import java.util.List;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class re2 extends SuspendLambda implements Function2 {
    public tc1 a;
    public List b;
    public jm2 c;
    public h1 d;
    public Integer e;
    public int f;
    public final /* synthetic */ ve2 g;
    public final /* synthetic */ List h;
    public final /* synthetic */ h1 i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re2(ve2 ve2Var, List list, h1 h1Var, long j, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.g = ve2Var;
        this.h = list;
        this.i = h1Var;
        this.j = j;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new re2(this.g, this.h, this.i, this.j, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((re2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r0 == r12) goto L20;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.re2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
