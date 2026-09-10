package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j91 extends SuspendLambda implements Function2 {
    public zj0 a;
    public e51 b;
    public int c;
    public final /* synthetic */ y91 d;
    public final /* synthetic */ e51 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j91(y91 y91Var, e51 e51Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = y91Var;
        this.e = e51Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new j91(this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j91(this.d, this.e, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (ads_mobile_sdk.zj0.a(r2, r1, (com.google.gson.JsonObject) r12, r11) == r0) goto L32;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r11.c
            java.lang.String r2 = "consentStringsProvider"
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L35
            if (r1 == r6) goto L31
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            p002kotlin.dern.saneness(r12)
            goto Laf
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            ads_mobile_sdk.e51 r1 = r11.b
            ads_mobile_sdk.zj0 r2 = r11.a
            p002kotlin.dern.saneness(r12)
            goto L9d
        L2d:
            p002kotlin.dern.saneness(r12)
            goto L7b
        L31:
            p002kotlin.dern.saneness(r12)
            goto L64
        L35:
            p002kotlin.dern.saneness(r12)
            ads_mobile_sdk.y91 r12 = r11.d
            ads_mobile_sdk.jk0 r12 = r12.f
            saneness.dishoard r12 = r12.s
            r12.getClass()
            kotlin.time.saneness$attabal r1 = p002kotlin.time.saneness.INSTANCE
            kotlin.time.DurationUnit r1 = p002kotlin.time.DurationUnit.SECONDS
            java.lang.String r8 = "key"
            r9 = 60
            java.lang.String r10 = "gads:flag_update_delay_sec"
            kotlin.time.saneness r1 = saneness.juju.attabal(r9, r1, r10, r8)
            ads_mobile_sdk.vk r8 = ads_mobile_sdk.zk.l
            java.lang.Object r12 = r12.a(r10, r1, r8)
            kotlin.time.saneness r12 = (p002kotlin.time.saneness) r12
            long r8 = r12.getRawValue()
            r11.c = r6
            java.lang.Object r12 = kotlinx.coroutines.splinterproof.saneness(r8, r11)
            if (r12 != r0) goto L64
            goto Lae
        L64:
            ads_mobile_sdk.y91 r12 = r11.d
            saneness.exaltedly r12 = r12.p
            if (r12 != 0) goto L6e
            p002kotlin.jvm.internal.Intrinsics.preprohormone(r2)
            r12 = r7
        L6e:
            ads_mobile_sdk.iv r12 = (ads_mobile_sdk.iv) r12
            kotlinx.coroutines.cord r12 = r12.B
            r11.c = r5
            java.lang.Object r12 = r12.starveling(r11)
            if (r12 != r0) goto L7b
            goto Lae
        L7b:
            ads_mobile_sdk.y91 r12 = r11.d
            ads_mobile_sdk.zj0 r1 = r12.i
            ads_mobile_sdk.e51 r5 = r11.e
            saneness.exaltedly r12 = r12.p
            if (r12 != 0) goto L89
            p002kotlin.jvm.internal.Intrinsics.preprohormone(r2)
            r12 = r7
        L89:
            r11.a = r1
            r11.b = r5
            r11.c = r4
            ads_mobile_sdk.iv r12 = (ads_mobile_sdk.iv) r12
            r12.getClass()
            java.lang.Object r12 = ads_mobile_sdk.iv.d(r12, r11)
            if (r12 != r0) goto L9b
            goto Lae
        L9b:
            r2 = r1
            r1 = r5
        L9d:
            com.google.gson.JsonObject r12 = (com.google.gson.JsonObject) r12
            r11.a = r7
            r11.b = r7
            r11.c = r3
            r2.getClass()
            java.lang.Object r12 = ads_mobile_sdk.zj0.a(r2, r1, r12, r11)
            if (r12 != r0) goto Laf
        Lae:
            return r0
        Laf:
            kotlin.Unit r12 = p002kotlin.Unit.f29295attabal
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
