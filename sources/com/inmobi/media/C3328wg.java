package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.gintrap;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3328wg {
    public final Nn a;
    public final formularize b;
    public final saran c;
    public final C3378yg d;
    public monroe e;
    public final AtomicBoolean f;

    public C3328wg(saran coroutineScope, C3378yg pollingVisibilityTrackerConfig, Nn visibilityTrackedView) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pollingVisibilityTrackerConfig, "pollingVisibilityTrackerConfig");
        Intrinsics.checkNotNullParameter(visibilityTrackedView, "visibilityTrackedView");
        Intrinsics.checkNotNullParameter(visibilityTrackedView, "visibilityTrackedView");
        this.a = visibilityTrackedView;
        this.b = gintrap.attabal(Mn.HIDDEN);
        this.c = coroutineScope;
        this.d = pollingVisibilityTrackerConfig;
        this.f = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:17:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.inmobi.media.C3328wg r7, p002kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.inmobi.media.C3278ug
            if (r0 == 0) goto L16
            r0 = r8
            com.inmobi.media.ug r0 = (com.inmobi.media.C3278ug) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            com.inmobi.media.ug r0 = new com.inmobi.media.ug
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            goto L38
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            p002kotlin.dern.saneness(r8)
            goto L56
        L38:
            p002kotlin.dern.saneness(r8)
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f
            boolean r8 = r8.get()
            if (r8 != 0) goto L64
            kotlinx.coroutines.technofreak r8 = kotlinx.coroutines.premeiotic.dern()
            com.inmobi.media.vg r2 = new com.inmobi.media.vg
            r5 = 0
            r2.<init>(r7, r5)
            r0.c = r4
            java.lang.Object r8 = kotlinx.coroutines.impromptu.competently(r8, r2, r0)
            if (r8 != r1) goto L56
            goto L63
        L56:
            com.inmobi.media.yg r8 = r7.d
            int r8 = r8.a
            long r5 = (long) r8
            r0.c = r3
            java.lang.Object r8 = kotlinx.coroutines.splinterproof.attabal(r5, r0)
            if (r8 != r1) goto L3b
        L63:
            return r1
        L64:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3328wg.a(com.inmobi.media.wg, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        if (this.f.get() || this.e != null) {
            return;
        }
        this.e = cutely.wireman(this.c, null, null, new C3253tg(this, null), 3, null);
    }
}
