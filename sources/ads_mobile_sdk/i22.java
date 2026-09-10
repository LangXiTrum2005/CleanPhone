package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i22 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ k22 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i22(k22 k22Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = k22Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new i22(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i22(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (ads_mobile_sdk.k22.a(r8, r7) == r0) goto L15;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r8)
            goto L56
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            p002kotlin.dern.saneness(r8)
            goto L4b
        L1e:
            p002kotlin.dern.saneness(r8)
            ads_mobile_sdk.k22 r8 = r7.b
            ads_mobile_sdk.jk0 r8 = r8.c
            r8.getClass()
            kotlin.time.saneness$attabal r1 = p002kotlin.time.saneness.INSTANCE
            kotlin.time.DurationUnit r1 = p002kotlin.time.DurationUnit.SECONDS
            java.lang.String r4 = "key"
            r5 = 180(0xb4, float:2.52E-43)
            java.lang.String r6 = "gads:play_prewarm_manager_connection_duration"
            kotlin.time.saneness r1 = saneness.juju.attabal(r5, r1, r6, r4)
            ads_mobile_sdk.vk r4 = ads_mobile_sdk.zk.l
            java.lang.Object r8 = r8.a(r6, r1, r4)
            kotlin.time.saneness r8 = (p002kotlin.time.saneness) r8
            long r4 = r8.getRawValue()
            r7.a = r3
            java.lang.Object r8 = kotlinx.coroutines.splinterproof.saneness(r4, r7)
            if (r8 != r0) goto L4b
            goto L55
        L4b:
            ads_mobile_sdk.k22 r8 = r7.b
            r7.a = r2
            java.lang.Object r8 = ads_mobile_sdk.k22.a(r8, r7)
            if (r8 != r0) goto L56
        L55:
            return r0
        L56:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i22.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
