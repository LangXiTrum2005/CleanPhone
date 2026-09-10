package ads_mobile_sdk;

import android.webkit.WebResourceRequest;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pq0 b;
    public final /* synthetic */ WebResourceRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(pq0 pq0Var, WebResourceRequest webResourceRequest, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = pq0Var;
        this.c = webResourceRequest;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new oq0(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new oq0(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r6.n(r5) == r0) goto L19;
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
            goto L59
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            p002kotlin.dern.saneness(r6)
            goto L3f
        L1e:
            p002kotlin.dern.saneness(r6)
            ads_mobile_sdk.pq0 r6 = r5.b
            ads_mobile_sdk.gk2 r6 = r6.r
            if (r6 == 0) goto L3f
            android.webkit.WebResourceRequest r1 = r5.c
            android.net.Uri r1 = r1.getUrl()
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "toString(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r5.a = r3
            java.lang.Object r6 = ads_mobile_sdk.gk2.a(r6, r1, r5)
            if (r6 != r0) goto L3f
            goto L58
        L3f:
            ads_mobile_sdk.pq0 r6 = r5.b
            ads_mobile_sdk.vw2 r1 = r6.m
            kurbash.formularize[] r3 = ads_mobile_sdk.pq0.t
            r4 = 3
            r3 = r3[r4]
            java.lang.Object r6 = r1.getValue(r6, r3)
            saneness.undertread r6 = (saneness.undertread) r6
            if (r6 == 0) goto L59
            r5.a = r2
            java.lang.Object r6 = r6.n(r5)
            if (r6 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.oq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
