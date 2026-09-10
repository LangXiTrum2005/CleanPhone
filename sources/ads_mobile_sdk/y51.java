package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y51 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ z51 b;
    public final /* synthetic */ Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(z51 z51Var, Function1 function1, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = z51Var;
        this.c = function1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new y51(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new y51(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r5.invoke(r4) == r0) goto L15;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r5)
            goto L39
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            p002kotlin.dern.saneness(r5)
            goto L2e
        L1e:
            p002kotlin.dern.saneness(r5)
            ads_mobile_sdk.z51 r5 = r4.b
            kotlinx.coroutines.cord r5 = r5.v
            r4.a = r3
            java.lang.Object r5 = r5.starveling(r4)
            if (r5 != r0) goto L2e
            goto L38
        L2e:
            kotlin.jvm.functions.Function1 r5 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto L39
        L38:
            return r0
        L39:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y51.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
