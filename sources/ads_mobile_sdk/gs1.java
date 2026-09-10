package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.sustenance;

/* JADX INFO: loaded from: classes.dex */
public final class gs1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sustenance c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs1(boolean z, sustenance sustenanceVar, long j, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = z;
        this.c = sustenanceVar;
        this.d = j;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new gs1(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gs1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r6.a(r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r6.c(r3, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r0;
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
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            p002kotlin.dern.saneness(r6)
            goto L3c
        L1b:
            p002kotlin.dern.saneness(r6)
            boolean r6 = r5.b
            if (r6 == 0) goto L2f
            saneness.sustenance r6 = r5.c
            long r1 = r5.d
            r5.a = r3
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L3c
            goto L3b
        L2f:
            saneness.sustenance r6 = r5.c
            long r3 = r5.d
            r5.a = r2
            java.lang.Object r6 = r6.c(r3, r5)
            if (r6 != r0) goto L3c
        L3b:
            return r0
        L3c:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gs1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
