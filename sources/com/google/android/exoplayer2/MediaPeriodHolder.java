package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.ClippingMediaPeriod;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class MediaPeriodHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SampleStream[] f17139c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17140e;
    public MediaPeriodInfo f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f17141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RendererCapabilities[] f17142i;
    public final TrackSelector j;
    public final MediaSourceList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MediaPeriodHolder f17143l;
    public TrackGroupArray m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TrackSelectorResult f17144n;
    public long o;

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        this.f17142i = rendererCapabilitiesArr;
        this.o = j;
        this.j = trackSelector;
        this.k = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f17145a;
        this.f17138b = mediaPeriodId.f18347a;
        this.f = mediaPeriodInfo;
        this.m = TrackGroupArray.e0;
        this.f17144n = trackSelectorResult;
        this.f17139c = new SampleStream[rendererCapabilitiesArr.length];
        this.f17141h = new boolean[rendererCapabilitiesArr.length];
        mediaSourceList.getClass();
        int i2 = AbstractConcatenatedTimeline.e0;
        Pair pair = (Pair) mediaPeriodId.f18347a;
        Object obj = pair.first;
        MediaSource.MediaPeriodId mediaPeriodIdB = mediaPeriodId.b(pair.second);
        MediaSourceList.MediaSourceHolder mediaSourceHolder = (MediaSourceList.MediaSourceHolder) mediaSourceList.d.get(obj);
        mediaSourceHolder.getClass();
        mediaSourceList.g.add(mediaSourceHolder);
        MediaSourceList.MediaSourceAndListener mediaSourceAndListener = (MediaSourceList.MediaSourceAndListener) mediaSourceList.f.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.f17166a.C(mediaSourceAndListener.f17167b);
        }
        mediaSourceHolder.f17171c.add(mediaPeriodIdB);
        MediaPeriod mediaPeriodU = mediaSourceHolder.f17169a.u(mediaPeriodIdB, allocator, mediaPeriodInfo.f17146b);
        mediaSourceList.f17160c.put(mediaPeriodU, mediaSourceHolder);
        mediaSourceList.c();
        long j2 = mediaPeriodInfo.d;
        this.f17137a = j2 != -9223372036854775807L ? new ClippingMediaPeriod(mediaPeriodU, true, 0L, j2) : mediaPeriodU;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
    public final long a(TrackSelectorResult trackSelectorResult, long j, boolean z2, boolean[] zArr) {
        RendererCapabilities[] rendererCapabilitiesArr;
        SampleStream[] sampleStreamArr;
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= trackSelectorResult.f18709a) {
                break;
            }
            if (z2 || !trackSelectorResult.a(this.f17144n, i2)) {
                z3 = false;
            }
            this.f17141h[i2] = z3;
            i2++;
        }
        int i3 = 0;
        while (true) {
            rendererCapabilitiesArr = this.f17142i;
            int length = rendererCapabilitiesArr.length;
            sampleStreamArr = this.f17139c;
            if (i3 >= length) {
                break;
            }
            if (rendererCapabilitiesArr[i3].getTrackType() == -2) {
                sampleStreamArr[i3] = null;
            }
            i3++;
        }
        b();
        this.f17144n = trackSelectorResult;
        c();
        long jE = this.f17137a.e(trackSelectorResult.f18711c, this.f17141h, this.f17139c, zArr, j);
        for (int i4 = 0; i4 < rendererCapabilitiesArr.length; i4++) {
            if (rendererCapabilitiesArr[i4].getTrackType() == -2 && this.f17144n.b(i4)) {
                sampleStreamArr[i4] = new EmptySampleStream();
            }
        }
        this.f17140e = false;
        for (int i5 = 0; i5 < sampleStreamArr.length; i5++) {
            if (sampleStreamArr[i5] != null) {
                Assertions.d(trackSelectorResult.b(i5));
                if (rendererCapabilitiesArr[i5].getTrackType() != -2) {
                    this.f17140e = true;
                }
            } else {
                Assertions.d(trackSelectorResult.f18711c[i5] == null);
            }
        }
        return jE;
    }

    public final void b() {
        if (this.f17143l != null) {
            return;
        }
        int i2 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.f17144n;
            if (i2 >= trackSelectorResult.f18709a) {
                return;
            }
            boolean zB = trackSelectorResult.b(i2);
            ExoTrackSelection exoTrackSelection = this.f17144n.f18711c[i2];
            if (zB && exoTrackSelection != null) {
                exoTrackSelection.disable();
            }
            i2++;
        }
    }

    public final void c() {
        if (this.f17143l != null) {
            return;
        }
        int i2 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.f17144n;
            if (i2 >= trackSelectorResult.f18709a) {
                return;
            }
            boolean zB = trackSelectorResult.b(i2);
            ExoTrackSelection exoTrackSelection = this.f17144n.f18711c[i2];
            if (zB && exoTrackSelection != null) {
                exoTrackSelection.enable();
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
    public final long d() {
        if (!this.d) {
            return this.f.f17146b;
        }
        long bufferedPositionUs = this.f17140e ? this.f17137a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f.f17148e : bufferedPositionUs;
    }

    public final long e() {
        return this.f.f17146b + this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
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
    public final void f() {
        b();
        ?? r0 = this.f17137a;
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

    public final TrackSelectorResult g(float f, Timeline timeline) {
        TrackSelectorResult trackSelectorResultC = this.j.c(this.f17142i, this.m, this.f.f17145a, timeline);
        for (ExoTrackSelection exoTrackSelection : trackSelectorResultC.f18711c) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f);
            }
        }
        return trackSelectorResultC;
    }

    public final void h() {
        Object obj = this.f17137a;
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
