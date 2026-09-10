package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SampleStream[] f5924c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5925e;
    public MediaPeriodInfo f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f5926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RendererCapabilities[] f5927i;
    public final TrackSelector j;
    public final MediaSourceList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MediaPeriodHolder f5928l;
    public TrackGroupArray m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TrackSelectorResult f5929n;
    public long o;

    public interface Factory {
    }

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        this.f5927i = rendererCapabilitiesArr;
        this.o = j;
        this.j = trackSelector;
        this.k = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f5930a;
        this.f5923b = mediaPeriodId.f6384a;
        this.f = mediaPeriodInfo;
        this.m = TrackGroupArray.d;
        this.f5929n = trackSelectorResult;
        this.f5924c = new SampleStream[rendererCapabilitiesArr.length];
        this.f5926h = new boolean[rendererCapabilitiesArr.length];
        mediaSourceList.getClass();
        int i2 = AbstractConcatenatedTimeline.d;
        Pair pair = (Pair) mediaPeriodId.f6384a;
        Object obj = pair.first;
        MediaSource.MediaPeriodId mediaPeriodIdA = mediaPeriodId.a(pair.second);
        MediaSourceList.MediaSourceHolder mediaSourceHolder = (MediaSourceList.MediaSourceHolder) mediaSourceList.d.get(obj);
        mediaSourceHolder.getClass();
        mediaSourceList.g.add(mediaSourceHolder);
        MediaSourceList.MediaSourceAndListener mediaSourceAndListener = (MediaSourceList.MediaSourceAndListener) mediaSourceList.f.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.f5953a.L(mediaSourceAndListener.f5954b);
        }
        mediaSourceHolder.f5958c.add(mediaPeriodIdA);
        MediaPeriod mediaPeriodA = mediaSourceHolder.f5956a.A(mediaPeriodIdA, allocator, mediaPeriodInfo.f5931b);
        mediaSourceList.f5947c.put(mediaPeriodA, mediaSourceHolder);
        mediaSourceList.c();
        long j2 = mediaPeriodInfo.d;
        this.f5922a = j2 != -9223372036854775807L ? new ClippingMediaPeriod(mediaPeriodA, true, 0L, j2) : mediaPeriodA;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    public final long a(TrackSelectorResult trackSelectorResult, long j, boolean z2, boolean[] zArr) {
        RendererCapabilities[] rendererCapabilitiesArr;
        SampleStream[] sampleStreamArr;
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= trackSelectorResult.f6539a) {
                break;
            }
            if (z2 || !trackSelectorResult.a(this.f5929n, i2)) {
                z3 = false;
            }
            this.f5926h[i2] = z3;
            i2++;
        }
        int i3 = 0;
        while (true) {
            rendererCapabilitiesArr = this.f5927i;
            int length = rendererCapabilitiesArr.length;
            sampleStreamArr = this.f5924c;
            if (i3 >= length) {
                break;
            }
            if (rendererCapabilitiesArr[i3].getTrackType() == -2) {
                sampleStreamArr[i3] = null;
            }
            i3++;
        }
        b();
        this.f5929n = trackSelectorResult;
        c();
        long jD = this.f5922a.d(trackSelectorResult.f6541c, this.f5926h, this.f5924c, zArr, j);
        for (int i4 = 0; i4 < rendererCapabilitiesArr.length; i4++) {
            if (rendererCapabilitiesArr[i4].getTrackType() == -2 && this.f5929n.b(i4)) {
                sampleStreamArr[i4] = new EmptySampleStream();
            }
        }
        this.f5925e = false;
        for (int i5 = 0; i5 < sampleStreamArr.length; i5++) {
            if (sampleStreamArr[i5] != null) {
                Assertions.e(trackSelectorResult.b(i5));
                if (rendererCapabilitiesArr[i5].getTrackType() != -2) {
                    this.f5925e = true;
                }
            } else {
                Assertions.e(trackSelectorResult.f6541c[i5] == null);
            }
        }
        return jD;
    }

    public final void b() {
        if (this.f5928l != null) {
            return;
        }
        int i2 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.f5929n;
            if (i2 >= trackSelectorResult.f6539a) {
                return;
            }
            boolean zB = trackSelectorResult.b(i2);
            ExoTrackSelection exoTrackSelection = this.f5929n.f6541c[i2];
            if (zB && exoTrackSelection != null) {
                exoTrackSelection.disable();
            }
            i2++;
        }
    }

    public final void c() {
        if (this.f5928l != null) {
            return;
        }
        int i2 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.f5929n;
            if (i2 >= trackSelectorResult.f6539a) {
                return;
            }
            boolean zB = trackSelectorResult.b(i2);
            ExoTrackSelection exoTrackSelection = this.f5929n.f6541c[i2];
            if (zB && exoTrackSelection != null) {
                exoTrackSelection.enable();
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final long d() {
        if (!this.d) {
            return this.f.f5931b;
        }
        long bufferedPositionUs = this.f5925e ? this.f5922a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f.f5933e : bufferedPositionUs;
    }

    public final long e() {
        return this.f.f5931b + this.o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final boolean f() {
        if (this.d) {
            return !this.f5925e || this.f5922a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g() {
        b();
        ?? r0 = this.f5922a;
        try {
            boolean z2 = r0 instanceof ClippingMediaPeriod;
            MediaSourceList mediaSourceList = this.k;
            if (z2) {
                mediaSourceList.f(((ClippingMediaPeriod) r0).X);
            } else {
                mediaSourceList.f(r0);
            }
        } catch (RuntimeException e2) {
            Log.d("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final TrackSelectorResult h(float f, Timeline timeline) {
        ExoTrackSelection[] exoTrackSelectionArr;
        TrackGroupArray trackGroupArray = this.m;
        MediaPeriodInfo mediaPeriodInfo = this.f;
        TrackSelector trackSelector = this.j;
        RendererCapabilities[] rendererCapabilitiesArr = this.f5927i;
        TrackSelectorResult trackSelectorResultF = trackSelector.f(rendererCapabilitiesArr, trackGroupArray, mediaPeriodInfo.f5930a, timeline);
        int i2 = 0;
        while (true) {
            int i3 = trackSelectorResultF.f6539a;
            exoTrackSelectionArr = trackSelectorResultF.f6541c;
            if (i2 >= i3) {
                break;
            }
            boolean z2 = true;
            if (trackSelectorResultF.b(i2)) {
                if (exoTrackSelectionArr[i2] == null && rendererCapabilitiesArr[i2].getTrackType() != -2) {
                    z2 = false;
                }
                Assertions.e(z2);
            } else {
                Assertions.e(exoTrackSelectionArr[i2] == null);
            }
            i2++;
        }
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f);
            }
        }
        return trackSelectorResultF;
    }

    public final void i() {
        Object obj = this.f5922a;
        if (obj instanceof ClippingMediaPeriod) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) obj;
            clippingMediaPeriod.f0 = 0L;
            clippingMediaPeriod.g0 = j;
        }
    }
}
