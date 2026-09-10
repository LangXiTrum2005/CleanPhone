package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3352xf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3377yf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3352xf(C3377yf c3377yf, dern dernVar) {
        super(2, dernVar);
        this.b = c3377yf;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3352xf(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3352xf(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.a(r4) == r0) goto L15;
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
            goto L37
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
            com.inmobi.media.yf r5 = r4.b
            r4.a = r3
            java.lang.Object r5 = com.inmobi.media.C3377yf.a(r5, r4)
            if (r5 != r0) goto L2c
            goto L36
        L2c:
            com.inmobi.media.pf r5 = com.inmobi.media.C3153pf.a
            r4.a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L37
        L36:
            return r0
        L37:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3352xf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
