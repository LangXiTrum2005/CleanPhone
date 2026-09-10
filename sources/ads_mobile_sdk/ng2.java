package ads_mobile_sdk;

import android.net.Uri;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ng2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ qg2 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ e2 d;
    public final /* synthetic */ l13 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng2(qg2 qg2Var, Uri uri, e2 e2Var, l13 l13Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = qg2Var;
        this.c = uri;
        this.d = e2Var;
        this.e = l13Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ng2(this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ng2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r6.b.a((ads_mobile_sdk.tn0) r7, r3, r4, r6) == r0) goto L22;
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
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            p002kotlin.dern.saneness(r7)     // Catch: java.lang.Exception -> L12
            goto L82
        L12:
            r7 = move-exception
            goto L5e
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            p002kotlin.dern.saneness(r7)     // Catch: java.lang.Exception -> L12
            goto L47
        L20:
            p002kotlin.dern.saneness(r7)
            ads_mobile_sdk.qg2 r7 = r6.b     // Catch: java.lang.Exception -> L12
            android.net.Uri r1 = r6.c     // Catch: java.lang.Exception -> L12
            java.util.Map r7 = ads_mobile_sdk.qg2.a(r7, r1)     // Catch: java.lang.Exception -> L12
            ads_mobile_sdk.qg2 r1 = r6.b     // Catch: java.lang.Exception -> L12
            saneness.hobby r1 = ads_mobile_sdk.qg2.a(r1)     // Catch: java.lang.Exception -> L12
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Exception -> L12
            android.net.Uri r5 = r6.c     // Catch: java.lang.Exception -> L12
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L12
            r4.<init>(r5)     // Catch: java.lang.Exception -> L12
            r6.a = r3     // Catch: java.lang.Exception -> L12
            r3 = 10
            java.lang.Object r7 = saneness.hobby.attabal(r1, r4, r7, r6, r3)     // Catch: java.lang.Exception -> L12
            if (r7 != r0) goto L47
            goto L5d
        L47:
            saneness.spartacist r7 = (saneness.spartacist) r7     // Catch: java.lang.Exception -> L12
            boolean r1 = r7 instanceof ads_mobile_sdk.tn0     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L82
            ads_mobile_sdk.qg2 r1 = r6.b     // Catch: java.lang.Exception -> L12
            ads_mobile_sdk.tn0 r7 = (ads_mobile_sdk.tn0) r7     // Catch: java.lang.Exception -> L12
            ads_mobile_sdk.e2 r3 = r6.d     // Catch: java.lang.Exception -> L12
            ads_mobile_sdk.l13 r4 = r6.e     // Catch: java.lang.Exception -> L12
            r6.a = r2     // Catch: java.lang.Exception -> L12
            java.lang.Object r7 = ads_mobile_sdk.qg2.a(r1, r7, r3, r4, r6)     // Catch: java.lang.Exception -> L12
            if (r7 != r0) goto L82
        L5d:
            return r0
        L5e:
            com.google.common.base.triweekly r0 = ads_mobile_sdk.kn0.a
            android.net.Uri r0 = r6.c
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while pinging URL: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            ads_mobile_sdk.kn0.b(r7)
        L82:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ng2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
