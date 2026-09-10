package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hl0 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public bm0 b;
    public int c;
    public final /* synthetic */ bm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(bm0 bm0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = bm0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new hl0(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hl0(this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #1 {all -> 0x007e, blocks: (B:22:0x006d, B:24:0x0071), top: B:38:0x006d }] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r1.a(r10) == r0) goto L26;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r10.c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L30
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            formularization.attabal r0 = r10.a
            p002kotlin.dern.saneness(r11)     // Catch: java.lang.Throwable -> L18
            goto L81
        L18:
            r11 = move-exception
            goto L87
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            ads_mobile_sdk.bm0 r1 = r10.b
            formularization.attabal r3 = r10.a
            p002kotlin.dern.saneness(r11)
            r11 = r3
            goto L6d
        L2c:
            p002kotlin.dern.saneness(r11)
            goto L5c
        L30:
            p002kotlin.dern.saneness(r11)
            ads_mobile_sdk.bm0 r11 = r10.d
            ads_mobile_sdk.jk0 r11 = r11.e
            r11.getClass()
            kotlin.time.saneness$attabal r1 = p002kotlin.time.saneness.INSTANCE
            kotlin.time.DurationUnit r1 = p002kotlin.time.DurationUnit.SECONDS
            java.lang.String r6 = "key"
            r7 = 5
            java.lang.String r8 = "gads:ad_overlay:delay_page_close_timeout_ms"
            kotlin.time.saneness r1 = saneness.juju.attabal(r7, r1, r8, r6)
            ads_mobile_sdk.tk r6 = ads_mobile_sdk.zk.j
            java.lang.Object r11 = r11.a(r8, r1, r6)
            kotlin.time.saneness r11 = (p002kotlin.time.saneness) r11
            long r6 = r11.getRawValue()
            r10.c = r4
            java.lang.Object r11 = kotlinx.coroutines.splinterproof.saneness(r6, r10)
            if (r11 != r0) goto L5c
            goto L7d
        L5c:
            ads_mobile_sdk.bm0 r1 = r10.d
            formularization.attabal r11 = r1.y
            r10.a = r11
            r10.b = r1
            r10.c = r3
            java.lang.Object r3 = r11.attabal(r5, r10)
            if (r3 != r0) goto L6d
            goto L7d
        L6d:
            boolean r3 = r1.B     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L80
            r10.a = r11     // Catch: java.lang.Throwable -> L7e
            r10.b = r5     // Catch: java.lang.Throwable -> L7e
            r10.c = r2     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.a(r10)     // Catch: java.lang.Throwable -> L7e
            if (r1 != r0) goto L80
        L7d:
            return r0
        L7e:
            r0 = move-exception
            goto L8a
        L80:
            r0 = r11
        L81:
            kotlin.Unit r11 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L18
            r0.wireman(r5)
            return r11
        L87:
            r9 = r0
            r0 = r11
            r11 = r9
        L8a:
            r11.wireman(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hl0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
