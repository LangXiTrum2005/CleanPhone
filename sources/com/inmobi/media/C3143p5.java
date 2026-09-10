package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3143p5 extends AbstractC2979ig {
    public final C2826cf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3143p5(C3129og dao) {
        super(dao);
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.d = new C2826cf(dao, new C3093n5(this), this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r13.a(r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.Rf r13, p002kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.inmobi.media.C3118o5
            if (r0 == 0) goto L13
            r0 = r14
            com.inmobi.media.o5 r0 = (com.inmobi.media.C3118o5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.inmobi.media.o5 r0 = new com.inmobi.media.o5
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p002kotlin.dern.saneness(r14)
            goto Lb2
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            p002kotlin.dern.saneness(r14)
            goto La7
        L3c:
            com.inmobi.media.Rf r13 = r0.a
            p002kotlin.dern.saneness(r14)
        L41:
            r8 = r13
            goto L5c
        L43:
            p002kotlin.dern.saneness(r14)
            java.lang.String r14 = "p5"
            java.lang.String r2 = "TAG"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r2)
            java.lang.String r14 = r13.b
            java.lang.String r14 = r13.e
            r0.a = r13
            r0.d = r5
            java.lang.Object r14 = r12.a(r14, r0)
            if (r14 != r1) goto L41
            goto Lb1
        L5c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            r14 = 0
            if (r13 != 0) goto L88
            java.util.concurrent.ConcurrentHashMap r13 = r12.b
            java.lang.String r0 = r8.h
            java.lang.Object r13 = r13.get(r0)
            java.lang.ref.WeakReference r13 = (java.lang.ref.WeakReference) r13
            if (r13 == 0) goto L78
            java.lang.Object r13 = r13.get()
            r14 = r13
            com.inmobi.media.fg r14 = (com.inmobi.media.InterfaceC2904fg) r14
        L78:
            r11 = r14
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "Database capacity exceeded for pings"
            r7 = 2248(0x8c8, float:3.15E-42)
            r5 = 0
            com.inmobi.media.AbstractC2979ig.a(r5, r6, r7, r8, r9, r11)
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        L88:
            com.inmobi.media.og r13 = r12.a
            r0.a = r14
            r0.d = r4
            com.inmobi.media.g9 r13 = r13.a
            android.content.ContentValues r14 = com.inmobi.media.AbstractC3154pg.a(r8)
            r2 = 4
            java.lang.String r4 = "pings"
            java.lang.Object r13 = r13.a(r4, r14, r2, r0)
            java.lang.Object r14 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r13 != r14) goto La2
            goto La4
        La2:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
        La4:
            if (r13 != r1) goto La7
            goto Lb1
        La7:
            com.inmobi.media.cf r13 = r12.d
            r0.d = r3
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3143p5.a(com.inmobi.media.Rf, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
