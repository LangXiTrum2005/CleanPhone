package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xx2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hy2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx2(hy2 hy2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = hy2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new xx2(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xx2(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r7.q(r6) == r0) goto L15;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r7)
            goto L3d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            p002kotlin.dern.saneness(r7)
            goto L30
        L1e:
            p002kotlin.dern.saneness(r7)
            ads_mobile_sdk.hy2 r7 = r6.b
            ads_mobile_sdk.h1 r7 = r7.b
            long r4 = r7.U
            r6.a = r3
            java.lang.Object r7 = kotlinx.coroutines.splinterproof.saneness(r4, r6)
            if (r7 != r0) goto L30
            goto L3c
        L30:
            ads_mobile_sdk.hy2 r7 = r6.b
            ads_mobile_sdk.e2 r7 = r7.c
            r6.a = r2
            java.lang.Object r7 = r7.q(r6)
            if (r7 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xx2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
