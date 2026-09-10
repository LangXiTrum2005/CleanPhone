package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import java.util.UUID;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.premeiotic;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3107nj extends T3 {
    public final Context a;
    public final C3097n9 b;
    public final String c;

    public C3107nj(Context context, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = c3097n9;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.c = "Static-Companion-" + string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r13, r6, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3107nj r12, java.lang.String r13, com.inmobi.media.Cj r14, p002kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof com.inmobi.media.C3032kj
            if (r0 == 0) goto L16
            r0 = r15
            com.inmobi.media.kj r0 = (com.inmobi.media.C3032kj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            com.inmobi.media.kj r0 = new com.inmobi.media.kj
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p002kotlin.dern.saneness(r15)
            goto L76
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            com.inmobi.media.Cj r14 = r0.b
            java.lang.String r13 = r0.a
            p002kotlin.dern.saneness(r15)
        L3f:
            r9 = r13
            r7 = r14
            goto L5b
        L42:
            p002kotlin.dern.saneness(r15)
            kotlinx.coroutines.technofreak r15 = kotlinx.coroutines.premeiotic.dern()
            com.inmobi.media.mj r2 = new com.inmobi.media.mj
            r2.<init>(r12, r5)
            r0.a = r13
            r0.b = r14
            r0.e = r4
            java.lang.Object r15 = kotlinx.coroutines.impromptu.competently(r15, r2, r0)
            if (r15 != r1) goto L3f
            goto L75
        L5b:
            r10 = r15
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            kotlinx.coroutines.merc r13 = kotlinx.coroutines.premeiotic.saneness()
            com.inmobi.media.lj r6 = new com.inmobi.media.lj
            r11 = 0
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r12 = kotlinx.coroutines.impromptu.competently(r13, r6, r0)
            if (r12 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r12 = p002kotlin.Unit.f29295attabal
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3107nj.a(com.inmobi.media.nj, java.lang.String, com.inmobi.media.Cj, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(C3305vi c3305vi, J3 j3) throws C2823cc {
        if (URLUtil.isNetworkUrl(c3305vi.a)) {
            return impromptu.competently(premeiotic.dern(), new C3007jj(this, c3305vi, null), j3);
        }
        throw new C2823cc("Companion Invalid Resource Error");
    }
}
