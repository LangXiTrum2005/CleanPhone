package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pl0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(bm0 bm0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = bm0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new pl0(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pl0(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r9.b(r8) == r0) goto L24;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r8.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p002kotlin.dern.saneness(r9)
            goto L7b
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            p002kotlin.dern.saneness(r9)
            goto L70
        L21:
            p002kotlin.dern.saneness(r9)
            goto L52
        L25:
            p002kotlin.dern.saneness(r9)
            ads_mobile_sdk.bm0 r9 = r8.b
            ads_mobile_sdk.jk0 r9 = r9.e
            r9.getClass()
            kotlin.time.saneness$attabal r1 = p002kotlin.time.saneness.INSTANCE
            kotlin.time.DurationUnit r1 = p002kotlin.time.DurationUnit.MILLISECONDS
            java.lang.String r5 = "key"
            r6 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r7 = "gads:timeout_for_show_call_succeed:ms"
            kotlin.time.saneness r1 = saneness.juju.attabal(r6, r1, r7, r5)
            ads_mobile_sdk.tk r5 = ads_mobile_sdk.zk.j
            java.lang.Object r9 = r9.a(r7, r1, r5)
            kotlin.time.saneness r9 = (p002kotlin.time.saneness) r9
            long r5 = r9.getRawValue()
            r8.a = r4
            java.lang.Object r9 = kotlinx.coroutines.splinterproof.saneness(r5, r8)
            if (r9 != r0) goto L52
            goto L7a
        L52:
            ads_mobile_sdk.bm0 r9 = r8.b
            java.util.concurrent.atomic.AtomicBoolean r9 = r9.n
            boolean r9 = r9.get()
            if (r9 == 0) goto L5f
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        L5f:
            java.lang.String r9 = "Full screen Activity took too long to start."
            r1 = 0
            ads_mobile_sdk.kn0.c(r9, r1)
            ads_mobile_sdk.bm0 r9 = r8.b
            r8.a = r3
            java.lang.Object r9 = r9.c(r8)
            if (r9 != r0) goto L70
            goto L7a
        L70:
            ads_mobile_sdk.bm0 r9 = r8.b
            r8.a = r2
            java.lang.Object r9 = r9.b(r8)
            if (r9 != r0) goto L7b
        L7a:
            return r0
        L7b:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pl0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
