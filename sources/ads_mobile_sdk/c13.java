package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c13 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ d13 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c13(d13 d13Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = d13Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new c13(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c13(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r5.a((wretchedly.dern) r4) == r0) goto L15;
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
            goto L3b
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
            ads_mobile_sdk.d13 r5 = r4.b
            ads_mobile_sdk.lf0 r5 = r5.e
            r4.a = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L2e
            goto L3a
        L2e:
            ads_mobile_sdk.d13 r5 = r4.b
            ads_mobile_sdk.n13 r5 = r5.d
            r4.a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L3b
        L3a:
            return r0
        L3b:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
