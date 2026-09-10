package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class x82 extends SuspendLambda implements triweekly {
    public int a;
    public /* synthetic */ kotlinx.coroutines.flow.wireman b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ k92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x82(k92 k92Var, wretchedly.dern dernVar) {
        super(3, dernVar);
        this.d = k92Var;
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x82 x82Var = new x82(this.d, (wretchedly.dern) obj3);
        x82Var.b = (kotlinx.coroutines.flow.wireman) obj;
        x82Var.c = (Throwable) obj2;
        return x82Var.invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r3.emit(r1, r7) == r0) goto L16;
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
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r8)
            goto L72
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Throwable r1 = r7.c
            kotlinx.coroutines.flow.wireman r3 = r7.b
            p002kotlin.dern.saneness(r8)
            goto L3e
        L22:
            p002kotlin.dern.saneness(r8)
            kotlinx.coroutines.flow.wireman r8 = r7.b
            java.lang.Throwable r1 = r7.c
            java.lang.String r4 = "Ad failed to load"
            ads_mobile_sdk.kn0.b(r4, r1)
            ads_mobile_sdk.k92 r4 = r7.d
            r7.b = r8
            r7.c = r1
            r7.a = r3
            java.lang.Object r3 = r4.b(r7)
            if (r3 != r0) goto L3d
            goto L71
        L3d:
            r3 = r8
        L3e:
            ads_mobile_sdk.k92 r8 = r7.d
            ads_mobile_sdk.on0 r4 = new ads_mobile_sdk.on0
            r5 = 6
            r6 = 0
            r4.<init>(r1, r6, r6, r5)
            r8.getClass()
            java.lang.String r8 = "error"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r8)
            com.google.android.libraries.ads.mobile.sdk.common.LoadAdError r8 = new com.google.android.libraries.ads.mobile.sdk.common.LoadAdError
            ads_mobile_sdk.k41 r1 = r4.a()
            com.google.android.libraries.ads.mobile.sdk.common.LoadAdError$ErrorCode r1 = r1.a()
            java.lang.String r4 = saneness.metairie.attabal(r4)
            r8.<init>(r1, r4, r6)
            ads_mobile_sdk.l92 r1 = new ads_mobile_sdk.l92
            r1.<init>(r8)
            r7.b = r6
            r7.c = r6
            r7.a = r2
            java.lang.Object r8 = r3.emit(r1, r7)
            if (r8 != r0) goto L72
        L71:
            return r0
        L72:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x82.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
