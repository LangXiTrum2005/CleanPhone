package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaPeriod[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final IdentityHashMap f18356Y;
    public final DefaultCompositeSequenceableLoaderFactory Z;
    public final ArrayList e0 = new ArrayList();
    public final HashMap f0 = new HashMap();
    public MediaPeriod.Callback g0;
    public TrackGroupArray h0;
    public MediaPeriod[] i0;
    public SequenceableLoader j0;

    public static final class ForwardingTrackSelection implements ExoTrackSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExoTrackSelection f18357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackGroup f18358b;

        public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.f18357a = exoTrackSelection;
            this.f18358b = trackGroup;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public final void a() {
            this.f18357a.a();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public final void b(boolean z2) {
            this.f18357a.b(z2);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public final void c() {
            this.f18357a.c();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public final void disable() {
            this.f18357a.disable();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public final void enable() {
            this.f18357a.enable();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingTrackSelection)) {
                return false;
            }
            ForwardingTrackSelection forwardingTrackSelection = (ForwardingTrackSelection) obj;
            return this.f18357a.equals(forwardingTrackSelection.f18357a) && this.f18358b.equals(forwardingTrackSelection.f18358b);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final Format getFormat(int i2) {
            return this.f18357a.getFormat(i2);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final int getIndexInTrackGroup(int i2) {
            return this.f18357a.getIndexInTrackGroup(i2);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public final Format getSelectedFormat() {
            return this.f18357a.getSelectedFormat();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final TrackGroup getTrackGroup() {
            return this.f18358b;
        }

        public final int hashCode() {
            return this.f18357a.hashCode() + ((this.f18358b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final int indexOf(int i2) {
            return this.f18357a.indexOf(i2);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final int length() {
            return this.f18357a.length();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public final void onPlaybackSpeed(float f) {
            this.f18357a.onPlaybackSpeed(f);
        }
    }

    public static final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
        public final MediaPeriod X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final long f18359Y;
        public MediaPeriod.Callback Z;

        public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j) {
            this.X = mediaPeriod;
            this.f18359Y = j;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public final void a(SequenceableLoader sequenceableLoader) {
            MediaPeriod.Callback callback = this.Z;
            callback.getClass();
            callback.a(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long c(long j, SeekParameters seekParameters) {
            long j2 = this.f18359Y;
            return this.X.c(j - j2, seekParameters) + j2;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final boolean continueLoading(long j) {
            return this.X.continueLoading(j - this.f18359Y);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void d(MediaPeriod.Callback callback, long j) {
            this.Z = callback;
            this.X.d(this, j - this.f18359Y);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void discardBuffer(long j, boolean z2) {
            this.X.discardBuffer(j - this.f18359Y, z2);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
            int i2 = 0;
            while (true) {
                SampleStream sampleStream = null;
                if (i2 >= sampleStreamArr.length) {
                    break;
                }
                TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i2];
                if (timeOffsetSampleStream != null) {
                    sampleStream = timeOffsetSampleStream.X;
                }
                sampleStreamArr2[i2] = sampleStream;
                i2++;
            }
            long j2 = this.f18359Y;
            long jE = this.X.e(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - j2);
            for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
                SampleStream sampleStream2 = sampleStreamArr2[i3];
                if (sampleStream2 == null) {
                    sampleStreamArr[i3] = null;
                } else {
                    SampleStream sampleStream3 = sampleStreamArr[i3];
                    if (sampleStream3 == null || ((TimeOffsetSampleStream) sampleStream3).X != sampleStream2) {
                        sampleStreamArr[i3] = new TimeOffsetSampleStream(sampleStream2, j2);
                    }
                }
            }
            return jE + j2;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public final void f(MediaPeriod mediaPeriod) {
            MediaPeriod.Callback callback = this.Z;
            callback.getClass();
            callback.f(this);
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final long getBufferedPositionUs() {
            long bufferedPositionUs = this.X.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return bufferedPositionUs + this.f18359Y;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.X.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return nextLoadPositionUs + this.f18359Y;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final TrackGroupArray getTrackGroups() {
            return this.X.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final boolean isLoading() {
            return this.X.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void maybeThrowPrepareError() {
            this.X.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long readDiscontinuity() {
            long discontinuity = this.X.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return discontinuity + this.f18359Y;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final void reevaluateBuffer(long j) {
            this.X.reevaluateBuffer(j - this.f18359Y);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long seekToUs(long j) {
            long j2 = this.f18359Y;
            return this.X.seekToUs(j - j2) + j2;
        }
    }

    public static final class TimeOffsetSampleStream implements SampleStream {
        public final SampleStream X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final long f18360Y;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j) {
            this.X = sampleStream;
            this.f18360Y = j;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int g(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            int iG = this.X.g(formatHolder, decoderInputBuffer, i2);
            if (iG == -4) {
                decoderInputBuffer.f0 = Math.max(0L, decoderInputBuffer.f0 + this.f18360Y);
            }
            return iG;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean isReady() {
            return this.X.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void maybeThrowError() {
            this.X.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int skipData(long j) {
            return this.X.skipData(j - this.f18360Y);
        }
    }

    public MergingMediaPeriod(DefaultCompositeSequenceableLoaderFactory defaultCompositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.Z = defaultCompositeSequenceableLoaderFactory;
        this.X = mediaPeriodArr;
        defaultCompositeSequenceableLoaderFactory.getClass();
        this.j0 = new CompositeSequenceableLoader(new SequenceableLoader[0]);
        this.f18356Y = new IdentityHashMap();
        this.i0 = new MediaPeriod[0];
        for (int i2 = 0; i2 < mediaPeriodArr.length; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                this.X[i2] = new TimeOffsetMediaPeriod(mediaPeriodArr[i2], j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public final void a(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.g0;
        callback.getClass();
        callback.a(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.i0;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.X[0]).c(j, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j) {
        ArrayList arrayList = this.e0;
        if (arrayList.isEmpty()) {
            return this.j0.continueLoading(j);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((MediaPeriod) arrayList.get(i2)).continueLoading(j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void d(MediaPeriod.Callback callback, long j) {
        this.g0 = callback;
        ArrayList arrayList = this.e0;
        MediaPeriod[] mediaPeriodArr = this.X;
        Collections.addAll(arrayList, mediaPeriodArr);
        for (MediaPeriod mediaPeriod : mediaPeriodArr) {
            mediaPeriod.d(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        for (MediaPeriod mediaPeriod : this.i0) {
            mediaPeriod.discardBuffer(j, z2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = exoTrackSelectionArr.length;
            identityHashMap = this.f18356Y;
            if (i3 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i3];
            Integer num = sampleStream == null ? null : (Integer) identityHashMap.get(sampleStream);
            iArr[i3] = num == null ? -1 : num.intValue();
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                String str = exoTrackSelection.getTrackGroup().f18423Y;
                iArr2[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i3] = -1;
            }
            i3++;
        }
        identityHashMap.clear();
        int length2 = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length2];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        MediaPeriod[] mediaPeriodArr = this.X;
        ArrayList arrayList = new ArrayList(mediaPeriodArr.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < mediaPeriodArr.length) {
            int i5 = i2;
            while (i5 < exoTrackSelectionArr.length) {
                sampleStreamArr3[i5] = iArr[i5] == i4 ? sampleStreamArr[i5] : null;
                if (iArr2[i5] == i4) {
                    ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i5];
                    exoTrackSelection2.getClass();
                    TrackGroup trackGroup = (TrackGroup) this.f0.get(exoTrackSelection2.getTrackGroup());
                    trackGroup.getClass();
                    exoTrackSelectionArr2[i5] = new ForwardingTrackSelection(exoTrackSelection2, trackGroup);
                } else {
                    exoTrackSelectionArr2[i5] = null;
                }
                i5++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            MediaPeriod[] mediaPeriodArr2 = mediaPeriodArr;
            int i6 = i4;
            long jE = mediaPeriodArr2[i4].e(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j2);
            if (i6 == 0) {
                j2 = jE;
            } else if (jE != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i7 = 0; i7 < exoTrackSelectionArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    SampleStream sampleStream2 = sampleStreamArr3[i7];
                    sampleStream2.getClass();
                    sampleStreamArr2[i7] = sampleStreamArr3[i7];
                    identityHashMap.put(sampleStream2, Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr3[i7] == i6) {
                    Assertions.d(sampleStreamArr3[i7] == null);
                }
            }
            if (z2) {
                arrayList.add(mediaPeriodArr2[i6]);
            }
            i4 = i6 + 1;
            mediaPeriodArr = mediaPeriodArr2;
            iArr = iArr3;
            i2 = 0;
        }
        int i8 = i2;
        System.arraycopy(sampleStreamArr2, i8, sampleStreamArr, i8, length2);
        MediaPeriod[] mediaPeriodArr3 = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[i8]);
        this.i0 = mediaPeriodArr3;
        this.Z.getClass();
        this.j0 = new CompositeSequenceableLoader(mediaPeriodArr3);
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        ArrayList arrayList = this.e0;
        arrayList.remove(mediaPeriod);
        if (arrayList.isEmpty()) {
            MediaPeriod[] mediaPeriodArr = this.X;
            int i2 = 0;
            for (MediaPeriod mediaPeriod2 : mediaPeriodArr) {
                i2 += mediaPeriod2.getTrackGroups().X;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < mediaPeriodArr.length; i4++) {
                TrackGroupArray trackGroups = mediaPeriodArr[i4].getTrackGroups();
                int i5 = trackGroups.X;
                int i6 = 0;
                while (i6 < i5) {
                    TrackGroup trackGroupA = trackGroups.a(i6);
                    TrackGroup trackGroup = new TrackGroup(i4 + ":" + trackGroupA.f18423Y, trackGroupA.e0);
                    this.f0.put(trackGroup, trackGroupA);
                    trackGroupArr[i3] = trackGroup;
                    i6++;
                    i3++;
                }
            }
            this.h0 = new TrackGroupArray(trackGroupArr);
            MediaPeriod.Callback callback = this.g0;
            callback.getClass();
            callback.f(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.j0.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return this.j0.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        TrackGroupArray trackGroupArray = this.h0;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean isLoading() {
        return this.j0.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() {
        for (MediaPeriod mediaPeriod : this.X) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.i0) {
            long discontinuity = mediaPeriod.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j != -9223372036854775807L && mediaPeriod.seekToUs(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (MediaPeriod mediaPeriod2 : this.i0) {
                    if (mediaPeriod2 == mediaPeriod) {
                        break;
                    }
                    if (mediaPeriod2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = discontinuity;
            } else if (discontinuity != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.j0.reevaluateBuffer(j);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j) {
        long jSeekToUs = this.i0[0].seekToUs(j);
        int i2 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.i0;
            if (i2 >= mediaPeriodArr.length) {
                return jSeekToUs;
            }
            if (mediaPeriodArr[i2].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }
}
