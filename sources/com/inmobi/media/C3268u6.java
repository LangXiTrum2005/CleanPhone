package com.inmobi.media;

import androidx.media3.exoplayer.adultoid;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;

/* JADX INFO: renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3268u6 {
    public final adultoid a;
    public final saran b;
    public final apical c;
    public final AtomicBoolean d;
    public monroe e;
    public monroe f;
    public int g;
    public boolean[] h;
    public final int[] i;
    public final Rl[] j;
    public final long k;
    public final long l;

    public C3268u6(adultoid player, AdConfig.HybridNativeConfig hybridNativeConfig, saran coroutineScope, long j, apical progressEvents, TrackPercentage trackPercentage) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        Intrinsics.checkNotNullParameter(trackPercentage, "trackPercentage");
        this.a = player;
        this.b = coroutineScope;
        this.c = progressEvents;
        this.d = new AtomicBoolean(false);
        this.g = -1;
        boolean[] zArr = new boolean[4];
        for (int i = 0; i < 4; i++) {
            zArr[i] = false;
        }
        this.h = zArr;
        this.i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.j = new Rl[]{C3359xm.a, C2986in.a, C3210rn.a, C3384ym.a};
        this.k = 200L;
        this.l = wireman.marial(j, hybridNativeConfig.getMinProgressInterval());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        if (r9.a(r2, r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3268u6 r9, p002kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.inmobi.media.C3193r6
            if (r0 == 0) goto L16
            r0 = r10
            com.inmobi.media.r6 r0 = (com.inmobi.media.C3193r6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            com.inmobi.media.r6 r0 = new com.inmobi.media.r6
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p002kotlin.dern.saneness(r10)
            goto Lab
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            int r2 = r0.a
            p002kotlin.dern.saneness(r10)
            goto La2
        L3e:
            p002kotlin.dern.saneness(r10)
            androidx.media3.exoplayer.adultoid r10 = r9.a
            boolean r10 = r10.isPlaying()
            if (r10 != 0) goto L4c
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        L4c:
            androidx.media3.exoplayer.adultoid r10 = r9.a
            long r5 = r10.getDuration()
            int r10 = (int) r5
            if (r10 > 0) goto L58
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        L58:
            androidx.media3.exoplayer.adultoid r2 = r9.a
            long r5 = r2.getCurrentPosition()
            int r2 = (int) r5
            int r2 = r2 * 100
            int r2 = r2 / r10
            int r5 = r9.g
            r6 = 0
            if (r5 != r3) goto L7d
            int[] r5 = r9.i
            r5 = r5[r6]
            if (r2 >= r5) goto L7d
            r5 = -1
            r9.g = r5
            r5 = 4
            boolean[] r7 = new boolean[r5]
            r8 = r6
        L74:
            if (r8 >= r5) goto L7b
            r7[r8] = r6
            int r8 = r8 + 1
            goto L74
        L7b:
            r9.h = r7
        L7d:
            r0.a = r2
            r0.d = r4
            int r4 = r9.g
            if (r4 < 0) goto L88
            kotlin.Unit r10 = p002kotlin.Unit.f29295attabal
            goto L9f
        L88:
            r9.g = r6
            kotlinx.coroutines.flow.apical r4 = r9.c
            com.inmobi.media.kn r5 = new com.inmobi.media.kn
            float r10 = (float) r10
            r5.<init>(r10)
            java.lang.Object r10 = r4.emit(r5, r0)
            java.lang.Object r4 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r10 != r4) goto L9d
            goto L9f
        L9d:
            kotlin.Unit r10 = p002kotlin.Unit.f29295attabal
        L9f:
            if (r10 != r1) goto La2
            goto Laa
        La2:
            r0.d = r3
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3268u6.a(com.inmobi.media.u6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            H6.a(this.e);
            H6.a(this.f);
            this.e = null;
            this.f = null;
        }
    }

    public static final Object a(C3268u6 c3268u6, C3243t6 c3243t6) {
        Object objEmit;
        if (!c3268u6.a.isPlaying()) {
            return Unit.f29295attabal;
        }
        long duration = c3268u6.a.getDuration();
        if (duration <= 0) {
            return Unit.f29295attabal;
        }
        return (c3268u6.g != 2 && (objEmit = c3268u6.c.emit(new C3046l8(c3268u6.a.getCurrentPosition(), duration), c3243t6)) == attabal.beachfront()) ? objEmit : Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0044
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(int r8, p002kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3144p6
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.p6 r0 = (com.inmobi.media.C3144p6) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.inmobi.media.p6 r0 = new com.inmobi.media.p6
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.c
            int r2 = r0.b
            int r4 = r0.a
            p002kotlin.dern.saneness(r9)
            r9 = r4
            goto L67
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            p002kotlin.dern.saneness(r9)
            int[] r9 = r7.i
            int r9 = r9.length
            r2 = 0
            r6 = r9
            r9 = r8
            r8 = r6
        L42:
            if (r2 >= r8) goto L69
            int[] r4 = r7.i
            r4 = r4[r2]
            if (r9 < r4) goto L67
            boolean[] r4 = r7.h
            boolean r5 = r4[r2]
            if (r5 != 0) goto L67
            r4[r2] = r3
            kotlinx.coroutines.flow.apical r4 = r7.c
            com.inmobi.media.Rl[] r5 = r7.j
            r5 = r5[r2]
            r0.a = r9
            r0.b = r2
            r0.c = r8
            r0.f = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L67
            return r1
        L67:
            int r2 = r2 + r3
            goto L42
        L69:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3268u6.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
