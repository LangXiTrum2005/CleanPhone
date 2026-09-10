package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Fh extends SuspendLambda implements Function2 {
    public Object a;
    public C3348xb b;
    public int c;
    public final /* synthetic */ Gh d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fh(Gh gh, long j, boolean z, dern dernVar) {
        super(2, dernVar);
        this.d = gh;
        this.e = j;
        this.f = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new Fh(this.d, this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Fh) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r2.b(r7, r17) == r1) goto L22;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L36
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.a
            com.inmobi.media.xb r1 = (com.inmobi.media.C3348xb) r1
            p002kotlin.dern.saneness(r18)
            r8 = r1
            goto L89
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            p002kotlin.dern.saneness(r18)
            goto Lbf
        L2a:
            com.inmobi.media.xb r2 = r0.b
            java.lang.Object r7 = r0.a
            com.inmobi.media.qb r7 = (com.inmobi.media.C3174qb) r7
            p002kotlin.dern.saneness(r18)
            r8 = r18
            goto L66
        L36:
            p002kotlin.dern.saneness(r18)
            com.inmobi.media.Gh r2 = r0.d
            long r9 = r0.e
            boolean r14 = r0.f
            java.lang.String r8 = r2.j
            java.util.concurrent.atomic.AtomicInteger r2 = r2.k
            int r15 = r2.get()
            com.inmobi.media.qb r7 = new com.inmobi.media.qb
            r12 = 0
            r16 = 12
            r11 = 0
            r7.<init>(r8, r9, r11, r12, r14, r15, r16)
            patroclinal.taiyuan r2 = com.inmobi.media.AbstractC3373yb.a
            java.lang.Object r2 = r2.getValue()
            com.inmobi.media.xb r2 = (com.inmobi.media.C3348xb) r2
            r0.a = r7
            r0.b = r2
            r0.c = r5
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 != r1) goto L66
            goto L87
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7b
            r0.a = r6
            r0.b = r6
            r0.c = r4
            java.lang.Object r2 = r2.b(r7, r0)
            if (r2 != r1) goto Lbf
            goto L87
        L7b:
            r0.a = r2
            r0.b = r6
            r0.c = r3
            java.lang.Object r3 = r2.a(r7, r0)
            if (r3 != r1) goto L88
        L87:
            return r1
        L88:
            r8 = r2
        L89:
            kotlinx.coroutines.saran r1 = com.inmobi.media.Sb.a
            long r1 = r0.e
            com.inmobi.media.Gh r3 = r0.d
            long r9 = r3.b
            long r9 = r1 - r9
            int r11 = r3.c
            java.lang.String r1 = "dao"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = com.inmobi.media.Sb.c
            boolean r1 = r1.getAndSet(r5)
            if (r1 != 0) goto Lbf
            com.inmobi.media.Qb r7 = new com.inmobi.media.Qb
            r12 = 0
            r7.<init>(r8, r9, r11, r12)
            kotlinx.coroutines.saran r1 = com.inmobi.media.AbstractC2984il.a
            java.lang.String r1 = "runnable"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlinx.coroutines.saran r8 = com.inmobi.media.AbstractC2984il.a
            com.inmobi.media.fl r11 = new com.inmobi.media.fl
            r1 = 10000(0x2710, double:4.9407E-320)
            r11.<init>(r1, r6, r7)
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            kotlinx.coroutines.impromptu.wireman(r8, r9, r10, r11, r12, r13)
        Lbf:
            kotlin.Unit r1 = p002kotlin.Unit.f29295attabal
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
