package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fv1 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ lv1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv1(lv1 lv1Var, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.b = lv1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new fv1(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new fv1(this.b, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r1, r3, r5) == r0) goto L17;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r6)
            goto L43
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            p002kotlin.dern.saneness(r6)
            goto L30
        L1e:
            p002kotlin.dern.saneness(r6)
            ads_mobile_sdk.zm r6 = ads_mobile_sdk.ym.a
            ads_mobile_sdk.zm r1 = ads_mobile_sdk.zm.ROBOLECTRIC_TEST
            if (r6 == r1) goto L4a
            r5.a = r3
            java.lang.Object r6 = kotlinx.coroutines.cosy.attabal(r5)
            if (r6 != r0) goto L30
            goto L42
        L30:
            ads_mobile_sdk.lv1 r6 = r5.b
            kotlin.coroutines.CoroutineContext r1 = r6.d
            ads_mobile_sdk.ev1 r3 = new ads_mobile_sdk.ev1
            r4 = 0
            r3.<init>(r6, r4)
            r5.a = r2
            java.lang.Object r6 = kotlinx.coroutines.impromptu.competently(r1, r3, r5)
            if (r6 != r0) goto L43
        L42:
            return r0
        L43:
            ads_mobile_sdk.lv1 r6 = r5.b
            kotlinx.coroutines.cord r6 = r6.i
            r6.dern()
        L4a:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fv1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
