package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Rk extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rk(boolean z, dern dernVar) {
        super(1, dernVar);
        this.b = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new Rk(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Rk(this.b, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r5.b(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (com.inmobi.media.Yk.a(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r0;
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
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            p002kotlin.dern.saneness(r5)
            goto L36
        L1b:
            p002kotlin.dern.saneness(r5)
            boolean r5 = r4.b
            if (r5 == 0) goto L2d
            com.inmobi.media.Yk r5 = com.inmobi.media.Yk.a
            r4.a = r3
            java.lang.Object r5 = r5.b(r4)
            if (r5 != r0) goto L36
            goto L35
        L2d:
            r4.a = r2
            java.lang.Object r5 = com.inmobi.media.Yk.a(r4)
            if (r5 != r0) goto L36
        L35:
            return r0
        L36:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
