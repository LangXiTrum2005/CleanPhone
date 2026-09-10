package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.CompositeMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
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

/* JADX INFO: loaded from: classes.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
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
        public final MediaSource.MediaPeriodId f6467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f6468b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Timeline f6469c;

        public AdMediaSourceHolder(MediaSource.MediaPeriodId mediaPeriodId) {
            this.f6467a = mediaPeriodId;
        }
    }

    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaItem f6470a;

        public AdPrepareListener(MediaItem mediaItem) {
            this.f6470a = mediaItem;
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public final void a(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher(AdsMediaSource.this.Z.f6390c, 0, mediaPeriodId);
            long andIncrement = LoadEventInfo.f6371b.getAndIncrement();
            MediaItem.LocalConfiguration localConfiguration = this.f6470a.f5438b;
            localConfiguration.getClass();
            Map map = Collections.EMPTY_MAP;
            new DataSpec(localConfiguration.f5458a, 1, null, map, 0L, -1L, null, 0);
            SystemClock.elapsedRealtime();
            eventDispatcher.d(new LoadEventInfo(map, andIncrement), new MediaLoadData(6, -1, null, 0, Util.T(-9223372036854775807L), Util.T(-9223372036854775807L)), new AdLoadException(iOException), true);
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public final void b(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.getClass();
            throw null;
        }
    }

    public final class ComponentListener implements AdsLoader.EventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f6472a = Util.m(null);
    }

    static {
        new MediaSource.MediaPeriodId(new Object());
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        AdPlaybackState adPlaybackState = this.n0;
        adPlaybackState.getClass();
        if (adPlaybackState.f5368a <= 0 || !mediaPeriodId.b()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
            maskingMediaPeriod.i(null);
            maskingMediaPeriod.g(mediaPeriodId);
            return maskingMediaPeriod;
        }
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.o0;
        int i2 = mediaPeriodId.f6385b;
        AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i2];
        int length = adMediaSourceHolderArr2.length;
        int i3 = mediaPeriodId.f6386c;
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
                                MediaItem[] mediaItemArr = adGroupA.d;
                                if (i5 < mediaItemArr.length && mediaItemArr[i5] != null) {
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
        adMediaSourceHolder.f6468b.add(maskingMediaPeriod2);
        Timeline timeline = adMediaSourceHolder.f6469c;
        if (timeline != null) {
            maskingMediaPeriod2.g(new MediaSource.MediaPeriodId(timeline.l(0), mediaPeriodId.d));
        }
        return maskingMediaPeriod2;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.X;
        if (!mediaPeriodId.b()) {
            maskingMediaPeriod.h();
            return;
        }
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.o0;
        int i2 = mediaPeriodId.f6385b;
        AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i2];
        int i3 = mediaPeriodId.f6386c;
        AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr2[i3];
        adMediaSourceHolder.getClass();
        ArrayList arrayList = adMediaSourceHolder.f6468b;
        arrayList.remove(maskingMediaPeriod);
        maskingMediaPeriod.h();
        if (arrayList.isEmpty()) {
            this.o0[i2][i3] = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void M(MediaItem mediaItem) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X(TransferListener transferListener) {
        super.X(transferListener);
        this.l0 = new ComponentListener();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
        super.Z();
        ComponentListener componentListener = this.l0;
        componentListener.getClass();
        this.l0 = null;
        componentListener.f6472a.removeCallbacksAndMessages(null);
        this.m0 = null;
        this.n0 = null;
        this.o0 = new AdMediaSourceHolder[0][];
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId a0(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) obj;
        return mediaPeriodId2.b() ? mediaPeriodId2 : mediaPeriodId;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void d0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        Timeline timeline2;
        long j;
        MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) obj;
        if (mediaPeriodId.b()) {
            AdMediaSourceHolder adMediaSourceHolder = this.o0[mediaPeriodId.f6385b][mediaPeriodId.f6386c];
            adMediaSourceHolder.getClass();
            Assertions.b(timeline.h() == 1);
            if (adMediaSourceHolder.f6469c == null) {
                Object objL = timeline.l(0);
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = adMediaSourceHolder.f6468b;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) arrayList.get(i2);
                    maskingMediaPeriod.g(new MediaSource.MediaPeriodId(objL, maskingMediaPeriod.X.d));
                    i2++;
                }
            }
            adMediaSourceHolder.f6469c = timeline;
        } else {
            Assertions.b(timeline.h() == 1);
            this.m0 = timeline;
        }
        Timeline timeline3 = this.m0;
        AdPlaybackState adPlaybackState = this.n0;
        if (adPlaybackState == null || timeline3 == null) {
            return;
        }
        int i3 = adPlaybackState.f5368a;
        if (i3 == 0) {
            Y(timeline3);
            return;
        }
        long[][] jArr = new long[this.o0.length][];
        int i4 = 0;
        while (true) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = this.o0;
            if (i4 >= adMediaSourceHolderArr.length) {
                break;
            }
            jArr[i4] = new long[adMediaSourceHolderArr[i4].length];
            int i5 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.o0[i4];
                if (i5 < adMediaSourceHolderArr2.length) {
                    AdMediaSourceHolder adMediaSourceHolder2 = adMediaSourceHolderArr2[i5];
                    long[] jArr2 = jArr[i4];
                    if (adMediaSourceHolder2 == null || (timeline2 = adMediaSourceHolder2.f6469c) == null) {
                        j = -9223372036854775807L;
                    } else {
                        AdsMediaSource.this.getClass();
                        j = timeline2.f(0, null, false).d;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
            }
            i4++;
        }
        AdPlaybackState.AdGroup[] adGroupArr = adPlaybackState.f5369b;
        AdPlaybackState.AdGroup[] adGroupArr2 = (AdPlaybackState.AdGroup[]) Util.K(adGroupArr, adGroupArr.length);
        for (int i6 = 0; i6 < i3; i6++) {
            AdPlaybackState.AdGroup adGroup = adGroupArr2[i6];
            long[] jArrCopyOf = jArr[i6];
            adGroup.getClass();
            int length = jArrCopyOf.length;
            MediaItem[] mediaItemArr = adGroup.d;
            if (length < mediaItemArr.length) {
                int length2 = mediaItemArr.length;
                int length3 = jArrCopyOf.length;
                int iMax = Math.max(length2, length3);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, iMax);
                Arrays.fill(jArrCopyOf, length3, iMax, -9223372036854775807L);
            } else if (adGroup.f5370a != -1 && jArrCopyOf.length > mediaItemArr.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, mediaItemArr.length);
            }
            adGroupArr2[i6] = new AdPlaybackState.AdGroup(adGroup.f5370a, adGroup.f5371b, adGroup.f5373e, adGroup.d, jArrCopyOf);
        }
        this.n0 = new AdPlaybackState(adGroupArr2);
        Y(new SinglePeriodAdTimeline(timeline3, this.n0));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem m() {
        throw null;
    }
}
