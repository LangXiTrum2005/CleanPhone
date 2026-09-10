package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    public static final MediaSource.MediaPeriodId p0 = new MediaSource.MediaPeriodId(new Object());
    public ComponentListener l0;
    public Timeline m0;
    public AdPlaybackState n0;
    public AdMediaSourceHolder[][] o0;

    public static final class AdLoadException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }
    }

    public final class AdMediaSourceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f18428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f18429b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Timeline f18430c;

        public AdMediaSourceHolder(MediaSource.MediaPeriodId mediaPeriodId) {
            this.f18428a = mediaPeriodId;
        }
    }

    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f18431a;

        public AdPrepareListener(Uri uri) {
            this.f18431a = uri;
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public final void a(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.getClass();
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public final void b(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher(AdsMediaSource.this.Z.f18353c, 0, mediaPeriodId);
            long andIncrement = LoadEventInfo.f18338b.getAndIncrement();
            Map map = Collections.EMPTY_MAP;
            new DataSpec(this.f18431a, 0L, 1, null, map, 0L, -1L, null, 0);
            SystemClock.elapsedRealtime();
            eventDispatcher.e(new LoadEventInfo(map, andIncrement), new MediaLoadData(6, -1, null, 0, eventDispatcher.a(-9223372036854775807L), eventDispatcher.a(-9223372036854775807L)), new AdLoadException(iOException), true);
            throw null;
        }
    }

    public final class ComponentListener implements AdsLoader.EventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f18433a = Util.l(null);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.X;
        if (!mediaPeriodId.a()) {
            maskingMediaPeriod.g();
            return;
        }
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.o0;
        int i2 = mediaPeriodId.f18348b;
        AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i2];
        int i3 = mediaPeriodId.f18349c;
        AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr2[i3];
        adMediaSourceHolder.getClass();
        ArrayList arrayList = adMediaSourceHolder.f18429b;
        arrayList.remove(maskingMediaPeriod);
        maskingMediaPeriod.g();
        if (arrayList.isEmpty()) {
            this.o0[i2][i3] = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void T(TransferListener transferListener) {
        super.T(transferListener);
        this.l0 = new ComponentListener();
        a0(p0, null);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
        super.V();
        ComponentListener componentListener = this.l0;
        componentListener.getClass();
        this.l0 = null;
        componentListener.f18433a.removeCallbacksAndMessages(null);
        this.m0 = null;
        this.n0 = null;
        this.o0 = new AdMediaSourceHolder[0][];
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId W(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) obj;
        return mediaPeriodId2.a() ? mediaPeriodId2 : mediaPeriodId;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void Z(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        long j;
        Timeline timeline2;
        long j2;
        MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) obj;
        int i2 = 0;
        if (mediaPeriodId.a()) {
            AdMediaSourceHolder adMediaSourceHolder = this.o0[mediaPeriodId.f18348b][mediaPeriodId.f18349c];
            adMediaSourceHolder.getClass();
            Assertions.b(timeline.h() == 1);
            if (adMediaSourceHolder.f18430c == null) {
                Object objL = timeline.l(0);
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = adMediaSourceHolder.f18429b;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) arrayList.get(i3);
                    maskingMediaPeriod.b(new MediaSource.MediaPeriodId(objL, maskingMediaPeriod.X.d));
                    i3++;
                }
            }
            adMediaSourceHolder.f18430c = timeline;
        } else {
            Assertions.b(timeline.h() == 1);
            this.m0 = timeline;
        }
        Timeline timeline3 = this.m0;
        AdPlaybackState adPlaybackState = this.n0;
        if (adPlaybackState == null || timeline3 == null) {
            return;
        }
        int i4 = adPlaybackState.X;
        if (i4 == 0) {
            U(timeline3);
            return;
        }
        long[][] jArr = new long[this.o0.length][];
        int i5 = 0;
        while (true) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = this.o0;
            j = -9223372036854775807L;
            if (i5 >= adMediaSourceHolderArr.length) {
                break;
            }
            jArr[i5] = new long[adMediaSourceHolderArr[i5].length];
            int i6 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.o0[i5];
                if (i6 < adMediaSourceHolderArr2.length) {
                    AdMediaSourceHolder adMediaSourceHolder2 = adMediaSourceHolderArr2[i6];
                    long[] jArr2 = jArr[i5];
                    if (adMediaSourceHolder2 == null || (timeline2 = adMediaSourceHolder2.f18430c) == null) {
                        j2 = -9223372036854775807L;
                    } else {
                        AdsMediaSource.this.getClass();
                        j2 = timeline2.f(0, null, false).e0;
                    }
                    jArr2[i6] = j2;
                    i6++;
                }
            }
            i5++;
        }
        Assertions.d(adPlaybackState.e0 == 0);
        AdPlaybackState.AdGroup[] adGroupArr = adPlaybackState.f0;
        AdPlaybackState.AdGroup[] adGroupArr2 = (AdPlaybackState.AdGroup[]) Util.D(adGroupArr, adGroupArr.length);
        while (i2 < i4) {
            AdPlaybackState.AdGroup adGroup = adGroupArr2[i2];
            long[] jArrCopyOf = jArr[i2];
            adGroup.getClass();
            int length = jArrCopyOf.length;
            Uri[] uriArr = adGroup.e0;
            if (length < uriArr.length) {
                int length2 = uriArr.length;
                int length3 = jArrCopyOf.length;
                int iMax = Math.max(length2, length3);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, iMax);
                Arrays.fill(jArrCopyOf, length3, iMax, j);
            } else if (adGroup.f18427Y != -1 && jArrCopyOf.length > uriArr.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, uriArr.length);
            }
            int i7 = i2;
            adGroupArr2[i7] = new AdPlaybackState.AdGroup(adGroup.X, adGroup.f18427Y, adGroup.Z, adGroup.f0, adGroup.e0, jArrCopyOf, adGroup.h0, adGroup.i0);
            i2 = i7 + 1;
            jArr = jArr;
            j = -9223372036854775807L;
        }
        this.n0 = new AdPlaybackState(adGroupArr2, adPlaybackState.f18426Y, adPlaybackState.Z, adPlaybackState.e0);
        U(new SinglePeriodAdTimeline(timeline3, this.n0));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        Uri uri;
        AdPlaybackState adPlaybackState = this.n0;
        adPlaybackState.getClass();
        if (adPlaybackState.X <= 0 || !mediaPeriodId.a()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
            maskingMediaPeriod.h(null);
            maskingMediaPeriod.b(mediaPeriodId);
            return maskingMediaPeriod;
        }
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.o0;
        int i2 = mediaPeriodId.f18348b;
        AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i2];
        int length = adMediaSourceHolderArr2.length;
        int i3 = mediaPeriodId.f18349c;
        if (length <= i3) {
            adMediaSourceHolderArr[i2] = (AdMediaSourceHolder[]) Arrays.copyOf(adMediaSourceHolderArr2, i3 + 1);
        }
        AdMediaSourceHolder adMediaSourceHolder = this.o0[i2][i3];
        if (adMediaSourceHolder == null) {
            adMediaSourceHolder = new AdMediaSourceHolder(mediaPeriodId);
            this.o0[i2][i3] = adMediaSourceHolder;
            AdPlaybackState adPlaybackState2 = this.n0;
            if (adPlaybackState2 != null) {
                for (int i4 = 0; i4 < this.o0.length; i4++) {
                    int i5 = 0;
                    while (true) {
                        AdMediaSourceHolder[] adMediaSourceHolderArr3 = this.o0[i4];
                        if (i5 < adMediaSourceHolderArr3.length) {
                            AdMediaSourceHolder adMediaSourceHolder2 = adMediaSourceHolderArr3[i5];
                            AdPlaybackState.AdGroup adGroupA = adPlaybackState2.a(i4);
                            if (adMediaSourceHolder2 != null) {
                                Uri[] uriArr = adGroupA.e0;
                                if (i5 < uriArr.length && (uri = uriArr[i5]) != null) {
                                    new MediaItem.Builder().f17097b = uri;
                                    throw null;
                                }
                            }
                            i5++;
                        }
                    }
                }
            }
        }
        MaskingMediaPeriod maskingMediaPeriod2 = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
        adMediaSourceHolder.f18429b.add(maskingMediaPeriod2);
        Timeline timeline = adMediaSourceHolder.f18430c;
        if (timeline != null) {
            maskingMediaPeriod2.b(new MediaSource.MediaPeriodId(timeline.l(0), mediaPeriodId.d));
        }
        return maskingMediaPeriod2;
    }
}
