package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nz0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new nz0(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new nz0(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r1.a((com.google.gson.JsonObject) null, r5, r4) == r0) goto L17;
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
            goto L46
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            p002kotlin.dern.saneness(r5)
            goto L2c
        L1e:
            p002kotlin.dern.saneness(r5)
            ads_mobile_sdk.wz0 r5 = r4.b
            r4.a = r3
            java.lang.Object r5 = r5.j(r4)
            if (r5 != r0) goto L2c
            goto L45
        L2c:
            ads_mobile_sdk.b11 r5 = (ads_mobile_sdk.b11) r5
            boolean r1 = r5.s()
            if (r1 == 0) goto L46
            ads_mobile_sdk.wz0 r1 = r4.b
            java.lang.String r5 = r5.o()
            r4.a = r2
            com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError r2 = ads_mobile_sdk.wz0.I
            r2 = 0
            java.lang.Object r5 = r1.a(r2, r5, r4)
            if (r5 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
