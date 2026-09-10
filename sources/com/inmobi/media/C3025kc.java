package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3025kc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3050lc b;
    public final /* synthetic */ AbstractC3368y6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3025kc(C3050lc c3050lc, AbstractC3368y6 abstractC3368y6, dern dernVar) {
        super(2, dernVar);
        this.b = c3050lc;
        this.c = abstractC3368y6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3025kc(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3025kc(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r1.a(r13, r12) == r0) goto L25;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r12.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r13)
            goto L7a
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            p002kotlin.dern.saneness(r13)
            goto L69
        L1e:
            p002kotlin.dern.saneness(r13)
            com.inmobi.media.lc r13 = r12.b
            com.inmobi.media.x6 r1 = r13.d
            com.inmobi.media.y6 r4 = r12.c
            r1.getClass()
            java.lang.String r5 = "experienceModel"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            boolean r5 = r4 instanceof com.inmobi.media.C3356xj
            if (r5 == 0) goto L44
            com.inmobi.media.wj r6 = new com.inmobi.media.wj
            android.content.Context r7 = r1.a
            kotlinx.coroutines.saran r8 = r1.b
            r9 = r4
            com.inmobi.media.xj r9 = (com.inmobi.media.C3356xj) r9
            kotlinx.coroutines.flow.apical r10 = r1.c
            com.inmobi.media.n9 r11 = r1.d
            r6.<init>(r7, r8, r9, r10, r11)
            goto L58
        L44:
            boolean r5 = r4 instanceof com.inmobi.media.C3160pm
            if (r5 == 0) goto L7f
            com.inmobi.media.om r6 = new com.inmobi.media.om
            android.content.Context r7 = r1.a
            kotlinx.coroutines.saran r8 = r1.b
            r9 = r4
            com.inmobi.media.pm r9 = (com.inmobi.media.C3160pm) r9
            kotlinx.coroutines.flow.apical r10 = r1.c
            com.inmobi.media.n9 r11 = r1.d
            r6.<init>(r7, r8, r9, r10, r11)
        L58:
            r13.b = r6
            com.inmobi.media.lc r13 = r12.b
            com.inmobi.media.j2 r13 = r13.b
            if (r13 == 0) goto L69
            r12.a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L69
            goto L79
        L69:
            com.inmobi.media.lc r13 = r12.b
            com.inmobi.media.j2 r1 = r13.b
            if (r1 == 0) goto L7a
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.c
            r12.a = r2
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L7a
        L79:
            return r0
        L7a:
            com.inmobi.media.lc r13 = r12.b
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.c
            return r13
        L7f:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3025kc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
