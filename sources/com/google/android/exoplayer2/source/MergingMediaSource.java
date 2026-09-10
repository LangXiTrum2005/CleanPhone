package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    public static final MediaItem t0;
    public final MediaSource[] l0;
    public final Timeline[] m0;
    public final ArrayList n0;
    public final DefaultCompositeSequenceableLoaderFactory o0;
    public final ListMultimap p0;
    public int q0;
    public long[][] r0;
    public IllegalMergeException s0;

    public static final class ClippedTimeline extends ForwardingTimeline {
        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            super.f(i2, period, z2);
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            super.m(i2, window, j);
            throw null;
        }
    }

    public static final class IllegalMergeException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }
    }

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f17096a = "MergingMediaSource";
        t0 = builder.a();
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        DefaultCompositeSequenceableLoaderFactory defaultCompositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
        this.l0 = mediaSourceArr;
        this.o0 = defaultCompositeSequenceableLoaderFactory;
        this.n0 = new ArrayList(Arrays.asList(mediaSourceArr));
        this.q0 = -1;
        this.m0 = new Timeline[mediaSourceArr.length];
        this.r0 = new long[0][];
        new HashMap();
        this.p0 = MultimapBuilder.a().a().c();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        int i2 = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.l0;
            if (i2 >= mediaSourceArr.length) {
                return;
            }
            MediaSource mediaSource = mediaSourceArr[i2];
            MediaPeriod mediaPeriod2 = mergingMediaPeriod.X[i2];
            if (mediaPeriod2 instanceof MergingMediaPeriod.TimeOffsetMediaPeriod) {
                mediaPeriod2 = ((MergingMediaPeriod.TimeOffsetMediaPeriod) mediaPeriod2).X;
            }
            mediaSource.B(mediaPeriod2);
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void T(TransferListener transferListener) {
        super.T(transferListener);
        int i2 = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.l0;
            if (i2 >= mediaSourceArr.length) {
                return;
            }
            a0(Integer.valueOf(i2), mediaSourceArr[i2]);
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
        super.V();
        Arrays.fill(this.m0, (Object) null);
        this.q0 = -1;
        this.s0 = null;
        ArrayList arrayList = this.n0;
        arrayList.clear();
        Collections.addAll(arrayList, this.l0);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId W(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        if (((Integer) obj).intValue() == 0) {
            return mediaPeriodId;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public final void Z(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        Integer num = (Integer) obj;
        if (this.s0 != null) {
            return;
        }
        if (this.q0 == -1) {
            this.q0 = timeline.h();
        } else if (timeline.h() != this.q0) {
            this.s0 = new IllegalMergeException();
            return;
        }
        int length = this.r0.length;
        Timeline[] timelineArr = this.m0;
        if (length == 0) {
            this.r0 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.q0, timelineArr.length);
        }
        ArrayList arrayList = this.n0;
        arrayList.remove(baseMediaSource);
        timelineArr[num.intValue()] = timeline;
        if (arrayList.isEmpty()) {
            U(timelineArr[0]);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        MediaSource[] mediaSourceArr = this.l0;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].m() : t0;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.s0;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaSource[] mediaSourceArr = this.l0;
        int length = mediaSourceArr.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        Timeline[] timelineArr = this.m0;
        int iB = timelineArr[0].b(mediaPeriodId.f18347a);
        for (int i2 = 0; i2 < length; i2++) {
            mediaPeriodArr[i2] = mediaSourceArr[i2].u(mediaPeriodId.b(timelineArr[i2].l(iB)), allocator, j - this.r0[iB][i2]);
        }
        return new MergingMediaPeriod(this.o0, this.r0[iB], mediaPeriodArr);
    }
}
