package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class An extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public An(Bn bn, dern dernVar) {
        super(2, dernVar);
        this.b = bn;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new An(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new An(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r7)
            goto L44
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            p002kotlin.dern.saneness(r7)
            goto L31
        L1e:
            p002kotlin.dern.saneness(r7)
            com.inmobi.media.Bn r7 = r6.b
            com.inmobi.media.Dn r7 = r7.b
            int r7 = r7.b
            long r4 = (long) r7
            r6.a = r3
            java.lang.Object r7 = kotlinx.coroutines.splinterproof.attabal(r4, r6)
            if (r7 != r0) goto L31
            goto L43
        L31:
            com.inmobi.media.Bn r7 = r6.b
            com.inmobi.media.Cn r1 = r7.d
            r1.b = r3
            kotlinx.coroutines.flow.apical r7 = r7.c
            kotlin.Unit r1 = p002kotlin.Unit.f29295attabal
            r6.a = r2
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.An.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
