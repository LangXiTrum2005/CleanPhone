package androidx.media3.exoplayer.source;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaPeriod[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final IdentityHashMap f6394Y;
    public final DefaultCompositeSequenceableLoaderFactory Z;
    public final ArrayList e0 = new ArrayList();
    public final HashMap f0 = new HashMap();
    public MediaPeriod.Callback g0;
    public TrackGroupArray h0;
    public MediaPeriod[] i0;
    public SequenceableLoader j0;

    public static final class ForwardingTrackSelection implements ExoTrackSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExoTrackSelection f6395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackGroup f6396b;

        public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.f6395a = exoTrackSelection;
            this.f6396b = trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void a() {
            this.f6395a.a();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void b(boolean z2) {
            this.f6395a.b(z2);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void c() {
            this.f6395a.c();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void disable() {
            this.f6395a.disable();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void enable() {
            this.f6395a.enable();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingTrackSelection)) {
                return false;
            }
            ForwardingTrackSelection forwardingTrackSelection = (ForwardingTrackSelection) obj;
            return this.f6395a.equals(forwardingTrackSelection.f6395a) && this.f6396b.equals(forwardingTrackSelection.f6396b);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final Format getFormat(int i2) {
            return this.f6396b.d[this.f6395a.getIndexInTrackGroup(i2)];
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int getIndexInTrackGroup(int i2) {
            return this.f6395a.getIndexInTrackGroup(i2);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final Format getSelectedFormat() {
            return this.f6396b.d[this.f6395a.getSelectedIndexInTrackGroup()];
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final int getSelectedIndexInTrackGroup() {
            return this.f6395a.getSelectedIndexInTrackGroup();
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final TrackGroup getTrackGroup() {
            return this.f6396b;
        }

        public final int hashCode() {
            return this.f6395a.hashCode() + ((this.f6396b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int indexOf(int i2) {
            return this.f6395a.indexOf(i2);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int length() {
            return this.f6395a.length();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void onPlaybackSpeed(float f) {
            this.f6395a.onPlaybackSpeed(f);
        }
    }

    public MergingMediaPeriod(DefaultCompositeSequenceableLoaderFactory defaultCompositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.Z = defaultCompositeSequenceableLoaderFactory;
        this.X = mediaPeriodArr;
        defaultCompositeSequenceableLoaderFactory.getClass();
        this.j0 = new CompositeSequenceableLoader(ImmutableList.x(), ImmutableList.x());
        this.f6394Y = new IdentityHashMap();
        this.i0 = new MediaPeriod[0];
        for (int i2 = 0; i2 < mediaPeriodArr.length; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                this.X[i2] = new TimeOffsetMediaPeriod(mediaPeriodArr[i2], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        ArrayList arrayList = this.e0;
        if (arrayList.isEmpty()) {
            return this.j0.a(loadingInfo);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((MediaPeriod) arrayList.get(i2)).a(loadingInfo);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void b(MediaPeriod mediaPeriod) {
        ArrayList arrayList = this.e0;
        arrayList.remove(mediaPeriod);
        if (arrayList.isEmpty()) {
            MediaPeriod[] mediaPeriodArr = this.X;
            int i2 = 0;
            for (MediaPeriod mediaPeriod2 : mediaPeriodArr) {
                i2 += mediaPeriod2.getTrackGroups().f6463a;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < mediaPeriodArr.length; i4++) {
                TrackGroupArray trackGroups = mediaPeriodArr[i4].getTrackGroups();
                int i5 = trackGroups.f6463a;
                int i6 = 0;
                while (i6 < i5) {
                    TrackGroup trackGroupA = trackGroups.a(i6);
                    Format[] formatArr = new Format[trackGroupA.f5521a];
                    for (int i7 = 0; i7 < trackGroupA.f5521a; i7++) {
                        Format format = trackGroupA.d[i7];
                        Format.Builder builderA = format.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i4);
                        sb.append(":");
                        String str = format.f5406a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        builderA.f5423a = sb.toString();
                        formatArr[i7] = new Format(builderA);
                    }
                    TrackGroup trackGroup = new TrackGroup(i4 + ":" + trackGroupA.f5522b, formatArr);
                    this.f0.put(trackGroup, trackGroupA);
                    trackGroupArr[i3] = trackGroup;
                    i6++;
                    i3++;
                }
            }
            this.h0 = new TrackGroupArray(trackGroupArr);
            MediaPeriod.Callback callback = this.g0;
            callback.getClass();
            callback.b(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.i0;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.X[0]).c(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = exoTrackSelectionArr.length;
            identityHashMap = this.f6394Y;
            if (i3 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i3];
            Integer num = sampleStream == null ? null : (Integer) identityHashMap.get(sampleStream);
            iArr[i3] = num == null ? -1 : num.intValue();
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                String str = exoTrackSelection.getTrackGroup().f5522b;
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
            long jD = mediaPeriodArr2[i4].d(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j2);
            if (i6 == 0) {
                j2 = jD;
            } else if (jD != j2) {
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
                    Assertions.e(sampleStreamArr3[i7] == null);
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
        this.i0 = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[i8]);
        AbstractList abstractListC = Lists.c(arrayList, new k(2));
        this.Z.getClass();
        this.j0 = new CompositeSequenceableLoader(arrayList, abstractListC);
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        for (MediaPeriod mediaPeriod : this.i0) {
            mediaPeriod.discardBuffer(j, z2);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void e(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.g0;
        callback.getClass();
        callback.e(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void f(MediaPeriod.Callback callback, long j) {
        this.g0 = callback;
        ArrayList arrayList = this.e0;
        MediaPeriod[] mediaPeriodArr = this.X;
        Collections.addAll(arrayList, mediaPeriodArr);
        for (MediaPeriod mediaPeriod : mediaPeriodArr) {
            mediaPeriod.f(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.j0.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return this.j0.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        TrackGroupArray trackGroupArray = this.h0;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return this.j0.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() {
        for (MediaPeriod mediaPeriod : this.X) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
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

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.j0.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
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
