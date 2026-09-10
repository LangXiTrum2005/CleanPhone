package ads_mobile_sdk;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y90 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ja0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(AtomicInteger atomicInteger, int i, int i2, ja0 ja0Var, int i3, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = atomicInteger;
        this.c = i;
        this.d = i2;
        this.e = ja0Var;
        this.f = i3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new y90(this.b, this.c, this.d, this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y90) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r7.a((android.app.Activity) null, r6) == r0) goto L29;
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 == r4) goto L20
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            p002kotlin.dern.saneness(r7)
            goto L83
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            p002kotlin.dern.saneness(r7)
            goto L75
        L24:
            p002kotlin.dern.saneness(r7)
            java.util.concurrent.atomic.AtomicInteger r7 = r6.b
            int r7 = r7.get()
            int r1 = r6.c
            if (r7 == r1) goto L75
            java.util.concurrent.atomic.AtomicInteger r7 = r6.b
            int r7 = r7.get()
            int r1 = r6.d
            if (r7 != r1) goto L4d
            ads_mobile_sdk.ja0 r7 = r6.e
            ads_mobile_sdk.wz0 r7 = r7.j
            ads_mobile_sdk.ny0 r1 = ads_mobile_sdk.ny0.FLICK
            r6.a = r5
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.wz0.a(r7, r1, r6)
            if (r7 != r0) goto L75
            goto L82
        L4d:
            int r1 = r6.f
            if (r7 != r1) goto L63
            ads_mobile_sdk.ja0 r7 = r6.e
            ads_mobile_sdk.wz0 r7 = r7.j
            ads_mobile_sdk.ny0 r1 = ads_mobile_sdk.ny0.SHAKE
            r6.a = r4
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.wz0.a(r7, r1, r6)
            if (r7 != r0) goto L75
            goto L82
        L63:
            ads_mobile_sdk.ja0 r7 = r6.e
            ads_mobile_sdk.wz0 r7 = r7.j
            ads_mobile_sdk.ny0 r1 = ads_mobile_sdk.ny0.NONE
            r6.a = r3
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.wz0.a(r7, r1, r6)
            if (r7 != r0) goto L75
            goto L82
        L75:
            ads_mobile_sdk.ja0 r7 = r6.e
            r6.a = r2
            android.net.Uri r1 = ads_mobile_sdk.ja0.q
            r1 = 0
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L83
        L82:
            return r0
        L83:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
