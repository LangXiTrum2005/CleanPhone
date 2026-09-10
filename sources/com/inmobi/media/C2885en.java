package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2885en extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2911fn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2885en(C2911fn c2911fn, dern dernVar) {
        super(2, dernVar);
        this.c = c2911fn;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C2885en c2885en = new C2885en(this.c, dernVar);
        c2885en.b = obj;
        return c2885en;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C2885en c2885en = new C2885en(this.c, (dern) obj2);
        c2885en.b = (saran) obj;
        return c2885en.invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[PHI: r1
  0x0030: PHI (r1v5 kotlinx.coroutines.saran) = (r1v2 kotlinx.coroutines.saran), (r1v4 kotlinx.coroutines.saran), (r1v9 kotlinx.coroutines.saran) binds: [B:14:0x0028, B:22:0x0052, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[Catch: IllegalStateException -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x0026, blocks: (B:17:0x0036, B:10:0x0022), top: B:26:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[PHI: r1
  0x0046: PHI (r1v4 kotlinx.coroutines.saran) = (r1v3 kotlinx.coroutines.saran), (r1v5 kotlinx.coroutines.saran), (r1v7 kotlinx.coroutines.saran) binds: [B:20:0x0043, B:18:0x0040, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0052 -> B:15:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r6.b
            kotlinx.coroutines.saran r1 = (kotlinx.coroutines.saran) r1
            p002kotlin.dern.saneness(r7)
            goto L30
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.b
            kotlinx.coroutines.saran r1 = (kotlinx.coroutines.saran) r1
            p002kotlin.dern.saneness(r7)     // Catch: java.lang.IllegalStateException -> L26
            goto L46
        L26:
            r7 = move-exception
            goto L43
        L28:
            p002kotlin.dern.saneness(r7)
            java.lang.Object r7 = r6.b
            r1 = r7
            kotlinx.coroutines.saran r1 = (kotlinx.coroutines.saran) r1
        L30:
            boolean r7 = kotlinx.coroutines.privatdozent.competently(r1)
            if (r7 == 0) goto L55
            com.inmobi.media.fn r7 = r6.c     // Catch: java.lang.IllegalStateException -> L26
            r6.b = r1     // Catch: java.lang.IllegalStateException -> L26
            r6.a = r3     // Catch: java.lang.IllegalStateException -> L26
            java.lang.Object r7 = com.inmobi.media.C2911fn.a(r7, r6)     // Catch: java.lang.IllegalStateException -> L26
            if (r7 != r0) goto L46
            goto L54
        L43:
            r7.toString()
        L46:
            com.inmobi.media.fn r7 = r6.c
            long r4 = r7.c
            r6.b = r1
            r6.a = r2
            java.lang.Object r7 = kotlinx.coroutines.splinterproof.attabal(r4, r6)
            if (r7 != r0) goto L30
        L54:
            return r0
        L55:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2885en.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
